<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: empty
  Date: 2020/5/15
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.productNum}</td>
            <td>${product.productName}</td>
            <td>${product.cityName}</td>
            <td>${product.departureTime}</td>
            <td>${product.productPrice}</td>
            <td>${product.productDesc}</td>
            <td>${product.productStatus}</td>
        </tr>
    </c:forEach>
</head>
<body>

</body>
</html>
