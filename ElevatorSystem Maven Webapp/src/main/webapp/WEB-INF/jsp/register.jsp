<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>注册页</title>
    <link href="${pageContext.request.contextPath }/statics/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/statics/css/main.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/statics/css/bootstrap-select.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/layui/css/layui.css" media="all">
    <!--[if lt IE 9]>
    <script src="bootstrap-3.3.7-dist/js/html5shiv.min.js"></script>
    <script src="bootstrap-3.3.7-dist/js/respond.min.js"></script>
    <![endif]-->
    <style>
        .error{
            color:red;
        }
    </style>
</head>
<body  style="overflow: auto">
<div class="register-wr">
    <div class="header">
        <div class="w800 regiter-header">
            <a href="#" class="fl logo"></a>
            <h1 class="fl header-tit">孝南区质监局电梯安全管理系统
            </h1>
        </div>
    </div>
   <!--注册{-->
    <div class="w800">
        <div class="register-bg">
            <blockquote class="layui-elem-quote">用户注册 <span class="fr">已有帐号？  <a href="${pageContext.request.contextPath}/user/login">请登陆</a> | <a href="#" class="registerForget">忘记密码</a></span></blockquote>
            <div class="register-bd">
                <form action="${pageContext.request.contextPath}/user/doRegister" id="registerForm" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <label for="userRole" class="item-label">角色:</label>
                        <div class="serchAreform-group">
                            <select name="userRole" id="userRole" class="item-select ">
                                <option value="">请选择</option>
                                <option value="1">楼盘用户</option>
                                <option value="2">物业管理员</option>
                                <option value="4">维保管理员</option>
                            </select><span class="userTips"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="userName" class="item-label">用户名:</label>
                        <input type="text" id="userName" name="userName" class="form-control" placeholder="设置用户名"
                               autocomplete="off" tip="请输入用户名"><span class="userTips"></span>
                    </div>
                    <div class="form-group">
                        <label for="realName" class="item-label">真实姓名:</label>
                        <input type="text" id="realName" name="realName" class="form-control" placeholder="请输入真实姓名"
                               autocomplete="off" tip="请输入真实姓名"><span class="userTips"></span>
                    </div>
                    <div class="form-group">
                        <label for="tel" class="item-label">手机号:</label>
                        <input type="text" id="tel" name="tel" class="form-control" placeholder="请输入注册手机号"
                               autocomplete="off" tip="请输入注册手机号"><span class="userTips"></span>
                    </div>
                    <div class="form-group">
                        <label for="scode" class="item-label">手机验证码:</label>
                        <div class="validate-box fl">
                            <input type="text" id="scode" name="scode" class="form-control fl" maxlength="11" placeholder="输入验证码" tip="请输入正确的验证码"><input type="button" class="btn btn-primary validate-box-btn btn-sm" id="send" value="免费获取验证码">
                            <span class="userTips"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="password" class="item-label">密码:</label>
                        <input type="password" id="password" name="password" class="form-control" placeholder="长度为6-16个字符" name="spass"
                               tip="长度为6-16个字符"><span class="userTips"></span>
                    </div>
                    <div class="form-group">
                        <label for="repassword" class="item-label">确认密码:</label>
                        <input type="password" name="repassword" id="repassword" class="form-control" placeholder="设置确认密码"><span class="userTips"></span>
                    </div>
                    <div class="form-group">
                        <label for="companyName" class="item-label">公司名称:</label>
                        <input type="text" id="companyName" name="companyName" class="form-control" placeholder="请输入公司名称"
                               autocomplete="off" tip="请输入公司名称"><span class="userTips"></span>
                    </div>
                  <!--   <div class="form-group">
                        <label for="companyAddress" class="item-label">公司地址:</label>
                        <input type="text" id="companyAddress" name="companyAddress" class="form-control" placeholder="请输入公司地址"
                               autocomplete="off" tip="请输入公司地址"><span class="userTips"></span>
                    </div> -->
                     <div class="form-group">
                        <label  class="item-label">公司地址:</label>
                        <div data-toggle="distpicker" id="address">
                            <select id="province" name="province" class="item-select item-selectdis"></select>
                            <select id="city" name="city" class="item-select item-selectdis"></select>
                            <select id="district" name="district" class="item-select item-selectdis"></select>
                        </div><span class="userTips"></span>
                    </div>
                    <div class="form-group">
                        <label for="capadress" class="item-label"> </label>
                        <input type="text" id="companyAddress" name="companyAddress" class="form-control" placeholder="请填写详细地址"
                               autocomplete="off" tip="请填写详细地址"><span class="userTips"></span>
                    </div>
                    <div class="form-group">
                        <label for="companyTel" class="item-label">公司电话:</label>
                        <input type="text" id="companyTel" name="companyTel" class="form-control" placeholder="请输入公司电话"
                               autocomplete="off" tip="请输入公司电话"><span class="userTips"></span>
                    </div>
                    <div class="form-group">
                        <label for="fax" class="item-label">公司传真:</label>
                        <input type="text" name="fax" id="fax"  class="form-control" placeholder="请输入公司传真"><span class="userTips"></span>
                    </div>
                    <div class="form-group">
                        <label for="representative" class="item-label">法人代表:</label>
                        <input type="text" id="representative" name="representative" class="form-control" placeholder="请输入法人代表"><span class="userTips"></span>
                    </div>
                    <div class="form-group">
                        <label for="contactPerson" class="item-label">负责人:</label>
                        <input type="text" id="contactPerson" name="contactPerson" class="form-control" placeholder="请输入公司负责人"
                        ><span class="userTips"></span>
                    </div>
                    <div class="form-group">
                        <label for="contactNumber" class="item-label">负责人手机号码:</label>
                        <input type="text" id="contactNumber" name="contactNumber" class="form-control" maxlength="11" placeholder="输入手机号码" tip="请输入手机号码"><span class="userTips"></span>
                    </div>
                    <div class="form-group">
                        <label for="creditCode" class="item-label">统一社会信用代码:</label>
                        <input type="text" id="creditCode" name="creditCode" class="form-control" maxlength="18" placeholder="输入统一社会信用代码" ><span class="userTips"></span>
                    </div>

                    <div class="form-group">
                    <input type="hidden" id="fileUploadError" value="${fileUploadError}" />
                        <label for="simage" class="item-label">营业执照:</label>
                        <input type="file" id="simage" name="simage" class="item-file"><span class="userTips"></span>
                    </div>
                    <div class="register-btn">
                        <botton  class="item-submit btn btn-default active">返回</botton>
                        <input type="submit" value="提交" class="item-submit btn btn-success">
                    </div>
                </form>
            </div>
<input type="hidden" id="path" name="path"
								value="${pageContext.request.contextPath }" />
        </div>
    </div>
    <!--}注册-->
</div>
<div class="footer" style="position:static">
    湖北省孝感市孝南区孝南区|© 2017  cdoptima Inc. All Rights Reserved &nbsp;&nbsp;
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/statics/js/comm.js" charset="utf-8"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="${pageContext.request.contextPath }/statics/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/statics/js/bootstrap-select.js"></script>
<script src="${pageContext.request.contextPath }/statics/localjs/register.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath }/statics/js/jquery.validate.min.js"></script>
<script src="${pageContext.request.contextPath }/statics/js/messages_zh.js"></script>
<script src="${pageContext.request.contextPath }/statics/js/regular.js" charset="gbk"></script>
<script src="${pageContext.request.contextPath }/statics/layui/layui.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath }/statics/js/distpicker.data.js"></script>
<script src="${pageContext.request.contextPath }/statics/js/distpicker.js"></script>
</body>
</html>
