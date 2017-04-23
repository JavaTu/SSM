package com.hjp.dao;

import org.apache.ibatis.annotations.Param;

import com.hjp.entity.UserEntity;

public interface LoginMapper {

	/**
	 * 查询用户是否存在
	 * @param : 
	 * @return:
	 */
	public int checkUserInfo(@Param("param")UserEntity param);
	
}
