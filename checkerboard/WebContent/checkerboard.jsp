<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./style.css">

</head>
<body>
<table>
    <% String height  = request.getParameter("height"); %>
    <% String width = request.getParameter("width"); %>
    <% int h = Integer.parseInt(height); %>
    <% int w = Integer.parseInt(width); %>
    <% for(int i = 0; i < h; i++) { %>
    <tr>
        <% for(int j = 0; j < w; j++) { %>
        <td></td>
        <% } %>
    </tr>
    <% } %>
</table>
</body>
</html>