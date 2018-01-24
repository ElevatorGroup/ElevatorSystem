package cn.elevator.sms;

import java.io.UnsupportedEncodingException;

import cn.elevator.sms.request.SmsVariableRequest;
import cn.elevator.sms.response.SmsVariableResponse;
import cn.elevator.sms.util.ChuangLanSmsUtil;

import com.alibaba.fastjson.JSON;
/**
 * 
 * @author tianyh 
 * @Description:变量短信发送
 */
public class SmsVariable {

	public static final String charset = "utf-8";
	// 用户平台API账号(非登录账号,示例:N1234567)
	public static String account = "N1777432";
	// 用户平台API密码(非登录密码)
	public static String pswd = "jOi1wbIGuTb23e";

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		//请求地址请登录253云通讯自助通平台查看或者询问您的商务负责人获取
		String smsVariableRequestUrl = "http://smssh1.253.com/msg/variable/json";
		//短信内容
		String msg = "【海狸科技】欢迎使用电梯安全管理系统，您的注册验证码是：{$var}，3分钟内有效。";
		//参数组																
		String params = "123456";
		//状态报告
		String report= "true";
		
		SmsVariableRequest smsVariableRequest=new SmsVariableRequest(account, pswd, msg, params, report);
		
        String requestJson = JSON.toJSONString(smsVariableRequest);
		
		System.out.println("before request string is: " + requestJson);
		
		String response = ChuangLanSmsUtil.sendSmsByPost(smsVariableRequestUrl, requestJson);
		
		System.out.println("response after request result is : " + response);
		
		SmsVariableResponse smsVariableResponse = JSON.parseObject(response, SmsVariableResponse.class);
		
		System.out.println("response  toString is : " + smsVariableResponse);
		
	}
	public static SmsVariableResponse sendMessage(String params){
		// 请求地址请登录253云通讯自助通平台查看或者询问您的商务负责人获取
				String smsVariableRequestUrl = "http://smssh1.253.com/msg/variable/json";
				// 短信内容
				String msg = "【海狸科技】欢迎使用电梯安全管理系统，您的注册验证码是：{$var}，3分钟内有效。";
				// 参数组
				//String params = "15971484080,123456";
				// 状态报告
				String report = "true";
				SmsVariableRequest smsVariableRequest = new SmsVariableRequest(account,
						pswd, msg, params, report);
				String requestJson = JSON.toJSONString(smsVariableRequest);
				String response = ChuangLanSmsUtil.sendSmsByPost(smsVariableRequestUrl,
						requestJson);
				SmsVariableResponse smsVariableResponse = JSON.parseObject(response,
						SmsVariableResponse.class);
				return smsVariableResponse;
	}
}
