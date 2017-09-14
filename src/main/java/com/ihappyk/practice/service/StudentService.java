package com.ihappyk.practice.service;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihappyk.practice.domains.Student;
import com.ihappyk.practice.repository.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository studentRepository;
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public Long createStudent(Student student) {
		Student savedStudent = 	studentRepository.save(student);
		return savedStudent.getSid();
	}
	
	public List<Student> getStudents() {
		List<Student> studentList = new ArrayList<Student>();
		Iterable<Student> iterator =  studentRepository.findAll();
		iterator.forEach(student -> studentList.add(student));
		return studentList;
	}
	
	public List<Student> getStudentsByEmail(String email) {
		List<Student> studentList = new ArrayList<Student>();
		Iterable<Student> iterator =  studentRepository.findByemail(email);
		iterator.forEach(student -> studentList.add(student));
		return studentList;
	}
}
