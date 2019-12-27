<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>글쓰기를 위한 jsp입니다.</h1>
<form action="register" method="post">

<table>
	<tr>
		<td>제목</td><td><input type = "text" name="subject"></td>
	</tr>
	<tr>
		<td>내용</td><td><textarea rows="50px" cols="100px" name="content" ></textarea></td>
	</tr>
	<tr>
		<td>글쓴이</td><td><input type="text" name = "name"></td>
	</tr>
	<tr>
		<td>조회수</td><td><input type="text" name = "cnt"></td>
	</tr>
	<tr>
		<td colspan ="2"><input type="submit" value = "등록"></td>
	</tr>
	 
	
</table>
</form>










</body>
</html>