<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting customer</title>
</head>
<body>
<h1>Delete User</h1>
<p>
    <a href="/UserServlet">Back to User list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>User information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${"name"}</td>
            </tr>
            <tr>
                <td>Email: </td>
                <td>${"email"}</td>
            </tr>
            <tr>
                <td>Country: </td>
                <td>${"country"}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete user"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>