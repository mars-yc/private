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
			<input class="form-control input-lg" type="text"
				placeholder=".input-lg">
		</div>
		<div class="form-group">
			<input class="form-control" type="text" placeholder="默认输入">
		</div>
		<div class="form-group">
			<input class="form-control input-sm" type="text"
				placeholder=".input-sm">
		</div>
		<div class="form-group"></div>
		<div class="form-group">
			<select class="form-control input-lg">
				<option value="">.input-lg</option>
			</select>
		</div>
		<div class="form-group">
			<select class="form-control">
				<option value="">默认选择</option>
			</select>
		</div>
		<div class="form-group">
			<select class="form-control input-sm">
				<option value="">.input-sm</option>
			</select>
		</div>

		<div class="row">
			<div class="col-lg-2">
				<input type="text" class="form-control" placeholder=".col-lg-2">
			</div>
			<div class="col-lg-3">
				<input type="text" class="form-control" placeholder=".col-lg-3">
			</div>
			<div class="col-lg-4">
				<input type="text" class="form-control" placeholder=".col-lg-4">
			</div>
		</div>
	</form>

	<form role="form">
		<span>帮助文本实例</span> <input class="form-control" type="text"
			placeholder="sdsdssdsds"> <span class="help-block">一个较长的帮助文本块，超过一行，
			需要扩展到下一行。本实例中的帮助文本总共有两行。</span>
	</form>


</body>
</html>