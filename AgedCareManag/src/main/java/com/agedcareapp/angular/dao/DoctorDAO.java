package com.agedcareapp.angular.dao;

import java.util.List;
import java.util.Map;

import com.agedcareapp.angular.model.Doctor;


public interface DoctorDAO {
	public List<Doctor> allDoctors();
	public Doctor createDoctor(Doctor doctor);
	public Doctor updateDoctor(Doctor doctor);
	public void deleteDoctor(long id);
	public List<Map<String, Object>> searchDoctorByName(String name);
	public Doctor searchDoctorById(long id);
	
}