package com.hjp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hjp.dao.LoginMapper;
import com.hjp.entity.UserEntity;
import com.hjp.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginMapper loginMapper;
	
	@Override
	@Transactional
	public int checkUserInfo(UserEntity param) {
		return loginMapper.checkUserInfo(param);
	}

}
