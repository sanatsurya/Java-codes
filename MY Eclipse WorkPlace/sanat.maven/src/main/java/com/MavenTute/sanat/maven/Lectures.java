package com.MavenTute.sanat.maven;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lectures {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String qualification; 
	private String address;
	private String phoneNum;
	private String about;
	public Lectures(int id, String name, String qualification, String address, String phoneNum, String about) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.address = address;
		this.phoneNum = phoneNum;
		this.about = about;
	}
	public Lectures() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	@Override
	public String toString() {
		return "Lectures [id=" + id + ", name=" + name + ", qualification=" + qualification + ", address=" + address
				+ ", phoneNum=" + phoneNum + ", about=" + about + "]";
	}
	
}
