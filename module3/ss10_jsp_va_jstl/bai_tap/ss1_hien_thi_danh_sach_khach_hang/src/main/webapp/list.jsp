
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách khách hàng</title>
</head>
<body>
<table border="1">
    <tr>
        <th colspan="4">Danh Khách khách hàng</th>
    </tr>
    <tr>
        <th>Tên</th>
        <th>ngày sinh</th>
        <th>địa chỉ</th>
        <th>ảnh</th>
    </tr>

    <c:forEach var="temp" items="${listCustomer}">
        <tr>
            <td>${temp.ten}</td>
            <td>${temp.ngaySinh}</td>
            <td>${temp.diaChi}</td>
            <td><img src="${temp.anh}" alt="" width="50"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
