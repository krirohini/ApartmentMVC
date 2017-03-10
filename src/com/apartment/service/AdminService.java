package com.apartment.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.apartment.dao.AdminDao;
import com.apartment.vo.Admin;

public class AdminService {
	
	@Autowired
	AdminDao theAdminDao;
	
	public Admin getProfileById(int id) {
		System.out.println("Inside AdminService AND....id is ..."+ id);
		Admin admin = theAdminDao.getProfileById(id);
		
		if(admin.getId()==id) {
//			System.out.println(admin.toString());
			return admin;
		}else {
			return null;
		}
	}

	public String generateId(String firstName, String phone) {
		String newId = theAdminDao.generateId(firstName, phone);
		return newId;
	}
}
