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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scan
        Scanner input = new Scanner(System.in);
        //ask how much the food costs
        System.out.println("How much does the food for prom cost?");
        //make a double to store answer
        double food = input.nextDouble();
        
        //ask how much the dj costs
        System.out.println("How much does the DJ cost?");
        //make a double so store answer
        double dj = input.nextDouble();
        
        //ask how much it costs to rent the hall
        System.out.println("How much does it cost to rent the hall?");
        //make a double so store answer
        double rent = input.nextDouble();
        
        //ask how much the decorations cost
        System.out.println("How much do the decorations cost?");
        //make a double so store answer
        double decorations = input.nextDouble();
        
        //ask how much the staff costs
        System.out.println("How much does it cost for staff?");
        //make a double so store answer
        double staff = input.nextDouble();
        
        //ask how much for miscenllaneous price
        System.out.println("How much are the msicellaneous costs?");
        //make a double so store answer
        double misc = input.nextDouble();
        
        //add them together
        double total = (food + dj + rent + decorations + staff + misc);
        //read them their total
        System.out.println("Your total is " + total);
       
                
        
        
        
    }
}
