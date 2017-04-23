package com.hjp.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.hjp.entity.UserEntity;
import com.hjp.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Resource
	private LoginService loginService;
	
	@RequestMapping("/checkInfo")
	@ResponseBody
	public String checkInfo(UserEntity param,HttpServletRequest request){
		
		int count = loginService.checkUserInfo(param);
		JSONObject returnVal = new JSONObject();
		
		if(count == 1){
			//�û���Ϣ����session��
			HttpSession session = request.getSession();
			session.setAttribute("user", param);
			returnVal.put("success", true);
		}else{
			returnVal.put("success", false);
		}
		
		return returnVal.toJSONString();
		
	}
	
	@RequestMapping("/goSuccess")
	public String goSuccess(HttpServletRequest request){
		//return "/success";
		return "/bootstrapDemo";
	}
}
