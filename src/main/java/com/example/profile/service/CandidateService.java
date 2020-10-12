package com.example.profile.service;

import com.example.profile.model.CandidateProfile;
import com.example.profile.repo.CandidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
@Service
public class CandidateService {
    @Autowired
    public CandidateRepo candidateRepo;

    private MongoOperations mongoOperations;
    @Autowired
    public CandidateService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }
    public long generateSequence(String seqName) {

        CandidateProfile counter = mongoOperations.findAndModify(org.springframework.data.mongodb.core.query.Query.query   (where("_id").is(seqName)),
                new Update().inc("seq",1), options().returnNew(true).upsert(true),
                CandidateProfile.class);
        return !Objects.isNull(counter) ? counter.getSeq():1;

    }


    public List<CandidateProfile> getcancdidateprofiles(){
        return candidateRepo.findAll();
    }
    public  CandidateProfile getCandidateProfileById(String id){
        return candidateRepo.findById(id).orElse(null);
    }

    public CandidateProfile SaveCandidateProfile(CandidateProfile candidateProfile){
        return candidateRepo.save(candidateProfile);
    }
    public String deleteCandidateProfileById(String id){
        candidateRepo.deleteById(id);
        return "profile removed" +id;
    }

    public CandidateProfile updateCandidateProfile(CandidateProfile candidateProfile) {
        CandidateProfile existingCandidateProfile= candidateRepo.findById(candidateProfile.getCandidateid()).orElse(null);
        existingCandidateProfile.setCandidateName(candidateProfile.getCandidateName());
        existingCandidateProfile.setTenantid(candidateProfile.getTenantid());
        existingCandidateProfile.setEmail(candidateProfile.getEmail());
        existingCandidateProfile.setPhonenumber(candidateProfile.getPhonenumber());
        existingCandidateProfile.setSkills(candidateProfile.getSkills());
        existingCandidateProfile.setCandidateEducation(candidateProfile.getCandidateEducation());
        existingCandidateProfile.setCandidateWorkHistory(candidateProfile.getCandidateWorkHistory());
        existingCandidateProfile.setCandidateSalary(candidateProfile.getCandidateSalary());
        existingCandidateProfile.setExpectedSalary(candidateProfile.getExpectedSalary());
        return candidateRepo.save(existingCandidateProfile);

    }

}
