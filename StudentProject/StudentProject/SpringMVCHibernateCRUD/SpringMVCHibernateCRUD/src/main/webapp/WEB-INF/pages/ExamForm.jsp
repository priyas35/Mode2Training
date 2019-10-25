<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
        <h1>New/Edit Exam</h1>
        <form:form action="saveExam" method="post" modelAttribute="exam">
        <h1>New Exam Details Form for the Student:<%=request.getParameter("sname") %></h1>
        <table border="1">
        <form:hidden path="examId"/>
         <form:hidden path="id"/>
             
            
               <%--  <td><form:input path="subName" /></td> --%>
               <tr>
              <td><form:label path = "subName">Subject</form:label></td>
               <td>
                  <form:select path = "subName">
                     <form:option value = "NONE" label = "Select"/>
                     <form:options items = "${subjectList}" />
                  </form:select>     	
               </td>
               
            </tr>  
            <tr>
                <td>Marks:</td>
                <td><form:input path="mark" /></td>
            </tr>
            <tr>
               
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        
        
        </form:form>
        <h4><a href="examShow?id=${exam.id }&name=<%=request.getParameter("name") %>">Show</a></h4>
    </div>
   
</body>
</html>