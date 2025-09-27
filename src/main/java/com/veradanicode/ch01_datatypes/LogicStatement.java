package com.veradanicode.ch01_datatypes;

public class LogicStatement {
    public static void main(String[] args) {
        //Unary opertors
        int i=1;
        int j=1;

        String m="1";
        //comparison operators

        //double equals operator
        System.out.println("double equals "+(i==j));

        //assignment operators
        System.out.println("m +=: "+(i+=1));
        System.out.println(i>=j);

        //calling the method
        checkDayOfTheWeek(3);

    }
   static void checkDayOfTheWeek(int x){
        //SWITCH STATEMENT
        switch (x){
            case 1-> System.out.println("Monday we go to School!");
            case 2-> System.out.println("Tuesday we go to School!");
            case 3-> System.out.println("Wednesday we go to School!");
            case 4-> System.out.println("Thursday we go to School!");
            case 5-> System.out.println("Friday we go to School!");
            case 6-> System.out.println("Saturday we rest!");
            case 7-> System.out.println("Sunday we go to Church!");
            default -> System.out.println("Invalid Response!Not a day of the week");
        }
    }
}
