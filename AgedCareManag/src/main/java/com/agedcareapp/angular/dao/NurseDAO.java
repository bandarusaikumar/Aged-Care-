package com.agedcareapp.angular.dao;

import java.util.List;
import java.util.Map;

import com.agedcareapp.angular.model.Nurse;

public interface NurseDAO {
	public List<Nurse> allNurse();
	public Nurse createNurse(Nurse nurse);
	public Nurse updateNurse(Nurse nurse);
	public void deleteNurse(long id);
	public List<Map<String, Object>> searchNurseByName(String name);
	public Nurse searchNurseById(long id);
	
	
}