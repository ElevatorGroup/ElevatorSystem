layui.use(['table', 'layer','element'], function(){

    var table = layui.table,
        layer=layui.layer,
        element=layui.element;
    //展示已知数据
    table.render({
        elem: '#firmtable'
        ,cols: [[ //标题栏
            {field: 'name', title: '公司名称'}
            ,{field: 'addres', title: '公司地址'}
            ,{field: 'code', title: '统一社会信用代码'}
            ,{field: 'ceo', title: '法定代表人'}
            ,{field: 'tel', title: '公司电话'}
            ,{field: 'fax', title: '公司传真'}
            ,{field: 'coo', title: '公司销售人'}
            ,{field: 'cooPhone', title: '公司销售人电话'}
            ,{field: 'simg', title: '厂商营业执照',}
            ,{field:'right', title: '操作', width:170,toolbar:"#barFirmTable"}
        ]]
        ,data: [{
            "name": "三菱电梯"
            ,"addres": "广东省深圳市莆田区某某工业园"
            ,"code": "56548989899987858"
            ,"ceo": "李强东"
            ,"tel": "0712-89888888"
            ,"fax": "0712-89888888"
            ,"coo": "李朝阳"
            ,"cooPhone": "15288989898"
            ,"simg": "<i class='iconfont icon-font29'></i>"

        }, {
            "name": "三菱电梯"
            ,"addres": "广东省深圳市莆田区某某工业园"
            ,"code": "56548989899987858"
            ,"ceo": "李强东"
            ,"tel": "0712-89888888"
            ,"fax": "0712-89888888"
            ,"coo": "李朝阳"
            ,"cooPhone": "15288989898"
            ,"simg": "<i class='iconfont icon-font29'></i>"
        }, {
            "name": "三菱电梯"
            ,"addres": "广东省深圳市莆田区某某工业园"
            ,"code": "56548989899987858"
            ,"ceo": "李强东"
            ,"tel": "0712-89888888"
            ,"fax": "0712-89888888"
            ,"coo": "李朝阳"
            ,"cooPhone": "15288989898"
            ,"simg": "<i class='iconfont icon-font29'></i>"
        }, {
            "name": "三菱电梯"
            ,"addres": "广东省深圳市莆田区某某工业园"
            ,"code": "56548989899987858"
            ,"ceo": "李强东"
            ,"tel": "0712-89888888"
            ,"fax": "0712-89888888"
            ,"coo": "李朝阳"
            ,"cooPhone": "15288989898"
            ,"simg": "<i class='iconfont icon-font29'></i>"
        }, {
            "name": "三菱电梯"
            ,"addres": "广东省深圳市莆田区某某工业园"
            ,"code": "56548989899987858"
            ,"ceo": "李强东"
            ,"tel": "0712-89888888"
            ,"fax": "0712-89888888"
            ,"coo": "李朝阳"
            ,"cooPhone": "15288989898"
            ,"simg": "<i class='iconfont icon-font29'></i>"
        }, {
            "name": "三菱电梯"
            ,"addres": "广东省深圳市莆田区某某工业园"
            ,"code": "56548989899987858"
            ,"ceo": "李强东"
            ,"tel": "0712-89888888"
            ,"fax": "0712-89888888"
            ,"coo": "李朝阳"
            ,"cooPhone": "15288989898"
            ,"simg": "<i class='iconfont icon-font29'></i>"
        }, {
            "name": "三菱电梯"
            ,"addres": "广东省深圳市莆田区某某工业园"
            ,"code": "56548989899987858"
            ,"ceo": "李强东"
            ,"tel": "0712-89888888"
            ,"fax": "0712-89888888"
            ,"coo": "李朝阳"
            ,"cooPhone": "15288989898"
            ,"simg": "<i class='iconfont icon-font29'></i>"
        }, {
            "name": "三菱电梯"
            ,"addres": "广东省深圳市莆田区某某工业园"
            ,"code": "56548989899987858"
            ,"ceo": "李强东"
            ,"tel": "0712-89888888"
            ,"fax": "0712-89888888"
            ,"coo": "李朝阳"
            ,"cooPhone": "15288989898"
            ,"simg": "<i class='iconfont icon-font29'></i>"
        }]
        //,skin: 'line' //表格风格
        ,page: true //是否显示分页
        //,limits: [5, 7, 10]
        ,limit: 5 //每页默认显示的数量
    });
    //监听工具条
    table.on('tool(firmtable)', function(obj){
        var data = obj.data;
        var firmtableTrVal = JSON.stringify(data);
        var firmtableEdit = $('.firmtableEdit').html();
        if(obj.event === 'detail'){
            layer.alert( "<div class='firmtableCheck'><p><span>公司名称：</span>恒大嘉园</p><p><span>公司地址：</span>湖北省孝感市孝南区</p><p><span>统一社会信用代码：</span>25658546658545656545</p><p><span>法定代表人：</span>李强东</p><p><span>公司电话：</span>0712-89898888</p><p><span>公司传真：</span>0712-898898888</p><p><span>公司销售人：</span>李朝阳</p><p><span>销售人电话：</span>15265656566</p><p><span>厂商营业执照：</span><img src='http://docs.ebdoor.com/Image/CompanyCertificate/9/90365.jpg'/></p></div>");
        } else if(obj.event === 'del'){
            layer.confirm('确定删除此行吗？', function(index){
                obj.del();
                layer.close(index);
            });
        }
    });

    //listTable
    table.render({
        elem: '#listTable'
        ,cellMinWidth: 80
        ,cols: [[ //标题栏
            {field: 'name', title: '楼盘名称'}
            ,{field: 'type', title: '电梯类型'}
            ,{field: 'occasion', title: '电梯使用场合'}
            ,{field: 'identification', title: '电梯标识'}
            ,{field: 'code', title: '注册代码'}
            ,{field: 'model', title: '电梯型号'}
            ,{field: 'num', title: '电梯编号'}
            ,{field: 'useing', title: '使用状态'}
            ,{field: 'regist', title: '注册状态',}
            ,{field: 'maintain', title: '首次维保日期',}
            ,{field:'right', title: '操作', width:160,toolbar:"#barlistTable"}
        ]]
        ,data: [{
            "name": "银泰城"
            ,"type": "直梯"
            ,"occasion": "商场"
            ,"identification": "ZQ56112541"
            ,"code": "48989899987858"
            ,"model": "MCA-1251-589"
            ,"num": "2-2#"
            ,"useing": "正在使用"
            ,"regist": "已注册"
            ,"maintain": "2017-12-25"

        },{
            "name": "银泰城"
            ,"type": "直梯"
            ,"occasion": "商场"
            ,"identification": "ZQ56112541"
            ,"code": "48989899987858"
            ,"model": "MCA-1251-589"
            ,"num": "2-2#"
            ,"useing": "正在使用"
            ,"regist": "已注册"
            ,"maintain": "2017-12-25"

        }]
        //,skin: 'line' //表格风格
        ,page: true //是否显示分页
        //,limits: [5, 7, 10]
        ,limit: 5 //每页默认显示的数量
    });
    //监听工具条
    table.on('tool(listTable)', function(obj){
        var data = obj.data;
        var firmtableTrVal = JSON.stringify(data);
        if(obj.event === 'detail'){
            layer.alert( "<div class='firmtableCheck'><p><span>公司名称：</span>恒大嘉园</p><p><span>公司地址：</span>湖北省孝感市孝南区</p><p><span>统一社会信用代码：</span>25658546658545656545</p><p><span>法定代表人：</span>李强东</p><p><span>公司电话：</span>0712-89898888</p><p><span>公司传真：</span>0712-898898888</p><p><span>公司销售人：</span>李朝阳</p><p><span>销售人电话：</span>15265656566</p><p><span>厂商营业执照：</span><img src='http://docs.ebdoor.com/Image/CompanyCertificate/9/90365.jpg'/></p></div>");
        } else if(obj.event === 'del'){
            layer.confirm('确定删除此行吗？', function(index){
                obj.del();
                layer.close(index);
            });
        }
    });
});
