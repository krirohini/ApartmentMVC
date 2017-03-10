package com.apartment.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.apartment.vo.Model;

public class ModelDao {

	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	
	public DataSource getDataSource() {				
		return dataSource;
	}
	
	@Autowired 
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	public Model getModelById(String id) {   		  
	  	String sql = "select * from apt_model WHERE ID='" + id + "'";  
	  	System.out.println("Inside ModelDao....." +sql);
	  	Model model = (Model) jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Model>(Model.class));
	  	System.out.println("In ModelDao ....modelId..." + model.getId());
	  	System.out.println("Inside ModelDao.....AND.....Model Data is....." + model.toString());
	  	return model;  
	}  
	
	public List<Model> getModelList() {
		List<Model> modelList = new ArrayList<>();
		String sql = "select * from apt_model";
		modelList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Model>(Model.class));
		System.out.println(modelList);
		return modelList;
	}
	
}
