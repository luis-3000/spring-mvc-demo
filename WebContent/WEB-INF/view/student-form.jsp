<!-- student-form  HTML Form data  -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

	<html>
		
		<head>
			<title>Student Registration Form</title>
		</head>
		
		<body>
			
			<!-- Spring MVC Form tags -->
			<form:form action="processForm" modelAttribute="student">
				
				First name: <form:input path="firstName"/> <!-- Property of 'student' class -->
				
				<br><br>
				
				Last name: <form:input path="lastName"/>
				
				<br><br>
				
				<!-- Label for country drop-down list -->
				Country:
				
				<form:select path="country">
					
					<!-- items, refer to the collection of data (countries) -->
					<form:options items="${student.countryOptions}"/><!-- Spring will call student.getCountryOptions() -->
					
				</form:select>
				
				<br><br>
				
				<input type="submit" value="Submit"/>
				
				
			</form:form>
			
		</body>
		
	</html>
	
</html>