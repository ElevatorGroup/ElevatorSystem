jQuery.validator.addMethod("isMobile", function(value, element) {
    var length = value.length;
    var mobile = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;
    return this.optional(element) || (length == 11 && mobile.test(value));
}, "请正确填写您的手机号码");
jQuery.validator.addMethod("isTel", function(value, element) {

    var phone = /^(\d{3,4}-?)?\d{7,9}$/g;
    return this.optional(element) || (phone.test(value));
}, "请填写正确的固定电话");

jQuery.validator.addMethod("checkPic", function(value, element) {
    var filepath=$("#simage").val();
    //获得上传文件名
    var fileArr=filepath.split("\\");
    var fileTArr=fileArr[fileArr.length-1].toLowerCase().split(".");
    var filetype=fileTArr[fileTArr.length-1];
    //切割出后缀文件名
    return  $.inArray(filetype, ['jpg','png','gif'])>=0?true:false;

}, "上传图片格式不适合");
jQuery.validator.addMethod("isChinese", function(value, element) {
    return this.optional(element) || /^[\u0391-\uFFE5]+$/.test(value);
}, "只能包含中文字符");
$(function(){
    //让当前表单调用validate方法，实现表单验证功能
    $("#register-fu").validate({

        rules:{     //配置验证规则，key就是被验证的dom对象，value就是调用验证的方法(也是json格式)
            sname:{
                required:true,  //必填。如果验证方法不需要参数，则配置为true
                rangelength:[2,12],
                remote:{
                    url:"ajax_check.action",
                    type:"post"
                }
            },
            capsname:{
                required:true,  //必填。如果验证方法不需要参数，则配置为true
                rangelength:[2,30],
                remote:{
                    url:"ajax_check.action",
                    type:"post"
                }
            },
            capadress:{
                required:true,  //必填。如果验证方法不需要参数，则配置为true
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
                equalTo:'#password' //表示和id="spass"的值相同
            },
            saddress:{
                required:true
            },
            sphone : {
                required : true,
                minlength : 11,
                // 自定义方法：校验手机号在数据库中是否存在
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
                required:"请输入用户名",
                rangelength:$.validator.format("用户名长度为{0}-{1}个字符"),
                remote:"该用户名已存在！"
            },
            capsname:{
                required:"请输公司名称",
                rangelength:$.validator.format("请务必输入真实公司名称"),
            },
            capadress:{
                required:"请输公司地址",
                rangelength:$.validator.format("请务必输入真实公司地址"),
            },
            spass:{
                required:"请输入密码",
                rangelength:$.validator.format("密码长度为{0}-{16}个字符")
            },
            spass2:{
                required:"请再次输入密码",
                equalTo:"两次密码必须一致" //表示和id="spass"的值相同
            },
            sphone : {
                required : "请输入手机号",
                minlength : "确认手机不能小于11个字符",
                isMobile : "请正确填写您的手机号码"
            },
            scode : {
                required : "请输入验证码",
                digits : "验证码应该输入数字"
            }  ,
            saddress:{
                required:"请选择地址"
            },
            slike:{
                required:"请选择爱好",
            },
            semail:{
                required:"请填写邮件",
                email:"邮箱格式不正确"
            },
            simage:{
                required:"请选择要上传的头像"
            },
            captel:{
                required:"请正确填写电话号码"
            },
            userceo:{
                required:"请正确填写的法人代表"
            },
            usercoo:{
                required:"请正确填写公司负责人"
            },
            creditcode:{
                required:"请正确填写统一社会信用代码"
            }
        }
    });
});
/**dianTiXinXiChaKanYanZheng**/
$(function(){
    //让当前表单调用validate方法，实现表单验证功能
    $(".elevatorInfo-fu").validate({

        rules:{     //配置验证规则，key就是被验证的dom对象，value就是调用验证的方法(也是json格式)
            sname:{
                required:true,  //必填。如果验证方法不需要参数，则配置为true
                rangelength:[2,30],
                remote:{
                    url:"ajax_check.action",
                    type:"post"
                },
                isChinese:true
            },
            saddres:{
                required:true,  //必填。如果验证方法不需要参数，则配置为true
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
                // 自定义方法：校验手机号在数据库中是否存在
                // checkPhoneExist : true,
                isMobile : true
            },
            simage:{
                required:true,
                checkPic:true
            },
            firmname:{
                required:true,  //必填。如果验证方法不需要参数，则配置为true
                rangelength:[2,12],
                remote:{
                    url:"ajax_check.action",
                    type:"post"
                }
            },
            firmaddres:{
                required:true,  //必填。如果验证方法不需要参数，则配置为true
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
                // 自定义方法：校验手机号在数据库中是否存在
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
                required:true,  //必填。如果验证方法不需要参数，则配置为true
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
                required:"请输公司名称",
                rangelength:$.validator.format("请务必输入真实公司名称"),
            },
            saddres:{
                required:"请输公司地址",
                rangelength:$.validator.format("请务必输入真实公司地址"),
            },
            creditcode:{
                required:"请正确填写统一社会信用代码"
            },
            userceo:{
                required:"请正确填写法人代表"
            },
            captel:{
                required:"请正确填写电话号码"
            },
            usercoo:{
                required:"请正确填写负责人姓名"
            },
            cooIphone:{
                required : "请输入手机号",
                minlength : "确认手机不能小于11个字符",
                isMobile : "请正确填写您的手机号码"
            },
            simage:{
                required:"请选择要上传的图片"
            },
            firmname:{
                required:"请输入公司名称",
                rangelength:$.validator.format("用户名长度为{0}-{1}个字符"),
                remote:"该公司已添加！"
            },
            firmaddres:{
                required:"请输公司地址",
                rangelength:$.validator.format("请务必输入真实公司地址"),
            },
            firmcreditcode:{
                required:"请正确填写统一社会信用代码"
            },
            firmceo:{
                required:"请正确填写法人代表"
            },
            firmtel:{
                required:"请正确填写电话号码"
            },
            firmcoo:{
                required:"请正确填写负责人姓名"
            },
            firmIphone:{
                required : "请输入手机号",
                minlength : "确认手机不能小于11个字符",
                isMobile : "请正确填写您的手机号码"
            },
            firmimage:{
                required:"请选择要上传的图片"
            },
            firmsum:{
                required:"请您输入数字"
            },
            firmuseing:{
                required:"请您正确输入使用场合"
            },
            firmdate:{
                required:"请您选择日期"
            },
            nameY:{
                reauired:"请正确的输入公司名称"
            },
            endDate:{
                required:"请您选择日期"
            },
            sType:{
                required:"请选择合同类型"
            }

        }
    });
});

//serch
/*
$("#elevatorSerch-fu").validate({
    debug:true, //调试模式，即使验证成功也不会跳转到目标页面
    rules:{     //配置验证规则，key就是被验证的dom对象，value就是调用验证的方法(也是json格式)
        sname:{
            required:true,  //必填。如果验证方法不需要参数，则配置为true
            rangelength:[2,12],
            remote:{
                url:"ajax_check.action",
                type:"post"
            }
        }
    },
    messages:{
        sname:{
            required:"请输入用户名",
            rangelength:$.validator.format("用户名长度为{0}-{1}个字符"),
            remote:"该用户名已存在！"
        }
    }
});*/
$(".addElevator").validate({

    rules:{     //配置验证规则，key就是被验证的dom对象，value就是调用验证的方法(也是json格式)
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
            required:"请输入电梯编号"
        },
        elevatorType:{
            required:"请输入电梯型号"
        },
        elevatorCode:{
            required:"请输入内部编码"
        },
        elevatorKnow:{
            required:"请输入设备识别码"
        },
        elevatorRegister:{
            required:"请输入注册代码"
        },
        elevatorFactory:{
            required:"请输入出厂编号"
        },
        elevatorUse:{
            required:"请输入使用证号"
        },
        startDate:{
            required:"请选择投用日期"
        },
        ekevatorRepair:{
            required:"请选择首次维保日期"
        },
        ekevatorRstState:{
            required:"请选择电梯注册状态"
        },
        ekevatorTypeS:{
            required:"请选择电梯类型"
        },
        elevatorUseState:{
            required:"请选择电梯使用状态"
        }
    }
});
//修改物业人员
$(".addStaff").validate({

    rules:{     //配置验证规则，key就是被验证的dom对象，value就是调用验证的方法(也是json格式)
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
            equalTo:'#password' //表示和id="spass"的值相同
        }
    },
    messages:{
        name:{
            required:"请输入姓名"
        },
        sphone : {
            required : "请输入手机号",
            minlength : "确认手机不能小于11个字符",
            isMobile : "请正确填写您的手机号码"
        },
        userName:{
            required:"请输入用户名"
        },
        spass:{
            required:"请输入密码",
            rangelength:$.validator.format("密码长度为{0}-{16}个字符")
        },
        spass2:{
            required:"请再次输入密码",
            equalTo:"两次密码必须一致" //表示和id="spass"的值相同
        }
    }
});
//修改物业人员
$(".changeProperty").validate({

    rules:{     //配置验证规则，key就是被验证的dom对象，value就是调用验证的方法(也是json格式)
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
            required:"请输入公司名称"
        },
        address:{
            required:"请输入公司地址"
        },
        sphone : {
            required : "请输入手机号",
            minlength : "确认手机不能小于11个字符",
            isMobile : "请正确填写您的手机号码"
        },
        code:{
            required:"请输入统一社会信用代码"
        },
        ceo:{
            required:"请输入法定代表人"
        },
        tel:{
            required:"请正确填写电话号码"
        },
        coo:{
            required:"请输入公司负责人姓名"
        }
    }
});
//修改救援信息
$(".addHelpInfo").validate({

    rules:{     //配置验证规则，key就是被验证的dom对象，value就是调用验证的方法(也是json格式)
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
            required:"请输入电梯编号"
        },
        helpDate:{
            required:"请选择求救时间"
        },
        repairDate:{
            required:"请选择维修时间"
        },
        repairUser:{
            required:"请输入维修人"
        },
        reason:{
            required:"请输入故障原因"
        },
        long:{
            required:"请输入维修时长"
        },
        finish:{
            required:"请输入完成时长"
        },
        type:{
            required:"请选择维修类型"
        }
    }
});
