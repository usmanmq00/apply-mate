package com.applyMate.job.controller;

import com.applyMate.job.entity.Job;
import com.applyMate.job.service.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/jobs")   // Base url for all endpoints in controller and both for class and method level
public class JobController {

    public JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping // reduced code
    //@RequestMapping(value = "/jobs", method = RequestMethod.GET) // url + type => alternative for http mapping annotations
    public ResponseEntity<List<Job>> getAllJobs() {
        return ResponseEntity.ok(jobService.getAllJobs());
    }
    // Response Entity is wrapper over your response.

    @PostMapping
    public ResponseEntity<String> createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return new ResponseEntity<>("Job added successfully!", HttpStatus.OK);  // second way of using response entity
    }

    @GetMapping("/{jobId}")
    public ResponseEntity<Object> getJobById(@PathVariable Long jobId) {
        Job job = jobService.getJobById(jobId);
        if (job!=null)
            return ResponseEntity.ok(job);
        //return ResponseEntity.notFound().build();
        // we use .build() because ResponseEntity.notFound() only creates a builder, not the final response.
        // It finalizes the response and converts the builder into a real ResponseEntity object.
        return new ResponseEntity<>("Job with id: "+jobId+" not found.", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{jobId}")
    public ResponseEntity<String> deleteJobById(@PathVariable Long jobId) {
        boolean isJobDeleted = jobService.deleteJobById(jobId);
        if (isJobDeleted)
            return ResponseEntity.ok("Job deleted successfully!");
        return new ResponseEntity<>("Job with id: "+jobId+" not found.", HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{jobId}")
    public ResponseEntity<String> updateJobById(@PathVariable Long jobId,@RequestBody Job updatedJob) {
        boolean isJobUpdated = jobService.updateJobById(jobId, updatedJob);
        if (isJobUpdated)
            return ResponseEntity.ok("Job updated successfully!");
        return new ResponseEntity<>("Job with id: "+jobId+" not found.", HttpStatus.NOT_FOUND);
    }

}
