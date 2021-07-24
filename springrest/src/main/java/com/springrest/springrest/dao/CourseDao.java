package com.springrest.springrest.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {
	
	

}
