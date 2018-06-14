
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angeg9136
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scan
        Scanner input = new Scanner(System.in);
        //ask how many students are in the class
        System.out.println("How many students are in the class?");
        //use an integer to store students
        int students = input.nextInt();
 
        //make an array to store marks
        double[] marks = new double[students];
        
        //ask for marks
        System.out.println("Enter the marks:");
        
        for(int i = 0; i < marks.length; i++){
            marks[i] = input.nextDouble();
            
        //set a sum at 0
        double sum = 0;
        
        sum = sum + marks[i];
        
        //divide the marks by students
        double totalAverage = sum / students;
        //read out the average
        System.out.println("The average is " + totalAverage + "%");
    }
}
}
