package com.HibernetQuery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user_table")
public class User {
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	int User_id;
	@Column(name = "user_name")
	String name;
	@Column(name = "u_email")
	String email;
	@Column(name = "user_pass")
	String password;
	//Constructor
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int user_id, String name, String password, String email) {
		super();
		User_id = user_id;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	//Getters and Setters
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//To String 
	@Override
	public String toString() {
		return "User [User_id=" + User_id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}
	
	
	

}
