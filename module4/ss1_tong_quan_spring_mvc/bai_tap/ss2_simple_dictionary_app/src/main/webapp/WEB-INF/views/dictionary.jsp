<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/15/2022
  Time: 9:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/search">
    <div>
        <label> Enter a string : </label>
        <input type="text" name="english">
    </div>
    <div>
        <button>submit</button>
    </div>
    <div>
        Dictionary : ${vietNam}
    </div>
</form>
</body>
</html>
