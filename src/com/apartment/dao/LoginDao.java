package com.apartment.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.apartment.vo.Login;

public class LoginDao {

	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	
	public DataSource getDataSource() {				
		return dataSource;
	}
	
	@Autowired 
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Login getProfile(String loginName, String password) {   		  
		  String sql = "select * from apt_login WHERE LOGIN_NAME ='" + loginName +"' AND PASSWORD = '" + password +"' " ; 
		  System.out.println("loginName..."+loginName);
		  System.out.println("Inside LoginDao=======");
		  try {
			  Login logDao=(Login) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Login>(Login.class));
			  System.out.println(logDao.toString());
			  System.out.println("Query for Object");
			  return logDao;
		  }catch (Exception exp) {
			  return null;
		  }
		    
	} 
	
//	public Tenant getTenantProfile(String id){
//		String sql = "select Tenant_ID from wlogin where "
//	}
		
}
