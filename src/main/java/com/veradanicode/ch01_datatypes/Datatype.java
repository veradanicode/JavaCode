package com.veradanicode.ch01_datatypes;

public class Datatype {
    public static void main(String[] args) {
        int one =21;
        int two =15;

//        if (one<18){
//            System.out.println("You can party!!!");
//        }else {
//            System.out.println("Abeg get back ooo");
//
//        }

        //using tenary operator
        String s = one > 18? "You can party!!!":"You cannot party!!!";
        System.out.println(s);
    }
}
