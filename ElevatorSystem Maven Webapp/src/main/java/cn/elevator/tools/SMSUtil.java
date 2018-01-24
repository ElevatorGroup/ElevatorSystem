package cn.elevator.tools;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class SMSUtil {
	static String httpUrl = "https://dx.ipyy.net/smsJson.aspx";
	//final static String API_KEY = "xxxx";
	public static String send(String phone,String content) throws Exception {
	BufferedReader reader = null;
	String result = null;
	StringBuffer sbf = new StringBuffer();
	String password=MD5Tool.getMD5("AG0014645");
	try {//action=send&userid=&account=账号&password=密码&mobile=15023239810,13527576163&content=内容&sendTime=&extno="
	String httpArg = "action=send&userid=&account=AG00146&password="+password+"&mobile="+phone+"&content="+URLEncoder.encode(content,"UTF-8")+"&sendTime=&extno=";
	httpUrl = httpUrl + "?" + httpArg ;
	URL url = new URL(httpUrl);
	HttpURLConnection connection = (HttpURLConnection) url
	.openConnection();
	connection.setRequestMethod("GET");
	// 填入apikey到HTTP header
	//connection.setRequestProperty("apikey",API_KEY);
	connection.connect();
	InputStream is = connection.getInputStream();
	reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	String strRead = null;
	while ((strRead = reader.readLine()) != null) {
	sbf.append(strRead);
	sbf.append("\r\n");
	}
	reader.close();
	result = sbf.toString();
	} catch (Exception e) {
	e.printStackTrace();
	}
	return result;
	}
}
