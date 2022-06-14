<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="
    sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>


        th, td {
            text-align: center !important;
        }

        button {
            background-color: deeppink !important;
        }

    </style>
</head>
<body>
<div class="r">
    <a href="/product?action=create"><button style="background-color: blue">ADD new product</button></a>
</div>
<div class="row col-12" style="background-color: rgba(190,199,201,0.24)">
    <p style="padding-top: 12px">Product List</p>
</div>
<div class="container mt-3">
    <table class="table table-bordered" id="myTable" >
        <thead>
        <tr class="table-danger">
            <th class="table-warning">#</th>
            <th class="table-warning">Product Name</th>
            <th class="table-warning">Price</th>
            <th class="table-warning">Quantity</th>
            <th class="table-warning">color</th>
            <th class="table-warning">describe</th>
            <th class="table-warning">Category</th>
            <th class="table-warning" colspan="2">Action</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productList}" var="i">
            <td class="table-warning">${i.productId}</td>
            <td class="table-warning">${i.productName}</td>
            <td class="table-warning">${i.price}</td>

            <td class="table-warning">${i.quantity}</td>
            <td class="table-warning">${i.color}</td>
            <td class="table-warning">${i.describe}</td>
            <c:choose>
                <c:when test="${i.categoryId==1}">
                    <td class="table-warning">phone</td>
                </c:when>
                <c:when test="${i.categoryId==2}">
                    <td class="table-warning">television</td>
                </c:when>
            </c:choose>


            <td class="table-warning">
                <button type="submit" style="background-color: #e0a800">
                    <a href="/customer?action=edit&id=${i.productId}">Edit</a>
                </button>
            </td>
            <td class="table-warning">

                <!-- Button trigger modal -->
                <button type="button" class="btn btn-danger" data-bs-toggle="modal"
                        data-bs-target="#staticBackdrop${i.productId}">
                    Delete
                </button>

                <!-- Modal -->
                <div class="modal fade" id="staticBackdrop${i.productId}" data-bs-backdrop="static"
                     data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel"
                     aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="staticBackdropLabel">Modal title</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal"
                                        aria-label="Close"></button>
                            </div>
                            <div class="modal-body text-center text-danger">
                                Bạn muốn xóa Customer có ID là ${i.productId} và tên là ${i.productName}
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close
                                </button>
                                <a href="/customer?action=delete&idDelete=${i.productId}" class="btn btn-success">Xác
                                    nhận</a>
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
