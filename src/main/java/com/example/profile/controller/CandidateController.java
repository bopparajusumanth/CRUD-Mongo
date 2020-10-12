package com.example.profile.controller;

import com.example.profile.model.CandidateProfile;
import com.example.profile.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class CandidateController {
    @Autowired
    public CandidateService candidateService;
    @GetMapping("candidateprofile/candidateprofiles")
    public List<CandidateProfile> findAllCandidateProfile(){
        return candidateService.getcancdidateprofiles();
    }
    @GetMapping("/candidateprofile/{candidateid}")
    public CandidateProfile findCandidateProfileById(@PathVariable String id){
        return candidateService.getCandidateProfileById(id);
    }
    @PostMapping("/candidateprofile/saveCandidate")
    public CandidateProfile addCandidateProfile(@RequestBody CandidateProfile candidateProfile){
        return candidateService.SaveCandidateProfile(candidateProfile);
    }

    @DeleteMapping("/candidateprofile/{candidateid}")
    public String deleteCandidateProfileById(@PathVariable String id){
        return candidateService.deleteCandidateProfileById(id);
    }

    @PutMapping("updatecandidate")
    public CandidateProfile updateCandidateProfile(@RequestBody CandidateProfile candidateProfile){
        return candidateService.updateCandidateProfile(candidateProfile);
    }
}
