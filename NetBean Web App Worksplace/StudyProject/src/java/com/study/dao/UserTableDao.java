package com.study.dao;
import com.study.entity.*;
import com.study.helper.ConnectionProvider;
import java.sql.*;
public class UserTableDao {
    public Connection con;

    public UserTableDao(Connection con) {
        this.con = con;
    }
    public boolean saveUser(UserTable userTable){
        boolean flag= false;
        try{
            //Connect to Database
            String query ="insert into UserTable(uname,uemail,upass,uimg,ugender,about) values(?,?,?,?,?,?)";
            PreparedStatement preparedStatement = this.con.prepareStatement(query);
            preparedStatement.setString(1, userTable.getUname());
            preparedStatement.setString(2, userTable.getUemail());
            preparedStatement.setString(3, userTable.getUpass());
            preparedStatement.setString(4, userTable.getUimg());
            preparedStatement.setString(5, userTable.getUgender());
            preparedStatement.setString(6, userTable.getAbout());
            preparedStatement.executeUpdate();
            flag = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
