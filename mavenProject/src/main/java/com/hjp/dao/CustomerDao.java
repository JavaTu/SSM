/*
 * 文件名称: CustomerDao.java
 * 版权信息: Copyright 2001-2017 test technology Co., LTD. All right reserved.
 * ----------------------------------------------------------------------------------------------
 * 修改历史:
 * ----------------------------------------------------------------------------------------------
 * 修改原因: 新增
 * 修改人员: huangjp
 * 修改日期: 2019-6-24
 * 修改内容: 
 */
package com.hjp.dao;

import com.hjp.entity.Customer;

import java.util.List;
import java.util.Map;

/**
 * 功能描述: 客户信息Dao接口类<p>  
 * 新增原因: TODO<p>  
 * 新增日期: 2019-6-24 <p>  
 * 
 * @author huangjp
 * @version 1.0.0
 */
public interface CustomerDao{

    List<Customer> findByWhere(Map<String, ?> param);

}
