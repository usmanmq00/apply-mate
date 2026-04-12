package com.applyMate.job.controller;

import com.applyMate.job.entity.Job;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class JobController {

    private List<Job> jobs = new ArrayList<>();

    @GetMapping("/jobs")
    public List<Job> getAllJobs() {
        return jobs;
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job) {
        jobs.add(job);
        return "Job added successfully!";
    }

}
