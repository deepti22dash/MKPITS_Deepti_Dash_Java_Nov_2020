// program to show update records into company table
package com.mkpits.java;
import java.sql.*;
import java.util.*;
public class JdbcEx5 {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Comapny ID");
        int comid = sc.nextInt();
        System.out.println("Enter  company name");
        String comname = sc.next();
        System.out.println("Enter  company address");
        String comaddress = sc.next();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
            System.out.println("connected successfully ");
            stmt = con.createStatement();
            // String str="create table Company(comid int primary key, comname varchar(50), comaddress varchar(50))";
            // stmt.executeUpdate(str);
            //String str1="insert into Company (comid,comname,comaddress) values("+comid+",'"+comname+"','"+comaddress+"')";
            //  stmt.executeUpdate(str1);
            System.out.println("record inserted successfully");
            con.close();

        } catch (Exception ee) {

            System.out.println(ee.toString());
        }
    }
}
