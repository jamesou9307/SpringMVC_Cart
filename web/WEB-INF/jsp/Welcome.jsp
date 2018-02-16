<%--
  Created by IntelliJ IDEA.
  User: JAMES
  Date: 2018/2/15
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="js/jquery-1.9.1.js"></script>
    <script src="js/bootstrap.js"></script>
    <script>
        function viewProducts() {
            window.location.href="productview";
        }
    </script>
    <title>Welcome</title>
</head>
<body>
${sessionScope.user.userName} Welcome!
To View Goods:<button class="btn btn-primary" onclick="viewProducts()">View Goods</button>
<button></button>
</body>
</html>
