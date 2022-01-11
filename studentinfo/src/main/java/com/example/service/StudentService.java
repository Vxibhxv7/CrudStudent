package com.example.service;
import org.springframework.stereotype.Component;

import com.example.model.Student;
@Component
public interface StudentService {

	public Student createStudent(Student student);
	public Student get(Long id);
	public Student update(Student student);
	public void delete(Student student);
	
	
	
}
