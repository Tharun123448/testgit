package com.jpaexample.jpademo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpaexample.jpademo.entites.Projects;

@Repository
public interface ProjectsDoaServices extends JpaRepository<Projects, Integer> {

}
