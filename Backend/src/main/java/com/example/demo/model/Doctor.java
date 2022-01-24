package com.example.demo.model;


import java.util.List;
import java.util.stream.Collector;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "specialist_fields")
	private String specialist_fields;
	@Column(name = "no_ofPatient")
	private int no_ofPatient;
	

	public Doctor() {

	}


	public Doctor(String name, int age, String gender, String specialist_fields, int no_ofPatient) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialist_fields = specialist_fields;
		this.no_ofPatient = no_ofPatient;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getSpecialist_fields() {
		return specialist_fields;
	}


	public void setSpecialist_fields(String specialist_fields) {
		this.specialist_fields = specialist_fields;
	}


	public int getNo_ofPatient() {
		return no_ofPatient;
	}


	public void setNo_ofPatient(int no_ofPatient) {
		this.no_ofPatient = no_ofPatient;
	}


	 
	

	 
	

	
}

