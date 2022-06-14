<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/3/2022
  Time: 9:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="
    sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="col-12 row  bg-warning" style="padding: 0px;margin: 0px">
    <div class="col-2" style="padding-left: 50px">
        <a href="/index.jsp"><img src="https://furamavietnam.com/wp-content/uploads/2018/10/logo.png" width="65px"></a>
    </div>
    <div class="col-10">
        <div class="col-lg-12 row">
            <div class="col-lg-10 text-center" style="padding-top: 22px; color: #1c7430">
                <h2>Furama Customer</h2>
            </div>
            <div class="col-lg-2">
                <p style="padding-top: 35px">LÊ THANH HẬU</p>
            </div>
        </div>
    </div>
</div>

<div class="col-12" style="margin: 0px;padding: 0px">
    <nav class="navbar navbar-dark bg-primary">
        <div class="container">
            <a class="navbar-brand" href="/index.jsp">Home</a>
            <a class="navbar-brand" href="/employee">Employee</a>
            <a class="navbar-brand" href="/customer">Customer</a>
            <a class="navbar-brand" href="/service">Service</a>
            <a class="navbar-brand" href="/contract">Contract</a>
            <form class="d-flex" style="padding-top: 15px" action="/customer">
                <input type="text" value="search" name="action" hidden>
                <input class="form-control me-2" name="customerSearchName" placeholder ="name search" type="text" aria-label="Search">
                <button class="btn btn-outline-success bg-dark" type="submit">Search</button>
            </form>
        </div>
    </nav>
</div>

<div class="col-12"  style="padding: 0px;margin: 0px">
    <a href="/customer?action=create"><button style="background-color: #1c7430;margin-top: 10px">Add New Customer</button> </a>
    <a href="/customer?action=sort"><button style="background-color: #1c7430;margin-top: 10px">Sort By Name</button></a>
    <table class=" table-hover" style="width: 100%" border="1" id="myTable">
        <thead>
        <tr style="background-color: #1c7430;color: white">
            <th>Customer ID</th>
            <th>Customer Type ID</th>
            <th>Customer Name</th>
            <th>Customer BirthDay</th>
            <th>Customer Gender</th>
            <th>Customer Id Card</th>
            <th>Customer Phone</th>
            <th>Customer Email</th>
            <th>Customer Address</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="h" items="${customerList}">
            <tr style="background-color: #117a8b; color: white">
                <td>${h.customerId}</td>
                <td>${h.customerTypeId}</td>
                <td>${h.customerName}</td>
                <td>${h.customerBirthday}</td>
                <c:choose>
                    <c:when test="${h.customerGender==0}">
                        <td>FeMale</td>
                    </c:when>
                    <c:when test="${h.customerGender==1}">
                        <td>Male</td>
                    </c:when>
                    <c:otherwise>
                        <td>Tài</td>
                    </c:otherwise>
                </c:choose>

                <td>${h.customerIdCard}</td>
                <td>${h.customerPhone}</td>
                <td>${h.customerEmail}</td>
                <td>${h.customerAddress}</td>
                <td>
                    <button type="submit" style="background-color: #e0a800">
                        <a href="/customer?action=edit&id=${h.customerId}">Edit</a>
                    </button>
                </td>
                <td>

                    <!-- Button trigger modal -->
                    <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#staticBackdrop${h.customerId}">
                        Delete
                    </button>

                    <!-- Modal -->
                    <div class="modal fade" id="staticBackdrop${h.customerId}" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="staticBackdropLabel">Modal title</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                </div>
                                <div class="modal-body text-center text-danger">
                                    Bạn muốn xóa Customer có ID là ${h.customerId} và tên là ${h.customerName}
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                    <a href="/customer?action=delete&idDelete=${h.customerId}" class="btn btn-success">Xác nhận</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <script src="../jquery/jquery-3.5.1.min.js"></script>
    <script src="../datatables/js/jquery.dataTables.min.js"></script>
    <script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script>
        $(document).ready(function () {
            $('#myTable').dataTable({
                "dom": 'lrtip',
                "lengthChange": false,
                "pageLength": 10
            });
        });
    </script>
</div>
</body>
</html>
