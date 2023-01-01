package com.study.dao;
import com.study.entity.*;
import com.study.helper.ConnectionProvider;
import java.sql.*;
public class UserTableDao {
    public Connection con;

    public UserTableDao(Connection con) {
        this.con = con;
    }
    //Save Data to User Table
    public boolean saveUser(UserTable userTable){
        boolean flag= false;
        try{
            //Connect to Database
            String query ="insert into UserTable(uname,uemail,upass,uimg,ugender,about) values(?,?,?,?,?,?)";
            PreparedStatement preparedStatement = this.con.prepareStatement(query);
            preparedStatement.setString(1, userTable.getUname());
            preparedStatement.setString(2, userTable.getUemail());
            preparedStatement.setString(3, userTable.getUpass());
            preparedStatement.setString(4, userTable.getProfilePicture());
            preparedStatement.setString(5, userTable.getUgender());
            preparedStatement.setString(6, userTable.getAbout());
            preparedStatement.executeUpdate();
            flag = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    //Update Data to uset table
    public boolean updateUser(UserTable userTable){
        boolean flag= false;
        try{
            //Connect to Database
            String query ="update UserTable set uname = ?,uemail = ?,about = ? where id=?";
            PreparedStatement preparedStatement = this.con.prepareStatement(query);
            preparedStatement.setString(1, userTable.getUname());
            preparedStatement.setString(2, userTable.getUemail());
            preparedStatement.setString(3, userTable.getAbout());
            preparedStatement.setInt(4, userTable.getId());
            preparedStatement.executeUpdate();
            flag = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    //Fetch Data From User Table
        public UserTable getUserByLogin(String email,String password){
            UserTable user = null;
            try{
                String query ="select * from UserTable where uemail=? and upass=?";
                PreparedStatement psmt = con.prepareCall(query);//con.prepareCall(query);
                psmt.setString(1, email);
                psmt.setString(2, password);
                ResultSet set=psmt.executeQuery();
                if(set.next()){
                    user = new UserTable();
                    String name = set.getString("uname");
                    user.setId(set.getInt("id"));
                    user.setUname(name);
                    user.setUemail(set.getString("uemail"));
                    user.setUgender(set.getString("ugender"));
                    user.setReg_date(set.getTimestamp("reg_date"));
                    user.setProfilePicture(set.getString("uimg"));
                    user.setAbout(set.getString("about"));
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            return user;
        }
}
