package com.example.demo.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.admin.entity.Student;
import com.example.demo.admin.repo.StudentRepository;

import jakarta.transaction.Transactional;

@Service
public class StudentService {
	
	@Autowired
    private final StudentRepository studentRepository;

    
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Other service methods as needed
    @Transactional
    public void insertStudent(String name, Integer age) {
        studentRepository.insertStudent(name, age);
    }

    public Student getStudentByNameAndAge(String name, Integer age) {
        return studentRepository.getStudentByNameAndAge(name, age);
    }
}



