<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>수정 페이지입니다.</h1>

<form action="modify" method="post">
<table>
	<tr> 
		<td>글번호</td><td><input type="text" value="${bom.number}" readonly="readonly" name="number"></td>
	</tr>
	<tr> 
		<td>제목</td><td><input type="text" value="${bom.subject}" name="subject"></td>
	</tr>
	<tr> 
		<td>내용</td><td><textarea rows="50px" cols="100px" name="content">${bom.content}</textarea></td>
	</tr>
	<tr> 
		<td>작성자</td><td><input type="text" value="${bom.name}" readonly="readonly" name="name"></td>
	</tr>
	<tr> 
		<td colspan="2"><input type="submit" value="수정완료"></td>
 		 
	</tr>
</table>
</form>



</body>
</html>