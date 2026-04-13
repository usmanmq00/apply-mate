package com.applyMate.job.service;

import com.applyMate.job.entity.Job;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    private List<Job> jobs = new ArrayList<>();
    private Long jobId = 1L;

    @Override
    public List<Job> getAllJobs() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setJobId(jobId++);    // Job Id cannot be null or duplicate
        jobs.add(job);
    }

    @Override
    public Job getJobById(Long jobId) {
        for (Job job: jobs)
            if (job.getJobId().equals(jobId)) return job;
        return null;
    }

    @Override
    public boolean deleteJobById(Long jobId) {
        Iterator<Job> iterator = jobs.iterator();
        while (iterator.hasNext()) {    // Returns true if the iteration has more elements
            Job job = iterator.next();  // Returns the next element in the iteration.
            if (job.getJobId().equals(jobId)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

}
