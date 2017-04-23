package com.hjp.service;

import com.hjp.entity.UserEntity;

public interface LoginService {

	/**
	 * 查询用户名密码是否正确
	 * @param : 
	 * @return:
	 */
	public int checkUserInfo(UserEntity param);
}
