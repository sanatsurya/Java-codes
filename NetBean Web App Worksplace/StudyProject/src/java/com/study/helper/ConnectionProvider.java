package com.study.helper;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionProvider {
    public static Connection con;
    public static Connection getConnection(){
        try{
//            driver class load
            if(con==null){
                Class.forName("com.mysql.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/edudream?useSSL=false","root","User@1");
            }
            
        }catch( SQLException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
}
