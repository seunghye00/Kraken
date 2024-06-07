<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
</head>
	<style>
		div {
			border: 1px solid black;
		}

		.container {
			width: 200px;
			height: 100px;
			display: flex;
			flex-direction: column;
			margin: auto;
			justify-content: center;
			align-items: center;
		}

		.btn {
			width: 60px;
			height: 30px;
			font-size: 15px;
            margin-top: 5px;
		}
	</style>
</head>

<body>
	<form action="input.movie" method="post">
		<div class="container">
			<input type='text' placeholder='영화제목' name='title'>
			<input type='text' placeholder='영화장르' name='genre'>
			<button class='btn'>제출</button>
		</div>
	</form>
</body>
</html>