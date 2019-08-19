<%@page import="com.huy.entity.Nhanvien"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/styles.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a class="test" href="chitiet?id=23">trang chi tiet</a>
<form action="chitiet" method="post">
<input type="text" name="tennhanvien"><br/>
<input type="password" name="diachi"></br>
<input type="submit" value="du lieu posst">
<c:out value="${ten}">${tuoi}</c:out>
</form>
</body>
</html>