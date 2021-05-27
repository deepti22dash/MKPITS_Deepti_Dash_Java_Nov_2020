//Example of Generic class
package com.java.collection;
import java.util.*;
public class MpaEx2GenericClass
{
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(876,"Ananya");
        map.put(751,"Ritesh");
        map.put(654,"Shudhansu");

        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}


