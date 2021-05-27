package com.java.collection;
import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;

import java.util.*;

class Employee{
    int e_id;
    String e_name,e_address;
    int ph_no;
    public Employee(int e_id, String e_name, String e_address, int ph_no) {
        this.e_id = e_id;
        this.e_name = e_name;
        this.e_address = e_address;
        this.ph_no = ph_no;
    }
}
public class ArrayDequeEx4 {
    public static void main(String[] args) {
        Deque<Employee> set=new ArrayDeque<Employee>();

        Employee e1=new Employee(450,"Deepti Dash", "ITPS",98734567);
        Employee e2=new Employee(653,"Tripti Dash", "Banharpali", 45678);
        Employee e3=new Employee(367,"Divyesh Dash", "Bandbahal", 456789);

        set.add(e1);
        set.add(e2);
        set.add(e3);

        for(Employee e:set)
        {
            System.out.println(e.e_id+" "+e.e_name+" "+e.e_address+" "+e.ph_no);
        }
    }
}


