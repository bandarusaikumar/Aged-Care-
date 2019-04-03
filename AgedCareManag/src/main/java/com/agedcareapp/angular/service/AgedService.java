package com.agedcareapp.angular.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agedcareapp.angular.dao.impl.DoctorDAOImpl;
import com.agedcareapp.angular.dao.impl.NurseDAOImpl;
import com.agedcareapp.angular.dao.impl.PatientDAOImpl;
import com.agedcareapp.angular.model.Doctor;
import com.agedcareapp.angular.model.Nurse;
import com.agedcareapp.angular.model.Patient;


@Service
public class AgedService {
	
	@Autowired
	DoctorDAOImpl doctorDao;
	
	@Autowired
	PatientDAOImpl patientDao;
	
	@Autowired
	NurseDAOImpl nurseDao;
	
	
	List<Doctor> listDoctors;
	List<Patient> listPatients;
	List<Nurse> listNurses;
	
	
	
	//Doctor
	
	public List<Doctor> showAllDoctors(){
		listDoctors=doctorDao.allDoctors();
		return listDoctors;
	}

	public List<Map<String, Object>> searchDoctorByName(String doctorName){
		return doctorDao.searchDoctorByName(doctorName);
	}
	
	public Doctor searchDoctorById(long id) {	
		return doctorDao.searchDoctorById(id);
	}
	
	public Doctor createDoctor(Doctor doctor) {
		return doctorDao.createDoctor(doctor);
	}
	
	public Doctor updateDoctor(Doctor doctor) {
		return doctorDao.updateDoctor(doctor);
	}
	
	public void deleteDoctor(long id){
		doctorDao.deleteDoctor(id);
	}
	//Patients
	
	public List<Patient> showAllPatients(){
		listPatients=patientDao.allPatients();
		return listPatients;
	}
	
	public List<Map<String, Object>> searchPatientByName(String patientName){
		return patientDao.searchPatientByName(patientName);
	}
	
	public Patient searchPatientById(long id) {
		return patientDao.searchPatientById(id);
	}
	
	public Patient createPatient(Patient patient) {
		return patientDao.createPatient(patient);
	}
	
	public void updatePatient(Patient patient){
		patientDao.updatePatient(patient);
	}
	
	public void deletePatient(long id){
		patientDao.deletePatient(id);
	}
	
	// Nurse 
	
	public List<Nurse> showAllNurses(){
		listNurses=nurseDao.allNurse();
		return listNurses;
	}
	
	public List<Map<String, Object>> searchNurseByName(String nurseName){
		return nurseDao.searchNurseByName(nurseName);
	}
	
	public Nurse searchNurseById(long id) {
		return nurseDao.searchNurseById(id);
	}
	
	public Nurse createNurse(Nurse nurse) {
		return nurseDao.createNurse(nurse);
	}
	
	public void updateNurse(Nurse nurse){
		nurseDao.updateNurse(nurse);
	}
	
	public void deleteNurse(long id){
		nurseDao.deleteNurse(id);
	}

}
