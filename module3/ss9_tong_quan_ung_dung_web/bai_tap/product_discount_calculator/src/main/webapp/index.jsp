<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title> product_discount_calculator</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>product_discount_calculator</h2>
<form action="Discount" method="post">
  <label>Product Description: </label><br/>
  <input type="text" name="productDescription" placeholder="productDescription"/><br/>
  <label>List Price: </label><br/>
  <input type="text" name="listPrice" placeholder="listPrice"/><br/>
  <label>Discount Percent: </label><br/>
  <input type="text" name="discountPercent" placeholder="discountPercent"/><br/>
  <input type = "submit" id = "submit" value = "Calculate Discount"/>
</form>
</body>
</html>