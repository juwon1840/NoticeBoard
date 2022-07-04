<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="resources/css/main.css">
</head>

<body>
	<%@ include file="./HeaderNav.jsp" %> <!--  태그안에는 자바 문법 -->
	<article1>
	<div id="bbsTitle">회원가입</div>
	<div id="bbslist">
		<form action="<%=request.getContextPath() %>/signpro" method="post">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">아이디</label> <input
					type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" name="id">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Password</label>
				<input type="password" class="form-control"
					id="exampleInputPassword1" name="pass">
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">이름</label> <input
					type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" name="name">
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">전화번호</label> <input
					type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" name="tel">
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

	</article1>
	<footer> 개발자 김티처</footer>

</body>

</html>