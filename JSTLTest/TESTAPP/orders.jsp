<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="employee" class="com.cdac.met.EmployeeBean" scope="session"/>
<jsp:setProperty name="employee" property="*"/>
<c:if test="${empty employee.id}">
	<c:redirect url="employee.jsp"/>
</c:if>
<html>
	<head>
		<title>TestWebApp</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
		<style>
			#detail{
				visibility: hidden;
			}
		</style>
	</head>
	<body>
		<h1>Welcome employee ${employee.id}</h1>
		<hr/>
		
		<form method="POST">
			<input>
				<select name="employeeid">
					<option>Employees</option>
					<option>Department</option>	
				</select><br/>
				<br/>
			<input type="button" id="butt" name="submit" value="submit">Submit</input>
		</form>
		<div class="container container-fluid" id="detail">
		<h3>Employees</h3>
		<table class="table" border="1">
			<tr>
				<th>Employeeid</th>
				<th>Name</th>
				<th>Salary</th>
				<th>Commission</th>
				<th>DeptNo</th>
				<th>Age</th>
			</tr>
			<c:forEach var="entry" items="${employee.getEmployee()}">
				<tr>
					<td>${entry.empId}</td>
					<td>${entry.empName}</td>
					<td>${entry.salary}</td>
					<td>${entry.commission}</td>
					<td>${entry.deptNo}</td>
					<td>${entry.age}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
		<p>
			<a href="customer.jsp?signout=true">Logout</a>
		</p>
		<script>
			document.getElementById("butt").onclick=()=>{
				// alert()
				document.getElementById("detail").style.visibility="visible"
			}
		</script>
	</body>
</html>

