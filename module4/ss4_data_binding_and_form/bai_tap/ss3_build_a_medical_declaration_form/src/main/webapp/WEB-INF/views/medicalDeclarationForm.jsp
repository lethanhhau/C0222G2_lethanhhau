<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/19/2022
  Time: 6:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .text-center {
            text-align: center;
        }

        .text-red {
            color: red;
        }

        .container {
            width: 100%;
            display: block;
        }

        .col-12 {
            width: 100%;
        }

    </style>
</head>
<body>
<form:form method="post" action="medicalDeclaration" modelAttribute="medicalDeclarationForm">
    <div class="row col-12">
        <div class="col-12" style="text-align: center">
            <h2><b>Tờ Khai Y Tế</b></h2>
        </div>
        <div class="col-12" style="text-align: center">
            <b>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ
                PHÒNG CHỐNG BỆNH TRUYỀN NHIỄM</b>
        </div>
        <div class="col-12" style="text-align: center">
            <h5 style="color: red">Khuyến cáo : khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử
                lí hình sự</h5>
        </div>
        <div class="container">
            <label><b>Họ tên (ghi chữ IN HOA)</b></label>
            <span class="text-red">(*)</span> <br>
            <form:input type="text" class="col-12" path="fullName"/>
            <label><b>Năm sinh</b></label>
            <span class="text-red">(*)</span> <br>
            <form:input type="text" class="col-12" path="birthday"/>
            <label><b>Giới tính</b></label>
            <span class="text-red">(*)</span> <br>
            <form:select path="gender">
                <form:option value="nam">Nam</form:option>
                <form:option value="nữ">Nữ</form:option>
                <form:option value="khác">Khác</form:option>
            </form:select> <br>
            <label><b>Quốc tịch</b></label>
            <span class="text-red">(*)</span> <br>
            <form:input type="text" class="col-12" path="nationality"/>
            <label><b>Hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác</b></label> <span
                class="text-red">(*)</span> <br>
            <form:input type="text" class="col-12" path="idCard"/> <br>
            <label><b>Thông tin đi lại</b></label>
            <span class="text-red">(*)</span> <br>
            <form:radiobutton path="travelInformation" value="tàu bay"/> Tàu bay <form:radiobutton
                path="travelInformation" value="tàu thuyền"/> tàu thuyền
            <form:radiobutton path="travelInformation" value="ô tô"/> Ô tô<form:radiobutton path="travelInformation"
                                                                                            value="khác"/> Khác (Ghi
            rõ) <br>
            <label><b>Số hiệu phương tiện</b></label> <br>
            <form:input type="text" class="col-12" path="vehicleNumber"/> <br>
            <label><b>Số ghế</b></label> <br>
            <form:input type="text" class="col-12" path="seats"/>
            <label><b>Ngày khởi hành</b></label>
            <span class="text-red">(*)</span> <br>
            <form:input type="date" path="dateStart"/> <br>
            <label><b>Ngày kết thúc</b></label>
            <span class="text-red">(*)</span> <br>
            <form:input type="date" path="dateEnd"/> <br>
            <label><b>Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh/ thành phố nào?</b></label> <span
                class="text-red">(*)</span>
            <br>
            <form:textarea path="moveInfo" cssClass="col-12"></form:textarea>
            <button><b>Gửi</b></button>
        </div>

    </div>
</form:form>

<fieldset>
    <legend>Tờ Khai Chi Tiết</legend>
    <table>
        <tr>
            <td>Họ tên:</td>
            <td> ${medicalDeclaration.fullName}</td>
        </tr>
        <tr>
            <td>Năm sinh</td>
            <td>${medicalDeclaration.birthday}</td>
        </tr>
        <tr>
            <td>Giới tính</td>
            <td>${medicalDeclaration.gender}</td>
        </tr>
        <tr>
            <td>Quốc tịch</td>
            <td>${medicalDeclaration.nationality}</td>
        </tr>
        <tr>
            <td>Hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác</td>
            <td>${medicalDeclaration.idCard}</td>
        </tr>
        <tr>
            <td>Thông tin đi lại</td>
            <td>${medicalDeclaration.travelInformation}</td>
        </tr>
       <tr>
           <td>Số hiệu phuowmg tiện</td>
           <td>${medicalDeclaration.vehicleNumber}</td>
       </tr>
        <tr>
            <td>Số ghế</td>
            <td>${medicalDeclaration.seats}</td>
        </tr>
        <tr>
            <td>Ngày Khởi hành</td>
            <td>${medicalDeclaration.dateStart}</td>
        </tr>
        <tr>
            <td>Ngày kết thúc</td>
            <td>${medicalDeclaration.dateEnd}</td>
        </tr>
       <tr>
           <td>Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh/ thành phố nào?</td>
           <td>${medicalDeclaration.moveInfo}</td>
       </tr>
    </table>
</fieldset>
</body>
</html>
