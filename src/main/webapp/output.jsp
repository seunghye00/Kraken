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
<body>
	<table border=1 align='center'>
	
	
	 <tr> 
          <th colspan=4>Git Practice</th> 
          </tr> 
          <tr> 
          <th>Id</th>
          <th>Title</th>
          <th>Genre</th>
          <th>Date</th>
          </tr> 


	<c:forEach var="dto" items="${list }">
		<tr>
			<td>${dto.id}</td>
			<td>${dto.name}</td>
			<td>${dto.genre}</td>
			<td>${dto.write_date}</td>
		</tr>
	</c:forEach>
		
        <!--   for (MovieDTO dto : list) {
             <tr> 
             <td>" + dto.getId());
             <td>" + dto.getTitle());
             <td>" + dto.getGenre());
             <td>" + dto.getMovie_date());
             </tr> 
         }
         -->
         // 삭제
          <tr> 
          <td colspan=4> 
          <form action="delete.movies"> 
          <input type='text' placeholder='Delete ID' name='delet_id'/> 
         <button id='delete_btn'>Delete</button> 
          </form> 
          </td> 
          </tr> 
         // 수정
          <tr> 
          <td colspan=4> 
          <form action='update.movies'> 
          <input type='text' placeholder='Update ID' name='update_id'/> 
          <br> 
          <input type='text' placeholder='Update Title' name='update_title'/> 
          <br> 
          <input type='text' placeholder='Update Genre' name='update_genre'/> 
          <br> 
          <input type='text' placeholder='Update Movie_date' name='update_date'/> 
          <br> 
         <button id='update_btn'>Update</button> 
          </form> 
          </td> 
          </tr> 
          <tr> 
          <td colspan=4 align=center> 
          <button id='back_btn'>Back</button> 
          </td> 
          </tr> 
          </table> 
         
         	<script> 
          	document.getElementById('back_btn').onclick=function(){location.href='/index.html';} 
          </script> 
	
	
</body>
</html>