package com.ihappyk.practice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ihappyk.practice.domains.Student;
import com.ihappyk.practice.service.StudentService;

@RestController
@RequestMapping(value="/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method=RequestMethod.POST,
			 produces = "application/json",
			 consumes = "application/json")
	public Long create(@RequestBody Student student) {
		return this.studentService.createStudent(student);
	}
	
	@RequestMapping(method=RequestMethod.GET,
			 produces = "application/json",
			 consumes = "application/json")
	public List<Student> getAllStudents() {
		return this.studentService.getStudents();
	}	
	
	@RequestMapping(value="/email",method=RequestMethod.GET,
			 produces = "application/json",
			 consumes = "application/json")
	public List<Student> getStudentsByEmail(@RequestParam String email) {
		return this.studentService.getStudentsByEmail(email);
	}
	
}
