<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="tglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: url("static/css/img/loginbcg.jpg");
}
/*整体*/
.totality {
	width: 100%;
	height: 100%;
}

/*登录*/
.entry {
	width: 590px;
	height: 330px;
	background: white;
	margin-top: 200px;
	margin-left: 463px;
	color: #666;
	border-radius: 5px;

	/* 	text-align: center; */
}

.header {
	margin-top: 20px;
}

.entry:before {
	content: " ";
	display: table;
}

.entry .header a {
	border-bottom: 3px solid #fa7d3c;
	color: #000;
	margin-bottom: -1px;
	text-decoration: none;
	text-align: center;
	font-size: 25px;
	line-height: 30px;
	margin-left: 155px;
	color: #666;
}

.entry .shuru {
	margin-top: 30px;
	font-size: 20px;
	margin-left: 140px;
	color: #666;
}

.entry .shuru input {
	border: 1px solid #d8d8d8;
	width: 220px;
	height: 32px;
	border-radius: 4px;
	text-align: center;
}

.entry .foot {
	margin-left: 5px;
	font-size: 15px;
}

.entry .foot input {
	font-size: 15px;
}

.entry .foot a {
	margin-left: 120px;
	font-style: bold;
	color: #ffa800;
	text-decoration: none;
}

.entry .foot a:hover {
	text-decoration: underline;
}

button {
	width: 300px;
	height: 42px;
	margin-top: 10px;
	font: 15px bold;
	background: #ffa800;
	border-radius: 5px;
	border: 1px solid;
	color: #fff;
	font-size: 18px;
}

.entry .other {
	margin-left: 66px;
	font-size: 18px;
}

.entry .other p {
	color: #666;
}

.entry .other a {
	color: red;
	text-decoration: none;
}

.entry .other a:hover {
	text-decoration: underline;
}
</style>
<!-- <link type="text/css" rel="stylesheet" href="static/css/main.css"> -->
</head>

<body>
	<div class="totality">
		<div class="entry">
			<div class="header">
				<a href="#">账号登录</a>&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;<a style="margin-left: 1px;" href="#">安全登录</a>
			</div>

			<div class="shuru">
				<form action="login.do" method="post">
					<div>${msg}</div>
					<div>
						用户名：<input type="text" name="username" placeholder="请输入你的用户名">
					</div>

					<div style="margin-top: 15px;">
						密&nbsp;&nbsp;&nbsp;码：<input type="password" name="passcode"
							placeholder="请输入你的密码">
					</div>
					<div class="foot">
						<input type="checkbox" name="duoxuan"
							style="width: 20px; height: 20px;">记住我 <a href="#">忘记密码</a>
					</div>
					<div>
						<button class="but" type="submit">登&nbsp;&nbsp;&nbsp;陆</button>
					</div>
					<div class="other">
						<p>
							还没有微博？<a href="zhuce.do">立即注册</a>
						</p>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>