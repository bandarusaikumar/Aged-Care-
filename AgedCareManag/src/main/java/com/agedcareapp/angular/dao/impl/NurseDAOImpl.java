package com.agedcareapp.angular.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.agedcareapp.angular.constants.Nurse_Constant;
import com.agedcareapp.angular.dao.NurseDAO;
import com.agedcareapp.angular.model.Nurse;
import com.agedcareapp.angular.rowmapper.NurseRowMapper;


@Repository
public class NurseDAOImpl implements NurseDAO {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	NurseRowMapper nurseRowMapper;
	
	@Override
	public List<Nurse> allNurse()
	{
		return namedParameterJdbcTemplate.query(Nurse_Constant.FETCH_SQL,nurseRowMapper);
	}

	@Override
	public Nurse createNurse(Nurse nurse) {
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource parameters = new MapSqlParameterSource()
				.addValue("contact_number", nurse.getContactNumber())
				.addValue("email_id", nurse.getEmailId())
				.addValue("name", nurse.getName());
		namedParameterJdbcTemplate.update(Nurse_Constant.INSERT_SQL, parameters, holder);
		nurse.setId(holder.getKey().longValue());
		return nurse;
	}

	@Override
	public Nurse updateNurse(Nurse nurse) {
		KeyHolder holder=new GeneratedKeyHolder();
		SqlParameterSource parameter=new MapSqlParameterSource()
				.addValue("id", nurse.getId())
				.addValue("contact_number", nurse.getContactNumber())
				.addValue("email_id",nurse.getEmailId())
				.addValue("name", nurse.getName());
		namedParameterJdbcTemplate.update(Nurse_Constant.UPDATE_SQL, parameter, holder);
		return nurse;
	}

	@Override
	public void deleteNurse(long id) {
		Map<String, Long> parameter = new HashMap<>();
		parameter.put("id", id);
		namedParameterJdbcTemplate.update(Nurse_Constant.DELETE_SQL, parameter);
	}
	
	@Override
	public List<Map<String, Object>> searchNurseByName(String name){
		Map<String, String> parameter = new HashMap<>();
		parameter.put("name", name);
		return namedParameterJdbcTemplate.queryForList(Nurse_Constant.FETCH_SQL_BY_NAME, parameter);
	}
	@Override
	public Nurse searchNurseById(long id) {
		Map<String, Long> parameter = new HashMap<>();
		parameter.put("id", id);
		return namedParameterJdbcTemplate.queryForObject(Nurse_Constant.FETCH_SQL_BY_ID, parameter,nurseRowMapper);
	}
}
