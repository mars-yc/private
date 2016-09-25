<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String ctx = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=ctx%>/css/bootstrap.css">
<script type="text/javascript" src="<%=ctx%>/js/jquery-3.1.1.js"></script>
<script type="text/javascript" src="<%=ctx%>/js/bootstrap.js"></script>
</head>
<body>
	<form role="form">
		<div class="form-group">
			<label for="name">选择列表</label> <select class="form-control">
				<option>1</option>
				<option>2</option>
				<option>3</option>
				<option>4</option>
				<option>5</option>
			</select> <label for="name">可多选的选择列表</label> <select multiple
				class="form-control">
				<option>1</option>
				<option>2</option>
				<option>3</option>
				<option>4</option>
				<option>5</option>
			</select>
		</div>
	</form>
</body>
</html>