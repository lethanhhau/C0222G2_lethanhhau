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
</head>
<body>
<form:form method="post" action="uploadMusic" modelAttribute="music">
<fieldset>
    <legend><h1>Music</h1></legend>
    <table>
        <tr>
            <td>
                Name of the song</td>
            <td>
               <form:input path="name"/>
            </td>
        </tr>
        <tr>
            <td>Performing Artist</td>
            <td>
                <form:input path="performingArtist"/>
            </td>
        </tr>
        <tr>
            <td>Kind of music</td>
            <td>
                <form:select path="kindOfMusic">
                    <form:option value="nhacTre"> Nhạc Trẻ</form:option>
                    <form:option value="rap"> Rap</form:option>
                    <form:option value="nhacVang"> Nhạc Vàng</form:option>
                    <form:option value="bolero">Nhạc bolero</form:option>
                    <form:option value="Rock">Rock</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>Link</td>
            <td>
                <form:select path="link">
                    <form:option value="https://youtu.be/UVbv-PJXm14"> Giàu vì bạn sang vì vợ</form:option>
                    <form:option value="https://www.youtube.com/watch?v=RgKAFK5djSk">See You Again</form:option>
                    <form:option value="https://www.youtube.com/watch?v=2Vv-BfVoq4g">Perfect</form:option>
                    <form:option value="https://www.youtube.com/watch?v=XZgiNnGB8m4">Rock</form:option>
                    <form:option value="https://www.youtube.com/watch?v=yc69qoW5nUA&t=4088s">TikTok top 2022</form:option>
                    <form:option value="https://www.youtube.com/watch?v=kPnIqaEP2W0"> Bolero</form:option>
                </form:select>
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
    <legend><h1>Update Music</h1></legend>
    <table>
        <tr>
            <td>Name of the song</td>
            <td>${uploadMusic.name}</td>
        </tr>
        <tr>
            <td>Performing Artist</td>
            <td>${uploadMusic.performingArtist}</td>
        </tr>
        <tr>
            <td>Kind of music</td>
            <td>${uploadMusic.kindOfMusic}</td>
        </tr>
        <tr>
            <td>Link</td>
            <td>
            <iframe width="200px" height="auto" title="the song" src="${uploadMusic.link}" allowfullscreen> </iframe>
            </td>
        </tr>
    </table>
</fieldset>
</body>
</html>
