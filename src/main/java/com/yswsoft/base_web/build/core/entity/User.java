package com.yswsoft.base_web.build.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sc_research_user")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long uid;
	private String name;
	private int sex;
	private String addr;
	private int sign;//0已标记 1未标记
	
	@Column(name="sign")
	public int getSign() {
		return sign;
	}
	public void setSign(int sign) {
		this.sign = sign;
	}
	
	@Id
	@Column(name="uid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="sex")
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	@Column(name="addr")
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	

}
