<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/calculator" method="get">
    <h1>Calculator</h1>

      <input type="text" name="number1" value="${number1}">
      <input type="text" name="number2" value="${number2}">
    <br>
    <br>
      <button name="operator" value="Addition">Addition(+)</button>
      <button name="operator" value="Subtraction">Subtraction(-)</button>
      <button name="operator" value="Multiplication">Multiplication(X)</button>
      <button name="operator" value="Division">Division(/)</button>

    <h2>Result: ${result}</h2>
  </form>
</form>
  </body>
</html>
