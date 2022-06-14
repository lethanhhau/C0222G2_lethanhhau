<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/6/2022
  Time: 10:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.css">
</head>
<body>



<div class="col-12 row  bg-warning">
    <div class="col-2" style="padding-left: 50px">
        <a href="/index.jsp"><img src="https://furamavietnam.com/wp-content/uploads/2018/10/logo.png" width="65px"></a>
    </div>
    <div class="col-10">
        <div class="col-lg-12 row">
            <div class="col-lg-10 text-center" style="padding-top: 22px; color: #1c7430"><h2>Edit customer</h2>
            </div>
            <div class="col-lg-2">
                <p style="padding-top: 35px">LÊ THANH HẬU</p>
            </div>
        </div>
    </div>
</div>

<div class="col-12">
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
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <tr>
                <th>Employee Name</th>
                <td>
                    <input type="text" name="employeeName" id="name" size="45" value="${employee.employeeName}"/>
                </td>
            </tr>
            <tr>
                <th>Employee Birthday</th>
                <td>
                    <input type="date" name="employeeBirthday" id="birthday" size="45" value="${employee.employeeBirthday}"/>
                </td>
            </tr>
            <tr>
                <th>Employee id Card</th>
                <td>
                    <input type="text" name="employeeIdCard" id="idCard" size="45" value="${employee.employeeIdCard}"/>
                </td>
            </tr>
            <tr>
                <th>Employee Salary</th>
                <td>
                    <input type="text" name="employeeSalary" id="salary" size="45" value="${employee.employeeSalary}"/>
                </td>
            </tr>
            <tr>
                <th>Employee phone</th>
                <td>
                    <input type="text" name="employeePhone" id="phone" size="45" value="${employee.employeePhone}"/>
                </td>
            </tr>
            <tr>
                <th>Employee Email</th>
                <td>
                    <input type="text" name="employeeEmail" id="email" size="45" value="${employee.employeeEmail}"/>
                </td>
            </tr>
            <tr>
                <th>Employee Address</th>
                <td>
                    <input type="text" name="employeeAddress" id="address" size="45" value="${employee.employeeAddress}"/>
                </td>
            </tr>
            <tr>
                <th>Position Id</th>
                <td>
                    <select name="positionId">
                        <c:forEach items="${positionList}" var="i">
                            <c:choose>
                                <c:when test="${i.positionId == position.positionId}">
                                    <option value="${i.positionId}" selected>${i.positionName}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${i.positionId}">${i.positionName}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>EducationDegree Id</th>
                <td>
                    <select name="educationDegreeId">
                        <c:forEach items="${educationDegreeList}" var="i">
                            <c:choose>
                                <c:when test="${i.educationDegreeId == position.educationDegreeId}">
                                    <option value="${i.educationDegreeId}" selected>${i.educationDegreeName}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${i.educationDegreeId}">${i.educationDegreeName}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Division</th>
                <td>
                    <select name="divisionId">
                        <c:forEach items="${divisionList}" var="i">
                            <c:choose>
                                <c:when test="${i.divisionId == position.divisionId}">
                                    <option value="${i.divisionId}" selected>${i.divisionName}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${i.divisionId}">${i.divisionName}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <button style="background-color: #e0a800;color: blue">
                        <a href="/employee">Back</a>
                    </button>
                    <a href="/employee?action=employee"><input type="submit" value="Save"/></a>
                </td>
            </tr>
        </table>
    </form>
</div>


<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#myTable').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    } );
</script>
</body>
</html>
