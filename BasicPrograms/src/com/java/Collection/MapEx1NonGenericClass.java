//Example of non - generic class
package com.java.collection;
import java.util.*;
public class MapEx1NonGenericClass
 {
    public static void main(String[] args) {
        Map map=new HashMap();

        map.put(11,"Amit");
        map.put(8,"Rahul");
        map.put(9,"Jai");
        map.put(7,"Anju");

        Set set=map.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext())
        {
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}

