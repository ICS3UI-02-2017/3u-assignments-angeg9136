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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scan
        Scanner input = new Scanner(System.in);
        //ask them for their name
        System.out.println("Hi, what is your name?");
        //make a string to store their name
        String name = input.nextLine();
        //say hello to them and ask they how they are
        System.out.println("Hello " + name+ ". How are you today?");
        
        
       
    }
}
