package com.example.profile.model;

public class CandidateWorkHistory {
    public String jobtitle;
    public String jobcompany;
    public String startdate;
    public String finishdate;

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getJobcompany()
    {
        return jobcompany;
    }

    public void setJobcompany(String jobcompany) {

        this.jobcompany = jobcompany;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(String finishdate) {
        this.finishdate = finishdate;
    }

}
