package com.agedcareapp.angular.constants;

public class Nurse_Constant {
	
	public static final String FETCH_SQL_BY_ID = "select * from Nurse where Nurse_id = :id";
	public static final String FETCH_SQL_BY_NAME = "select * from Nurse where name = :name";
	public static final String FETCH_SQL = "select * from Nurse";
	public static final String INSERT_SQL = "insert into Nurse(contact_number,email_id,name)"
			+ " values(:contact_number,:email_id, :name)";
	public static final String UPDATE_SQL = "update Nurse set contact_number=:contact_number"
			+ "email_id=:email_id, name=:name where Nurse_id=:id";
	public static final String DELETE_SQL = "delete from Nurse where Nurse_id=:id";
}
