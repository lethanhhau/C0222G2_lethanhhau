
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
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
            <div class="col-lg-10 text-center" style="padding-top: 22px; color: #1c7430">
                <h2>Furama Employee</h2>
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
                <input type="text" name="action" value="search" hidden>
                <input class="form-control me-2" type="text" placeholder="Name" name="employeeNameSearchValue" value="${employeeNameSearchValue}">
                <input class="form-control me-2" type="text" placeholder="Address" name="employeeAddressSearchValue" value="${employeeAddressSearchValue}">
                <button class="btn btn-outline-success bg-dark" type="submit">Search</button>
            </form>
        </div>
    </nav>
</div>


<div class="col-12"style="padding: 0px;margin: 0px">
    <a href="/employee?action=create"><button style="background-color: #1c7430;margin-top: 10px">Add New Employee</button> </a>
    <a href="/employee?action=sortByName"><button style="background-color: #1c7430;margin-top: 10px">Sort By Name</button></a>
    <table class=" table-hover" style="width: 100%" border="1" id="myTable">
        <thead>
        <tr style="background-color: #e0a800;color: white">
            <th>Employee ID</th>
            <th>Employee Name</th>
            <th>Employee BirthDay</th>
            <th>Employee Id Card</th>
            <th>Employee Salary</th>
            <th>Employee Phone</th>
            <th>Employee Email</th>
            <th>Employee Address</th>
            <th>Position Id</th>
            <th>Education Degree Id</th>
            <th>Division Id</th>
            <th>Username</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="h" items="${employeeList}">
            <tr style="background-color: #28a745;color: white">
                <td>${h.employeeId}</td>
                <td>${h.employeeName}</td>
                <td>${h.employeeBirthday}</td>
                <td>${h.employeeIdCard}</td>
                <td>${h.employeeSalary}</td>
                <td>${h.employeePhone}</td>
                <td>${h.employeeEmail}</td>
                <td>${h.employeeAddress}</td>
                <td>${h.positionId}</td>
                <td>${h.educationDegreeId}</td>
                <td>${h.divisionId}</td>
                <td>${h.username}</td>
                <td>
                    <button type="submit" style="background-color: #e0a800">
                        <a href="/employee?action=edit&id=${h.employeeId}">Edit</a>
                    </button>
                </td>
                <td>
                    <button style="background-color: red">
                        <a href="/employee?action=delete&id=${h.employeeId}">Delete</a>
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
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
