<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引入bootstrap css  -->
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css">
<!-- 引入jquery js -->
<script type="text/javascript" src="<%=request.getContextPath()%>/jquery/js/jquery-3.1.1.min.js"></script>
<!-- 引入bootstrap js -->
<script type="text/javascript" src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
<title>Bootstrap Demo</title>
</head>
<body>
	<h1 align="center">欢迎进入Bootstrap Demo!</h1>
	<ol>
		<li>栅格系统：
			<ul>
				<li>布局容器：
					<ul>
						<li>.container : 固定宽度</li>
						<li>.contaniner-fluid : 100%宽度</li>
					</ul>
				</li>
			</ul>
		</li>
		<li>排版：
			<ul>
				<li>标题标签：h1~h6,另外还提供了副标题标签：small,如下:
					<h6>标题h6:<small>副标题：small</small><h6>
				</li>
				<li>
					中心内容：.lead，必须在p标签中使用，让段落突出显示，如下：
					<p class="lead">
						段落p加上突出显示class="lead"
					</p>
				</li>
			</ul>
		</li>
		<li>代码：
			<ul>
				<li></li>
			
			
			</ul>
		</li>
	</ol>
</body>
</html>