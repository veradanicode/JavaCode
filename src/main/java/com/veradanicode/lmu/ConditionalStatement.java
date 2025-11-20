package com.veradanicode.lmu;
import java.util.Scanner;
public class ConditionalStatement {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String score=scanner.nextLine();
        int num=scanner.nextInt();
//        if (num <100){
//            System.out.println("A");
//        } else if (num>60) {
//            System.out.println("B");
//
//        }else {
//            System.out.println("failed");
//        }

        switch (score){
            case "A":
                System.out.println("you are inbetween 75-100");
                break;

            case "B":
                System.out.println("you are inbetween 65-74");
                break;

            default:
                System.out.println("This is not a valid grade");
        }


    }
}
