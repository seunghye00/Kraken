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
* {
	box-sizing: border-box;
}

div {
	border: 1px solid black;
}

.container {
	width: 500px;
	height: 100px;
	margin: auto;
	text-align: center;
}

.index {
	height: 30%;
}

.btns {
	display: flex;
	height: 70%;
}

.btns div {
	flex: 1;
	display: flex;
	justify-content: center;
	align-items: center;
}
</style>

<body>
	<div class="container">
		<div class="index">index</div>
		<div class="btns">
			<div>
				<button onclick="location.href='inputform.jsp'">input</button>
			</div>
			<div>
				<button onclick="location.href='output.movie'">output</button>
			</div>
		</div>

	</div>
</body>
</html>