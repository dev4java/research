package com.yswsoft.research.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
	public static String getXssFiter(String str){
		if(null !=str && !"".equals(str)){
			String regEx="[《》`~!@#$%^&amp;*()+=|{}':;',\\[\\].&lt;&gt;/?~！@#￥%……&amp;*（）——+|{}【】'；：”“’。，、？]"; 
			Pattern p = Pattern.compile(regEx);;  
			Matcher m = p.matcher(str);;  
			//System.out.println(str);;  
			//System.out.println(m.replaceAll("").trim());
			return m.replaceAll("").trim(); 	
		}
		return "";
	}
}
