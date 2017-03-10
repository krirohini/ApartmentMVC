package com.apartment.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.apartment.vo.Tenant;

public class TenantDao {

	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public DataSource getDataSource() {
		return dataSource;
	}
	

	public Tenant getProfileById(int id) {
		String sql = "select * from apt_tenant WHERE ID='" + id + "'";
//		System.out.println("Inside TenantDao....." + sql);
		Tenant tenant = (Tenant) jdbcTemplate.queryForObject(sql,
				new BeanPropertyRowMapper<Tenant>(Tenant.class));
//		System.out.println("In TenantDao ....tennatID..." + tenant.getId());
		System.out.println("Inside TenantDao.....AND.....Tenant Data is.....");
		return tenant;
	}
	

	public Tenant getProfileByEmailId(String email) {
		String sql = "select * from apt_tenant WHERE ID='" + email + "'";
//		System.out.println("Inside TenantDao....." + sql);
		Tenant tenant = (Tenant) jdbcTemplate.queryForObject(sql,
				new BeanPropertyRowMapper<Tenant>(Tenant.class));
//		System.out.println("In TenantDao ....tennatID..." + tenant.getId());
		System.out.println("Inside TenantDao.....AND.....Tenant Data is.....");
		return tenant;
	}
	
	
	// Function To Get All Tenant
	public List<Tenant> getTenantList() {
		List<Tenant> tenantList = new ArrayList<>();
		String sql = "select * from apt_tenant";
		tenantList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Tenant>(
				Tenant.class));
		System.out.println(tenantList);
		return tenantList;
	}

	// Function For Update Or Insert Tenant
	public void upsertTenant(Tenant tenant ) {
		String sql = null;
		int num = 0;
		int tenantId = Integer.parseInt(tenant.getId());
		System.out.println("tenanatid " + tenantId);
		if (tenantId >= 0) {

			sql = "UPDATE apt_tenant SET FIRST_NAME= ?, MIDDLE_NAME= ?, LAST_NAME= ?, "
					+ "SEX= ?, AGE= ?, PHONE= ?, EMAIL_ID= ?, APART_ID= ?, "
					+ "LEASE_START_DATE= ?, LEASE_END_DATE= ?, "
					+ "IDENTIFICATION_DOCUMENT_TYPE= ?, IDENTIFICATION_DOCUMENT_ID= ?,"
					+ "IDENTIFICATION_DOCUMENT_EXPIRY_DATE= ?, OCCUPATION= ? , "
					+ "ANNUAL_INCOME= ?, PERMANENT_ADDRESS= ?, DESCRIPTION= ? "
					+ "WHERE ID ='" + tenantId + "'";
			System.out.println("Update tenant Record" + sql);

			num = jdbcTemplate.update(
					sql,
					new Object[] { tenant.getFirstName(),
							tenant.getMiddleName(), tenant.getLastName(),
							tenant.getSex(), tenant.getAge(),
							tenant.getPhone(), tenant.getEmailId(),
							tenant.getApartId(), tenant.getLeaseEndDate(),
							tenant.getLeaseEndDate(),
							tenant.getIdentificationDocumentType(),
							tenant.getIdentificationDocumentId(),
							tenant.getIdentificationDocumentExpiryDate(),
							tenant.getOccupation(), tenant.getAnnualIncome(),
							tenant.getPermanentAddress(),
							tenant.getDescription() });

		} else {
			sql = "INSERT INTO apt_tenant "
					+ "( FIRST_NAME, MIDDLE_NAME, LAST_NAME, "
					+ "SEX, AGE, PHONE, EMAIL_ID, APART_ID, "
					+ "LEASE_START_DATE, LEASE_END_DATE, "
					+ "IDENTIFICATION_DOCUMENT_TYPE, IDENTIFICATION_DOCUMENT_ID,"
					+ "IDENTIFICATION_DOCUMENT_EXPIRY_DATE, OCCUPATION , "
					+ "ANNUAL_INCOME, PERMANENT_ADDRESS, DESCRIPTION ) "
					+ "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

			System.out.println("Insert tenant Record" + sql);

			num = jdbcTemplate.update(
					sql,
					new Object[] { tenant.getFirstName(),
							tenant.getMiddleName(), tenant.getLastName(),
							tenant.getSex(), tenant.getAge(),
							tenant.getPhone(), tenant.getEmailId(),
							tenant.getApartId(), tenant.getLeaseEndDate(),
							tenant.getLeaseEndDate(),
							tenant.getIdentificationDocumentType(),
							tenant.getIdentificationDocumentId(),
							tenant.getIdentificationDocumentExpiryDate(),
							tenant.getOccupation(), tenant.getAnnualIncome(),
							tenant.getPermanentAddress(),
							tenant.getDescription() });
		}

		System.out.println("no of rows affected" + num);
	}

}
