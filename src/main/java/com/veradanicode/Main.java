package com.veradanicode;

import com.veradanicode.ch02_OOP.C2;
import com.veradanicode.ch02_OOP.Car;
import com.veradanicode.ch02_OOP.Lion;
import com.veradanicode.ch02_OOP.SomeClass;

public class Main {
    public static void main(String[] args) {

//        System.out.print("Hello and welcome!");
        //creating a lion object

//        Lion mufasa=new Lion("10whiskers",12,true);
//
//        mufasa.devour();
//
//        Car ferrari =new Car("blue","fire",true);
//        ferrari.accelerate();

        //creating object to run the interface
        SomeClass newClass=new SomeClass();
        System.out.println(newClass.method2(2));

        //creating object to override
        C2 newC =new C2();
        newC.method();

    }
}