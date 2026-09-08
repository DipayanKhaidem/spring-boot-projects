package com.dipayan.jobtracker.service;

import com.dipayan.jobtracker.repository.ApplicationRepository;
import org.springframework.stereotype.Service;
import com.dipayan.jobtracker.entity.Application;
import com.dipayan.jobtracker.exception.ApplicationNotFoundException;

import java.util.List;

@Service  //Create one managed object(bean) of this class
public class ApplicationService {

    //Dependency Injection: Injecting the repository object into this service class
    private final ApplicationRepository repository;
    public ApplicationService(ApplicationRepository repository){
        this.repository=repository;
    }

    //Retrieves all job applications from the database
    public List<Application> getAllApplications(){
        return repository.findAll();
    }

    //Saves new job application to the database
    public Application saveApplication(Application application){
        return repository.save(application);
    }

    public Application getApplicationById(Long id){
        return repository.findById(id).orElseThrow(() -> new ApplicationNotFoundException("Application not found with id:" + id));

        //If an application exists with this ID, give it to me. Otherwise, throw an exception
    }

    public Application updateApplication(Long id, Application updatedApplication){
        Application existingApplication= repository.findById(id)
        .orElseThrow(()-> new ApplicationNotFoundException("Application not found with id:" + id));

        existingApplication.setCompany(updatedApplication.getCompany());
        existingApplication.setPosition(updatedApplication.getPosition());
        existingApplication.setLocation(updatedApplication.getLocation());
        existingApplication.setStatus(updatedApplication.getStatus());
        existingApplication.setAppliedDate(updatedApplication.getAppliedDate());
        existingApplication.setJobUrl(updatedApplication.getJobUrl());
        existingApplication.setNotes(updatedApplication.getNotes());
        
        return repository.save(existingApplication);
    }

    public void deleteApplication(Long id){

        //check whetther the application exists in the DB
        if(!repository.existsById(id)){
            throw new ApplicationNotFoundException("Application not found with id:" + id);
        }
        repository.deleteById(id);
    }

}
