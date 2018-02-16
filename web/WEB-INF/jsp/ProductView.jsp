<%--
  Created by IntelliJ IDEA.
  User: JAMES
  Date: 2018/2/15
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Product View</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="js/jquery-1.9.1.js"></script>
    <script src="js/bootstrap.js"></script>
</head>
<body>
current user:${sessionScope.user.userName}
<h4>Product Details</h4>
<div class="container">
    <table class="table table-bordered table-hover table-striped">
        <thead>
        <th>product id</th>
        <th>product name</th>
        <th>product description</th>
        <th>product price</th>
        </thead>
        <tbody>
       <c:forEach items="${products}" var="product">
            <tr>
                <td><c:out value="${product.productid}"/></td>
                <td><c:out value="${product.productname}"/></td>
                <td><c:out value="${product.productdescription}"/></td>
                <td><c:out value="${product.productprice}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
