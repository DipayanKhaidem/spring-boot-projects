package com.dipayan.jobtracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;

@Entity 
public class Application {

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)  // this tells Hibernate that Db should generate the id automatically
    private Long id;
    //This tells the JPA : This field is the primary key of the dB table

    private String company;
    private String position;
    private String location;
    private String status;
    private LocalDate appliedDate;
    private String jobUrl;
    private String notes;

    public Application()
    {} //constructor for JPA

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company=company;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position=position;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location=location;
    }

    public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}

public LocalDate getAppliedDate() {
    return appliedDate;
}

public void setAppliedDate(LocalDate appliedDate) {
    this.appliedDate = appliedDate;
}

public String getJobUrl() {
    return jobUrl;
}

public void setJobUrl(String jobUrl) {
    this.jobUrl = jobUrl;
}

public String getNotes() {
    return notes;
}

public void setNotes(String notes) {
    this.notes = notes;
}


}
