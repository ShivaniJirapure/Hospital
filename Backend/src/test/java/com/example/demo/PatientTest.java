package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.controller.PatientController;
import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.repository.PatientRepository;
@RunWith(SpringRunner.class)
@SpringBootTest
class PatientTest {
     
	@MockBean
	private PatientRepository patientRepository;
	
	@Autowired
	private PatientController service;
	
	@Test
	public void getAllpatientTest() {
		when(patientRepository.findAll()).thenReturn(Stream.of(new Patient("alok",23,"Dr. Rajendra Srivastava",new java.util.Date(System.currentTimeMillis()),"Lisinopril brand names")).collect(Collectors.toList()));
		assertEquals(1,service.getAllPatients().size());
	}
	
	@Test
	public void createDoctorTest() {
		Patient doc=new Patient("alok",23,"Dr. Rajendra Srivastava",new java.util.Date(System.currentTimeMillis()),"Lisinopril brand names");
		when(patientRepository.save(doc)).thenReturn(doc);
		 assertEquals(doc,service.createPatient(doc)); 
	}

}