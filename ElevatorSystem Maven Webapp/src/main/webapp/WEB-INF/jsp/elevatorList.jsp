<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>物业-维保人员</title>
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
				<a href="#" class="headerUser-item headerUser-item-user"> <span
					class="glyphicon glyphicon-user" aria-hidden="true"></span>
					${userSession.userName }[用户角色：${userSession.userRoleName }] </a>
					 <a href="${pageContext.request.contextPath}/user/logout"
					class="headerUser-item"> <span class="glyphicon glyphicon-off"
					aria-hidden="true"></span> 退出 </a>
					<input id="roleId" type="hidden" value="${userSession.userRole }"/>
			</div>
    </div>
</div>
<!--}header-->
<!--main{-->
<div class="main">
    <!--左侧菜单{-->
    <div class="vertical-menu-wr">
        <div class="slide-btn-box slide-btn-up hidden"><i class="iconfont icon-down-trangle"></i></div>
        <div class="slide-btn-box slide-btn-down hidden"><i class="iconfont icon-down-trangle-copy-copy"></i></div>
        <div class="vertical-menu-bd">

            <div class="presoner">
                <a href="#"><img src="${pageContext.request.contextPath }/statics/images/personer.png"/></a>
            </div>
            <div class="vertical-menu">
                <ul>
                    <li><a  href=""><i class="iconfont icon-xinxi"></i><em>消息提醒</em><span class="layui-badge">99+</span></a>
                    </li>
                    <li><a class="curr" href=""><i class="iconfont icon-loupan"></i><em>楼盘管理</em></a>
                        <div class="vertical-menu-list">
                            <a class="fl" href=""><i class="iconfont icon-jiuyuan"></i><em>楼盘信息修改</em></a>
                            <a class="fl" href=""><i class="iconfont icon-dianti"></i><em>添加电梯信息</em></a>
                            <a class="fl" href=""><i class="iconfont icon-manufacturer-new-add"></i><em>添加厂商安装</em></a>
                            <a class="fl" href=""><i class="iconfont icon-hetong1"></i><em>添加合同信息</em></a>
                        </div>
                    </li>
                    <li><a href=""><i class="iconfont icon-wuye"></i><em>物业信息</em></a>
                    </li>
                    <li><a href=""><i class="iconfont icon-anzhuang"></i><em>安装公司</em></a>
                    </li>
                    <li><a href=""><i class="iconfont icon-dianti1"></i><em>电梯厂商</em></a>
                    </li>
                    <li><a href=""><i class="iconfont icon-bf-sos"></i><em>紧急救援</em></a>
                    </li>
                    <li><a href=""><i class="iconfont icon-hetong"></i><em>合同信息</em></a></li>
                    <li><a href=""><i class="iconfont icon-hetong"></i><em>楼盘信息</em></a></li>
                    <li><a href=""><i class="iconfont icon-hetong"></i><em>维保管理</em></a>
                        <div class="vertical-menu-list">
                            <a class="fl" href="${pageContext.request.contextPath }/maintenance/maintenanceView"><i class="iconfont icon-dianti"></i><em>公司信息管理</em></a>
                            <a class="fl" href="${pageContext.request.contextPath }/maintenance/maintenanceUser"><i class="iconfont icon-hetong1"></i><em>维保人员管理</em></a>
                            <a class="fl" href=""><i class="iconfont icon-hetong1"></i><em>维保工作管理</em></a>
                            <a class="fl" href=""><i class="iconfont icon-jiuyuan"></i><em>维保记录管理</em></a>
                            <a class="fl" href=""><i class="iconfont icon-jiuyuan"></i><em>维保合同管理</em></a>
                        </div>
                    </li>
                   
                </ul>
            </div>
        </div>
    </div>
    <!--}左侧菜单-->
    
    <!--右边{-->
		<div class="main-r">
			<form action="${pageContext.request.contextPath }/elevator/elevatorListUI" method="get">
				<div class="defaultAre">
					<div class="serchAre clearfix">
						<!-- 1楼盘名称 -->
						<div class="selectAre">
							<label for="" class=" control-label">楼盘</label>
							<div class="serchAreform-group">
								
								
								<select class="selectpicker" name="buildingId" value="${buildingId}" >
									<option name="" value="">请选择楼盘</option>
									<c:forEach items="${buildingName}" var="item" varStatus="status">
										<option   value="${item.id}"  <c:if test="${buildingId == item.id}">selected</c:if> >
										${item.companyName}</option>
										
									</c:forEach>
								</select>
							</div>
						</div>
						<!-- 2物业公司-->
						<div class="selectAre">
							<label for="" class=" control-label">物业公司</label>
							<div class="serchAreform-group">
								<select class="selectpicker" name="" title="请选择物业公司">
									<option>刘磊物业公司</option>
									<option>汪传胜物业公司</option>
								</select>
							</div>
						</div>

						<!-- 3维保公司 -->
						<div class="selectAre">
							<label for="" class=" control-label">维保公司</label>
							<div class="serchAreform-group">
								<select class="selectpicker" name="" title="请选择维保公司">
									<option>刘磊维保公司</option>
									<option>汪传胜维保公司</option>

								</select>
							</div>
						</div>

						<!-- 4电梯类型 -->
						<div class="selectAre">
							<label for="" class=" control-label">电梯类型</label>
							<div class="serchAreform-group">
								<select class="selectpicker" name="elevatorType" value="${elevatorType}" >
										<option name="elevatorType" value="">请选择电梯类型</option>
									   <c:forEach var="item" items="${elevatorTypeList}" varStatus="status">
									   		<option  value="${item.valueId}" <c:if test="${elevatorType == item.valueId}">selected</c:if>> ${item.valueName}</option>
									   </c:forEach>
        							<select>
							</div>
						</div>
						<!-- 5设备识别码 -->
						<div class="form-group">
							<label for="" class=" control-label">设备识别码</label> <input
								type="text" name="elevatorCode" value="${elevatorCode }" class="form-control">
						</div>


						<!-- 6注册代码 -->
						<div class="form-group form-group-code">
							<label for="" class=" control-label">注册代码</label> <input
								type="text" name="registrationCode" value="${registrationCode}" class="form-control">
						</div>
						<!-- 7注册状态 -->
						<div class="selectAre">
							<label for="" class=" control-label">注册状态</label>
							<div class="serchAreform-group">
								<select class="selectpicker" name="registrationStatus" value="${registrationStatus}">
									<option name="registrationStatus" value="">请选择注册状态</option>
									<c:forEach items="${registrationStatusList}" var="item" varStatus="status">
										<option value="${item.valueId }" <c:if test="${registrationStatus==item.valueId }" >selected</c:if>>${item.valueName}</option>
									</c:forEach>
								</select>
								
								
								
								
								
							</div>
						</div>


						<!-- 8使用状态 -->
						<div class="selectAre">
							<label for="" class=" control-label">使用状态</label>
							<div class="serchAreform-group">
									<select class="selectpicker" name="usingState" value="${usingState}" >
										<option name="usingState" value="">请选择使用状态</option>
									   <c:forEach var="item" items="${usingStateList}" varStatus="status">
									   		<option  value="${item.valueId}" <c:if test="${usingState == item.valueId}">selected</c:if>> ${item.valueName}</option>
									   </c:forEach>
        							<select>
        							
        							
        							
							</div>
						</div>


						<div class="form-group-button fl">
							<button type="submit" class="btn btn-warning serchBtn">查询</button>
						</div>
					</div>



					<table class="layui-table"
						lay-data="{ height:600, url:'${pageContext.request.contextPath }/elevator/elevatorListData?${params}', page:true, id:'firmtable'}"
						lay-filter="firmtable">
						<thead>
							<tr>
								
								<th lay-data="{field:'buildingName'}">楼盘名称</th>
								<th lay-data="{field:'elevatorTyepName'}">电梯类型</th>
								<th lay-data="{field:'elevatorCode'}">设备识别码</th>
								<th lay-data="{field:'registrationCode'}">注册代码</th>
								<th lay-data="{field:'elevatorModel'}">电梯型号</th>
								<th lay-data="{field:'elevatorNumber'}">电梯编号</th>
								<th lay-data="{field:'usingStateName'}">使用状态</th>
								<th lay-data="{field:'registrationStatusName'}">注册状态</th>
								<th lay-data="{field:'firstMaintenance'}">首次维保日期</th>
								<th
									lay-data="{ align:'center', width:170,toolbar:'#barFirmTable'}">操作</th>
							</tr>
						</thead>
					</table>
					<input type="hidden" id="path" value="${pageContext.request.contextPath }"/>
					<script type="text/html" id="barFirmTable">
                <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
                <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
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

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="${pageContext.request.contextPath }/statics/js/jquery-3.2.1.min.js"></script>

<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="${pageContext.request.contextPath }/statics/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/statics/js/bootstrap-select.js"></script>
<script src="${pageContext.request.contextPath }/statics/layui/layui.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath }/statics/js/table1.js" charset="gbk"></script>
<script src="${pageContext.request.contextPath }/statics/js/jquery.validate.min.js"></script>
<script src="${pageContext.request.contextPath }/statics/js/messages_zh.js"></script>
<script src="${pageContext.request.contextPath }/statics/js/regular.js" charset="gbk"></script>
<script src="${pageContext.request.contextPath }/statics/js/jquery.mousewheel.min.js"></script>
<script src="${pageContext.request.contextPath }/statics/js/comm.js"></script>
</body>
</html>