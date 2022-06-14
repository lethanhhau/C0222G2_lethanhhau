<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/6/2022
  Time: 1:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="col-12 row  bg-warning" style="padding: 0px;margin: 0px">
    <div class="col-2" style="padding-left: 50px">
        <a href="/index.jsp"><img src="https://furamavietnam.com/wp-content/uploads/2018/10/logo.png" width="65px"></a>
    </div>
    <div class="col-10">
        <div class="col-lg-12 row">
            <div class="col-lg-10 text-center" style="padding-top: 22px; color: #1c7430"><h2>Edit Employee</h2>
            </div>
            <div class="col-lg-2">
                <p style="padding-top: 35px">LÊ THANH HẬU</p>
            </div>
        </div>
    </div>
</div>

<div class="col-12" style="padding: 0px;margin: 0px">
    <nav class="navbar navbar-dark bg-primary">
        <div class="container">
            <a class="navbar-brand" href="/index.jsp">Home</a>
            <a class="navbar-brand" href="/employee">Employee</a>
            <a class="navbar-brand" href="/customer">Customer</a>
            <a class="navbar-brand" href="/service">Service</a>
            <a class="navbar-brand" href="/contract">Contract</a>
            <form class="d-flex" style="padding-top: 15px">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" width="100px">
                <button class="btn btn-outline-success bg-dark" type="submit">Search</button>
            </form>
        </div>
    </nav>
</div>

</center>
<div align="center" style="padding: 0px;margin: 0px">
    <form method="post">
        <table border="1" cellpadding="5">
            <tr>
                <th>Customer Type Id:</th>
                <td>
                    <select name="customerTypeId">
                        <c:forEach items="${customerTypeList}" var="i">
                            <c:choose>
                                <c:when test="${i.customerTypeId == customer.customerTypeId}">
                                    <option value="${i.customerTypeId}" selected>${i.customerTypeName}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${i.customerTypeId}">${i.customerTypeName}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Customer Name</th>
                <td>
                    <input type="text" name="customerName" id="name" size="45" value="${customer.customerName}"/>
                </td>
            </tr>
            <tr>
                <th>Customer Birthday</th>
                <td>
                    <input type="date" name="customerBirthday" id="birthDay" size="45" value="${customer.customerBirthday}"/>
                </td>
            </tr>
            <tr>
                <th>Customer Gender</th>
                <td>
                    <select class="form-select" aria-label="Default select example" id="form1Example4"
                            name="customerGender">
                        <option value="1">Male</option>
                        <option value="0">FeMale</option>
                        <option value="2">Other</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Customer id Card</th>
                <td>
                    <input type="text" name="customerIdCard" id="idCard" size="45" value="${customer.customerIdCard}"/>
                </td>
            </tr>
            <tr>
                <th>Customer phone</th>
                <td>
                    <input type="text" name="customerPhone" id="phone" size="45" value="${customer.customerPhone}"/>
                    <p style="color: red">${errors.get('customerName')}</p>
                </td>
            </tr>
            <tr>
                <th>Customer Email</th>
                <td>
                    <input type="text" name="customerEmail" id="email" size="45" value="${customer.customerEmail}"/>
                </td>
            </tr>
            <tr>
                <th>Customer Address</th>
                <td>
                    <input type="text" name="customerAddress" id="address" size="45" value="${customer.customerAddress}"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <a href="/customer"><input style="background-color: #e0a800" type="submit" value="back"></a>
                    <a href="/customer?action=customer"><input style="background-color: #28a745" type="submit" value="Save"/></a>
                </td>
            </tr>
        </table>
    </form>
</div>



<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableStudent').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
</body>
</html>
