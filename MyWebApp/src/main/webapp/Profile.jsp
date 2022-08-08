<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
<h1>PROFILE</h1>

username  : <%=request.getAttribute("name") %>
pass :  <%=request.getAttribute("pass") %>

<h1>multi line</h1>
<h1><% String name=(String)request.getAttribute("name");
        out.println(name);
    %></h1>
<h1><% String password=(String)request.getAttribute("pass");
        out.println(password);
    %></h1>

</body>
</html>