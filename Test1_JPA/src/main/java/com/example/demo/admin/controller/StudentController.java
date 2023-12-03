package com.example.demo.admin.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.admin.entity.Student;
import com.example.demo.admin.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

//    @PostMapping
//    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
//        Student savedStudent = studentService.saveStudent(student);
//        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public ResponseEntity<Iterable<Student>> getAllStudents() {
//        Iterable<Student> students = studentService.getAllStudents();
//        return new ResponseEntity<>(students, HttpStatus.OK);
//    }
    
    @PostMapping("/insert")
    public ResponseEntity<Void> insertStudents(@RequestBody List<Student> students) {
        for (Student student : students) {
            studentService.insertStudent(student.getName(), student.getAge());
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get")
    public ResponseEntity<Student> getPerson(@RequestParam String name, @RequestParam Integer age) {
        Student person = studentService.getStudentByNameAndAge(name, age);
        return ResponseEntity.ok(person);
    }

    // Other CRUD operations as needed

}

