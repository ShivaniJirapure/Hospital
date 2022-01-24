package com.example.demo;

import static org.mockito.Mockito.when;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.common.base.Optional;

import com.example.demo.controller.DoctorController;
import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PatientRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class DoctorTest {
	@MockBean
	private DoctorRepository doctorRepository;
	
	@Autowired
	private DoctorController service;
	

	
	@Test
	public void getAllDoctorsTest() {
		when(doctorRepository.findAll()).thenReturn(Stream.of(new Doctor("Dr. Brahmadeva Dwivedi",45,"Male","Pediatric Surgeon",10)).collect(Collectors.toList()));
		assertEquals(1,service.getAllDoctors().size());
	}
	
//	@Test
//	public void createDoctorTest() {
//		Doctor doc=new Doctor("Dr. Brahmadeva Dwivedi",45,"Male","Pediatric Surgeon",10);
//		when(doctorRepository.save(doc)).thenReturn(doc);
//		 assertEquals(doc,service.createDoctor(doc)); 
//	}
	

} 
