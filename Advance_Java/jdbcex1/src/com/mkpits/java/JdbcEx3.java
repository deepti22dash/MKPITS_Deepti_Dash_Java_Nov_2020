package com.mkpits.java;
import java.sql.*;
public class JdbcEx3{
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","root");
            System.out.println("connected successfully ");
            stmt =con.createStatement();
            String str="create table Student(roll_no int primary key, sname varchar(50), saddress varchar(50), ph_no int)";
            stmt.executeUpdate(str);
            System.out.println("table successfully created");
            con.close();
        }catch (Exception ee) {

            System.out.println(ee.toString());
        }
    }
}

