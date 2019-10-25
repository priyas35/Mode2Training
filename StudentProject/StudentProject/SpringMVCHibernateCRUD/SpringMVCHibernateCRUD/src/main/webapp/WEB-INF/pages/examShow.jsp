<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Exam List for the Student: <%=request.getParameter("name") %></h1>
		
		<table border="1">
			<tr>
			
			<th>Subject Name</th>
			<th>Marks</th>
			
			<th>Action</th>
			</tr>
			<c:set var="id" value="0"/>	
			<c:forEach var="exam" items="${listExam}">
			<c:set var="id" value="${exam.id}"/>	
				<tr>
					
					<td>${exam.subName}</td>
					<td>${exam.mark}</td>
					
					<td><a href="editExam?examId=${exam.examId}&name=<%=request.getParameter("name")%>">Edit</a>&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="deleteExam?examId=${exam.examId}&id=${exam.id}">Delete</a>&nbsp;&nbsp;&nbsp;&nbsp;
					</td>

				</tr>
			</c:forEach>
			
				
		</table><br/>
		
					<a href="newExam?id=<%=request.getParameter("id") %>&name=<%request.getParameter("name");%>">Add Exam Result</a>&nbsp;&nbsp;&nbsp;&nbsp;<br/>
					<a href="/SpringMVCHibernateCRUD/">Go To Home Page</a>&nbsp;&nbsp;&nbsp;&nbsp;
				
		
	</div>
</body>
</html>

















<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
		<h1>Exam List</h1>
		
		<table border="1">
			<tr>
			<th>ExamID</th>
			<th>Subject Name</th>
			<th>Marks</th>
			<th>SID</th>
			<th>Action</th>
			</tr>
			<c:set var="id" value="${id}"/>	
			<c:forEach var="exam" items="${listExam}">
			<c:set var="id" value="${exam.id}"/>	
				<tr>
					<td>${exam.examId}</td>
					<td>${exam.subName}</td>
					<td>${exam.mark}</td>
					<td>${exam.id}</td>
					<td><a href="editExam?examId=${exam.examId}">Edit</a>&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="deleteExam?examId=${exam.examId}">Delete</a>&nbsp;&nbsp;&nbsp;&nbsp;
					</td>
			</tr>
			</c:forEach>
		</table>
		
			<a href="/SpringMVCHibernateCRUD/">Go To Home Page</a>&nbsp;&nbsp;&nbsp;&nbsp;
				
	</div>

</body>
</html> --%>
