<!-- Student confirmation page -->

<!-- We need to reference JSTL tag library which gives the forech tag to loop over the array of operating systems -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

	<html>
		
		<head>
			<title>Student Registration Form</title>
		</head>
		
		<body>
			The student is confirmed: ${student.firstName} ${student.lastName}
			
			<br><br>
			
			
			Country: ${student.country}
			
			
			<br><br>
			
			Favorite Programming Language: ${student.favoriteProgrammingLanguage}
			
			
			<br><br>
			
			Operating Systems:
			
			<ul>
				<c:forEach var="temp" items="${student.operatingSystems}">
					<li> ${temp} </li>
				</c:forEach>
			</ul>
			
			
		</body>
		
	</html>
	
</html>