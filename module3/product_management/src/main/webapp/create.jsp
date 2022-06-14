<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/11/2022
  Time: 9:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-3">
    <h2>ADD New Product</h2>
    <form method="post">
        <div class="mb-3 mt-3">
            <label for="name">Name</label>
            <input type="email" class="form-control" id="name" placeholder="Enter Name" name="productName" value="${product.customerName}">
        </div>
        <div class="mb-3 mt-3">
            <label for="price">Price</label>
            <input type="email" class="form-control" id="price" placeholder="Enter Price" name="price" value="${product.price}">
        </div>
        <div class="mb-3 mt-3">
            <label for="quantity">Quantity</label>
            <input type="email" class="form-control" id="quantity" placeholder="Enter Quantity" name="quantity" value="${product.quantity}">
        </div>
        <div class="mb-3 mt-3">
            <label for="color">Color</label>
            <input type="email" class="form-control" id="color" placeholder="Enter Color" name="color" value="${product.color}">
        </div>
        <div class="mb-3 mt-3">
            <label for="describe">Describe</label>
            <input type="email" class="form-control" id="describe" placeholder="Enter Describe" name="describe" value="${product.describe}">
        </div>
        <div class="mb-3 mt-3">
                <label class="form-label" for="form1Example2">Category</label>
                <select class="form-select" aria-label="Default select example" id="form1Example2" name="categoryId">
                    <option selected disabled>Computer</option>
                    <c:forEach items="${categoryList}" var="i">
                        <option value="${i.categoryId}">${i.categoryName}</option>
                    </c:forEach>
                </select>
        </div>
        <button type="submit" style="background-color: green">
            <a href="/product?action=product" style="color: white;text-decoration: none">Create</a>
        </button>
        <button type="submit" style="background-color: darkgray"><a href="/product" style="color: white;
        text-decoration: none">Back</a></button>
    </form>
</div>
</body>
</html>
