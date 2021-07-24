package com.springrest.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseServices;

@RestController
public class MyController {
	
	@Autowired
	private CourseServices courseService;
	
	@GetMapping("/home")
	public String home() {
		
		return "this is home page";
	}
	
	//get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
		return this.courseService.getCourses();
	}
	//get the single course
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
		
	}
	
	//post/save the course
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		
		return this.courseService.addCourse(course);
		
	}
	
	@DeleteMapping("/courses/delete/{courseId}")
	public Course deleteCourse(@PathVariable String courseId){
		return this.courseService.deleteCourse(Long.parseLong(courseId));
		
	}
    @PutMapping("/course")
    public Course updateCourse(@RequestBody Course course) {
    	
    	return this.courseService.updateCourse(course);
    }
}
