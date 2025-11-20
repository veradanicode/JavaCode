package com.veradanicode.ch03_collection_data_type;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDataTypeS {
    public static void main(String[] args) {

        //create
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(56);
        numberSet.add(34);
        numberSet.add(33);
        numberSet.add(56);

        //display all aitem in the set
        System.out.println(numberSet);

        //create hashed set
        HashSet<Integer> hashedSet = new HashSet<>();
        hashedSet.add(56);
        hashedSet.add(34);
        hashedSet.add(33);
        hashedSet.add(56);

        //display all value in hashed set
        System.out.println(hashedSet);

        //Creating a treeset
        TreeSet <Integer>numbers =new TreeSet<>();
        numbers.add(19);
        numbers.add(20);
        numbers.add(19);

        //displaying all the items from treeset
        System.out.println(numbers);

        //creating a linked hashset
        LinkedHashSet <String> lhs =new LinkedHashSet<>();
        lhs.add("Apple");
        lhs.add("orange");
        lhs.add("Apple");
        lhs.add("null");

        //display all items in linkedhashset
        System.out.println(lhs);




    }
}
