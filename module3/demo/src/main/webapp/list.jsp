<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-3">
    <center>
        <h2>Hover Rows</h2>
    </center>
    <a href="student?action=create">Add new Student</a>
    <input type="search" name="nameSearch" placeholder="Nhap ten">
    <input type="search" name="idSearch" placeholder="nhap id">
    <input type="submit" name="action" value="search">
    <table class="table table-primary">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Point</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listStudent}" var="i">
            <tr>
                <td>${i.id}</td>
                <td>${i.name}</td>
                <td>${i.point}</td>
                <td><a href="student?action=delete&idDelete=${i.id}" style="color: red">Delete</a></td>
                <td><a href="student?action=edit&idEdit=${i.id}" style="color: #0832d7">Edit</a></td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>


</body>
</html>
