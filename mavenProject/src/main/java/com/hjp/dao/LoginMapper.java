package com.hjp.dao;

import org.apache.ibatis.annotations.Param;

import com.hjp.entity.UserEntity;

public interface LoginMapper {

	/**
	 * ��ѯ�û��Ƿ����
	 * @param : 
	 * @return:
	 */
	public int checkUserInfo(@Param("param")UserEntity param);
	
}
