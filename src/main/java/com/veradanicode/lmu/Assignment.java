package com.veradanicode.lmu;
import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a value:");
        int attendance=scanner.nextInt();

        switch(attendance >=75 && attendance<=100 ? 0 : 1){
            case 0:
                System.out.println("eligible");
                break;
            case 1:
                System.out.println("not eligible");
        }
    }
}
