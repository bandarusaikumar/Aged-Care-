package com.agedcareapp.angular.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.agedcareapp.angular.model.Nurse;


@Component
public class NurseRowMapper implements RowMapper<Nurse> {

	@Override
	public Nurse mapRow(ResultSet rs, int rowNum) throws SQLException {
		Nurse nurse = new Nurse();
		nurse.setId(rs.getLong(1));
		nurse.setContactNumber(rs.getLong(3));
	    nurse.setEmailId(rs.getString(6));
		nurse.setName(rs.getString(8));
		return nurse;
	}

}
