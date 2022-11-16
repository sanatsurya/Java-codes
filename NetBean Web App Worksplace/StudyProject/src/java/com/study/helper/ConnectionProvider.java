package com.study.helper;

import java.sql.*;

public class ConnectionProvider {
    public static Connection con;
    public static Connection getConnection(){
        try{
//            driver class load
            if(con==null){
                Class.forName("com.mysql.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/tdic?useSSL=false","root","User@1");
            }
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return con;
    }
    
}
