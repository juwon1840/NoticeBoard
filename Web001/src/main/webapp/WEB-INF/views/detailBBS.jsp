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
	${bbsvo.no } <br>
	${bbsvo.bbs_user } <br>
	${bbsvo.pass } <br>
	${bbsvo.title } <br>
	${bbsvo.memo } <br>
	${bbsvo.scheck } <br>
	${bbsvo.indate } <br>
	조회수 : ${bbsvo.cnt }
		
	<footer> </footer>
</body>
</html>