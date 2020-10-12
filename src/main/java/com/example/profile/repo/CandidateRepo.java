package com.example.profile.repo;

import com.example.profile.model.CandidateProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepo extends MongoRepository<CandidateProfile, String> {

}
