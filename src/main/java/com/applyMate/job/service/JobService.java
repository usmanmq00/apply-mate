package com.applyMate.job.service;

import com.applyMate.job.entity.Job;

import java.util.List;

public interface JobService {

    List<Job> getAllJobs();

    void createJob(Job job);

    Job getJobById(Long jobId);

    boolean deleteJobById(Long jobId);

    boolean updateJobById(Long jobId, Job updatedJob);

}
