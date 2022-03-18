<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>환영합니다.</title>
</head>
<body>
로그인 되었습니다.
${member.id}님 환영합니다.
<input type="button" value="로그아웃"
		onClick="location='<c:url value='/logout'/>'" />
</body>
</html>