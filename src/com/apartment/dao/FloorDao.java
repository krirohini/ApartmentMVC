package com.apartment.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.apartment.vo.Floor;

public class FloorDao {

	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	
	public DataSource getDataSource() {				
		return dataSource;
	}
	
	@Autowired 
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Floor getFloor() { 
						
		  String sql = "select * from apt_floor" ;		  				
		  System.out.println("Inside FloorDao=======");
		  try {
			  Floor floorDao=(Floor) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Floor>(Floor.class));
			  System.out.println(floorDao.toString());
			  System.out.println("Query for Object");
			  return floorDao;
		  }catch (Exception exp) {
			  return null;
		  }
		    
	}

	public List<Floor> getFloorList() {
		List<Floor> floorList = new ArrayList<>();
		String sql = "select * from apt_floor";
		floorList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Floor>(Floor.class));
		System.out.println(floorList);
		return floorList;
	} 
	

		
}
