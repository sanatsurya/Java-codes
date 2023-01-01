package com.MavenTute.sanat.maven;

import java.beans.Transient;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;
@Entity @Table(name="Student_Details")
public class Student {
	@Id @GeneratedValue(strategy  = GenerationType.IDENTITY)
	@Column(name = "Student_Id")
	private int Id;
	@Column(name = "Student_Name")
	private String name;
	@Column(length = 100, name = "Father")
	private String fatherName;
	@Column(length = 50, name = "Studentemail")
	private String email;
	private String mobile;
	private String address;
	@Lob
	private byte[] image;
	@Temporal(TemporalType.DATE)
	private Date date_of_joinDate;
	@javax.persistence.Transient
	private boolean de;
	@Embedded
	private Course course;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String fatherName, String email, String mobile, String address, byte[] image,
			Date date_of_joinDate) {
		super();
		this.name = name;
		this.fatherName = fatherName;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.image = image;
		this.date_of_joinDate = date_of_joinDate;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Date getDate_of_joinDate() {
		return date_of_joinDate;
	}
	public void setDate_of_joinDate(Date date_of_joinDate) {
		this.date_of_joinDate = date_of_joinDate;
	}
	public boolean isDe() {
		return de;
	}
	public void setDe(boolean de) {
		this.de = de;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", fatherName=" + fatherName + ", email=" + email + ", mobile="
				+ mobile + ", address=" + address + ", image=" + Arrays.toString(image) + ", date_of_joinDate="
				+ date_of_joinDate + ", de=" + de + ", course=" + course + "]";
	}
	
	

}
