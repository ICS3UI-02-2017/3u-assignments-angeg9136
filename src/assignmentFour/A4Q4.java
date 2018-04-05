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
        //maje the scanner
        Scanner input = new Scanner(System.in);
        //ask how much the food costs
        System.out.println("How much does the food cost?");
        //say how much the food costs
        double name = input.nextDouble();
        //ask how much the dj costs
        System.out.println("How much does the DJ cost?");
        double nam = input.nextDouble();
        //ask how much it costs to rent the hall
        System.out.println("How much does it cost to rent the hall?");
        double na = input.nextDouble();
        //ask how much the decorations cost
        System.out.println("How much does decorations cost?");
        double n = input.nextDouble();
        //ask how much it costs for the staff 
        double l = input.nextDouble();
        System.out.println("How much does it cost for staff?");
        double a = input.nextDouble();
        //ask how much all the miscellaneous stuff costs
        System.out.println("How much for miscellaneous costs?");
        double d = input.nextDouble();
        //add them together
        double naenae = (name + nam + na + n + l + a + d);
        //output their number
        System.out.println("The Total cost is " + naenae);
    }
}
