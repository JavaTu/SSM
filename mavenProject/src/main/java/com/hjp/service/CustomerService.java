package com.hjp.service;

import com.hjp.dao.CustomerDao;
import com.hjp.entity.Customer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 功能描述: 客户信息服务接口<p>
 * 新增原因: TODO<p>
 * 新增日期: 2019-6-24 <p>
 *
 * @author huangjp
 * @version 1.0.0
 */
@Service
public class CustomerService{

    @Resource
    private CustomerDao customerDao;

    /**
     * 获取客户列表
     * @param reqParam
     * @return
     */
    public List<Customer> findList(Map<String, Object> reqParam){
        return customerDao.findByWhere(reqParam);
    }


}
