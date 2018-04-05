package assignmentFour;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angeg9136
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scan
        Scanner input = new Scanner(System.in);
        // make the integers
        int playerB = 1;
        int playerA = 1;
        
        // make the game
        while (true){
            // ask for sum of dice
            System.out.print( "Enter your number of dice: ");
            // store the sum
            playerA = input.nextInt();
            if (playerA > 12 || playerA < 2){
                System.out.println("You quit!");
                break;
                }  
            
            //make it so they can't go above 12 or less than 2, their are 2 dice
            if (playerA <= 12 && playerA >= 2){
                //start game
                //add # of dice to location of player
                if (playerB < 88){
                playerB = (playerB + playerA);
                // display location of player
                System.out.println("you are now on square: " + playerB);
                // add snakes and ladders
                if (playerB == 6){
                playerB = (playerB + 25);
                System.out.println("you hit a ladder! you are now on square: " + playerB);
                }
                if (playerB == 50){
                playerB = (playerB + 24);
                System.out.println("you hit a ladder! you are now on square: " + playerB);
                }
                if (playerB == 69){
                playerB = (playerB + 19);
                System.out.println("you hit a ladder! you are now on square: " + playerB);
                }
                if (playerB == 83){
                playerB = (playerB - 35);
                System.out.println("you hit a snake! you are now on square: " + playerB);
                }
                if (playerB == 96){
                playerB = (playerB - 42);
                System.out.println("you hit a snake! you are now on square: " + playerB);
                }
                if (playerB == 99){
                playerB = (playerB - 22);
                System.out.println("you hit a snake! you are now on square: " + playerB);
                } 
                
                
                // if on square 100 say they won
                if (playerB == 100){
                System.out.println("you won!");
                break;
                
    }
                }
            }
        }
    }
}
        
                
