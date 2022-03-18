<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h1>회원 가입</h1>
	<form:form commandName="member">
		<div>
			<label>아이디</label> 
			<form:input path="id"/>
		</div>
		<div>
			<label>비밀번호</label> 
			<form:input path="password"/>
		</div>
		<div>
			<label>이메일</label> 
			<form:input path="email"/>
		</div>
		<div>
			<input type="submit" value="회원가입"/>
		</div>
	</form:form>

</body>
</html>