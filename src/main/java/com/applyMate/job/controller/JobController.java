package com.applyMate.job.controller;

import com.applyMate.job.entity.Job;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
