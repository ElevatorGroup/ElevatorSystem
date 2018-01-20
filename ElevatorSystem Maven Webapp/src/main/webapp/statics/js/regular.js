jQuery.validator.addMethod("isMobile", function(value, element) {
    var length = value.length;
    var mobile = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;
    return this.optional(element) || (length == 11 && mobile.test(value));
}, "����ȷ��д�����ֻ�����");
jQuery.validator.addMethod("isTel", function(value, element) {

    var phone = /^(\d{3,4}-?)?\d{7,9}$/g;
    return this.optional(element) || (phone.test(value));
}, "����д��ȷ�Ĺ̶��绰");

jQuery.validator.addMethod("checkPic", function(value, element) {
    var filepath=$("#simage").val();
    //����ϴ��ļ���
    var fileArr=filepath.split("\\");
    var fileTArr=fileArr[fileArr.length-1].toLowerCase().split(".");
    var filetype=fileTArr[fileTArr.length-1];
    //�и����׺�ļ���
    return  $.inArray(filetype, ['jpg','png','gif'])>=0?true:false;

}, "�ϴ�ͼƬ��ʽ���ʺ�");
jQuery.validator.addMethod("isChinese", function(value, element) {
    return this.optional(element) || /^[\u0391-\uFFE5]+$/.test(value);
}, "ֻ�ܰ��������ַ�");
$(function(){
    //�õ�ǰ������validate������ʵ�ֱ���֤����
    $("#register-fu").validate({

        rules:{     //������֤����key���Ǳ���֤��dom����value���ǵ�����֤�ķ���(Ҳ��json��ʽ)
            sname:{
                required:true,  //��������֤��������Ҫ������������Ϊtrue
                rangelength:[2,12],
                remote:{
                    url:"ajax_check.action",
                    type:"post"
                }
            },
            capsname:{
                required:true,  //��������֤��������Ҫ������������Ϊtrue
                rangelength:[2,30],
                remote:{
                    url:"ajax_check.action",
                    type:"post"
                }
            },
            capadress:{
                required:true,  //��������֤��������Ҫ������������Ϊtrue
                rangelength:[2,30],
                remote:{
                    url:"ajax_check.action",
                    type:"post"
                }
            },

            spass:{
                required:true,
                rangelength:[6,16]
            },
            spass2:{
                required:true,
                equalTo:'#password' //��ʾ��id="spass"��ֵ��ͬ
            },
            saddress:{
                required:true
            },
            sphone : {
                required : true,
                minlength : 11,
                // �Զ��巽����У���ֻ��������ݿ����Ƿ����
                // checkPhoneExist : true,
                isMobile : true
            },
            scode : {
                digits : true,
                required : true
            } ,
            slike:{
                required:true,
            },
            semail:{
                required:true,
                email:true
            },
            simage:{
                required:true,
                checkPic:true
            },
            captel:{
                required : true,
                isTel:true
            },
            userceo:{
                required : true,
                minlength:2
            },
            usercoo:{
                required : true,
                minlength:2
            },
            creditcode:{
                required : true,
                minlength : 18
            }
        },
        messages:{
            sname:{
                required:"�������û���",
                rangelength:$.validator.format("�û�������Ϊ{0}-{1}���ַ�"),
                remote:"���û����Ѵ��ڣ�"
            },
            capsname:{
                required:"���乫˾����",
                rangelength:$.validator.format("�����������ʵ��˾����"),
            },
            capadress:{
                required:"���乫˾��ַ",
                rangelength:$.validator.format("�����������ʵ��˾��ַ"),
            },
            spass:{
                required:"����������",
                rangelength:$.validator.format("���볤��Ϊ{0}-{16}���ַ�")
            },
            spass2:{
                required:"���ٴ���������",
                equalTo:"�����������һ��" //��ʾ��id="spass"��ֵ��ͬ
            },
            sphone : {
                required : "�������ֻ���",
                minlength : "ȷ���ֻ�����С��11���ַ�",
                isMobile : "����ȷ��д�����ֻ�����"
            },
            scode : {
                required : "��������֤��",
                digits : "��֤��Ӧ����������"
            }  ,
            saddress:{
                required:"��ѡ���ַ"
            },
            slike:{
                required:"��ѡ�񰮺�",
            },
            semail:{
                required:"����д�ʼ�",
                email:"�����ʽ����ȷ"
            },
            simage:{
                required:"��ѡ��Ҫ�ϴ���ͷ��"
            },
            captel:{
                required:"����ȷ��д�绰����"
            },
            userceo:{
                required:"����ȷ��д�ķ��˴���"
            },
            usercoo:{
                required:"����ȷ��д��˾������"
            },
            creditcode:{
                required:"����ȷ��дͳһ������ô���"
            }
        }
    });
});
/**dianTiXinXiChaKanYanZheng**/
$(function(){
    //�õ�ǰ������validate������ʵ�ֱ���֤����
    $(".elevatorInfo-fu").validate({

        rules:{     //������֤����key���Ǳ���֤��dom����value���ǵ�����֤�ķ���(Ҳ��json��ʽ)
            sname:{
                required:true,  //��������֤��������Ҫ������������Ϊtrue
                rangelength:[2,30],
                remote:{
                    url:"ajax_check.action",
                    type:"post"
                },
                isChinese:true
            },
            saddres:{
                required:true,  //��������֤��������Ҫ������������Ϊtrue
                rangelength:[2,30],
                remote:{
                    url:"ajax_check.action",
                    type:"post"
                }
            },
            creditcode:{
                required : true,
                minlength : 18
            },
            userceo:{
                required:true,
                rangelength:[2,30],
                isChinese:true
            },
            captel:{
                required : true,
                isTel:true
            },
            usercoo:{
                required:true,
                rangelength:[2,30],
                isChinese:true
            },
            cooIphone:{
                required : true,
                minlength : 11,
                // �Զ��巽����У���ֻ��������ݿ����Ƿ����
                // checkPhoneExist : true,
                isMobile : true
            },
            simage:{
                required:true,
                checkPic:true
            },
            firmname:{
                required:true,  //��������֤��������Ҫ������������Ϊtrue
                rangelength:[2,12],
                remote:{
                    url:"ajax_check.action",
                    type:"post"
                }
            },
            firmaddres:{
                required:true,  //��������֤��������Ҫ������������Ϊtrue
                rangelength:[2,30],
                /*remote:{
                    url:"ajax_check.action",
                    type:"post"
                }*/
            },
            firmcreditcode:{
                required : true,
                minlength : 18
            },
            firmceo:{
                required:true,
                rangelength:[2,30],
                isChinese:true
            },
            firmtel:{
                required : true,
                isTel:true
            },
            firmcoo:{
                required:true,
                rangelength:[2,30],
                isChinese:true
            },
            firmIphone:{
                required : true,
                minlength : 11,
                // �Զ��巽����У���ֻ��������ݿ����Ƿ����
                // checkPhoneExist : true,
                isMobile : true
            },
            firmimage:{
                required:true,
                checkPic:true
            },
            firmsum:{
                required:true,
                digits:true
            },
            firmuseing:{
                required:true,
                rangelength:[2,30],
                isChinese:true
            },
            firmdate:{
                required:true,
                date:true
            },
            nameY:{
                required:true,  //��������֤��������Ҫ������������Ϊtrue
                rangelength:[2,30],
                remote:{
                    url:"ajax_check.action",
                    type:"post"
                },
                isChinese:true
            },
            endDate:{
                required:true,
                tate:true
            },
            sType:{
                required:true
            }
        },
        messages:{
            sname:{
                required:"���乫˾����",
                rangelength:$.validator.format("�����������ʵ��˾����"),
            },
            saddres:{
                required:"���乫˾��ַ",
                rangelength:$.validator.format("�����������ʵ��˾��ַ"),
            },
            creditcode:{
                required:"����ȷ��дͳһ������ô���"
            },
            userceo:{
                required:"����ȷ��д���˴���"
            },
            captel:{
                required:"����ȷ��д�绰����"
            },
            usercoo:{
                required:"����ȷ��д����������"
            },
            cooIphone:{
                required : "�������ֻ���",
                minlength : "ȷ���ֻ�����С��11���ַ�",
                isMobile : "����ȷ��д�����ֻ�����"
            },
            simage:{
                required:"��ѡ��Ҫ�ϴ���ͼƬ"
            },
            firmname:{
                required:"�����빫˾����",
                rangelength:$.validator.format("�û�������Ϊ{0}-{1}���ַ�"),
                remote:"�ù�˾����ӣ�"
            },
            firmaddres:{
                required:"���乫˾��ַ",
                rangelength:$.validator.format("�����������ʵ��˾��ַ"),
            },
            firmcreditcode:{
                required:"����ȷ��дͳһ������ô���"
            },
            firmceo:{
                required:"����ȷ��д���˴���"
            },
            firmtel:{
                required:"����ȷ��д�绰����"
            },
            firmcoo:{
                required:"����ȷ��д����������"
            },
            firmIphone:{
                required : "�������ֻ���",
                minlength : "ȷ���ֻ�����С��11���ַ�",
                isMobile : "����ȷ��д�����ֻ�����"
            },
            firmimage:{
                required:"��ѡ��Ҫ�ϴ���ͼƬ"
            },
            firmsum:{
                required:"������������"
            },
            firmuseing:{
                required:"������ȷ����ʹ�ó���"
            },
            firmdate:{
                required:"����ѡ������"
            },
            nameY:{
                reauired:"����ȷ�����빫˾����"
            },
            endDate:{
                required:"����ѡ������"
            },
            sType:{
                required:"��ѡ���ͬ����"
            }

        }
    });
});

//serch
/*
$("#elevatorSerch-fu").validate({
    debug:true, //����ģʽ����ʹ��֤�ɹ�Ҳ������ת��Ŀ��ҳ��
    rules:{     //������֤����key���Ǳ���֤��dom����value���ǵ�����֤�ķ���(Ҳ��json��ʽ)
        sname:{
            required:true,  //��������֤��������Ҫ������������Ϊtrue
            rangelength:[2,12],
            remote:{
                url:"ajax_check.action",
                type:"post"
            }
        }
    },
    messages:{
        sname:{
            required:"�������û���",
            rangelength:$.validator.format("�û�������Ϊ{0}-{1}���ַ�"),
            remote:"���û����Ѵ��ڣ�"
        }
    }
});*/
$(".addElevator").validate({

    rules:{     //������֤����key���Ǳ���֤��dom����value���ǵ�����֤�ķ���(Ҳ��json��ʽ)
        elevatorNum:{
            required:true
        },
        elevatorType:{
            required:true
        },
        elevatorCode:{
            required:true
        },
        elevatorKnow:{
            required:true
        },
        elevatorRegister:{
            required:true
        },
        elevatorFactory:{
            required:true
        },
        elevatorUse:{
            required:true
        },
        startDate:{
            required:true
        },
        ekevatorRepair:{
            required:true
        },
        ekevatorRstState:{
            required:true
        },
        ekevatorTypeS:{
            required:true
        },
        elevatorUseState:{
            required:true
        }
    },
    messages:{
        elevatorNum:{
            required:"��������ݱ��"
        },
        elevatorType:{
            required:"����������ͺ�"
        },
        elevatorCode:{
            required:"�������ڲ�����"
        },
        elevatorKnow:{
            required:"�������豸ʶ����"
        },
        elevatorRegister:{
            required:"������ע�����"
        },
        elevatorFactory:{
            required:"������������"
        },
        elevatorUse:{
            required:"������ʹ��֤��"
        },
        startDate:{
            required:"��ѡ��Ͷ������"
        },
        ekevatorRepair:{
            required:"��ѡ���״�ά������"
        },
        ekevatorRstState:{
            required:"��ѡ�����ע��״̬"
        },
        ekevatorTypeS:{
            required:"��ѡ���������"
        },
        elevatorUseState:{
            required:"��ѡ�����ʹ��״̬"
        }
    }
});
//�޸���ҵ��Ա
$(".addStaff").validate({

    rules:{     //������֤����key���Ǳ���֤��dom����value���ǵ�����֤�ķ���(Ҳ��json��ʽ)
        name:{
            required:true
        },
        sphone : {
            required : true,
            minlength : 11,
            isMobile : true
        },
        userName:{
            required:true
        },
        spass:{
            required:true,
            rangelength:[6,16]
        },
        spass2:{
            required:true,
            equalTo:'#password' //��ʾ��id="spass"��ֵ��ͬ
        }
    },
    messages:{
        name:{
            required:"����������"
        },
        sphone : {
            required : "�������ֻ���",
            minlength : "ȷ���ֻ�����С��11���ַ�",
            isMobile : "����ȷ��д�����ֻ�����"
        },
        userName:{
            required:"�������û���"
        },
        spass:{
            required:"����������",
            rangelength:$.validator.format("���볤��Ϊ{0}-{16}���ַ�")
        },
        spass2:{
            required:"���ٴ���������",
            equalTo:"�����������һ��" //��ʾ��id="spass"��ֵ��ͬ
        }
    }
});
//�޸���ҵ��Ա
$(".changeProperty").validate({

    rules:{     //������֤����key���Ǳ���֤��dom����value���ǵ�����֤�ķ���(Ҳ��json��ʽ)
        name:{
            required:true
        },
        address:{
            required:true
        },
        sphone : {
            required : true,
            minlength : 11,
            isMobile : true
        },
        code:{
            required:true
        },
        ceo:{
            required:true
        }
        ,
        tel:{
            required:true,
            isTel:true
        },
        coo:{
            required:true
        }
    },
    messages:{
        name:{
            required:"�����빫˾����"
        },
        address:{
            required:"�����빫˾��ַ"
        },
        sphone : {
            required : "�������ֻ���",
            minlength : "ȷ���ֻ�����С��11���ַ�",
            isMobile : "����ȷ��д�����ֻ�����"
        },
        code:{
            required:"������ͳһ������ô���"
        },
        ceo:{
            required:"�����뷨��������"
        },
        tel:{
            required:"����ȷ��д�绰����"
        },
        coo:{
            required:"�����빫˾����������"
        }
    }
});
//�޸ľ�Ԯ��Ϣ
$(".addHelpInfo").validate({

    rules:{     //������֤����key���Ǳ���֤��dom����value���ǵ�����֤�ķ���(Ҳ��json��ʽ)
        num:{
            required:true
        },
        helpDate:{
            required:true
        },
        repairDate:{
            required:true
        },
        repairUser:{
            required:true
        },
        reason:{
            required:true
        },
        long:{
            required:true
        },
        finish:{
            required:true
        },
        type:{
            required:true
        }
    },
    messages:{
        num:{
            required:"��������ݱ��"
        },
        helpDate:{
            required:"��ѡ�����ʱ��"
        },
        repairDate:{
            required:"��ѡ��ά��ʱ��"
        },
        repairUser:{
            required:"������ά����"
        },
        reason:{
            required:"���������ԭ��"
        },
        long:{
            required:"������ά��ʱ��"
        },
        finish:{
            required:"���������ʱ��"
        },
        type:{
            required:"��ѡ��ά������"
        }
    }
});
