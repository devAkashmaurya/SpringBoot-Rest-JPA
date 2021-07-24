package com.springrest.springrest.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseServices {

	@Autowired
	private CourseDao courseDao;
//	List<Course> list;

	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(134, "java", "this is awesome course"));
//		list.add(new Course(137, "php", "this is very awesome course"));
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub

		return courseDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Course c = null;
//		for (Course course : list) {
//			if (course.getId() == courseId) {
//                c=course;
//			}
	//}
		
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		//list.add(course);
		return courseDao.save(course);
	}

	@SuppressWarnings("deprecation")
	@Override
	public Course deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		
	//	list = this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
		Course entity=courseDao.getOne(courseId);
		courseDao.delete(entity);
		return entity;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
//		list.forEach(e->{if (e.getId()==course.getId()) {
//			e.setDescription(course.getDescription());
//			e.setTitle(course.getTitle());
//		}});
		courseDao.save(course);
		return course;
	}

}
