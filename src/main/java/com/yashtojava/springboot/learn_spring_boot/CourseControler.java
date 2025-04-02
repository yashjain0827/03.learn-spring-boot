package com.yashtojava.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseControler {

	@RequestMapping("/courses")
	public List<Course> retriveAllCourses() {
		return Arrays.asList(new Course(1, "learn AWS", "by_yash"), new Course(2, "learn react", "by_ayush"),
				new Course(3, "learn python", "by_muskan"),new Course(4, "learn cpp", "by_kittu"),new Course(5, "learn python", "by_muskan")

		);
	}

}
