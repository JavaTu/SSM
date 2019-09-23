/*
 * 文件名称: CustomerController.java
 * 版权信息: Copyright 2001-2017 test technology Co., LTD. All right reserved.
 * ----------------------------------------------------------------------------------------------
 * 修改历史:
 * ----------------------------------------------------------------------------------------------
 * 修改原因: 新增
 * 修改人员: huangjp
 * 修改日期: 2019-6-24
 * 修改内容: 
 */
package com.hjp.action;

import com.alibaba.fastjson.JSONObject;
import com.hjp.entity.Customer;
import com.hjp.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 功能描述: 客户信息请求入口<p>  
 * 新增原因: TODO<p>  
 * 新增日期: 2019-6-24 <p>  
 * 
 * @author huangjp
 * @version 1.0.0
 */
@Controller
@RequestMapping("/customer")
public class CustomerController{

    @Resource
    private CustomerService customerService;

    /**
     * 获取客户列表
     * @param reqParam 查询参数
     * @return
     */
    @RequestMapping("/list")    // ?
    @ResponseBody               // ?
    public String findList(Map<String, Object> reqParam){

        JSONObject result = new JSONObject();       // ?
        List<Customer> list = customerService.findList(reqParam);
        result.put("rows", list);

        return result.toJSONString();
    }

}
