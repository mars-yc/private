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
	<div>
		<nav class="navbar navbar-inverse" role="navigation">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">菜鸟教程</a>
				</div>
				<div>
					<ul class="nav navbar-nav">
						<li class="active"><a href="#">iOS</a></li>
						<li><a href="#">SVN</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown"> Java <b class="caret"></b>
						</a>
							<ul class="dropdown-menu">
								<li><a href="#">jmeter</a></li>
								<li><a href="#">EJB</a></li>
								<li><a href="#">Jasper Report</a></li>
								<li class="divider"></li>
								<li><a href="#">分离的链接</a></li>
								<li class="divider"></li>
								<li><a href="#">另一个分离的链接</a></li>
							</ul></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>
</body>
</html>