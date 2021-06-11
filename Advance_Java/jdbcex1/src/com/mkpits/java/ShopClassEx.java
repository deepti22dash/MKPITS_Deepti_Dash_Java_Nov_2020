package com.mkpits.java;
import java.sql.*;

public class ShopClassEx {
    int shop_no;
    String city;
    String owner;
    String address;
    Connection con = null;
    Statement stmt = null;

    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopDBExample:", "root", "root");
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }

    public String addShop(int shop_no, String city, String owner, String address)
    {
        this.shop_no = shop_no;
        this.city = city;
        this.owner = owner;
        this.address = address;

        try {
            connect();
            String str = " insert into shop values (" + shop_no + ",'" + city + "','" + owner + "','" + address + "')";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
        }
        catch (Exception e)
        {
            return e.toString();
        }
        return "Shop added successfully";
    }
    public String updateShop(int shop_no, String city, String owner, String address)
    {
        this.shop_no = shop_no;
        this.city = city;
        this.owner = owner;
        this.address = address;

        try {
            connect();
            String str = " insert into shop values (" + shop_no + ",'" + city + "','" + owner + "','" + address + "')";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
        }
        catch (Exception e)
        {
            return e.toString();
        }
        return "Shop updated successfully";
    }
    public String removeShop(int shop_no, String city, String owner, String address)
    {
        this.shop_no = shop_no;
        this.city = city;
        this.owner = owner;
        this.address = address;

        try {
            connect();
            String str = "delete from shop where shop_no="+shop_no+"";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
        }
        catch (Exception e)
        {
            return e.toString();
        }
        return "Shop deleted successfully";
    }

    public  String searchShop(int shop_no)
    {
        this.shop_no=shop_no;
        int flag=0;
        String res=null;

        try {
            connect();
            String str = "select * from shop where shop_no="+shop_no+"";
            stmt = con.createStatement();
            ResultSet rs=   stmt.executeQuery(str);
            while (rs.next())
            {
                flag=1;
                this.city=rs.getString("city");
                this.owner=rs.getString("owner");
                this.address=rs.getString("address");
            }
            rs.close();
            stmt.close();
            con.close();
            if(flag==0)
            {
                res="No record found";
            }
            return res;

        }
        catch ( Exception e)
        {
            return  e.toString();
        }

    }

    public static void main(String[] args)
    {
        ShopClassEx se = new ShopClassEx();

    }
}
