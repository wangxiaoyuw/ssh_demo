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
  <div class="page-content">
  <table>
    <tr><td>地址</td><td>名称</td><td>操作</td></tr>
    <c:forEach items="${list}" var="l">
      <tr>
      <td>${l.address}</td>
        <td>${l.username}</td>
        <td><a href="javascript:update('${l.id}');"> 修改</a><a href="javascript:update1('${l.id}');">删除</a></td></tr>
    </c:forEach>
<from>
  <input type="text" id="address"><br>
  <input type="text" id="username"><br>
  <Button onclick="saveUser()">保存 </Button>
</from>
  </table>
  </div>
  </body>
</html>
<script src="/jquery-1.8.2.min.js"></script>
<script>
    function saveUser() {
        var username = $("#username").val();
        var address = $("#address").val();

        var data = {
            "username" :username,
            "address":address
        }

        $.ajax({
            url:"/save",
            type:'POST',
            data:data,
            success:function () {
                alert("success")
            },
            error:function () {
                alert("false")
            }

        })
    }

    function update(id) {
        $(".page-content").load("/update/" + id);
    }

    function update1(id){
        $(".page-content").load("/delete/" + id);
    }

</script>