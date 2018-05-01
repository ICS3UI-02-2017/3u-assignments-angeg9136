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
        
        //ask how many inches they want
        System.out.println("How many inches do you wish to convert?");
        //use a double to store the inches
        double inches = input.nextDouble();
        //make the centimetres 2.54x the amount as inches
        double cm = inches * 2.54;
        //read out their answer
        System.out.println(inches + "inches is the same as " +cm+ " centimetres");
        
        
       
        
        
        
        
        
    }
}
