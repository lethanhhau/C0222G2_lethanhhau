<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/change">
    <div>
        <label> USD</label>
        <input type="text"  name="usd">
    </div>
    <div>
        <label>Rate</label>
        <input type="text"  name="rate" >
    </div>
    <div>
        <button> summit</button>
    </div>

    <div>result VNĐ : ${vnd}</div>
</form>
</body>
</html>
