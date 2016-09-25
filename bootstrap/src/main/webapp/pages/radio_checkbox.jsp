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
	<label for="name">默认的复选框和单选按钮的实例</label>
	<div class="checkbox">
		<label><input type="checkbox" value="">选项 1</label>
	</div>
	<div class="checkbox">
		<label><input type="checkbox" value="">选项 2</label>
	</div>
	<div class="radio">
		<label> <input type="radio" name="optionsRadios"
			id="optionsRadios1" value="option1" checked> 选项 1
		</label>
	</div>
	<div class="radio">
		<label> <input type="radio" name="optionsRadios"
			id="optionsRadios2" value="option2">选项 2 - 选择它将会取消选择选项 1
		</label>
	</div>
	<label for="name">内联的复选框和单选按钮的实例</label>
	<div>
		<label class="checkbox-inline"> <input type="checkbox"
			id="inlineCheckbox1" value="option1"> 选项 1
		</label> <label class="checkbox-inline"> <input type="checkbox"
			id="inlineCheckbox2" value="option2"> 选项 2
		</label> <label class="checkbox-inline"> <input type="checkbox"
			id="inlineCheckbox3" value="option3"> 选项 3
		</label> <label class="checkbox-inline"> <input type="radio"
			name="optionsRadiosinline" id="optionsRadios3" value="option1"
			checked> 选项 1
		</label> <label class="checkbox-inline"> <input type="radio"
			name="optionsRadiosinline" id="optionsRadios4" value="option2">
			选项 2
		</label>
	</div>
</body>
</html>