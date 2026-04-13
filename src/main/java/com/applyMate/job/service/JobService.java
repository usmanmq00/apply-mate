package com.applyMate.job.service;

import com.applyMate.job.entity.Job;

import java.util.List;

public interface JobService {

    public List<Job> getAllJobs();

    public void createJob(Job job);

}
