package com.veradanicode.lmu;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
     Scanner scanner= new Scanner(System.in);
        System.out.println("ROCK,PAPER,SCISORS?? SHOOT!!");
     String playerInput=scanner.nextLine();
     String computerInput="";

     switch ((int)(3*Math.random())){
         case 0:
             computerInput="Rock";
             break;
         case 1:
             computerInput="Paper";
             break;
         case 2:
             computerInput="Scissors";
             break;
         default:
             System.out.println("Invalid Input!");
     }

     if (playerInput.equalsIgnoreCase("Rock")){
         if (computerInput.equalsIgnoreCase("Rock")){
             System.out.println("YOU: "+playerInput+"\nComputer: "+computerInput+"\n It's a tie");
         } else if (computerInput.equalsIgnoreCase("Paper")) {
             System.out.println("YOU: "+playerInput+"\nComputer: "+computerInput+"\n  Computer wins");
         }else {
             System.out.println("YOU: "+playerInput+"\nComputer: "+computerInput+"\n you win");
         }
     }

        if (playerInput.equalsIgnoreCase("Paper")){
            if (computerInput.equalsIgnoreCase("Rock")){
                System.out.println("YOU: "+playerInput+"\nComputer: "+computerInput+"\n  You win");
            } else if (computerInput.equalsIgnoreCase("Paper")) {
                System.out.println("YOU: "+playerInput+"\nComputer: "+computerInput+"\n  It's a Tie");
            }else {
                System.out.println("YOU: "+playerInput+"\nComputer: "+computerInput+"\n  Computer wins");
            }
        }

        if (playerInput.equalsIgnoreCase("Scissors")){
            if (computerInput.equalsIgnoreCase("Rock")){
                System.out.println("YOU: "+playerInput+"\nComputer: "+computerInput+"\n Computer wins");
            } else if (computerInput.equalsIgnoreCase("Paper")) {
                System.out.println("YOU: "+playerInput+"\nComputer: "+computerInput+"\n  You win");
            }else {
                System.out.println("YOU: "+playerInput+"\nComputer: "+computerInput+"\n  It'a a tie");
            }
        }

    }
}
