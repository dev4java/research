package com.yswsoft.research.admin.build.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sc_research_talk")
public class Talk implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public Long tid;
public Long uid;
public String talk;
public Date createTime;
public String lon;
public String lat;
private int sign;//0已标记 1未标记

@Id
@Column(name="tid")
@GeneratedValue(strategy=GenerationType.AUTO)
public Long getTid() {
	return tid;
}
public void setTid(Long tid) {
	this.tid = tid;
}


@Column(name="sign")
public int getSign() {
	return sign;
}
public void setSign(int sign) {
	this.sign = sign;
}
@Column(name="uid")
public Long getUid() {
	return uid;
}
public void setUid(Long uid) {
	this.uid = uid;
}
@Column(name="talk")
public String getTalk() {
	return talk;
}
public void setTalk(String talk) {
	this.talk = talk;
}
@Column(name="create_time")
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}

@Column(name="lon")
public String getLon() {
	return lon;
}
public void setLon(String lon) {
	this.lon = lon;
}

@Column(name="lat")
public String getLat() {
	return lat;
}
public void setLat(String lat) {
	this.lat = lat;
}







}
