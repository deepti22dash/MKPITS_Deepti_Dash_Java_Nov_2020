package com.mkpits.java;
import java.sql.*;
public class JdbcEx1{
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","root");
            System.out.println("connected successfully ");
            stmt =con.createStatement();
            String str="create table employees(empid int primary key, empname varchar(50),empaddress varchar(50))";
            stmt.executeUpdate(str);
            System.out.println("table successfully created");
            con.close();
        }catch (Exception ee) {

            System.out.println(ee.toString());
        }
    }
}

