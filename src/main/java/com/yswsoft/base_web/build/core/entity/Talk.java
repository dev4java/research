package com.yswsoft.base_web.build.core.entity;

import java.io.Serializable;
import java.sql.Date;

public class Talk implements Serializable{
public Long tid;
public Long uid;
public String talk;
public Date createTime;
public double lon;
public double lat;
public Long getTid() {
	return tid;
}
public void setTid(Long tid) {
	this.tid = tid;
}
public Long getUid() {
	return uid;
}
public void setUid(Long uid) {
	this.uid = uid;
}
public String getTalk() {
	return talk;
}
public void setTalk(String talk) {
	this.talk = talk;
}
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
public double getLon() {
	return lon;
}
public void setLon(double lon) {
	this.lon = lon;
}
public double getLat() {
	return lat;
}
public void setLat(double lat) {
	this.lat = lat;
}



}
