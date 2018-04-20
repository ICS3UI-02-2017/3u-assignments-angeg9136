/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author gavra1029
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scan
        Scanner input = new Scanner(System.in);
        //get a word to translate
        System.out.println("What word would you like to translate?");
        String og = input.nextLine();
        String translated = "";
        //make everything lowercase
        og = og.toLowerCase();
        //repeat translator
        String start = "";
        String end = "";
        String translate = "";

        //check if we start with vowel
        if (og.startsWith("a")
                || og.startsWith("e")
                || og.startsWith("i")
                || og.startsWith("o")
                || og.startsWith("u")) {

            translated = "ub" + og;

            //give them their word now translated in ubbi dubbi
            System.out.println(og + " in ubbi dubbi is " + translated);
            //break once they have their word

        } else {
            //go thru the word looking for vowels
            int length = og.length();
            //look for a vowels using a loop
            for (int i = 0; i < length; i++) {
                //look for vowels using i
                if (og.charAt(i) == 'a'
                        || og.charAt(i) == 'e'
                        || og.charAt(i) == 'i'
                        || og.charAt(i) == 'o'
                        || og.charAt(i) == 'u'){
                    //the position of the vowel is i
                    //break word apart from vowel
                    start = og.substring(0, i);
                    end = og.substring(i);

                    //finish with adding it all together
                    translate =  start + "ub" + end ;
                    //when done break loop
                    break;

                }
                }
            //print out their translation
                System.out.println(og + " in ubbi dubbi is " + translate);
            }
        }
}