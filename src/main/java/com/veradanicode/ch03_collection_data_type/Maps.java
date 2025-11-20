package com.veradanicode.ch03_collection_data_type;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        //All map must have unique key
        Map<Integer, String> sholasMap =
                Map.of(1,"s1",2,"s2",3,"s3");

        //System.out.println(sholasMap);


//        for(Integer i: sholasMap.keySet()){
//            System.out.println(i + "," + sholasMap.get(i) +",");
//


        //CREATING A TREE MAP
        //TreeMap :Keys are stored in ascending other
        TreeMap <Integer,String> custom =new TreeMap<>();
        custom.put(1,"one");
        custom.put(3,"three");
        custom.put(2,"two");

        System.out.println(custom);

        //create Hashtabe
        //DOES NOT ALLOW NULL KEYS OR VALUES
        Hashtable<Integer,String> table =new Hashtable<>();
        table.put(1,"one");
        table.put(3,"three");
        table.put(2,"two");

        System.out.println(table);

        //CREATE LINKEDHASHMAP
        //ALLOW ONLY ONE NULL KEY AND ONE NULL VALUE,MAINTAINS INSERTION ORDER THE ORDER YOU PUT IT IS THE ORDER IT WILL DISPLAY
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(3,"john");
        lhm.put(2,"apple");
        lhm.put(null,null);


        System.out.println(lhm);




    }
}
