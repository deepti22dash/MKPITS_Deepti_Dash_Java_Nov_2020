package com.mkpits.java;
import java.sql.*;
import java.util.*;
public class JdbcEx2
{
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter empno");
        int empid=sc.nextInt();
        System.out.println("Enter empname");
        String empname=sc.next();
        System.out.println("Enter empaddress");
        String empaddress=sc.next();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","root");
            System.out.println("connected successfully ");
            stmt =con.createStatement();
            String str="insert into employees(empid,empname,empaddress) values("+empid+",'"+empname+"','"+empaddress+"')";
            stmt.executeUpdate(str);
            System.out.println("record inserted successfully");
            con.close();

        }catch (Exception ee) {

            System.out.println(ee.toString());
        }
    }
}

