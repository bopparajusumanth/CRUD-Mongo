package com.example.profile.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

    @Document("value= CandidateProfile")
    @EntityScan

    public class CandidateProfile {
//    @Id
//    public int id;

        @Id
        private String candidateid;
        private long seq;
        public String tenantid;
        public String candidateName;
        public String email;
        public  long phonenumber;
        public List<String> skills;
        public List<CandidateEducation> candidateEducation;
        public List<CandidateWorkHistory> candidateWorkHistory;
        public long candidateSalary;
        public long expectedSalary;

        public CandidateProfile(String candidateid, long seq, String tenantid, String candidateName, String email, long phonenumber, List<String> skills, List<CandidateEducation> candidateEducation, List<CandidateWorkHistory> candidateWorkHistory, long candidateSalary, long expectedSalary) {
            this.candidateid = candidateid;
            this.seq = seq;
            this.tenantid = tenantid;
            this.candidateName = candidateName;
            this.email = email;
            this.phonenumber = phonenumber;
            this.skills = skills;
            this.candidateEducation = candidateEducation;
            this.candidateWorkHistory = candidateWorkHistory;
            this.candidateSalary = candidateSalary;
            this.expectedSalary = expectedSalary;
        }

        public String getCandidateid() {
            return candidateid;
        }

        public void setCandidateid(String candidateid) {
            this.candidateid = candidateid;
        }

        public long getSeq() {
            return seq;
        }

        public void setSeq(long seq) {
            this.seq = seq;
        }

        public String getTenantid() {
            return tenantid;
        }

        public void setTenantid(String tenantid) {
            this.tenantid = tenantid;
        }

        public String getCandidateName() {
            return candidateName;
        }

        public void setCandidateName(String candidateName) {
            this.candidateName = candidateName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public long getPhonenumber() {
            return phonenumber;
        }

        public void setPhonenumber(long phonenumber) {
            this.phonenumber = phonenumber;
        }

        public List<String> getSkills() {
            return skills;
        }

        public void setSkills(List<String> skills) {
            this.skills = skills;
        }

        public List<CandidateEducation> getCandidateEducation() {
            return candidateEducation;
        }

        public void setCandidateEducation(List<CandidateEducation> candidateEducation) {
            this.candidateEducation = candidateEducation;
        }

        public List<CandidateWorkHistory> getCandidateWorkHistory() {
            return candidateWorkHistory;
        }

        public void setCandidateWorkHistory(List<CandidateWorkHistory> candidateWorkHistory) {
            this.candidateWorkHistory = candidateWorkHistory;
        }

        public long getCandidateSalary() {
            return candidateSalary;
        }

        public void setCandidateSalary(long candidateSalary) {
            this.candidateSalary = candidateSalary;
        }

        public long getExpectedSalary() {
            return expectedSalary;
        }

        public void setExpectedSalary(long expectedSalary) {
            this.expectedSalary = expectedSalary;
        }

    }

