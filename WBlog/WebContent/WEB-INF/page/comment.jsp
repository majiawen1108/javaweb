<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="tglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="commentObj" items="${commentList }" varStatus="st">
		${commentObj.username}&nbsp;说：&nbsp; ${commentObj.comment}&emsp;
		<br>
		
	 <%-- 	user.username ==${ user.username}
		currentUser.username ==${ currentUser.username}
		commentObj.username ==${ commentObj.username}  --%>
		
		<c:if test="${user.username == commentObj.username|| currentUser.username == user.username}">
			<a href="delComment.do?commentId=${commentObj.commentId }">删除</a>
		</c:if>
		<br><br>
	</c:forEach>
</body>
</html>