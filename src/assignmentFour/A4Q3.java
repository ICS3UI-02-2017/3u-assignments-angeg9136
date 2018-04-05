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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //do the scan
        Scanner input = new Scanner(System.in);
        //ask them to type their numbers out
        System.out.println("Type out your 4 numbers.");
        //get it to numbers can be decimals
         double inches = input.nextDouble();
         double inches1 = input.nextDouble();
         double inches3 = input.nextDouble();
         double inches4 = input.nextDouble();
         
         System.out.println("Your numbers were " + inches + ", " + inches1 + ", " + inches3 + ", " + inches4);
         
    }
}
