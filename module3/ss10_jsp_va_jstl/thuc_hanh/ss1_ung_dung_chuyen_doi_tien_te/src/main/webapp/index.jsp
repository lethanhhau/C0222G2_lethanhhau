
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Currency Converter</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Currency Converter</h2>
<form action="CurrencyConverterJsp" method="post">
  <label>Rate: </label><br/>
  <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
  <label>USD: </label><br/>
  <input type="text" name="usd" placeholder="USD" value="0"/><br/>
  <input type = "submit" id = "submit" value = "Converter"/>
</form>
<h1> Reta: ${rate}</h1>
<h1> USD: ${usd}</h1>
<h1> VND: ${vnd}</h1>
</body>
</html>
