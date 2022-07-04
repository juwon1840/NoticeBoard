<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<!--  css를 설치.. CDN -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<!--  우리가 지정한 css 설치 -->
<link rel="stylesheet" type="text/css" href="resources/css/main.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>



<script>

</script>
<style>
</style>
</head>

<body>
	<%@ include file="./HeaderNav.jsp"%>
	<!--  태그안에는 자바 문법 -->
	<article>
		<div class="card-group">
			<div class="card">
				<img src="resources/img/1.png" class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">Card title</h5>
					<p class="card-text">This is a wider card with supporting text
						below as a natural lead-in to additional content. This content is
						a little bit longer.</p>
				</div>
				<div class="card-footer">
					<small class="text-muted">Last updated 3 mins ago</small>
				</div>
			</div>
			<div class="card">
				<img src="resources/img/1.png" class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">Card title</h5>
					<p class="card-text">This card has supporting text below as a
						natural lead-in to additional content.</p>
				</div>
				<div class="card-footer">
					<small class="text-muted">Last updated 3 mins ago</small>
				</div>
			</div>
			<div class="card">
				<img src="resources/img/1.png" class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">Card title</h5>
					<p class="card-text">This is a wider card with supporting text
						below as a natural lead-in to additional content. This card has
						even longer content than the first to show that equal height
						action.</p>
				</div>
				<div class="card-footer">
					<small class="text-muted">Last updated 3 mins ago</small>
				</div>
			</div>
		</div>
	</article>
	<div id="loginBox">
		<%
			//String uuu = (String)request.getAttribute("username"); //model객체에서 값 가져오기
			String uuu = (String)session.getAttribute("nowUser");
			String msg = (String)request.getAttribute("err");
			//out.print(uuu +"값");
			//String uu1 = (String) request.getParameter("username"); //parameter(클라이언트에서발생) 값 가져오기
			//out.print(uu1 +"값 getparameter");
			if (uuu == null) {
		%>

		<form name="loginFrm" action="<%=request.getContextPath()%>/login"
			method="post">
			<span><%=msg %></span>
			<div class="input-group mb-3">
				<span class="input-group-text" id="basic-addon1">UserID</span> <input
					type="text" class="form-control" placeholder="Username"
					aria-label="Username" aria-describedby="basic-addon1"
					name="username">
			</div>
			<div class="input-group mb-3">
				<span class="input-group-text" id="basic-addon1">passWord</span> <input
					type="password" class="form-control" placeholder="Username"
					aria-label="Username" aria-describedby="basic-addon1" name="pwd">
			</div>
			<div class="d-grid gap-2 d-md-flex justify-content-md-end">
				<input type="submit" class="btn btn-outline-primary" value="로그인">
				<a class="btn btn-outline-secondary"
					href="<%=request.getContextPath()%>/signup">회원가입</a>
			</div>
		</form>
		<%
			} else {
		%>
		<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1"><%=uuu %>님</span><br>
			<span><a class="input-group-text">[정보보기]</a></span><br>
			<span><a class="input-group-text" href="<%=request.getContextPath()%>/logout">[로그아웃]</a></span><br>
			<span><a class="input-group-text">[회원탈퇴]</a></span>
		</div>

		<%
			}
		%>

	</div>
	<div id="bannerBox"></div>
	<footer> </footer>

</body>







</html>