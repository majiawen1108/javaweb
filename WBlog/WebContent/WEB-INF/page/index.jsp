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
	/* background: #E8E8E8; */
	background: url(static/css/img/bg.jpg);
	background-size: 100%;
	font: 12px/1.3 Arial, "PingFang SC", "Hiragino Sans GB",
		"Microsoft YaHei", "WenQuanYi Micro Hei", sans-serif;
}

li {
	list-style-type: none;
}

.all {
	width: 100%;
	height: 100%;
	/* 	margin-top: 20px; */
	background: white;
	margin-top: -5px;
}

.toplink {

	width: 100%;
	height: 60px;
	background: white;
	position:fixed; 

}

.toplink_logo {
	margin-left: 60px;
}

.toplink img {
	float: left;
	margin-top: 21px;
	margin-left: 50px;
}

.toplink .toplink_search {
	width: 285px;
	height: 30px;
	margin: 17px 0 20px 30px;
	background: #C0C0C0;
	float: left;
}

.toplink .toplink_search input {
	width: 250px;
	height: 18px;
	margin: 3px;
}

.toplink .toplink_search button {
	height: 24px;
	width: 26px;
	background: url(static/css/img/search.jpg);
	background-size: 100%;
	margin-left: 257px;
	float: left;
	margin-top: -26px;
}

.toplink_fenlan {
	width: 750px;
	height: 40px;
	margin-top: 11px;
	margin-left: 750px;
}

.toplink_fenlan ul {
	margin-top: -5px;
}

.toplink_fenlan ul li {
	float: left;
	list-style-type: none;
	text-align: -webkit-match-parent;
}

.toplink_fenlan ul li a {
	display: block;
	line-height: 40px;
	font-size: 15px;
	text-decoration: none;
}

.toplink_fenlan ul li a em {
	line-height: 64px;
	margin-left: 10px;
}

.toplink_fenlan ul li a img {
	height: 22px;
	width: 25px;
}

.bd {
	width: 100%;
	height: auto;
	float: left;
}

.left {
	margin-top:60px;
 	text-align:center;
	margin-left:175px;
	padding: 0px;
	width: 150px;
	height: 650px;
	
	float: left;
	position:fixed; 
	background:rgba(156,156,156,0.5);
}
.left a{
	text-decoration: none;
	color:white;
}
.left_up div{
	width:80px;
	height:30px;
	font:20px blod;
	margin:auto;
	margin-top:10px;
}
.left_middle div{
	width:80px;
	height:30px;
	font-size:17px;
	margin:auto;
	margin-top:10px;
}
.left_line{
	width:150px;
	height:2px;
	background:white;	
	margin-top:10px;
}
.middle {
	text-align: center;
	width: 800px;
	height: auto;
/* 	background: yellow; */
	float: left;
	margin-left: 285px;
	margin-top: 65px;
}

.right {
	margin-top:62px;
	margin-left: -30px;
	width: 300px;
	height: 600px;
 	float: left;
	background:rgba(175,238,238,0.5);
}
.right_top{
	width:300px;
	height:180px;

	padding-top:10px;
	font:20px blod;
	text-align:center;
	border-radius:10px;
	background:rgba(255,255,255,0.5);

}
.right_top_img{
	width:60px;
	height:60px;
	background:url(static/css/img/touxiang.jpg);
	border:0px;
	border-radius:20px;
	background-size:100%;
	margin-left:122px;
	margin-bottom:12px;

}
.right-top-word{
	margin-left:35px;
	margin-top:15px;
}
.right-top-msg{
	float:left;
	font-size:16px;
	margin-left:15px;
}
.right_middle{
	width:300px;
	height:300px;
 	background:rgba(255,255,255,0.5);
 	margin-top:10px;
 	border-radius:20px;
}
.right_middle_title{
	margin-top:15px;
	font:22px blod;
	margin-left:12px;
}
.right_middle_news{
	font:18px blod;
	margin-top:20px;
	margin-left:55px;
	
}
.right_buttom{

}
.buttom_msg{
	font: 15px blod; 
	margin-top:20px;
	margin-left:40px;
	margin-right:20px;
	color:red;
}
a{
	text-decoration: none;
	}
a:hover{
	color:red;
}
.publish {
	width: 800px;
	height: 150px;
	margin-top: 20px;
	/* margin-left: 500px; */
}

.publish_title {
	font-family: 幼圆 blod;
	color: #9966FF;
	font-size: 20px;
}

.publish textarea {
	width: 610px;
	height: 100px;
	margin-top: 20px;
	border: solid 1px #E0E0E0;
	font: 18px;
	border-radius: 15px;
	resize: none
}

.publish_foot {
	margin-top: 10px;
	width:700px;
	height: 30px;
	text-align: left;
}
.toplink_fenlan2{
	margin-left:60px;
}
.toplink_fenlan2 ul li{
	margin-left:10px;
	float:left;
	list-style-type: none;
	text-align: -webkit-match-parent;
}
.toplink_fenlan2 ul li a {
	display: block;
	line-height: 40px;
	font-size: 16px; 
	text-decoration: none;
	letter-spacing:2px;
}
.toplink_fenlan2 ul li a img {
	height: 24px;
	width: 26px;
}
.publish button {
	width: 60px;
	height: 30px;
	font: 15px bold;
	background: #ffa800;
	border-radius: 5px;
	border: 0px solid;
	color: #fff;
	margin-left:225px;
}

.view {
	margin-top: 11px;
	width: 600px;
	height: auto;
	font-size: 18px;
	padding-left: 20px;
    background:rgba(173,216,230,0.5);
	background-size:100%;
	border: solid 1px #E0E0E0;
	border-radius: 15px;
}
.view a{
	color:black;
}

.list1 {
	text-align: left;
	width: 600px;
	height: auto;
	margin-left: 95px;
	margin-top: 35px;
	border-radius: 4px;
}
.content textarea{
	width: 300px;
	height: 30px;
	margin-left:10px;
	margin-top:-8px;
	border: solid 1px #E0E0E0;
	border-radius: 15px;
	resize: none
}
.content button{
	width: 60px;
	height: 30px;
	font: 15px bold;
	background: #ffa800;
	border-radius: 5px;
	border: 0px solid;
	color: #fff;
	margin-top:20px;
}

</style>
</head>
<body>

	<div class="toplink">
		<div class="toplink_logo">
			<img src="static/css/img/WB_logo.png" />
			<div class="toplink_search">
				<form action="http://www.baidu.com/s" method="get">
					<input type="text" name="wd" placeholder="大家都在搜索....." />
					<button type="submit"></button>
				</form>
			</div>
		</div>
		<div class="toplink_fenlan">
			<ul>
				<li><a href="https://krcom.cn/"><img
						src="static/css/img/vieo.png"> <em>视频</em> </a></li>
				<li><a href="index.do"><img
						src="static/css/img/home.png"> <em>首页</em> </a></li>
				<li><a
					href="https://weibo.com/friends?leftnav=1&wvr=6&isfriends=1&step=2"><img
						src="static/css/img/friend.png"> <em>好友圈</em> </a></li>
				<li><a href="#"><img src="static/css/img/xiaoxi.png">
						<em>消息</em> </a></li>
				<li><a href="home.do"><img src="static/css/img/yonghu.png">
						<em> <%-- <c:forEach var="obj" items="${ list }" varStatus="st">
						${ obj.username }
						</c:forEach> --%>个人
					</em> </a></li>
			</ul>
		</div>
	</div>
	<div class="bd">
		<div class="left">
		<div class="left_up">
		<div>
			<a href="index.do">首页</a>
		</div>
		<div>
			<a href="#">我的收藏</a>
		</div>
		<div>
			<a href="#">我的赞</a>
		</div>
		</div>
		<div class="left_line"></div>
		<div class="left_middle">
		<div>
			<a href="#">热门微博</a>
		</div>
		<div>
			<a href="#">热门视频</a>
		</div>
		<div>
			<a href="#">热门看点</a>
		</div>
		<div>
			<a href="#">热门明星</a>
		</div>
		</div>
		<div class="left_line"></div>
		<div class="left_middle">
			<div>
				<a href="#">好友圈</a>
			</div>
			<div>
				<a href="#">特别关注</a>
			</div>
			<div>
				<a href="#">情感</a>
			</div>
			<div>
				<a href="#">体育</a>
			</div>
			<div>
				<a href="#">生活</a>
			</div>
			<div>
				<a href="#">吐槽</a>
			</div>
			<div>
				<a href="#">星座</a>
			</div>
		</div>
		</div>
		<div class="middle" >
			<div class="publish" style="display: none">
				<div class="publish_title">
					<em>有什么新鲜事想告诉大家？</em>
				</div>
				<form action="publish.do" method="post">
					<textarea rows="8" name="blogContent"></textarea>
					<div class="publish_foot">
						<div class="toplink_fenlan2">
							<ul>
								<li><a href="#"><img
										src="static/css/img/biaoqing.png"> <em>表情</em> </a></li>
								<li><a href="#"><img
										src="static/css/img/picture.png"> <em>图片</em> </a></li>
								<li><a
									href="#"><img
										src="static/css/img/vieo1.png"> <em>视频</em> </a></li>
								<li><a href="#"><img src="static/css/img/huati.png">
										<em>话题</em> </a></li>
							</ul>
						</div>
						<button type="submit">发表</button>
					</div>
				</form>
			</div>
			<br>
			<div class="list1">
				<c:forEach var="obj" items="${ list }" varStatus="st">
					<div class="view">
						<p>${ obj.username }&nbsp;&nbsp;&nbsp;&nbsp;${ obj.createAt }
						
						</p>
						<p>${ obj.blogContent }</p>
						<a href="thumb.do?blogId=${ obj.blogId }">
						<div style="float:left;margin-left:5px; margin-top:-7px;"><img alt="点赞" src="static/css/img/zan1.png" style="width:30px;height:30px;"></a>
						</div>
						<div style="float:left;margin-left:5px;margin-right:10px;">(${ obj.thumb })</div> 
						<c:if test="${obj.author.loginFans==1}">
						<a href="fans.do?dUserId=${ obj.userId }"><img alt="未关注" src="static/css/img/yiguan.png" style="width:32px;height:30px;"><div style="margin-left:100px;margin-top:-30px;">已关注</div></a>
						</c:if>
						<c:if test="${obj.author.loginFans==-1}">
						<a href="fans.do?dUserId=${ obj.userId }"><img alt="未关注" src="static/css/img/weiguan.png" style="width:32px;height:30px;"><div style="margin-left:100px;margin-top:-30px;">关注</div></a>
						</c:if>
						<form action="comment.do" method="post" class="content"> 
										<textarea rows="1" cols="20" name="content"></textarea>
										<input type="hidden" name= "blogId" value="${obj.blogId}">
										<button type="submit">评论</button>
									</form>
									<c:forEach var="discuss" items="${obj.discussList}" varStatus="st1">
										<p>评论者:${obj.username}&nbsp;&nbsp;&nbsp;&nbsp;${discuss.create_at}</p>
										<p>内容:${discuss.content}</p>
									
									</c:forEach>
					</div>
				</c:forEach>
				
			</div>
		</div>
		<div class="right">
			<div class="right_top">
			<div class="right_top_img"></div>
			<em>老马粥铺</em>
			<div class="right-top-word">
			<div class="right-top-msg">关注:1</div>
			<div class="right-top-msg">粉丝:100W</div>
			<div class="right-top-msg">微博:1</div>
			</div>
			</div>
			<div class="right_middle">
			<div class="right_middle_title">
				热门话题
			</div>
			<div class="right_middle_news"><div style="float:left;margin-top:5px;font-size:15px"><a href="#">陈晓旭去世12周年</a></div><div style="float:right;font-size:15px;margin-right:10px;">9455W</div></div>
			<div class="right_middle_news"><div style="float:left;margin-top:5px;font-size:15px"><a href="#">每天多喝咖啡是对身体好</a></div><div style="float:right;font-size:15px;margin-right:10px;">9455W</div></div>
			<div class="right_middle_news"><div style="float:left;margin-top:5px;font-size:15px"><a href="#">今年一定是勇士总冠军</a></div><div style="float:right;font-size:15px;margin-right:10px;">9455W</div></div>
			<div class="right_middle_news"><div style="float:left;margin-top:5px;font-size:15px"><a href="#">陈晓旭去世12周年</a></div><div style="float:right;font-size:15px;margin-right:10px;">9455W</div></div>
			<div class="right_middle_news"><div style="float:left;margin-top:5px;font-size:15px"><a href="#">每天多喝咖啡是对身体好</a></div><div style="float:right;font-size:15px;margin-right:10px;">9455W</div></div>
			<div class="right_middle_news"><div style="float:left;margin-top:5px;font-size:15px"><a href="#">今年一定是勇士总冠军</a></div><div style="float:right;font-size:15px;margin-right:10px;">9455W</div></div>
			<div class="right_middle_news"><div style="float:left;margin-top:5px;font-size:15px"><a href="#">陈晓旭去世12周年</a></div><div style="float:right;font-size:15px;margin-right:10px;">9455W</div></div>
			<div class="right_middle_news"><div style="float:left;margin-top:5px;font-size:15px"><a href="#">每天多喝咖啡是对身体好</a></div><div style="float:right;font-size:15px;margin-right:10px;">9455W</div></div>
			<div class="right_middle_news"><div style="float:left;margin-top:5px;font-size:15px"><a href="#">今年一定是勇士总冠军</a></div><div style="float:right;font-size:15px;margin-right:10px;">9455W</div></div>
			
			</div>
			<div class="right_middle">
			<div class="right_middle_title">
				公告栏	
			</div>
			<div class="buttom_msg"><a>《全国辟谣平台》</a></div>
			<div class="buttom_msg"><a>《首都互联网协会发布坚守七条底线倡议书》</a></div>
			<div class="buttom_msg"><a>《中央保密协议》</a></div>
			<div class="buttom_msg"><a>《勇士总冠军倡议书》</a></div>
			<div class="buttom_msg"><a>《管理法倡议书》</a></div>
			
			</div>
		</div>
	</div>
</body>
</html>