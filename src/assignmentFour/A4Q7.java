/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentFour;

import java.util.Scanner;

/**
 *
 * @author angeg9136
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scan
        Scanner input = new Scanner(System.in);
        //make a player
        int player1 = 1;
                
        //make game
        while (true){
            //ask them to input sum of dice
            System.out.println("Enter sum of dice");
            //store sum using string
            String roll = input.nextLine();
            //parse string to make it a number
            int dice = Integer.parseInt(roll);
            //show them their number
            player1 = dice + player1;
            System.out.println("You are now on square " + player1);
            //make them unable to put a sum of the dice above 12 or below 2
            if (dice >12 || dice <2){
                //tell them the dice doesn't go below 2 or above 12
                System.out.println("You quit!");
                //break when done
                break;
                
            }
            //make all 3 ladders
            if (player1 == 9){
                player1 = (player1 + 25);
                System.out.println("You hit a ladder! You are now on square 34");}
          
            if (player1 == 67){
                player1 = (player1 + 19);
                System.out.println("You hit a ladder! You are now on square 86");}
            
            if (player1 == 40){
                player1 = (player1 + 24);
                System.out.println("You hit a ladder! You are now on square 64");}
            
            
            //make all 3 snakes
            if (player1 == 90){
                player1 = (player1 - 42);
                System.out.println("You hit a snake! You are now on square 48");}
            
            if (player1 == 54){
                player1 = (player1 - 35);
                System.out.println("You hit a snake! You are now on square 19");}  
            
            if (player1 == 99){
                player1 = (player1 - 22);
                System.out.println("You hit a snake! You are now on square 77");}
            
            //make it so if you go over 100 you lose
            if (player1 >100){
                player1 = (player1 - 100);
                System.out.println("You quit!");
            }
            
              //if they are on square 100 tell them they won
            while (player1 == 100){
                //spam out they won to make them feel good about themselves
                System.out.println("Congratulations! you won!");
                
                
                
        }
            
            
           
            }   
            }
        }
        
        
        
        
        
        
        
    

