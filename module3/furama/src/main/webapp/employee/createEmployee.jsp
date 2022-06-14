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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.css">
</head>
<body>

<div class="col-12 row  bg-warning" style="padding: 0px;margin: 0px">
    <div class="col-2" style="padding-left: 50px">
        <a href="/index.jsp"><img src="https://furamavietnam.com/wp-content/uploads/2018/10/logo.png" width="65px"></a>
    </div>
    <div class="col-10">
        <div class="col-lg-12 row">
            <div class="col-lg-10 text-center" style="padding-top: 22px; color: #1c7430"><h2>Add New Customer</h2>
            </div>
            <div class="col-lg-2">
                <p style="padding-top: 35px">LÊ THANH HẬU</p>
            </div>
        </div>
    </div>
</div>

<div class="col-12"style="padding: 0px;margin: 0px">
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

<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
                <th>Employee Name</th>
                <td><input type="text" name="employeeName" id="Name" size="45"/></td>
            </tr>
            <tr>
                <th>Employee BirthDay</th>
                <td><input type="date" name="employeeBirthDay" id="birthDay" size="45"/></td>
            </tr>
            <tr>
                <th>Employee Id Card</th>
                <td><input type="text" name="employeeIdCard" id="idCard" size="45"/></td>
            </tr>
            <tr>
                <th>Employee Salary</th>
                <td><input type="text" name="employeeSalary" id="salary" size="45"/></td>
            </tr>
            <tr>
                <th>Employee Phone</th>
                <td><input type="text" name="employeePhone" id="phone" size="45"/></td>
            </tr>
            <tr>
                <th>Employee Email</th>
                <td><input type="text" name="employeeEmail" id="email" size="45"/></td>
            </tr>
            <tr>
                <th>Employee Address</th>
                <td><input type="text" name="employeeAddress" id="address" size="45"/></td>
            </tr>
            <tr>
                <th>Position Id</th>
                <td>
                    <select name="positionId">
                        <option>Choice Position Id</option>
                        <c:forEach items="${positionList}" var="i">
                            <option value="${i.positionId}">${i.positionName}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Education Degree Id</th>
                <td>
                    <select name="educationDegreeId">
                        <option>Choice Education Degree Id</option>
                        <c:forEach items="${educationDegreeList}" var="i">
                            <option value="${i.educationDegreeId}">${i.educationDegreeName}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Division Id</th>
                <td>
                    <select name="divisionId">
                        <option>Choice division Id</option>
                        <c:forEach items="${divisionList}" var="i">
                            <option value="${i.divisionId}">${i.divisionName}</option>
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
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>

</body>
</html>
