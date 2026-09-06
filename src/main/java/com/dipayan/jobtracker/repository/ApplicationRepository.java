package com.dipayan.jobtracker.repository;
import com.dipayan.jobtracker.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

//Create a repository for the Application entity, whose primary key type is LONG
public interface ApplicationRepository extends JpaRepository<Application, Long> {
    
}
