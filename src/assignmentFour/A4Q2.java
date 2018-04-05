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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scan
        Scanner input = new Scanner(System.in);
        //say hello
        System.out.println("Hello, how many inches would you like to convert?");
        //make the inches a thing
        double inches = input.nextDouble();
        //make it so there are 2.54 centimetres in an inch
        double number = 2.54*inches;
        //show them how many centimetres they have
        System.out.println(inches + " inches is the same as " + number +" centimetres.");
        
        
        
        
        
    }
}
