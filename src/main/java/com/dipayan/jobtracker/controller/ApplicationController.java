package com.dipayan.jobtracker.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dipayan.jobtracker.service.ApplicationService;
import com.dipayan.jobtracker.entity.Application;
import java.util.List; 

@RestController 


//Sets the common URL path for all endpoints in this controller
@RequestMapping("/api/applications") 
public class ApplicationController {

    private final ApplicationService service; //Service responsible for business logic

    //Constructor injection
    public ApplicationController(ApplicationService service){
        this.service=service;
    }

    @GetMapping
    public List<Application> getAllApplications(){
         return service.getAllApplications(); //Returns all job applications from the database 
    } 

    @PostMapping
    public Application createApplication(@RequestBody Application application){
        return service.saveApplication(application);
    }

    @GetMapping("/{id}")
    public Application getApplicationById(@PathVariable Long id){
        return service.getApplicationById(id);
    }

    @PutMapping("/{id}")
    public Application updateApplication(
        @PathVariable  Long id,
        @RequestBody Application application)
    {
        return service.updateApplication(id, application);
    }

    @DeleteMapping("/{id}")
    public void deleteApplication(@PathVariable Long id){
        service.deleteApplication(id);
    }
}
