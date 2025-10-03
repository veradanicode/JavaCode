package com.veradanicode.ch03_collection_data_type;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Generics {
    public static void main(String[] args) {
        //  CREATED AN ARRAY LIST USING A GENERICS
         List<String> list = new ArrayList<>();

        // CREATED A SET USING A GENERIC
        Set<Integer> set = new HashSet<>();

        // add item to our list
        list.add("john");
        list.add("jeremiah");


        // REMOVE an item from the list
        list.remove("john");
        System.out.println(list);


        Collection<String> stringList = List.of("john","terry","luke");

        Collection<String> setList = setList = Set.of("s1","s2","s3");

        //System.out.println(stringList);
        //System.out.println(setList);



    }
}
