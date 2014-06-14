package com.yswsoft.research.portal.web.controller;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

import java.lang.reflect.Array;
import java.lang.reflect.Type;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.codehaus.jackson.type.JavaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.codehaus.jackson.map.ObjectMapper;

public class Rea1 {
	public final static ObjectMapper mapper = new ObjectMapper(); 
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
              // System. out.println(str);
               //toPackger(getJson(str));
               //testJson2EntityList(getJson(str));
              //List<Packager> lp= getPersons(str, Packager.class);
               //testToList(str);
               //JSONObject object = JSON.parseObject(str);  
              // System.out.println(object.get("geo"));
               // Do not need the rest 
              //Map<String,String> map= parseData(str);
              //System.out.println(map.size());
               JavaType javaType = getCollectionType(ArrayList.class, Packager.class); 
               //List<Packager> lst =mapper.readValue(getJson(str), javaType); 
               ArrayList<Packager> lst=mapper.readValue(getJson(str), javaType); 
               System.out.println("---->"+lst.size());
               httpgets.abort();   
           } 
       } 
    
    
    public static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {   
    	        return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);   
    	   }  
    
    public static <T> List<T> getPersons(String jsonString, Class<T> cls) {
        List<T> list = new ArrayList<T>();
        try {
            Gson gson = new Gson();
            list = gson.fromJson(jsonString, new TypeToken<List<Packager>>() {
            }.getType());
        } catch (Exception e) {
        }
        return list;
    }
    
   // @Test //将jsonList转化为List<T>
    public static void testToList(String jsonList){
        //String jsonList = "[{\"id\":1,\"username\":\"luojihui\",\"password\":\"luojiahui\"}]";
        Type type = new TypeToken<List<Packager>>(){}.getType();
        Gson gson = new Gson();
        List<Packager> list = (List<Packager>)gson.fromJson(jsonList,type);
        System.out.println("==="+list.size());
    }
    
    /**
     * 
     * 函数名称: parseData
     * 函数描述: 将json字符串转换为map
     * @param data
     * @return
     */
    private static Map<String, String> parseData(String data){
        GsonBuilder gb = new GsonBuilder();
        Gson g = gb.create();
        Map<String, String> map = g.fromJson(data, new TypeToken<Map<String, String>>() {}.getType()); 
        return map;
    }
    
    public static String getJson(String str){
    	int a=str.indexOf(":");
    	int b=str.lastIndexOf("]");
    	System.out.println(a+"--"+b);
    	str=str.substring(a+1, b+1);
    	System.out.println("-->"+str);
		return str;
    }
    public static List<Packager> toPackger(String str){
    	
    	JSONArray array=JSONArray.fromObject(str);
    	 for(int i=0;i<array.size();i++){
    	     Map o=(Map)array.get(i);
    	     //System.out.println(o.get("id")+" "+o.get("mid"));
    	     String geo=o.get("geo").toString();
    	     if(geo !=null && !geo.equals("null")){
    	    	 System.out.println(o.get("geo"));
    	     }
    	 }
		return null;
    	
    }
         
    public static void testJson2EntityList(String json){  
        List<Packager> result = null;       
        //String json = this.testEntityList2Json();  
        JSONArray jsonobj = JSONArray.fromObject(json);  
        result = (List<Packager>) JSONArray.toList(jsonobj,Packager.class);   
        for(Packager tn:result){  
            System.out.println(tn.getUsr());  
        }  
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
