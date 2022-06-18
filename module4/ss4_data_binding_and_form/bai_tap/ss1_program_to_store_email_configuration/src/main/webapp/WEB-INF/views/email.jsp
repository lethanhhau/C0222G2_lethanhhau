<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/17/2022
  Time: 11:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" action="addEmail" modelAttribute="email">
<fieldset>
    <legend><h1>Settings</h1></legend>
    <table>
        <tr>
            <td>Languages</td>
            <td>
                <form:select path="languages" id="Languages" name="Languages">
                    <option value="English">English</option>
                    <option value="Vietnamese">Vietnamese</option>
                    <option value="Japanese">Japanese</option>
                    <option value="Chinese">Chinese</option>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>Page size:</td>
            <td>
                Show
                <form:select path="pageSize" id="size" name="size">
                    <option>5</option>
                    <option>10</option>
                    <option>15</option>
                    <option>25</option>
                    <option>50</option>
                    <option>100</option>
                </form:select>
                emails per page
            </td>
        </tr>
        <tr>
            <td>Spam filter:</td>
            <td>
                <form:checkbox path="spamsFilter"/>
                Enable spams filter
            </td>
        </tr>
        <tr>
            <td>Signature:</td>
            <td>
                <form:textarea path="signature" rows="3" cols="20" name="comment"/>
            </td>
        </tr>
        <tr>
            <td><input style="background: #5c5cd2" type="submit" value="Update"/></td>
            <td><input type="button" value="Cancel"/></td>
        </tr>
    </table>
    </form:form>
</fieldset>
<fieldset>
    <legend><h1>Update</h1></legend>
    <table>
        <tr>
            <td>Languages:</td>
            <td>${email.languages}</td>
        </tr>
        <tr>
            <td>Page size:</td>
            <td>${email.pageSize}</td>
        </tr>
        <tr>
            <td>Spam filter:</td>
            <td>${email.spamsFilter}</td>
        </tr>
        <tr>
            <td>Signature:</td>
            <td>${email.signature}</td>
        </tr>
    </table>
</fieldset>
</body>
</html>
