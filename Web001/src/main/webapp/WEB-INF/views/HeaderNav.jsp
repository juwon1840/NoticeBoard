<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<nav class="navbar navbar-light bg-light">
			<div class="container-fluid">
				<a class="navbar-brand">KimTeacher</a>
				<form class="d-flex">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</form>
			</div>
		</nav>

	</header>
	<nav>
		<ul class="nav nav-pills">
			<li class="nav-item"><a class="nav-link"
				href="<%=request.getContextPath()%>/">Home</a></li>
			<li class="nav-item">
			<a class="nav-link"	href="<%=request.getContextPath()%>/bbslist">게시판</a></li>
			<li class="nav-item"><a class="nav-link">Disabled</a></li>
		</ul>

	</nav>
</body>
</html>