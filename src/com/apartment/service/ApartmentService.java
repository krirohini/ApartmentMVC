package com.apartment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.apartment.dao.ApartmentDao;
import com.apartment.vo.Apartment;

public class ApartmentService {
	
	@Autowired 
	ApartmentDao theApartmentDao;
	
	public Apartment getApartmentInfo(int id) {
		Apartment apartment = theApartmentDao.getApartmentInfo(id);
		if ( apartment.getId()==id ) {
			return apartment;
		} else {
			return null;
		}	
	}

	public List<Apartment> getApartmentList() {
		List<Apartment> list = theApartmentDao.getApartmentList();
		return list;
	}

}
