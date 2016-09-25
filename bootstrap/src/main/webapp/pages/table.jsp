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

	<div class="container">
		<h2>表格</h2>
		<p>.table 为任意表格添加基本样式 (只有横向分隔线):</p>
		<table class="table">
			<thead>
				<tr>
					<th>#</th>
					<th>Firstname</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>Anna</td>
				</tr>
				<tr>
					<td>2</td>
					<td>Debbie</td>
				</tr>
				<tr>
					<td>3</td>
					<td>John</td>
				</tr>
			</tbody>
		</table>
	</div>
	
</body>
</html>