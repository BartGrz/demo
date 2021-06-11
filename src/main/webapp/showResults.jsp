<%@ page import="com.example.demo.models.Cars" %>
<%@ page import="com.example.demo.PrepareData" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <title>Search result: persons</title>
</head>
<body bgcolor="white">
<table width="59%" border="1">
    <thead>
    <tr>
        <td>Category</td>
        <td>Brand</td>
        <td>Year_of_production</td>
        <td>fuel_consumption</td>
    </tr>
    </thead>

  <c:forEach items="${set}" var="car" >
    <tr>
        <td>${car.getCategory()}</td>
        <td>${car.getBrand()}</td>
        <td>${car.getDate_of_production()}</td>
        <td>${car.getFuel_consumption()}</td>
    </tr>
  </c:forEach>
</table>
</body>