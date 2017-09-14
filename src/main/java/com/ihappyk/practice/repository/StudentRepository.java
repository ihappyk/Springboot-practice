package com.ihappyk.practice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ihappyk.practice.domains.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{
	public List<Student> findByemail(String email);
}
