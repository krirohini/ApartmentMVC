package com.apartment.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.apartment.dao.LoginDao;
import com.apartment.vo.Login;

public class LoginService {
	
	@Autowired 
	LoginDao theLoginDao;
	
	public Login authenticateAndReturnRole(String loginName, String password) {
		Login loginVO = theLoginDao.getProfile(loginName, password);
		
		if ((null != loginVO) && (loginVO.getPassword().equals(password))) {
			String role = loginVO.getRole();
			if (null != role && !role.isEmpty()) {
				System.out.println("Role is ... " + role);
				if (("TENANT".equalsIgnoreCase(role))
						&& null != loginVO.getTenantId()
						&& !loginVO.getTenantId().isEmpty()) {
					System.out.println("TenantId is ....." + loginVO.getTenantId());
					return loginVO;
				} else if (("ADMIN".equalsIgnoreCase(role))
						&& null != loginVO.getAdminId()
						&& !loginVO.getAdminId().isEmpty()) {
					System.out.println("AdminId is ....." + loginVO.getAdminId());
					return loginVO;
				}
			}
		}

		return null;

	}
}
