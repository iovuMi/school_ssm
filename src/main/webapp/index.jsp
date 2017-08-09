<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<% String path=request.getContextPath();%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css">
    <title>学校管理系统</title>
</head>
<body>
<div class="container text-center">
<h2>学校管理系统</h2><br><br>
    <legend><ladle><span class="glyphicon glyphicon-user"></span>&nbsp;用户登录</ladle></legend><br>
        <form id="LoginForm" action="${path}/login" class="form-horizontal" method="post">

            <div class="form-group" id="userNameDiv">
                <label  class="col-md-4 control-label"><span>账号:</span></label>
                <div class="col-md-5">
                     <input class="form-control" type="text" id="userName" name="userName" placeholder="请输入账号">
                </div>
                <div class="col-md-3"><span id="userNameSpan"></span></div>
            </div>
            <div class="form-group" id="passWordDiv">
                <label  class="col-md-4 control-label"><span>密码:</span></label>
                <div  class="col-md-5">
                    <input class="form-control" type="password" id="passWord" name="passWord" placeholder="请输入密码">
                </div>
                <div class="col-md-3"><span id="passWordSpan"></span></div>
            </div>
            <div class="col-md-6 control-label">
                <button type="submit" class="btn btn-primary btn-md">登录</button>
            </div>
            <div class="col-md-2 control-label">
                <button type="button" class="btn btn-primary btn-md">注册</button>
            </div>

        </form>
</div>
</body>
<script src="bootstrap/js/jquery-3.2.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="js/login.js" type="text/javascript"></script>
</html>
