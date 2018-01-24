$(document).ready(function() {
	var path = $("#path").val();
	// 绑定失去焦点事件 914209003435062736 18972674470
	// 显示图片上传错误提示信息
	if ($("#fileUploadError").val() != "") {
		$("#simage").next().html($("#fileUploadError").val());
	} else {
		$("#simage").next().html("");
	}
	
	
	$("#userRole").change(checkUserRole);
	$("#province").change(checkProvince);
	$("#city").change(checkCity);
	$("#userName").blur(checkUserName);
	$("#password").blur(checkPass);
	$("#repassword").blur(checkRePass);
	$("#realName").blur(checkRealName);
	$("#tel").blur(checkTel);
	$("#companyName").blur(checkCompanyName);
	$("#companyAddress").focus(focusCompanyAddress);
	$("#companyTel").blur(checkCompanyTel);
	$("#contactPerson").blur(checkContactPerson);
	$("#contactNumber").blur(checkContactNumber);
	$("#representative").blur(checkRepresentative);
	$("#fax").blur(checkFax);
	$("#creditCode").blur(checkCreditCode);
	$("#scode").blur(checkScode);
	$("#companyAddress").blur(checkCompanyAddress);
	$("#simage").blur(checkSimage);
	// 提交表单,调用验证函数
	$("#registerForm").submit(function() {
		var flag = true;
		if (!checkUserRole()) {
			flag = false;
			//alert("checkUserRole");
		}
		if (!checkProvince()) {
			flag = false;
			//alert("checkUserRole");
		}
		if (!checkCity()) {
			flag = false;
			//alert("checkUserRole");
		}
		if (!checkUserName()) {
			flag = false;
			//alert("checkUserName");
		}
		if (!checkPass()) {
			flag = false;
			//alert("checkPass");
		}
		if (!checkRePass()) {
			flag = false;
			//alert("checkRePass");
		}
		if (!checkRealName()) {
			flag = false;
			//alert("checkRealName");
		}
		if (!checkTel()) {
			flag = false;
			//alert("checkTel");
		}
		if (!checkCompanyName()) {
			flag = false;
			//alert("checkCompanyName");
		}
		if (!checkCompanyTel()) {
			flag = false;
			//alert("checkCompanyTel");
		}
		if (!checkContactPerson()) {
			flag = false;
			//alert("checkContactPerson");
		}
		if (!checkContactNumber()) {
			flag = false;
			//alert("checkContactNumber");
		}
		if (!checkRepresentative()) {
			flag = false;
			//alert("checkRepresentative");
		}
		if (!checkFax()) {
			flag = false;
			//alert("checkFax");
		}
		if (!checkCreditCode()) {
			flag = false;
			//alert("checkCreditCode");
		}
		if (!checkScode()) {
			flag = false;
			//alert("checkScode");
		}
		if (!checkCompanyAddress()) {
			flag = false;
			//alert("checkCompanyAddress");
		}
		if (!checkSimage()) {
			flag = false;
			//alert("checkSimage");
		}
		return flag;
	});
})
// 验证角色
function checkUserRole() {
	var $userRole = $("#userRole");
	if ($userRole.val() == "") {
		$userRole.next().html("请选择角色名");
		return false;
	}
	$userRole.next().html("");
	return true;
}
//获取焦点验证公司地址
function focusCompanyAddress() {
	//alert("123");
	var $province = $("#province");
	var texProvince=$province.find("option:selected").text();
	var $city = $("#city");
	var texCity=$city.find("option:selected").text();
	var $companyAddress=$("#companyAddress");
	if (texProvince == "—— 省 ——" || texCity=="—— 市 ——") {
		$companyAddress.next().html("请选择省市");
		return false;
	}
	$companyAddress.next().html("");
	return true;
}
//验证地址下拉框省
function checkProvince() {
	var $province = $("#province");
	var tex=$province.find("option:selected").text();
	//alert(tex);
	if (tex == "—— 省 ——") {
		$("#address").next().html("请选择省");
		return false;
	}
	$("#address").next().html("");
	return true;
}
//验证地址下拉框市
function checkCity() {
	var $city = $("#city");
	var tex=$city.find("option:selected").text();
	//alert(tex);
	if (tex == "—— 市 ——") {
		$("#address").next().html("请选择市");
		return false;
	}
	$("#address").next().html("");
	return true;
}
// 验证用户名
function checkUserName() {
	var flg = true;
	$.ajax({
		type : "GET",// 请求类型
		url : $("#path").val() + "/user/nameExist",// 请求的url
		data : {
			flag : "user",
			name : $("#userName").val()
		},// 请求参数
		dataType : "json",// ajax接口（请求url）返回的数据类型
		success : function(data) {// data：返回数据（json对象）
			if (data.result == "empty") {
				$("#userName").next().html("用户名不能为空");
				flg = false;
			} else if (data.result == "exist") {
				$("#userName").next().html("用户名已存在");
				flg = false;
			} else if (data.result == "noexist") {
				$("#userName").next().html("");
				flg = true;
			}
		},
		error : function(data) {// 当访问时候，404，500 等非200的错误状态码
			alert("验证失败！");
		}
	});
	return flg;
}
// 验证验证码
function checkScode() {
	var flg = true;
	if ($("#tel").val() != "") {
		$.ajax({
			type : "GET",// 请求类型
			url : $("#path").val() + "/user/validateCode",// 请求的url
			data : {
				phoneNumber : $("#tel").val(),
				sCode : $("#scode").val()
			},// 请求参数
			dataType : "json",// ajax接口（请求url）返回的数据类型
			success : function(data) {// data：返回数据（json对象）
				if ($("#scode").val() == "") {
					$("#send").next().html("验证码不能为空");
					flg = false;
				} else if (data.result == "success") {
					$("#send").next().html("");
					flg = true;
				} else if (data.result == "expire") {
					$("#send").next().html("验证码已过期，请重新发送");
					flg = false;
				} else if (data.result == "noexist") {
					$("#send").next().html("验证码错误");
					flg = false;
				} else if (data.result == "error") {
					$("#send").next().html("验证码错误");
					flg = false;
				}
			},
			error : function(data) {// 当访问时候，404，500 等非200的错误状态码
				alert("验证失败！");
			}
		});
	} else {
		$("#send").next().html("请输入手机号接收验证");
		flg = false;
	}
	return flg;
}
// 验证公司名
function checkCompanyName() {
	var flg = true;
	$.ajax({
		type : "GET",// 请求类型
		url : $("#path").val() + "/user/nameExist",// 请求的url
		data : {
			flag : "company",
			name : $("#companyName").val()
		},// 请求参数
		dataType : "json",// ajax接口（请求url）返回的数据类型
		success : function(data) {// data：返回数据（json对象）
			if (data.result == "empty") {
				$("#companyName").next().html("公司名称不能为空");
				flg = false;
			} else if (data.result == "exist") {
				$("#companyName").next().html("公司名称已存在");
				flg = false;
			} else if (data.result == "noexist") {
				$("#companyName").next().html("");
				flg = true;
			}
		},
		error : function(data) {// 当访问时候，404，500 等非200的错误状态码
			alert("验证失败！");
		}
	});
	return flg;
}
// 验证输入密码
function checkPass() {
	var $pwd = $("#password");
	if ($pwd.val() == "") {
		$("#password").next().html("密码不能为空");
		return false;
	}
	if ($pwd.val().length < 6) {
		$("#password").next().html("密码必须等于或大于6个字符");
		return false;
	}
	$("#password").next().html("");
	return true;
}
// 验证重复密码
function checkRePass() {
	var $pwd = $("#password"); // 输入密码
	var $repwd = $("#repassword"); // 再次输入密码
	if ($repwd.val() == "") {
		$("#repassword").next().html("请输入确认密码");
		return false;
	}
	if ($pwd.val() != $repwd.val()) {
		$("#repassword").next().html("两次输入的密码不一致");
		return false;
	}
	$("#repassword").next().html("");
	return true;
}
// 验证真实姓名
function checkRealName() {
	var $realName = $("#realName");
	if ($realName.val() == "") {
		$("#realName").next().html("真实姓名不能为空");
		return false;
	}
	var reg = /^[\u4E00-\u9FA5]{2,20}$|^[a-zA-Z\.\s]{2,20}$/;
	if (reg.test($realName.val()) == false) {
		$("#realName").next().html("姓名格式不正确");
		return false;
	}
	$("#realName").next().html("");
	return true;
}

// 验证公司地址
function checkCompanyAddress() {
	var $companyAddress = $("#companyAddress");
	if ($companyAddress.val() == "") {
		$companyAddress.next().html("公司地址不能为空");
		return false;
	}
	$companyAddress.next().html("");
	return true;
}
// 验证负责人
function checkContactPerson() {
	var $contactPerson = $("#contactPerson");
	if ($contactPerson.val() == "") {
		$("#contactPerson").next().html("负责人姓名不能为空");
		return false;
	}
	var reg = /^[\u4E00-\u9FA5]{2,20}$|^[a-zA-Z\.\s]{2,20}$/;
	if (reg.test($contactPerson.val()) == false) {
		$("#contactPerson").next().html("负责人姓名格式不正确");
		return false;
	}
	$("#contactPerson").next().html("");
	return true;
}
// 验证法人代表姓名
function checkRepresentative() {
	var $representative = $("#representative");
	if ($representative.val() == "") {
		$("#representative").next().html("负责人姓名不能为空");
		return false;
	}
	var reg = /^[\u4E00-\u9FA5]{2,20}$|^[a-zA-Z\.\s]{2,20}$/;
	if (reg.test($representative.val()) == false) {
		$("#representative").next().html("负责人姓名格式不正确");
		return false;
	}
	$("#representative").next().html("");
	return true;
}
// 验证手机号
function checkTel() {
	var $tel = $("#tel");
	if ($tel.val() == "") {
		$tel.next().html("手机号码不能为空");
		return false;
	}
	var regMobile = /^1(3|4|5|7|8)\d{9}$/;// 手机号
	if (regMobile.test($tel.val()) == false) {
		$tel.next().html("手机号码不正确，请重新输入");
		return false;
	}
	$tel.next().html("");
	return true;
}
// 验证公司电话
function checkCompanyTel() {
	var $companyTel = $("#companyTel");
	if ($companyTel.val() == "") {
		$companyTel.next().html("公司电话不能为空");
		return false;
	}
	var regMobile = /^1(3|4|5|7|8)\d{9}$|^(\(\d{3,4}\)|\d{3,4}-|\s)?\d{7,14}$/;// 固定电话或手机号
	if (regMobile.test($companyTel.val()) == false) {
		$companyTel.next().html("公司电话不正确，请重新输入");
		return false;
	}
	$companyTel.next().html("");
	return true;
}
// 验证传真，一般为固定电话
function checkFax() {
	var $fax = $("#fax");
	if ($fax.val() == "") {
		$fax.next().html("传真不能为空");
		return false;
	}
	var regMobile = /^(\(\d{3,4}\)|\d{3,4}-|\s)?\d{7,14}$/;// 固定电话
	if (regMobile.test($fax.val()) == false) {
		$fax.next().html("传真不正确，请重新输入");
		return false;
	}
	$fax.next().html("");
	return true;
}
// 验证负责人手机号码
function checkContactNumber() {
	var $contactNumber = $("#contactNumber");
	var regMobile = /^1(3|4|5|7|8)\d{9}$/;// 手机号
	if ($contactNumber.val() == "") {
		$contactNumber.next().html("负责人手机号码不能为空");
		return false;
	}
	if (regMobile.test($contactNumber.val()) == false) {
		$contactNumber.next().html("负责人手机号码不正确，请重新输入");
		return false;
	}
	$contactNumber.next().html("");
	return true;
}
// 验证统一社会信用代码
function checkCreditCode() {
	var $creditCode = $("#creditCode");
	var regMobile = /[^_IOZSVa-z\W]{2}\d{6}[^_IOZSVa-z\W]{10}$/;// 统一代码为18位，统一代码由十八位的数字或大写英文字母（不适用I、O、Z、S、V）组成，由五个部分组成
	if ($creditCode.val() == "") {
		$creditCode.next().html("统一社会信用代码不能为空");
		return false;
	}
	if (regMobile.test($creditCode.val()) == false) {
		$creditCode.next().html("统一社会信用代码不正确，请重新输入");
		return false;
	}
	$creditCode.next().html("");
	return true;
}
// 验证是否上传营业执照
function checkSimage() {
	var $simage = $("#simage");
	if ($simage.val() == "") {
		$simage.next().html("请上传营业执照");
		return false;
	}
	$simage.next().html("");
	return true;
}
// 发送手机验证码
var countdown = 180;
function sendemail() {
	var obj = $(".validate-box-btn");
	settime(obj);

}
function settime(obj) { // 发送验证码倒计时
	if (countdown == 0) {
		obj.attr('disabled', false);
		// obj.removeattr("disabled");
		obj.val("免费获取验证码");
		countdown = 180;
		return;
	} else {
		obj.attr('disabled', true);
		obj.val("重新发送(" + countdown + ")");
		countdown--;
	}
	setTimeout(function() {
		settime(obj)
	}, 1000)
}
$('.validate-box-btn').on('click', function() {
	sendemail();
	$.ajax({
		type : "GET",// 请求类型
		url : $("#path").val() + "/user/sendMessage",// 请求的url
		data : {
			phoneNumber : $("#tel").val()
		},// 请求参数
		dataType : "json",// ajax接口（请求url）返回的数据类型
		success : function(data) {// data：返回数据（json对象）
			if (data.statusCode == "0")
				alert("发送成功！");
			else
				alert("发送失败！");
		},
		error : function(data) {// 当访问时候，404，500 等非200的错误状态码
			alert("验证失败！");
		}
	});
})