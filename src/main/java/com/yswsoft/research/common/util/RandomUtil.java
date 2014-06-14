package com.yswsoft.research.common.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
	  public static final String allChar      = "23456789abcdefghjkmnpqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ" ;
      public static final String letterChar   = "abcdefghjkmnpqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ" ;
      public static final String numberChar   = "0123456789";
      public static final String talkWord[]   = {"我","爱","北京","暴","动","砍死人","上访","暴民","火车站","戒严"," ",
    	  										 "炸","飞","机","时","间","行","动","今","天","警","察","打老虎","反腐","改革",
    	  										 "手","机","","好","好","吃","促销","大甩卖","来","了","平","安","全",
    	  										 "赶快","撤离","离开","突击","堵截","黑","监","狱","社","会","党","邪","教",
    	  										 "分","子","队","伍","人质","劫持","引爆","炸弹","有"
    	  										 };
      
      
      public static final String nameWord[]   = {"张三","李四","mike","张晓峰","李彤彤","刘丹丽","杨威利",
    	                                         "向双","默罕默德。艾买提","马丁路德银","张伟力","阿旺阿陪静美","小泉纯二郎","高谷丽",
    	                                         "李洋洋","郭美美","大张伟","小洋人","农夫故事","康师傅","小红帽","红领巾"};
      
      /**
       * 随机获得经纬度
       * @return
       */
      public static String getLonLat(){
	      StringBuilder sb = new StringBuilder();
	      sb.append("\"coordinates\":[");
	      sb.append(getLongitude());
	      sb.append(",");
	      sb.append(getLatitude());
	      sb.append("]");
	     // System.out.println(sb.toString());
	      return sb.toString();       
      }
      
      public static String getString(double d){
    	  return Double.toString(d);
      }

      /**
       * 随机获得经度
       * @return
       */
      public static double getLongitude(){
    	  Random rand = new Random();
    	  double lon=rand.nextInt(7333)+6172;
    	  //System.out.println(lon/100);
    	  return lon/100;
      }
      

      /**
       * 随机获得纬度
       * @return
       */
      public static double getLatitude(){
    	  Random rand = new Random();
    	  double lat=rand.nextInt(351)+4982;
    	  //System.out.println(lat/100);
    	  return lat/100;
      }
      
      /**
       * 随机获得说说
       * @return
       */
      public static String getTalk(){
    	  StringBuilder talk=new StringBuilder();
    	  Random r = new Random();
    	  int size=talkWord.length;
    		 
    	  int ts=talk.length();
    	  for(int i=20;ts<i;ts++){
    		  talk.append(talkWord[r.nextInt(size)]);
    	  }
    	  //TODO 去重
    	  return talk.toString();
      }
     /* public static String getTalk(){
    	  StringBuilder talk=new StringBuilder();
    	  Random r = new Random();
    	  String strArray[] = new String[20];
    	  int index=0;
    	  for (int i=0;i<20;i++) {
    		  index=r.nextInt(talkWord.length-i);
    		  strArray[i]=talkWord[index];
    		  for (int j = index; j < talkWord.length-i-1; j++) {
    			  talkWord[j]=talkWord[j+1];
			}
		}
    	  Set<String> set = new HashSet<String>();
    	  for (String string : strArray) {
			//System.out.println(string+" ");
			set.add(string);
		}
    	  Iterator<String> iter = set.iterator();  
          while (iter.hasNext()){
              //System.out.println(iter.next());  
              talk.append(iter.next());
          }
      
    	  //System.out.println(set+","+set.size());
    	  //System.out.println(talk);
    	  return talk.toString();
      }
      */
      /**
       * 随机获得姓名
       * @return
       */
      public static String getName(){
    	  int index = (int) (Math.random()*nameWord.length);
    	  String name =nameWord[index];
    	  //System.out.println(name);
    	  return name;
      }
      
      /**
       * 随机获得性别
       * @return
       */
      public static int get0Or1(){
    	  int a=new Random().nextInt()%2;
    	  return Math.abs(a);
      }
      public static String generateRandomCode(int length, int type){ //参数为返回随机数的长度
             //TODO 此处应转为配置文件
             if(length<=0){
                    length=6;
            }
             if(type<=0 ||type>3){
                   type=1;
            }
             StringBuilder sb = new StringBuilder();
             Random random = new Random();
             if(type==1){
                    for (int i = 0; i < length; i++){
                          sb.append(allChar.charAt(random.nextInt(allChar.length())));
                    }
             } else if (type==2){
                    for (int i = 0; i < length; i++){
                          sb.append(letterChar .charAt(random.nextInt(letterChar.length())));
                    }
             } else if (type==3){
                    for (int i = 0; i < length; i++){
                          sb.append(numberChar .charAt(random.nextInt(numberChar.length())));
                    }
             }
             //System. out.println(sb.toString());
             return sb.toString();
            }
      
      public static void main(String[] args){
    	  getTalk();
    	  //getName();
    	  //getLongitude();
    	  //getLatitude();
    	  //getLonLat();
      }

}
