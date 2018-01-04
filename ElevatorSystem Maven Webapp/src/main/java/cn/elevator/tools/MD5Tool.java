package cn.elevator.tools;

import java.security.MessageDigest;

public class MD5Tool {
	  public static String getMD5(String str) throws Exception {

	        String MD5 = "";

	        MessageDigest md5 = MessageDigest.getInstance("MD5");
	        byte[] bytes = str.getBytes();
	        //通过执行诸如填充之类的最终操作完成哈希计算
	        byte[] digest = md5.digest(bytes);

	        for (int i = 0; i < digest.length; i++) {
	            //摘要字节数组中各个字节的"十六进制"形式.
	            int j = digest[i];
	             j = j & 0x000000ff;
	            String s1 = Integer.toHexString(j);

	            if (s1.length() == 1) {
	                s1 = "0" + s1;
	            }
	            MD5 += s1;
	        }
	        return MD5;
	    }
}
