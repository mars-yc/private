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

	<form class="form-inline" role="form">
		<div class="form-group">
			<label class="sr-only" for="name">名称</label> <input type="text"
				class="form-control" id="name" placeholder="请输入名称">
		</div>
		<div class="form-group">
			<label class="sr-only" for="inputfile">文件输入</label> <input
				type="file" id="inputfile">
		</div>
		<div class="checkbox">
			<label> <input type="checkbox"> 请打勾
			</label>
		</div>
		<button type="submit" class="btn btn-default">提交</button>
	</form>

	<form class="form-horizontal" role="form">
		<div class="form-group">
			<label for="firstname" class="col-sm-2 control-label">名字</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="firstname"
					placeholder="请输入名字">
			</div>
		</div>
		<div class="form-group">
			<label for="lastname" class="col-sm-2 control-label">姓</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="lastname"
					placeholder="请输入姓">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<div class="checkbox">
					<label> <input type="checkbox"> 请记住我
					</label>
				</div>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default">登录</button>
			</div>
		</div>
	</form>

	<form role="form">
		<div class="form-group">
			<label for="name">标签</label> <input type="text" class="form-control"
				placeholder="文本输入">
		</div>
	</form>

	<form role="form">
		<div class="form-group">
			<label for="name">文本框</label>
			<textarea class="form-control" rows="3"></textarea>
		</div>
	</form>

</body>
</html>