package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;

@Service
public class ServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repo;

	@Override
	public Student createStudent(Student student) {
		Student createResponse = repo.save(student);
		return createResponse;
	}

	@Override
	public Student get(Long id) {
		Student getResponse = repo.getById(id);

		return getResponse;
	}

	@Override
	public Student update(Student student) {
		Student updateReponse = repo.save(student);
		return updateReponse;
	}

	@Override
	public void delete(Student student) {
		repo.delete(student);

	}

}
