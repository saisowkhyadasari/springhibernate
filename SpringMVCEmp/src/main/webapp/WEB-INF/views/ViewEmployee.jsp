<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr><th>Empno<th>Ename<th>SALARY</th>hiredate<th>mgr</th>job<th>deptno</th>comm</th></tr>
<c:forEach var="empl" items="${employee}"> 
			<tr>
			<td><c:out value="${empl.empno}"></c:out>  </td>
			<td><c:out value="${empl.ename}"></c:out>  </td>
			<td><c:out value="${empl.esal}"></c:out>  </td>
			<td><c:out value="${empl.hiredate}"></c:out>  </td>
			<td><c:out value="${empl.mgr}"></c:out>  </td>
			<td><c:out value="${empl.job}"></c:out>  </td>
			<td><c:out value="${empl.deptno}"></c:out>  </td>
			<td><c:out value="${empl.comm}"></c:out>  </td>
			<td><a href="updateemployee?code=${empl.empno}">Update </a></td>
				<td><a href="deleteemployee?code=${empl.empno}">Delete </a></td>
			</tr>
		</c:forEach>
	</table> <br>
	<a href="addemp">Add Employee </a>
</body>
</html>
	
	
	
	
	
			
</body>
</html>