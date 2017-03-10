package com.apartment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.apartment.dao.TenantDao;
import com.apartment.vo.Tenant;

public class TenantService {
	
	@Autowired
	TenantDao theTenantDao;	
	
	public Tenant getProfileById(int id) {
		System.out.println("Inside Tenant Service AND....id is ..."+ id);
		Tenant tenant = theTenantDao.getProfileById(id);
		
		if(Integer.parseInt(tenant.getId())==id) {
			System.out.println(tenant.toString());
			return tenant;
		}else {
			return null;
		}
	}
	
	
	public Tenant getProfileByEmailId(String email) {
		System.out.println("Inside Tenant Service AND....id is ..."+ email);
		Tenant tenant = theTenantDao.getProfileByEmailId(email);
		
		if((tenant.getEmailId()).equals(email)) {
			System.out.println(tenant.toString());
			return tenant;
		}else {
			return null;
		}
	}
	

	public void updateTenantProfile(Tenant t) {
		System.out.println("=========TenantService======upsertTenant(Tenant t, String id)=========");
		theTenantDao.upsertTenant(t);
		System.out.println("");		
	}

	
	//Function to Get All Tenant ... Called By Controller ....
	public List<Tenant> getTenantList() {
		List<Tenant> tenantList = theTenantDao.getTenantList();
		return tenantList;
	}
	
	
	public void addNewTenant(Tenant t) {
		System.out.println(("=========TenantService======addTenant(Tenant t)========="));
		t.setId("-1");
		theTenantDao.upsertTenant(t);
	}
	
	
	
}
