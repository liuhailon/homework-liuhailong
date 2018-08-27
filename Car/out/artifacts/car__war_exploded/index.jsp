<%--
  Created by IntelliJ IDEA.
  User: lhl
  Date: 2018/8/23
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>

    <title>$Title$</title>
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
      <script src="js/jquery.js"></script>
      <script src="js/index.js"></script>
  </head>
  <body>
  <div style="margin: 10px;">
  <form id="form1" action="Car_QueryByname" method="get">
      <input id="var" type="text" name="var">
      <input id="query" type="submit" value="查询">
       <input id="reload" type="submit" value="刷新">
  </form>
  </div>
  <div>
    <table class="table table-hover" id="tab">
        <tr>
            <th>全选<input id="all" type="checkbox"></th>
            <th>汽车编号</th>
            <th>汽车名称</th>
            <th>出厂日期</th>
            <th>汽车报价</th>
            <th>结构特点</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${car}" var="cars">
            <tr>
                <td><input class='cek' type='checkbox' value='"+data[i]+"'></td>
                <td>${cars.carId}</td>
                <td>${cars.carName}</td>
                <td>${cars.carDate}</td>
                <td>${cars.carPrice}</td>
                <td>${cars.carType}</td>
                <td><a href="Car_Update?var=${cars.carName}" class='upd'>修改</a>&nbsp;
                <a href="Car_Delete?var=${cars.carId}" class='del'>删除</a></td>
            </tr>
        </c:forEach>
    </table>
  </div>
  <form action="addCar.jsp" method="post" >
      <input id="addcar" type="submit" value="新增">
  </form >
  </body>
</html>
