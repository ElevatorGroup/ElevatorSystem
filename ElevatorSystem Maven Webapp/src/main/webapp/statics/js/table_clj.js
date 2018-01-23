layui.use(['table', 'layer','element', 'laydate'], function(){

    var table = layui.table,
        layer=layui.layer,
        element=layui.element,
        laydate = layui.laydate;

    //日期
    laydate.render({
        elem: '#installDate',
        elem: '#startDate'
    });
    laydate.render({
        elem: '#endDate'
    });
    laydate.render({
        elem: '#helpDate'
        ,type: 'datetime'
    });
    laydate.render({
        elem: '#repairDate'
        ,type: 'datetime'
    });
    //监听工具条 楼盘电梯厂商
    table.on('tool(firmtable)', function(obj){
        var data = obj.data;
        var firmtableTrVal = JSON.stringify(data);
        var firmtableEdit = $('.firmtableEdit').html();
        if(obj.event === 'detail'){
        	$.ajax({
    			type:"GET",//请求类型
    			url:$("#path").val()+"/elevator/elevatorDetail",//请求的url
    			data:{id:data.id},//请求参数
    			dataType:"json",//ajax接口（请求url）返回的数据类型
    			success:function(result){//data：返回数据（json对象）
    				layer.open({
    	                title:'电梯详细信息',
    	                content:"<div class='firmtableCheck'>" +
    	                		"<p><span>电梯所属楼盘：</span> "+result.buildingId+"</p>" +
    	                		"<p><span>电梯注册代码：</span> "+result.registrationCode+"</p>" +
    	                		"<p><span>电梯内部编号：</span> "+result.internalNumber+"</p>" +
    	                		"<p><span>所属物业公司：</span> "+result.buildingId+"</p>"+ 
    	                		"<p><span>物业联系人：</span> "+result.buildingId+"</p>" +
    	                		"<p><span>物业联系电话：</span> "+result.buildingId+"</p>" +
    	                		"<p><span>所属维保公司：</span> "+result.buildingId+"</p>" +
    	                		"<p><span>所属维保公司电话：</span> "+result.buildingId+"</p>" +
    	                		"<p><span>所属维保公司：</span> "+result.buildingId+"</p>" +
    	                		"<p><span>维保管理员：</span> "+result.buildingId+"</p>" +
    	                		"<p><span>维保管理电话：</span> "+result.buildingId+"</p>" +
    	                		"<p><span>电梯使用注册证：</span> "+result.buildingId+"</p>" +
    	                		"</div>",
    	                area: '1000px'

    	            });
    			},
    			error:function(data){//当访问时候，404，500 等非200的错误状态码
    				alert("数据加载失败！");
    			}
    		});
        	
        } else if(obj.event === 'del'){
        	if($("#roleId").val()==1){
            layer.confirm('确定删除此行吗？', function(index){
              	$.ajax({
        			type:"GET",//请求类型
        			url:$("#path").val()+"/elevator/elevatorDel",//请求的url
        			data:{id:data.id},//请求参数
        			dataType:"json",//ajax接口（请求url）返回的数据类型
        			success:function(result){//data：返回数据（json对象）
        				if(result==true){
        					obj.del();
        				}else{
        					alert("删除失败！");
        				}
        			},
        			error:function(data){//当访问时候，404，500 等非200的错误状态码
        				alert("删除失败！");
        			}
        		});
                
                layer.close(index);
            });}else{
        		alert("权限不足，不允许删除！");
        	}
        }else if(obj.event === 'edit'){
        	if($("#roleId").val()==1){
            location.href=$("#path").val()+"/elevator/elevatorDetail?id="+data.id;
        	}else{
        		alert("权限不足，不允许修改！");
        	}
        }
    });


    //监听工具条 物业信息
    table.on('tool(property)', function(obj){
        var data = obj.data;
        if(obj.event === 'detail'){
            layer.open({
                title:'物业维保公司信息',
                content:"<div class='firmtableCheck'><p><span>公司名称：</span>恒大嘉园</p><p><span>公司地址：</span>湖北省孝感市孝南区</p><p><span>统一社会信用代码：</span>25658546658545656545</p><p><span>法定代表人：</span>李强东</p><p><span>公司电话：</span>0712-89898888</p><p><span>公司传真：</span>0712-898898888</p><p><span>公司销售人：</span>李朝阳</p><p><span>销售人电话：</span>15265656566</p><p><span>厂商营业执照：</span><img src='http://docs.ebdoor.com/Image/CompanyCertificate/9/90365.jpg'/></p></div>",
                area: '500px'
            });
        }
    });
    //监听工具条 安装公司
    table.on('tool(installtable)', function(obj){
        var data = obj.data;
        if(obj.event === 'detail'){
            layer.open({
                title:'物业维保公司信息',
                content:"<div class='firmtableCheck'><p><span>公司名称：</span>恒大嘉园</p><p><span>公司地址：</span>湖北省孝感市孝南区</p><p><span>统一社会信用代码：</span>25658546658545656545</p><p><span>法定代表人：</span>李强东</p><p><span>公司电话：</span>0712-89898888</p><p><span>公司传真：</span>0712-898898888</p><p><span>公司销售人：</span>李朝阳</p><p><span>销售人电话：</span>15265656566</p><p><span>厂商营业执照：</span><img src='http://docs.ebdoor.com/Image/CompanyCertificate/9/90365.jpg'/></p></div>",
                area: '500px'
            });
        }
    });
    //监听工具条 紧急救援
    table.on('tool(sostable)', function(obj){
        var data = obj.data;
        if(obj.event === 'detail'){
            layer.open({
                title:'物业维保公司信息',
                content:"<div class='firmtableCheck'><p><span>公司名称：</span>恒大嘉园</p><p><span>公司地址：</span>湖北省孝感市孝南区</p><p><span>统一社会信用代码：</span>25658546658545656545</p><p><span>法定代表人：</span>李强东</p><p><span>公司电话：</span>0712-89898888</p><p><span>公司传真：</span>0712-898898888</p><p><span>公司销售人：</span>李朝阳</p><p><span>销售人电话：</span>15265656566</p><p><span>厂商营业执照：</span><img src='http://docs.ebdoor.com/Image/CompanyCertificate/9/90365.jpg'/></p></div>",
                area: '500px'
            });
        }
    });
    //监听工具条 合同信息
    table.on('tool(contractTable)', function(obj){
        var data = obj.data;
        var firmtableTrVal = JSON.stringify(data);
        var firmtableEdit = $('.firmtableEdit').html();
        if(obj.event === 'detail'){
            layer.open({
                title:'物业维保公司信息',
                content:"<div class='firmtableCheck'><p><span>公司名称：</span>恒大嘉园</p><p><span>公司地址：</span>湖北省孝感市孝南区</p><p><span>统一社会信用代码：</span>25658546658545656545</p><p><span>法定代表人：</span>李强东</p><p><span>公司电话：</span>0712-89898888</p><p><span>公司传真：</span>0712-898898888</p><p><span>公司销售人：</span>李朝阳</p><p><span>销售人电话：</span>15265656566</p><p><span>厂商营业执照：</span><img src='http://docs.ebdoor.com/Image/CompanyCertificate/9/90365.jpg'/></p></div>",
                area: '500px'
            });
        } else if(obj.event === 'del'){
            layer.confirm('确定删除此行吗？', function(index){
                obj.del();
                layer.close(index);
            });
        }
    });
    //监听工具条 保养信息提醒
    table.on('tool(maintainMsgTable)', function(obj){
        var data = obj.data;
        if(obj.event === 'detail'){
            layer.open({
                title:'物业维保公司信息',
                content:"<div class='firmtableCheck'><p><span>公司名称：</span>恒大嘉园</p><p><span>公司地址：</span>湖北省孝感市孝南区</p><p><span>统一社会信用代码：</span>25658546658545656545</p><p><span>法定代表人：</span>李强东</p><p><span>公司电话：</span>0712-89898888</p><p><span>公司传真：</span>0712-898898888</p><p><span>公司销售人：</span>李朝阳</p><p><span>销售人电话：</span>15265656566</p><p><span>厂商营业执照：</span><img src='http://docs.ebdoor.com/Image/CompanyCertificate/9/90365.jpg'/></p></div>",
                area: '500px'
            });
        }
    });
    //监听工具条 楼盘信息
    table.on('tool(buldingtable)', function(obj){
        var data = obj.data;
        var firmtableTrVal = JSON.stringify(data);
        var firmtableEdit = $('.firmtableEdit').html();
        if(obj.event === 'detail'){
            layer.open({
                title:'物业维保公司信息',
                content:"<div class='firmtableCheck'><p><span>公司名称：</span>恒大嘉园</p><p><span>公司地址：</span>湖北省孝感市孝南区</p><p><span>统一社会信用代码：</span>25658546658545656545</p><p><span>法定代表人：</span>李强东</p><p><span>公司电话：</span>0712-89898888</p><p><span>公司传真：</span>0712-898898888</p><p><span>公司销售人：</span>李朝阳</p><p><span>销售人电话：</span>15265656566</p><p><span>厂商营业执照：</span><img src='http://docs.ebdoor.com/Image/CompanyCertificate/9/90365.jpg'/></p></div>",
                area: '500px'
            });
        } else if(obj.event === 'del'){
            layer.confirm('确定删除此行吗？', function(index){
                obj.del();
                layer.close(index);
            });
        }
    });
    //监听工具条 物业-楼盘信息
    table.on('tool(wy-buldingtable)', function(obj){
        var data = obj.data;
        var firmtableTrVal = JSON.stringify(data);
        var firmtableEdit = $('.firmtableEdit').html();
        if(obj.event === 'detail'){
            layer.open({
                title:'物业维保公司信息',
                content:"<div class='firmtableCheck'><p><span>公司名称：</span>恒大嘉园</p><p><span>公司地址：</span>湖北省孝感市孝南区</p><p><span>统一社会信用代码：</span>25658546658545656545</p><p><span>法定代表人：</span>李强东</p><p><span>公司电话：</span>0712-89898888</p><p><span>公司传真：</span>0712-898898888</p><p><span>公司销售人：</span>李朝阳</p><p><span>销售人电话：</span>15265656566</p><p><span>厂商营业执照：</span><img src='http://docs.ebdoor.com/Image/CompanyCertificate/9/90365.jpg'/></p></div>",
                area: '500px'
            });
        } else if(obj.event === 'del'){
            layer.confirm('确定删除此行吗？', function(index){
                obj.del();
                layer.close(index);
            });
        }
    });
    //监听工具条 list
    table.on('tool(listtable)', function(obj){
        var data = obj.data;
        var firmtableTrVal = JSON.stringify(data);
        var firmtableEdit = $('.firmtableEdit').html();
        if(obj.event === 'detail'){
            layer.open({
                title:'物业维保公司信息',
                content:"<div class='firmtableCheck'><p><span>公司名称：</span>恒大嘉园</p><p><span>公司地址：</span>湖北省孝感市孝南区</p><p><span>统一社会信用代码：</span>25658546658545656545</p><p><span>法定代表人：</span>李强东</p><p><span>公司电话：</span>0712-89898888</p><p><span>公司传真：</span>0712-898898888</p><p><span>公司销售人：</span>李朝阳</p><p><span>销售人电话：</span>15265656566</p><p><span>厂商营业执照：</span><img src='http://docs.ebdoor.com/Image/CompanyCertificate/9/90365.jpg'/></p></div>",
                area: '500px'
            });
        } else if(obj.event === 'del'){
            layer.confirm('确定删除此行吗？', function(index){
                obj.del();
                layer.close(index);
            });
        }
    });
    //监听工具条 物业维保公司
    table.on('tool(wy-weibaotable)', function(obj){
        var data = obj.data;

        var firmtableEdit = $('.firmtableEdit').html();
        if(obj.event === 'detail'){
            layer.open({
                title:'物业维保公司信息',
                content:"<div class='firmtableCheck'><p><span>公司名称：</span>恒大嘉园</p><p><span>公司地址：</span>湖北省孝感市孝南区</p><p><span>统一社会信用代码：</span>25658546658545656545</p><p><span>法定代表人：</span>李强东</p><p><span>公司电话：</span>0712-89898888</p><p><span>公司传真：</span>0712-898898888</p><p><span>公司销售人：</span>李朝阳</p><p><span>销售人电话：</span>15265656566</p><p><span>厂商营业执照：</span><img src='http://docs.ebdoor.com/Image/CompanyCertificate/9/90365.jpg'/></p></div>",
                area: '500px'
            });
        } else if(obj.event === 'del'){
            layer.confirm('确定删除此行吗？', function(index){
                obj.del();
                layer.close(index);
            });
        }
    });

    //监听表格复选框选择
    table.on('checkbox(firmtable)', function(obj){
        console.log(obj)
    });
    $(function(){
        var $ = layui.$, active = {
            getCheckLength: function(){ //获取选中数目
                var checkStatus = table.checkStatus('firmtable')
                    ,data = checkStatus.data;
                if(data.length>0){
                    layer.open({
                        title: '分配物业人员',
                        content: '<div class="form-group">  <label for="ekevatorRstState" class=" control-label">分配楼盘</label>                     <select name="ekevatorRstState" class="item-select valid" aria-invalid="false">           <option value="">请选择</option>                    <option value="银泰城">银泰城</option>     <option value="保利国际">保利国际</option>         </select>            </div>'
                    });
                }else{
                    alert("请至少选择一位物业人员")
                }
            }
        };
        $('.layui-change-checkbox').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });
    
    
    //维保
    $('.addServer').on('click',function(){
        layer.open({
            title: '新增维保人员'
            ,content: '<form action="'+$("#path").val()+'/maintenance/addMainUser" method="get" class="addSaa" novalidate="novalidate">       <div class="elevatorInfo-wr addStaff-wr">            <div class="elevatorInfo-item"><div class="elevatorInfo-item-bd clearfix">  <div class="form-group">            <label for="name" class=" control-label">姓名</label>  <input type="text" name="realName" value="" class="form-control">  </div>   <div class="form-group">            <label for="phone" class=" control-label">手机号码</label>  <input type="text" name="tel" value="" class="form-control">  </div><div class="form-group">            <label for="phone" class=" control-label">微信</label>  <input type="text" name="wenXin" value="" class="form-control">  </div><div class="form-group">            <label for="username" class=" control-label">用户名</label>  <input type="text" name="userName" value="" class="form-control">  </div><div class="form-group">            <label for="password" class=" control-label">密码</label>  <input type="password" name="password" value="" class="form-control">  </div></div>            </div> <div class="register-btn">  <input type="submit" value="提交" class="item-submit btn btn-success">  </div> </div>  </form>'
            ,btn:0
            ,area: '750px'
        });
    });
    
    
    table.on('tool(wy-stafftable)', function(obj){
        var data = obj.data;
        var firmtableTrVal = JSON.stringify(data);
        var firmtableEdit = $('.firmtableEdit').html();
        if(obj.event === 'edit'){
        	alert(data.id);
        	$.ajax({
    			type:"GET",//请求类型
    			url:$("#path").val()+"/user/UserById",//请求的url
    			data:{id:data.id},//请求参数
    			dataType:"json",//ajax接口（请求url）返回的数据类型
    			success:function(result){//data：返回数据（json对象）
    				layer.open({
    		            title: '修改维保人员信息'
    		            ,content: '<form action="'+$("#path").val()+'/maintenance/addMainUser" method="get" class="addSaa" novalidate="novalidate">       <div class="elevatorInfo-wr addStaff-wr">            <div class="elevatorInfo-item"><div class="elevatorInfo-item-bd clearfix">  <div class="form-group">            <label for="name" class=" control-label">姓名</label>  <input type="text" name="realName" value="'+result.realName+'" class="form-control">  </div>   <div class="form-group">            <label for="phone" class=" control-label">手机号码</label>  <input type="text" name="tel" value="'+result.tel+'" class="form-control">  </div><div class="form-group">            <label for="phone" class=" control-label">微信</label>  <input type="text" name="wenXin" value="'+result.wenXin+'" class="form-control">  </div><div class="form-group">            <label for="username" class=" control-label">用户名</label>  <input type="text" name="userName" value="'+result.userName+'" class="form-control">  </div><div class="form-group">            <label for="password" class=" control-label">密码</label>  <input type="password" name="password" value="'+result.password+'" class="form-control">  </div></div>            </div> <div class="register-btn">  <input type="submit" value="提交" class="item-submit btn btn-success">  </div> </div>  </form>'
    		            ,btn:0
    		            ,area: '750px'
    		        });
    			},
    			error:function(data){//当访问时候，404，500 等非200的错误状态码
    				alert("数据加载失败！");
    			}
    		});
           
        } else if(obj.event === 'del'){
            layer.confirm('确定删除此行吗？', function(index){
                obj.del();
                layer.close(index);
            });
        }
    });
   
    $('.register-examine-img-bt').on('click',function(){
        layer.open({
            title: '用户头像',
            content:'<div class="register-examine-img-bt-wr"><img src="https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1515740891&di=e79815c09a4ec3969657f6660988a3b5&src=http://imgsrc.baidu.com/imgad/pic/item/a9d3fd1f4134970a034652049ecad1c8a7865de7.jpg"></div>'
            ,area: '500px'
        })
    })
    
    
    
    
    
    
    //监听分配维保人员(维保管理人员)
    table.on('checkbox(firmtable)', function(obj){
        console.log(obj)
    });
    $(function(){
        var $ = layui.$, active = {
            getCheckLength: function(){ //获取选中数目
                var checkStatus = table.checkStatus('firmtable')
                    ,data = checkStatus.data;
                if(data.length>0){
                	var str="";
                	for(var a=0;a<data.length;a++){
      					str+="<input type='text' name='elevatorId' value='"+data[a].id+"'/>";
      				}
                 	$.ajax({
            			type:"GET",//请求类型
            			url:$("#path").val()+"/user/getUser_pt",//请求的url
            			/*data:,//请求参数
*/            			
            			dataType:"json",//ajax接口（请求url）返回的数据类型
            			success:function(result){//data：返回数据（json对象）
            				var b="";
            				for(var a=0;a<result.length;a++){
              					b+="<option value='"+result[a].id+"'>"+result[a].userName+"</option>" ;
              				}
            				  layer.open({
                                  title: '分配维保人员工作',
                                  content: "<form action='"+$("#path").val()+"/maintenance/maintenanceWork' method='get'><select id='custom-headers' name='userid' multiple='multiple'>" 
                                	  +b+ "</select>"+str+"<div class='layui-layer-btn layui-layer-btn-'><input type='submit' class='layui-layer-btn0'><a class='layui-layer-btn1'>返回</a></div></form><script>$('#custom-headers').multiSelect();</script>"
                                  ,area: '410px'
                                ,btn:0 
                              });
            			},
            			error:function(result){//当访问时候，404，500 等非200的错误状态码
            				alert("数据加载无效！");
            			}
            		});
                }else{
                    alert("请至少选择一位物业人员")
                }
            }
        };
        $('.Maintenance-checkbox').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });
});
