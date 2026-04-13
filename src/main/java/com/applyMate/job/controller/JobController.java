package com.applyMate.job.controller;

import com.applyMate.job.entity.Job;
import com.applyMate.job.service.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class JobController {

    public JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> getAllJobs() {
        return ResponseEntity.ok(jobService.getAllJobs());
    }

    @PostMapping("/jobs")
    public ResponseEntity<String> createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return new ResponseEntity<>("Job added successfully!", HttpStatus.OK);  // second way of using response entity
    }

    @GetMapping("/jobs/{jobId}")
    public ResponseEntity<Object> getJobById(@PathVariable Long jobId) {
        Job job = jobService.getJobById(jobId);
        if (job!=null)
            return ResponseEntity.ok(job);
        //return ResponseEntity.notFound().build();
        // we use .build() because ResponseEntity.notFound() only creates a builder, not the final response.
        // It finalizes the response and converts the builder into a real ResponseEntity object.
        return new ResponseEntity<>("Job with id: "+jobId+" not found.", HttpStatus.NOT_FOUND);
    }

}
