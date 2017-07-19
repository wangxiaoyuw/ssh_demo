<%--
  Created by IntelliJ IDEA.
  User: wangzy
  Date: 2017/7/18
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  Login${person.username}
  <table>
    <tr><td>地址</td><td>名称</td></tr>
    <c:forEach items="${list}" var="l">
      <tr>
      <td>${l.address}</td>
        <td>${l.username}</td></tr>
    </c:forEach>

  </table>
  </body>
</html>
