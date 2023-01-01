package com.study.entity;
import java.sql.Timestamp;

public class UserTable {
    private int id;
    private String uname;
    private String uemail;
    private String upass;
    private String ugender;
    private String about;
    private Timestamp reg_date;
    private String profilePicture;
    //Constructor

    

    public UserTable() {
    }

    public UserTable(String uname, String uemail, String upass, String ugender, String about, String profilePicture) {
        this.uname = uname;
        this.uemail = uemail;
        this.upass = upass;
        this.ugender = ugender;
        this.about = about;
        this.profilePicture = profilePicture;
    }

    public UserTable(int id, String uname, String uemail, String upass, String ugender, String about, String profilePicture) {
        this.id = id;
        this.uname = uname;
        this.uemail = uemail;
        this.upass = upass;
        this.ugender = ugender;
        this.about = about;
        this.profilePicture = profilePicture;
    }
     //Generate Getters And setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

  

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender;
    }

    public Timestamp getReg_date() {
        return reg_date;
    }

    public void setReg_date(Timestamp reg_date) {
        this.reg_date = reg_date;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
    
    
}
