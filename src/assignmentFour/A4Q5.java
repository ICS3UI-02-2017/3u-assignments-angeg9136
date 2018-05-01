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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scan
        Scanner input = new Scanner(System.in);
        // ask them for there name
        System.out.println("Hello, what is your name?");       
        String name = input.nextLine();
        
        //ask what first test was out of
        System.out.println("What was the first test out of?");
        //store answer with a double
        double test1 = input.nextDouble();
        //ask what they got
        System.out.println("What mark did you get?");
        //store answer with a double
        double test1a = input.nextDouble();
        
        //ask what second test was out of
        System.out.println("What was the second test out of?");
        //store answer with a double
        double test2 = input.nextDouble();
        //ask what they got
        System.out.println("What mark did you get?");
        //store answer with a double
        double test2a = input.nextDouble();
        
        //ask what third test was out of
        System.out.println("What was the third test out of?");
        //store answer with a double
        double test3 = input.nextDouble();
        //ask what they got
        System.out.println("What mark did you get?");
        //store answer with a double
        double test3a= input.nextDouble();
        
        //ask what fourth test was out of
        System.out.println("What was the fourth test out of?");
        //store answer with a double
        double test4 = input.nextDouble();
        //ask what they got
        System.out.println("What mark did you get?");
        //store answer with a double
        double test4a = input.nextDouble();
        
        //ask what fifth test was out of
        System.out.println("What was the fifth test out of?");
        //store answer with a double
        double test5 = input.nextDouble();
        //ask what they got
        System.out.println("What mark did you get?");
        //store answer with a double
        double test5a = input.nextDouble();
        
        //add all tests together
        double testR1 = (test1a /test1);
        //multiply the mark by 100 to get a %
        double testT1 = (testR1 * 100);
        double testR2 = (test2a /test2);
        //multiply the mark by 100 to get a %
        double testT2 = (testR2 * 100);
        double testR3 = (test3a /test3);
        //multiply the mark by 100 to get a %
        double testT3 = (testR3 * 100);
        double testR4 = (test4a /test4);
        //multiply the mark by 100 to get a %
        double testT4 = (testR4 * 100);
        double testR5 = (test5a /test5);
        //multiply the mark by 100 to get a %
        double testT5 = (testR5 * 100);
        
        //read them their averages for each tests
        System.out.println("The results are in! " + name);
        System.out.println("Test 1: " +testT1 +"%");
        System.out.println("Test 2: " +testT2 + "%");
        System.out.println("Test 3: " +testT3 + "%");
        System.out.println("Test 4: " +testT4 + "%");
        System.out.println("Test 5: " +testT5 + "%");
        
        //add all test scores together and divide by 5
        double totalAverage = (testT1 + testT2 + testT3 + testT4 + testT5);
        double totalAverage1 = (totalAverage /5);
        //read out their final mark
        System.out.println("Your total average is: " + totalAverage1 + "%");
        
        //say they did good if they got above 90
        if (totalAverage1 >90){
            System.out.println("Great job! " + name);}
        
        //say good try if they got below 90
        if (totalAverage1 <89){
            System.out.println("Good try, better luck next time " + name);
            
            
        }
        
        
        
    }
}
