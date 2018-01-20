layui.use(['table', 'layer','element'], function(){

    var table = layui.table,
        layer=layui.layer,
        element=layui.element;
    //չʾ��֪����
    table.render({
        elem: '#firmtable'
        ,cols: [[ //������
            {field: 'name', title: '��˾����', width: 100}
            ,{field: 'addres', title: '��˾��ַ', width: 300}
            ,{field: 'code', title: 'ͳһ������ô���', width: 180}
            ,{field: 'ceo', title: '����������', width: 100}
            ,{field: 'tel', title: '��˾�绰', width: 180}
            ,{field: 'fax', title: '��˾����', width: 180}
            ,{field: 'coo', title: '��˾������', width: 100}
            ,{field: 'cooPhone', title: '��˾�����˵绰', width: 150}
            ,{field: 'simg', title: '����Ӫҵִ��', width: 120}
            ,{field:'right', title: '����', width: 180,toolbar:"#barFirmTable"}
        ]]
        ,data: [{
            "name": "�������"
            ,"addres": "�㶫ʡ������������ĳĳ��ҵ԰"
            ,"code": "56548989899987858"
            ,"ceo": "��ǿ��"
            ,"tel": "0712-89888888"
            ,"fax": "0712-89888888"
            ,"coo": "���"
            ,"cooPhone": "15288989898"
            ,"simg": "<i class='iconfont icon-font29'></i>"

        }, {
            "name": "�������"
            ,"addres": "�㶫ʡ������������ĳĳ��ҵ԰"
            ,"code": "56548989899987858"
            ,"ceo": "��ǿ��"
            ,"tel": "0712-89888888"
            ,"fax": "0712-89888888"
            ,"coo": "���"
            ,"cooPhone": "15288989898"
            ,"simg": "<i class='iconfont icon-font29'></i>"
        }, {
            "name": "�������"
            ,"addres": "�㶫ʡ������������ĳĳ��ҵ԰"
            ,"code": "56548989899987858"
            ,"ceo": "��ǿ��"
            ,"tel": "0712-89888888"
            ,"fax": "0712-89888888"
            ,"coo": "���"
            ,"cooPhone": "15288989898"
            ,"simg": "<i class='iconfont icon-font29'></i>"
        }, {
            "name": "�������"
            ,"addres": "�㶫ʡ������������ĳĳ��ҵ԰"
            ,"code": "56548989899987858"
            ,"ceo": "��ǿ��"
            ,"tel": "0712-89888888"
            ,"fax": "0712-89888888"
            ,"coo": "���"
            ,"cooPhone": "15288989898"
            ,"simg": "<i class='iconfont icon-font29'></i>"
        }, {
            "name": "�������"
            ,"addres": "�㶫ʡ������������ĳĳ��ҵ԰"
            ,"code": "56548989899987858"
            ,"ceo": "��ǿ��"
            ,"tel": "0712-89888888"
            ,"fax": "0712-89888888"
            ,"coo": "���"
            ,"cooPhone": "15288989898"
            ,"simg": "<i class='iconfont icon-font29'></i>"
        }, {
            "name": "�������"
            ,"addres": "�㶫ʡ������������ĳĳ��ҵ԰"
            ,"code": "56548989899987858"
            ,"ceo": "��ǿ��"
            ,"tel": "0712-89888888"
            ,"fax": "0712-89888888"
            ,"coo": "���"
            ,"cooPhone": "15288989898"
            ,"simg": "<i class='iconfont icon-font29'></i>"
        }, {
            "name": "�������"
            ,"addres": "�㶫ʡ������������ĳĳ��ҵ԰"
            ,"code": "56548989899987858"
            ,"ceo": "��ǿ��"
            ,"tel": "0712-89888888"
            ,"fax": "0712-89888888"
            ,"coo": "���"
            ,"cooPhone": "15288989898"
            ,"simg": "<i class='iconfont icon-font29'></i>"
        }, {
            "name": "�������"
            ,"addres": "�㶫ʡ������������ĳĳ��ҵ԰"
            ,"code": "56548989899987858"
            ,"ceo": "��ǿ��"
            ,"tel": "0712-89888888"
            ,"fax": "0712-89888888"
            ,"coo": "���"
            ,"cooPhone": "15288989898"
            ,"simg": "<i class='iconfont icon-font29'></i>"
        }]
        //,skin: 'line' //�����
        ,page: true //�Ƿ���ʾ��ҳ
        //,limits: [5, 7, 10]
        ,limit: 5 //ÿҳĬ����ʾ������
    });
    //����������
    table.on('tool(firmtable)', function(obj){
        var data = obj.data;
        var firmtableTrVal = JSON.stringify(data)
        if(obj.event === 'detail'){
            layer.alert( "<div class='firmtableCheck'><p><span>��˾���ƣ�</span>����԰</p><p><span>��˾��ַ��</span>����ʡТ����Т����</p><p><span>ͳһ������ô��룺</span>25658546658545656545</p><p><span>���������ˣ�</span>��ǿ��</p><p><span>��˾�绰��</span>0712-89898888</p><p><span>��˾���棺</span>0712-898898888</p><p><span>��˾�����ˣ�</span>���</p><p><span>�����˵绰��</span>15265656566</p><p><span>����Ӫҵִ�գ�</span><img src='http://docs.ebdoor.com/Image/CompanyCertificate/9/90365.jpg'/></p></div>");
        } else if(obj.event === 'del'){
            layer.confirm('ȷ��ɾ��������', function(index){
                obj.del();
                layer.close(index);
            });
        } else if(obj.event === 'edit'){
            layer.alert("<div class='firmtableCheck'><p><span>��˾���ƣ�</span>����԰</p><p><span>��˾��ַ��</span>����ʡТ����Т����</p><p><span>ͳһ������ô��룺</span>25658546658545656545</p><p><span>���������ˣ�</span>��ǿ��</p><p><span>��˾�绰��</span>0712-89898888</p><p><span>��˾���棺</span>0712-898898888</p><p><span>��˾�����ˣ�</span>���</p><p><span>�����˵绰��</span>15265656566</p><p><span>����Ӫҵִ�գ�</span><img src='http://docs.ebdoor.com/Image/CompanyCertificate/9/90365.jpg'/></p></div>")
        }
    });
});
