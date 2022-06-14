<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/9/2022
  Time: 8:26 PM
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

<div class="r">
    <a href="/matBang?action=create">
        <button style="background-color: blue">ADD new mat bang</button>
    </a>
    <a href="/matBang?action=sort"><button style="background-color: #1c7430;margin-top: 10px">Sort By Dien Tich</button></a>
</div>
<div class="row col-12" style="background-color: rgba(190,199,201,0.24)">
    <p style="padding-top: 12px">mat bang List</p>
</div>
<div class="container mt-3">
    <table class="table table-bordered" id="myTable">
        <thead>
        <tr class="table-danger">
            <th class="table-warning">ma mat bang</th>
            <th class="table-warning">dien tich</th>
            <th class="table-warning">tranng thai</th>
            <th class="table-warning">tang</th>
            <th class="table-warning">loai mat bang</th>
            <th class="table-warning">gia tien</th>
            <th class="table-warning">ngay bat dau</th>
            <th class="table-warning">ngay ket thuc</th>
            <th class="table-warning" colspan="2">Action</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${matBangList}" var="i">
            <td class="table-warning">${i.maMatBang}</td>
            <td class="table-warning">${i.dienTich}</td>
            <td class="table-warning">${i.trangThai}</td>

            <td class="table-warning">${i.tang}</td>
            <td class="table-warning">${i.loaiMatBang}</td>
            <td class="table-warning">${i.giaTien}</td>
            <td class="table-warning">${i.ngayBatDau}</td>
            <td class="table-warning">${i.ngayKetThuc}</td>


            <td class="table-warning">
                <button type="submit" style="background-color: #e0a800">
                    <a href="/matBang?action=edit&id=${i.maMatBang}">Edit</a>
                </button>
            </td>
            <td class="table-warning">
                <!-- Button trigger modal -->
                <button type="button" class="btn btn-danger" data-bs-toggle="modal"
                        data-bs-target="#staticBackdrop${i.maMatBang}">
                    Delete
                </button>

                <!-- Modal -->
                <div class="modal fade" id="staticBackdrop${i.maMatBang}" data-bs-backdrop="static"
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
                                Bạn muốn xóa Customer có ID là ${i.maMatBang}
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close
                                </button>
                                <a href="/matBang?action=delete&maMatBang=${i.maMatBang}" class="btn btn-success">Xác
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
