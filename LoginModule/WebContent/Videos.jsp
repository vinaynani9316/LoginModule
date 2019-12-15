<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <%
     
     response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
  if(session.getAttribute("username")==null)
    		{
    	        response.sendRedirect("llogin.jsp");
    		}
  %>
  <iframe width="640" height="360" src="https://www.youtube.com/embed/9Ht7ILp_DLY" frameborder="0" allowfullscreen></iframe>
  <iframe width="560" height="315" src="https://www.youtube.com/embed/lD0-ztCFydA" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

</body>
</html>