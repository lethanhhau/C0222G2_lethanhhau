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
<div align="center"  style="padding: 0px;margin: 0px">
    <form method="post">
        <table border="1" cellpadding="5">
            <tr>
                <th>Ma mat bang</th>
                <td>
                    <input type="text" name="maMatBang" id="maMatBang" size="45" value="${matBang.maMatBang}"/>
                    <p style="color: red">${errors.get('maMatBang')}</p>
                </td>
            </tr>
            <tr>
                <th>dien tich</th>
                <td>
                    <input type="text" name="dienTich" id="dienTich" size="45" value="${matBang.dienTich}"/>
                    <p style="color: red">${errors.get('dienTich')}</p>
                </td>
            </tr>

            <tr>
                <th>Trang Thai</th>
                <td>
                    <input type="text" name="trangThai" id="trangThai" size="45" value="${matBang.trangThai}"/>
                    <p style="color: red">${errors.get('trangThai')}</p>
                </td>
            </tr>
            <tr>
                <th>Tang</th>
                <td>
                    <input type="text" name="tang" id="tang" size="45" value="${matBang.tang}"/>
                    <p style="color: red">${errors.get('tang')}</p>
                </td>
            </tr>
            <tr>
                <th>Loai van Phong</th>
                <td>
                    <input type="text" name="customerEmail" id="email" size="45" value="${matBang.trangThai}"/>
                    <p style="color: red">${errors.get('customerEmail')}</p>
                </td>
            </tr>
            <tr>
                <th>Mo ta chi tiet</th>
                <td>
                    <input type="text" name="customerAddress" id="g" size="45" value="${matBang.customerAddress}"/>
                    <p style="color: red">${errors.get('customerAddress')}</p>
                </td>
            </tr>
            <tr>
                <th>Gia</th>
                <td>
                    <input type="text" name="gia" id="gia" size="45" value="${matBang.gia}"/>
                    <p style="color: red">${errors.get('gia')}</p>
                </td>
            </tr>
            <tr>
                <th>ngay bat dau</th>
                <td>
                    <input type="date" name="ngayBatDau" id="ngayBatDau" size="45" value="${matBang.ngayBatDau}"/>
                    <p style="color: red">${errors.get('ngayBatDau')}</p>
                </td>
            </tr>
            <tr>
                <th>ngay Ket Thuc</th>
                <td>
                    <input type="date" name="ngayKetThuc" id="ngayKetThuc" size="45" value="${matBang.ngayKetThuc}"/>
                    <p style="color: red">${errors.get('ngayKetThuc')}</p>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <button style="background-color: #e0a800;color: blue">
                        <a href="/matBang">Back</a>
                    </button>
                    <a href="/matBang?action=matBang"><input type="submit" value="Save" style="background-color: #e0a800;color: blue"/></a>
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
