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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the scanner
        Scanner input = new Scanner(System.in);
        
        //ask then what the speed limit is
        System.out.println("Enter the speed limit");
        //enter speed limit and speed1 is the variable to store it
        int speed1 = input.nextInt();
        //ask how fast they are going
        System.out.println("What is the speed of the car?");
        //make an int to store how fast the car is going
        int speedA = input.nextInt();
                
        //check if they are speeding
        if(speed1 > 20){
            //tell them they're speeding
            System.out.println("You're speeding and your fine is $100");}
        
        //if they aren't speeding tell them they are in the speed limit
        else if (speed1 < 20);
        System.out.println("Good job you are within the speed limit");
        
        //check if they are speeding by more than 20km/h
        int speed2 = input.nextInt();
        //make it so if its more than 20km/h they are fined
        if(speed2 > 21){
            //read them the fine
            System.out.println("You're speeding by more than 20km/h and your fine is $270");}
        
        //check if they're speading by more than 30km/h
        int speed3 = input.nextInt();
        //make more than 30km/h have a $500 fine
        if (speed3 > 31){
            //read the fine
            System.out.println("You're speeding by more than 30km/h and your fine is $500");}
       
        
        
            
            
        
        
       
       
        }   }  
        
    
    
            
        
            
            