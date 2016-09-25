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
	<form class="form-horizontal" role="form">
		<div class="form-group">
			<label class="col-sm-2 control-label">聚焦</label>
			<div class="col-sm-10">
				<input class="form-control" id="focusedInput" type="text"
					value="该输入框获得焦点...">
			</div>
		</div>
		<div class="form-group">
			<label for="inputPassword" class="col-sm-2 control-label"> 禁用
			</label>
			<div class="col-sm-10">
				<input class="form-control" id="disabledInput" type="text"
					placeholder="该输入框禁止输入..." disabled>
			</div>
		</div>
		<fieldset disabled>
			<div class="form-group">
				<label for="disabledTextInput" class="col-sm-2 control-label">禁用输入（Fieldset
					disabled） </label>
				<div class="col-sm-10">
					<input type="text" id="disabledTextInput" class="form-control"
						placeholder="禁止输入">
				</div>
			</div>
			<div class="form-group">
				<label for="disabledSelect" class="col-sm-2 control-label">禁用选择菜单（Fieldset
					disabled） </label>
				<div class="col-sm-10">
					<select id="disabledSelect" class="form-control">
						<option>禁止选择</option>
					</select>
				</div>
			</div>
		</fieldset>
		<div class="form-group has-success">
			<label class="col-sm-2 control-label" for="inputSuccess">
				输入成功 </label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess">
			</div>
		</div>
		<div class="form-group has-warning">
			<label class="col-sm-2 control-label" for="inputWarning">
				输入警告 </label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputWarning">
			</div>
		</div>
		<div class="form-group has-error">
			<label class="col-sm-2 control-label" for="inputError"> 输入错误
			</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputError">
			</div>
		</div>
	</form>
</body>
</html>