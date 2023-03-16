<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="employee" class="com.cdac.met.EmployeeBean" scope="session"/>
<jsp:setProperty name="employee" property="*"/>

<html>
	<head>
		<title>TESTWebApp</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
	</head>
	<body>
		<h1>Welcome ADMIN</h1>
		<hr/>
		<div class="container">
		<form method="POST">
			<p>
				<b>ID</b><br/>
				<input type="text" name="id"/>
			</p>
			<p>
				<b>Password</b><br/>
				<input type="password" name="password"/>
			</p>
			<p>
				<input class="btn btn-primary "
				type="submit" name="submit" value="Login"/>
			</p>
		</form>

		<c:if test="${param.submit == 'Login'}">
			<c:choose>
				<c:when test="${employee.authenticate()}">
					<c:redirect url="orders.jsp"/>
				</c:when>
				<c:otherwise>
					<b>Authentication Failed</b>
				</c:otherwise>
			</c:choose>
		</c:if>
	</div>
	</body>
</html>

