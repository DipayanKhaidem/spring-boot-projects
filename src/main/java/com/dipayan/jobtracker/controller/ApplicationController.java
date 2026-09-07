package com.dipayan.jobtracker.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
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

}
