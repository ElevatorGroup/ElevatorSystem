<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>list</title>
    <link href="${pageContext.request.contextPath }/statics/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/statics/css/main.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/statics/font/iconfont.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/statics/css/bootstrap-select.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/layui/css/layui.css" media="all">
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<!--header{-->
<div class="header">
    <a href="#" class="fl logo"></a>
    <h1 class="fl header-tit">孝南区质监局电梯安全管理系统
    </h1>
    <div class="headerInfo fr">
        <div class="header-flashes">
            <ul class="nav nav-pills" role="tablist">
                <li role="presentation"><a href="#">全部 <span class="badge">18</span></a> </li>
                <li role="presentation"><a href="#">离线 <span class="badge">0</span></a> </li>
                <li role="presentation"><a href="#">故障 <span class="badge">0</span></a> </li>
                <li role="presentation"><a href="#">检修 <span class="badge">3</span></a> </li>
                <li role="presentation"><a href="#">正常 <span class="badge">15</span></a> </li>
            </ul>
        </div>
        <div class="header-user">
            <a href="#" class="headerUser-item headerUser-item-user">
                <span class="glyphicon glyphicon-user" aria-hidden="true"></span> 陈露露开心快乐dfs！物业管理员工

            </a>
            <a href="#" class="headerUser-item">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span> 退出
            </a>
        </div>
    </div>
</div>
<!--}header-->
<!--main{-->
<div class="main">
    <!--左侧菜单{-->
    <div class="vertical-menu-wr">
        <div class="presoner">
            <a href="#"><img src="${pageContext.request.contextPath }/statics/images/personer.png"/></a>
        </div>
        <div class="vertical-menu">
            <ul>
                <li><a href=""><i class="iconfont icon-xinxi"></i><em>消息提醒</em></a></li>
                <li><a href=""><i class="iconfont icon-loupan"></i><em>楼盘信息</em></a></li>
                <li><a href=""><i class="iconfont icon-wuye"></i><em>物业信息</em></a></li>
                <li><a href=""><i class="iconfont icon-icon02"></i><em>添加电梯</em></a></li>
                <li><a href=""><i class="iconfont icon-hetong"></i><em>合同信息</em></a></li>
            </ul>
        </div>
    </div>
    <!--}左侧菜单-->
    
    <!--右边{-->
    <div class="main-r">
        <form action="">
            <div class="defaultAre">
                <div class="serchAre clearfix">
                    <div class="form-group">
                        <label for="" class=" control-label">楼盘名称</label>
                        <input type="text" class="form-control"  >
                    </div>
                    <div class="selectAre">
                        <label for="" class=" control-label">电梯类型</label>
                        <div class="serchAreform-group">
                            <select  class="selectpicker"  title="请选择电梯类型">
                                <option>观光电梯</option>
                                <option>乘客电梯</option>
                                <option>杂货电梯</option>
                                <option>载货电梯</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="" class=" control-label">电梯标识</label>
                        <input type="text" class="form-control"  >
                    </div>
                    <div class="form-group form-group-code">
                        <label for="" class=" control-label">注册代码</label>
                        <input type="text" class="form-control"  >
                    </div>
                    <div class="form-group">
                        <label for="" class=" control-label">使用状态</label>
                        <input type="text" class="form-control"  >
                    </div>
                    <div class="selectAre form-group">
                        <label for="" class=" control-label">使用状态</label>
                        <div class="serchAreform-group">
                            <select  class="selectpicker"  title="">
                                <option>使用中</option>
                                <option>停用</option>
                                <option>维修中</option>
                                <option>维保中</option>
                                <option>故障</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group-button fl">
                        <button type="button" class="btn btn-warning serchBtn">查 询</button>
                    </div>
                </div>
                <table class="${pageContext.request.contextPath }/statics/layui-hide" id="listTable" lay-filter="listTable"></table>
                <script type="text/html" id="barlistTable">
                    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
                    <a class="layui-btn layui-btn-xs" lay-event="edit" href="#">编辑</a>
                    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
                </script>

            </div>
        </form>

    </div>
    <!--}右边-->
    <!--footer{-->
    <div class="footer">
        湖北省孝感市孝南区孝南区|© 2017  cdoptima Inc. All Rights Reserved &nbsp;&nbsp;
    </div>
    <!--}footer-->
</div>
<!--}main-->

<script>

   
</script>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/statics/js/comm.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="${pageContext.request.contextPath }/statics/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/statics/js/bootstrap-select.js"></script>
<script src="${pageContext.request.contextPath }/statics/layui/layui.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath }/statics/js/table1.js" charset="gbk"></script>
<script src="${pageContext.request.contextPath }/statics/js/jquery.validate.min.js"></script>
<script src="${pageContext.request.contextPath }/statics/js/messages_zh.js"></script>
<script src="${pageContext.request.contextPath }/statics/js/regular.js" charset="gbk"></script>
</body>
</html>