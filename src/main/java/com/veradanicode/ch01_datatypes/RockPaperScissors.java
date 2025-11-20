package com.veradanicode.ch01_datatypes;
import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors {
    public static void main(String[] args) {
        String[] Options ={"ROCK","PAPER","SCISSORS"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick your number:ROCK(0)  PAPER(1) SCISSORS(2)");
        int You =scanner.nextInt();

        Random random = new Random();
        int computerChoice=random.nextInt(3);




    }
}
