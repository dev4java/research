package com.yswsoft.base_web.web.controller;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

public class Rea {
	  
    public static void main(String[] args) throws ClientProtocolException, IOException 
       { 
           // 创建HttpClient实例    
           HttpClient httpclient = new DefaultHttpClient(); 
           // 创建Get方法实例    
          HttpGet httpgets = new HttpGet("https://api.weibo.com/2/statuses/public_timeline.json?source=707016719&count=200" ); 
         /*  HttpPost httpposts = new HttpPost("https://api.weibo.com/2/statuses/public_timeline.json");
           List<NameValuePair> nvps = new ArrayList<NameValuePair>(); 
           nvps.add(new BasicNameValuePair("source", "3109898698")); 
           nvps.add(new BasicNameValuePair("count", "200")); 
           httpposts.setEntity(new UrlEncodedFormEntity( nvps));  */
          //httpclient.execute(httpposts); 
           HttpResponse response = httpclient.execute(httpgets);   
           HttpEntity entity = response.getEntity();   
           if (entity != null) {   
               InputStream instreams = entity.getContent();   
               String str = convertStreamToString(instreams); 
              /* System. out.println("Do something" ); */ 
               System. out.println(str);
               toPackger(str);
               //JSONObject object = JSON.parseObject(str);  
              // System.out.println(object.get("geo"));
               // Do not need the rest   
               httpgets.abort();   
           } 
       } 
        
    
    public static Packager toPackger(String str){
    	
		return null;
    	
    }
    
    
       public static String convertStreamToString(InputStream is) {     
           BufferedReader reader = new BufferedReader(new InputStreamReader(is));     
           StringBuilder sb = new StringBuilder();     
         
           String line = null;     
           try {     
               while ((line = reader.readLine()) != null) { 
                   sb.append(line + "\n");     
               }     
           } catch (IOException e) {     
               e.printStackTrace();     
           } finally {     
               try {     
                   is.close();     
               } catch (IOException e) {     
                  e.printStackTrace();     
               }     
           }     
           return sb.toString();     
       } 
       
       private static String ConvertStream2Json(InputStream inputStream)
       {
           String jsonStr = "";
           // ByteArrayOutputStream相当于内存输出流
           ByteArrayOutputStream out = new ByteArrayOutputStream();
           byte[] buffer = new byte[1024];
           int len = 0;
           // 将输入流转移到内存输出流中
           try
           {
               while ((len = inputStream.read(buffer, 0, buffer.length)) != -1)
               {
                   out.write(buffer, 0, len);
               }
               // 将内存流转换为字符串
               jsonStr = new String(out.toByteArray());
           }
           catch (IOException e)
           {
               // TODO Auto-generated catch block
               e.printStackTrace();
           }
           return jsonStr;
       }
   

}
