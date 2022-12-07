package com.demo.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.demo.model.Student;


@Repository
public interface StudentRepository extends CrudRepository<Student,String> {
	
	public Student getByRollNo(int rollNo)
;
}
