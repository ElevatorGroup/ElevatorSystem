<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>登陆页</title>
<link
	href="${pageContext.request.contextPath }/statics/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath }/statics/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath }/statics/css/main.css"
	rel="stylesheet">

</head>
<body>
	<div class="loginBg">
		<div class="login-wr">
			<div class="login-box">
				<div class="login-tit"></div>
				<h1>孝南区质监局电梯安全管理系统</h1>
				<div class="login-cont clearfix">
					<div class="login-logo fl">
					</div>
					<form id="myForm"
						action="${pageContext.request.contextPath}/user/dologin"
						method="post">
						<div class="login-main fl">
							<p class="login-tips">${message}</p>
							<div class="input-group">
								<span class="input-group-addon" id="basic-addon1">用户名：</span> <input
									type="text" id="userName" name="userName" class="form-control"
									placeholder="请输入您的用户名" aria-describedby="basic-addon1">
							</div>
							<div class="input-group">
								<span class="input-group-addon" id="basic-addon1">密&nbsp;&nbsp;&nbsp;码：</span>
								<input id="password" type="password" name="password"
									class="form-control" placeholder="请输入您的密码"
									aria-describedby="basic-addon1">

							</div>
							<div class="login-tools">
								<div class="checkbox">
									<label> <input type="checkbox" id="remeberMe"
										name="remeberMe">下次自动登陆 </label> <a href="#" class="fogetPw">忘记密码</a>
								</div>
							</div>
							<div class="login-btn">
								<button type="button" class="btn btn-primary btn-lg active">注
									册</button>
								<button type="submit" id="login"
									class="btn btn-default btn-lg active">登 录</button>
							</div>
							<input type="hidden" id="path" name="path"
								value="${pageContext.request.contextPath }" />
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath }/statics/js/comm.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script
		src="${pageContext.request.contextPath }/statics/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</body>
</html>