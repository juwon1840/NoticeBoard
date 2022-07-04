<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<%@ include file="./HeaderNav.jsp"%>
	<!--  태그안에는 자바 문법 -->
	<article1>
	<div id="bbsTitle">자유게시판</div>
	<div id="bbslist">
		<div class="bs-example" data-example-id="striped-table">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>글번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>조회수</th>
						<th>작성날짜</th>
						<th>수정/삭제</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="bbsvo" items="${bbsList}" varStatus="status">
						<tr>
							<td>${status.count} / ${bbsvo.no}</td>
							<td><a href="<%=request.getContextPath() %>/view?no=${bbsvo.no}">${bbsvo.title}</a></td>
							<td>${bbsvo.bbs_user }</td>
							<td>${bbsvo.cnt }</td>
							<td>${bbsvo.indate }</td>							
							<td>
							<a href="<%=request.getContextPath() %>/bbsmod?no=${bbsvo.no}">수정</a>/
							<a href="<%=request.getContextPath() %>/delno?no=${bbsvo.no}">삭제</a></td> <!--  미완 -->
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div id="btndiv">
				<a class="btn btn-primary"
					href="<%=request.getContextPath()%>/bbsWrite">글쓰기</a> <a
					class="btn btn-primary">Test</a>
			</div>
		</div>
		<!-- /example -->

	</div>

	</article1>
	<footer> 개발자 김티처</footer>

</body>

</html>