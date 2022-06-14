
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Coutry</title>
</head>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>View User Country</title>
</head>
<body>
<center>
<h1>User details in the country</h1>
<h2>
    <a href="/UserServlet">Back to User list</a>
</h2>
</center>
<div align="center">
<table border="1" cellpadding="5">
    <caption><h2>List of Users</h2></caption>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
        <th colspan="2">Actions</th>
    </tr>
    <c:forEach var="user" items="${listUser}">
        <tr>
            <td><c:out value="${user.id}"/></td>
            <td><c:out value="${user.name}"/></td>
            <td><c:out value="${user.email}"/></td>
            <td><c:out value="${user.country}"/></td>
            <td><a href="/UserServlet?action=edit&id=${user.id}">Edit</a></td>
            <td><a href="/UserServlet?action=delete&id=${user.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</div>
</body>
</html>
