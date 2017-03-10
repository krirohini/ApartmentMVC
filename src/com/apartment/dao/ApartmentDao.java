package com.apartment.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.apartment.vo.Apartment;

public class ApartmentDao {
	
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	
	@Autowired 
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public DataSource getDataSource() {				
		return dataSource;
	}
	
	
	public Apartment getApartmentInfo(int id) {
		String sql = "select * from apt_apartment WHERE ID ='" + id +"'"; 		  
		//System.out.println("========Inside====ApartmentDao=======");
		Apartment apartmentDao =(Apartment) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Apartment>(Apartment.class));
		System.out.println(apartmentDao.toString());
		return apartmentDao;		  
	}

	public List<Apartment> getApartmentList() {
		List<Apartment> apartmentList = new ArrayList<>();
		String sql = "select * from apt_apartment";
		apartmentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Apartment>(Apartment.class));
		System.out.println(apartmentList);
		return apartmentList;
	}
}
