import java.sql.*;
public class CreateTableUsingSql {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/tdic?useSSL=false";
            String username="";
            String password="";
            Connection con = DriverManager.getConnection(url,username,password);
            String q = "create table class_details(int cid int auto increment primary key , cname varchar(50), cfloor varchar(20), student_strength int)";
            Statement smt = con.createStatement();
            smt.executeUpdate(q);
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
