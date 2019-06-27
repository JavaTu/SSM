package com.hjp.service;

import com.hjp.dao.LoginDao;
import com.hjp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	private LoginDao loginMapper;
	
	public int checkUserInfo(User param) {
		return loginMapper.checkUserInfo(param);
	}

}
