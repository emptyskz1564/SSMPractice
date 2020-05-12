<%--
  Created by IntelliJ IDEA.
  User: empty
  Date: 2020/5/12
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>添加产品</h1>

    <form action="/product/save" method="post">
        产品号<input type="text" name="productNum" value=""><br>
        产品名<input type="text" name="productName" value=""><br>
        产品地<input type="text" name="cityName" value=""><br>
        产品费<input type="text" name="productPrice" value=""><br>
        产品描述<input type="text" name="productDesc" value=""><br>
        产品状态<input type="text" name="productStatus" value=""><br>
        <button type="submit"/>
    </form>

</body>
</html>
