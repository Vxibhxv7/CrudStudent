package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService service;

	@PostMapping("/create")
	public Student createstud(Student student) {
		Student createReponse = service.createStudent(student);
		return createReponse;

	}

	@GetMapping("/id")
	public Student getStud(Long id) {
		Student getStudentResponse = service.get(id);
		return getStudentResponse;

	}

	@DeleteMapping("/delete")
	public String deleteStud(Student student) {
		service.delete(student);
		return "deleted";
	}

	@PutMapping("/update")
	public Student updateStud(Student student) {
		Student updateResponse = service.update(student);
		return updateResponse;
	}
}
