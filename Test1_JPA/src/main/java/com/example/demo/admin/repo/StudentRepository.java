package com.example.demo.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.lang.Long;

import com.example.demo.admin.entity.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // You can add custom queries here if needed

    // Custom query to insert a student
	
	@Modifying
    @Query("INSERT INTO Student s (s.name, s.age) VALUES (:name, :age)")
    void insertStudent(@Param("name") String name, @Param("age") Integer age);

    // Custom query to get a student by name and age
    @Query("SELECT s FROM Student s WHERE s.name = :name AND s.age = :age")
    Student getStudentByNameAndAge(@Param("name") String name, @Param("age") Integer age);

}