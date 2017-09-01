<%--
  Created by IntelliJ IDEA.
  User: kobe
  Date: 2017/8/22
  Time: 2:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>kobe</title>
    <%@include file="common/common.jsp"%>
</head>
<body>
    <c:forEach var="user" items="${users}">
        <h1>${user.id}==${user.username}==${user.email}</h1>
    </c:forEach>


    <hr/>

    <h1>${basePath}:==== ${basePath}/admin/user/save.html</h1>

    <form action="${basePath}/admin/user/save.html" method="post" >
        <p>用户名: <input type="text" name="username"></p>
        <p>密码: <input type="text" name="password"></p>
        <p>年龄: <input type="text" name="age"></p>
        <p>邮箱: <input type="text" name="email"></p>
        <p>地址: <input type="text" name="address"></p>
        <input type="submit" value="注册"/>
    </form>


</body>
</html>
