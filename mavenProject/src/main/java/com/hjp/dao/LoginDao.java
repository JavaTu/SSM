package com.hjp.dao;

import org.apache.ibatis.annotations.Param;

import com.hjp.entity.User;

public interface LoginDao {

	int checkUserInfo(@Param("param") User param);
	
}
