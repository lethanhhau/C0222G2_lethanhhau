<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/UserServlet?action=create">Add New User</a>
    </h2>
</center>
<div align="center">
    <form method="post" action="/UserServlet?action=viewCountry">
        <input type="text" placeholder="Enter the Country" name="country">
        <input type="submit" name="country" value="search">
    </form>
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
    <a href="/UserServlet?action=sortByName">Sort By Name</a>
</div>
</body>
</html>