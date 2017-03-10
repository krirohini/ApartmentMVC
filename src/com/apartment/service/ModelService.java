package com.apartment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.apartment.dao.ModelDao;
import com.apartment.vo.Model;

public class ModelService {
	
	@Autowired 
	ModelDao theModelDao;
	
	public Model getModel  (String id) {
		System.out.println("Inside ModelService AND....id is ..."+ id);
		Model model = theModelDao.getModelById(id);
		
		return model;
		
//		if(model.getId()==id) {
//			return model;
//		}else {
//			return null;
//		}
	}

	
	public List<Model> getModelList() {
		List<Model> modelList = theModelDao.getModelList();
		return modelList;
	}
}
