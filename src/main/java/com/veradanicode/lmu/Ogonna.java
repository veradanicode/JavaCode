package com.veradanicode.lmu;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Ogonna {
    public static void main(String[] args) {
        for(int num = 0; num < 10; ++num) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Rock, Paper, Scissors, SHOOT?!");
            String Playerinput = scanner.nextLine();
            String computerinput = "";
            switch ((int)((double)3.0F * Math.random())) {
                case 0 -> computerinput = "Rock";
                case 1 -> computerinput = "Paper";
                case 2 -> computerinput = "Scissors";
                default -> System.out.println("INVALID INPUT");
            }

            System.out.println(computerinput);
            if (Playerinput.equalsIgnoreCase("Rock")) {
                if (computerinput.equals("Scissors")) {
                    System.out.println("Player chose: " + Playerinput + " Computer chose: " + computerinput + " You WIN ");
                } else if (computerinput.equals("Paper")) {
                    System.out.println("Player Chose: " + Playerinput + " Computer chose: " + computerinput + " You LOST ");
                } else if (computerinput.equals("Rock")) {
                    System.out.println(" Player chose: " + Playerinput + " Computer chose: " + computerinput + " It's A TIE ");
                } else {
                    System.out.println("Invalid input");
                }
            } else if (Playerinput.equalsIgnoreCase("Paper")) {
                if (computerinput.equals("Scissors")) {
                    System.out.println("Player chose: " + Playerinput + " Computer chose: " + computerinput + " You LOST ");
                } else if (computerinput.equals("Paper")) {
                    System.out.println("Player Chose: " + Playerinput + " Computer chose: " + computerinput + "  It's A TIE ");
                } else if (computerinput.equals("Rock")) {
                    System.out.println(" Player chose: " + Playerinput + " Computer chose: " + computerinput + " You WON ");
                } else {
                    System.out.println("Invalid input");
                }
            } else if (Playerinput.equalsIgnoreCase("Scissors")) {
                if (computerinput.equals("Scissors")) {
                    System.out.println("Player chose: " + Playerinput + " Computer chose: " + computerinput + " It's A TIE");
                } else if (computerinput.equals("Paper")) {
                    System.out.println("Player Chose: " + Playerinput + " Computer chose: " + computerinput + "  You WON ");
                } else if (computerinput.equals("Rock")) {
                    System.out.println(" Player chose: " + Playerinput + " Computer chose: " + computerinput + " You LOST ");
                } else {
                    System.out.println("Invalid input");
                }
            } else {
                System.out.println("Invalid Input");
            }
        }

    }
}

