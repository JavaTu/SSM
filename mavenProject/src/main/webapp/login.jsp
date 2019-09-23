<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="<%=request.getContextPath()%>/jquery/js/jquery-3.1.1.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<style>
	span {
		font-weight: bold;
	}
	.button{
		width: 100px;
	    height: 28px;
	    background: floralwhite;
	    font-weight: bold;
	    margin-left: 120px;
	    margin-top: 20px;
	}
	.div{
		padding-left: 40px;
    	padding-top: 60px;
	}
	input{
		width: 120px
	}
</style>
</head>
<body style="background-image: url('./images/backgroud.jpg');background-repeat: no-repeat;background-size: 1440px 800px;">
<form action="login/goSuccess.do">
	<div style="margin-left: 1000px;margin-top: 200px;background-color: antiquewhite;width: 300px;height: 200px">
		<div class="div">
			<span>手机号：</span>
			<input type="text" id="mobile" name="mobile"/>
			<br>
			<br>
			<span>密码：</span>&nbsp;
			<input type="password" id="password" name="password"/>
			<br>
			<br>
		</div>
		<input type="button" value="登录" class="button" onclick="login()"/>
	</div>
</form>
	
<script type="text/javascript">
function login(){
	var mobile = $("#mobile").val();
	var password = $("#password").val();

	if(mobile == ""){
		alert("请输入手机号！");
	}
	
	if(password == ""){
		alert("请输入密码！");
	}
	
	$.post("login/checkInfo.do",{"mobile":mobile,"password":password},function(result){
		result = eval ("("+result+")");
		if(result.success == false){
			alert("用户名或密码错误！");
		}else{
			window.location.href = "login/goSuccess.do";		//在本页面打开页面
			//window.open("login/goSuccess.do");				  打开一个新的页面
		}
	});
}

</script>
</body>
</html>