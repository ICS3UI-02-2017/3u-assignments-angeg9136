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
        
        // ask for the speed limit
        System.out.println("Enter the speed limit:");
        int speedL = input.nextInt();
        System.out.println("Enter the recorded speed of the car:");
        int speedC = input.nextInt();
        
        //make the speed
        int speedT = (speedC - speedL);
        
        //make the speed limit
        if (speedT < 0){
            System.out.println("Congratulations, you are within the speed limit! ");
        }
        //make the fines
        if (speedT > 0){
            if (speedT >= 20 && speedT < 30){
               System.out.println("You're speeding and your fine is $100");
            }
            if (speedT < 30 && speedT > 20){
               System.out.println("You're speeding and your fine is $270");
            }
            if (speedT > 30){
               System.out.println("You're speeding. Your fine is $500");
            }
        }
    }
}