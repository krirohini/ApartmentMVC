package com.apartment.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.apartment.vo.Admin;

public class AdminDao {
	
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	
	public DataSource getDataSource() {				
		return dataSource;
	}
	
	@Autowired 
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Admin getProfileById(int id) {   		  
	  	String sql = "select * from apt_admin WHERE ID='" + id + "'";  
	  	System.out.println("Inside AdminDao....." +sql);
	  	Admin admin = (Admin) jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Admin>(Admin.class));
	  	System.out.println("In AdminDao ....adminId..." + admin.getId());
	  	System.out.println("Inside AdminDao.....AND.....Admin Data is.....");
	  	return admin;  
	}  

//	public String generateId(String firstName, long phone)
	public String generateId(String firstName, String phone) {
		String generatedId = firstName + phone;
		return generatedId;		
	}
}
