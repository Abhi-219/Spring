package com.example.demo.admin.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Entity
@Data
@IdClass(Student.class) 
public class Student implements Serializable {

//	@Id
//  @GeneratedValue(strategy = GenerationType.AUTO)
//  private int id;

	@Id
	private String name;
	@Id
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	// Constructors, getters, and setters

	// Constructors, getters, and setters
}
