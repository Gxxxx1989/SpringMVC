<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="springmvc/testPathVariable/1">testPathVariable</a>
	<br><br>
	<a href="springmvc/testAntPath/asdasd/abc">testAntPath</a>
	<br><br>
	<a href="springmvc/testParamsAndHeads?username=gx&&age=11">testParamsAndHeads</a>
	<br><br>
	<form action="springmvc/testMethod" method="post">
		<input type="submit" value="submit">
	</form>
	<br><br>
	<a href="springmvc/testMethod">testMethod get请求无法应答，会报405错误</a><!-- get请求无法应答 -->
	<br><br>
	<a href="springmvc/testRequestMapping">testRequestMapping </a>
	<br><br>
	<!-- 和controller中请求一致 -->
	<a href="hello">hello</a>
</body>
</html>