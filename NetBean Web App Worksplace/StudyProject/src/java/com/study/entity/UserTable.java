package com.study.entity;
import java.sql.Timestamp;

public class UserTable {
    private int id;
    private String uname;
    private String uemail;
    private String upass;
    private String uimg;
    private String ugender;
    private Timestamp reg_date;
    private String about;
    //Constructor

    public UserTable(int id, String uname, String uemail, String upass, String uimg, String ugender, Timestamp reg_date, String about) {
        this.id = id;
        this.uname = uname;
        this.uemail = uemail;
        this.upass = upass;
        this.uimg = uimg;
        this.ugender = ugender;
        this.reg_date = reg_date;
        this.about = about;
    }

    public UserTable() {
    }

    public UserTable(String uname, String uemail, String upass, String ugender, Timestamp reg_date, String about) {
        this.uname = uname;
        this.uemail = uemail;
        this.upass = upass;
        this.ugender = ugender;
        this.reg_date = reg_date;
        this.about = about;
    }

    public UserTable(String uname, String uemail, String upass, String uimg, String ugender, Timestamp reg_date, String about) {
        this.uname = uname;
        this.uemail = uemail;
        this.upass = upass;
        this.uimg = uimg;
        this.ugender = ugender;
        this.reg_date = reg_date;
        this.about = about;
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

    public String getUimg() {
        return uimg;
    }

    public void setUimg(String uimg) {
        this.uimg = uimg;
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
    
    
}
