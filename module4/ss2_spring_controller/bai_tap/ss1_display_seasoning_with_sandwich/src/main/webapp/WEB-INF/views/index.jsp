<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<form action="/save" method="get">
<label><b>Sandwich Condiments</b></label>
  <input type="checkbox" name="condiment" value="Lettuce">
  <label>Lettuce</label>
  <input type="checkbox" name="condiment" value="Tomato">
  <label>Tomato</label>
  <input type="checkbox" name="condiment" value="Mustard">
  <label>Mustard</label>
  <input type="checkbox" name="condiment" value="Sprouts">
  <label>Sprouts</label>
  <br>
  <hr>
  <button>save</button>
</form>
  </body>
</html>
