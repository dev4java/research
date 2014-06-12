package com.yswsoft.base_web.build.core.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sc_research_talk")
public class Talk implements Serializable{
public Long tid;
public Long uid;
public String talk;
public Date createTime;
public double lon;
public double lat;

@Id
@Column(name="tid")
@GeneratedValue(strategy=GenerationType.AUTO)
public Long getTid() {
	return tid;
}
public void setTid(Long tid) {
	this.tid = tid;
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
public double getLon() {
	return lon;
}
public void setLon(double lon) {
	this.lon = lon;
}
@Column(name="lat")
public double getLat() {
	return lat;
}
public void setLat(double lat) {
	this.lat = lat;
}



}
