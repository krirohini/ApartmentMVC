package com.apartment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apartment.dao.FloorDao;
import com.apartment.vo.Floor;

@Service
public class FloorService {
	
	@Autowired 
	FloorDao theFloorDao;
	
	public Floor getFloorInfo() {
		
		Floor floorVO = theFloorDao.getFloor();		
//		if ((null != floorVO) ) {
//			return floorVO;
//		}
		return floorVO;
	}
	
	
	public List<Floor> getFloorList() {
		List<Floor> floorList = theFloorDao.getFloorList();
		return floorList;
	}
}

