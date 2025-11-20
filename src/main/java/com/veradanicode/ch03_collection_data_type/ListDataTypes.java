package com.veradanicode.ch03_collection_data_type;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import  java.util.Vector;

public class ListDataTypes {
    public static void main(String[] args) {

        //Creating an array list
        ArrayList<String> fruits =new ArrayList<>();

        //Inserting items into the arraylist
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        //Display one item in the arraylist
        String item1=fruits.get(1);
        System.out.println("Item at index one is -> "+item1);

        //Creating a linked list
        LinkedList<String> position =new LinkedList<>();

        //add into linked list
        position.add("First");
        position.add("Second");
        position.add("Third");

        System.out.println(position);

        //creating a vector
        Vector <String> vectorFruits =new Vector<>();
        vectorFruits.add("pawpaw");
        vectorFruits.add("mango");
        vectorFruits.add("grape");

        //display all the items of the vector
        System.out.println(vectorFruits);

        //CREATING A STACK
        Stack <Integer> numberStack =new Stack<>();

        //add to a stack
        numberStack.push(100);
        numberStack.push(300);
        numberStack.push(500);

        //DISPLAY STACK
        System.out.println(numberStack);





    }
}
