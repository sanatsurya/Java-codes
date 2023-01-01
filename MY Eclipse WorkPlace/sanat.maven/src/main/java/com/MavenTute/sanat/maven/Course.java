package com.MavenTute.sanat.maven;

public class Course {
	private String Course;
	private int duration;
	private int feeStructure;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String course, int duration, int feeStructure) {
		super();
		Course = course;
		this.duration = duration;
		this.feeStructure = feeStructure;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFeeStructure() {
		return feeStructure;
	}
	public void setFeeStructure(int feeStructure) {
		this.feeStructure = feeStructure;
	}
	
}
