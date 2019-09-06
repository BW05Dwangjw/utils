package com.wjw.test;
/** 
* @author 作者:wangjiawen
* @version 创建时间: 2019年9月6日 上午9:31:00
* 类功能说明 
*/
public class StringgUtils {
	
	//判断是否为空
	public static boolean isEmpty(String str) {
		return (null==str||"".equals(str.trim()));
	}
	
	//判断是否有值
	public static boolean isHasValue(String str) {
		return (null!=null && "".equals(str.trim()));
	}
	
	
	
}
