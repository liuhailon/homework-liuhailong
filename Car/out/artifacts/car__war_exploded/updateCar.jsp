<%--
  Created by IntelliJ IDEA.
  User: lhl
  Date: 2018/8/26
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        window.onload=function (ev) {
            id.onfocus=function () {
                alert("编号不能修改！");
                this.disabled=true;
            }
            id.onblur=function () {
                this.disabled=false;
            }
        }
    </script>
</head>
<body>
<form action="Car_UpdateCar" method="post">
    汽车编号：<input id="id" name="carId" type="text" value="${car.carId}"><br>
    汽车名称：<input name="carName" type="text" value="${car.carName}"><br>
    出厂日期：<input name="carDate" type="text" value="${car.carDate}"><br>
    汽车报价：<input name="carPrice" type="text" value="${car.carPrice}"><br>
    汽车类型：<input name="carType" type="text" value="${car.carType}"><br>
    <input type="submit" value="确定">
</form>
</body>
</html>
