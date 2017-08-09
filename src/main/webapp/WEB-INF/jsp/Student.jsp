<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<% String path=request.getContextPath();%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css"/>
    <title>学生信息表</title>
</head>
<body>
<div class="container text-center">
    <div class="panel panel-default">
        <div class="panel panel-heading">
            <h2>学生信息管理</h2>
        </div>
        <div class="panel panel-body">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th><input id="ids" type="checkbox" onchange="quanxuan()" class="checkbox"></th>
                    <th>序号</th>
                    <th>学生编号</th>
                    <th>学生姓名</th>
                    <th>学生性别</th>
                    <th>出生日期</th>
                    <th>身份证号</th>
                    <th>家庭住址</th>
                    <th><a class="btn btn-primary btn-md" href="/student/add">添加</a></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${students}" var="s" varStatus="stu">
                    <tr>
                        <td><input type="checkbox" class="checkbox" value="${s.studentId}" name="ids"></td>
                        <td>${stu.count}</td>
                        <td>${s.studentId}</td>
                        <td>${s.studentName}</td>
                        <c:if test="${s.studentsex==0}">
                            <td>男</td>
                        </c:if>
                        <c:if test="${s.studentsex==1}">
                            <td>女</td>
                        </c:if>
                        <td><fmt:formatDate value="${s.studentBrithday}" pattern="yyyy-MM-dd"/></td>
                        <td>${s.studentCard}</td>
                        <td>${s.studentHome}</td>
                        <td><a class="btn btn-primary btn-md" href="/student/update">修改</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
<script src="bootstrap/js/jquery-3.2.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script>
    function quanxuan() {
        alert(11)
    }

</script>
<style>
    .table th, .table td {
        text-align: center;
        vertical-align: middle!important;
    }
</style>
</html>
