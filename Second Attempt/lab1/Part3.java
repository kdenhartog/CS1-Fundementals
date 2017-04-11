/*****************************************************************
* Program Example #1
* @author Kyle Den Hartog
* @version 17 January 2013
* 
* This program illustrates basic Java syntax and commenting style
* ****************************************************************/

import java.util.Scanner;       // include the Java class Scanner
                                // to facilitate keyboard input
public class Part3{
    public static void main (String [] args){
        Scanner kb = new Scanner (System.in);
   
        double age; // declares age object
        final double DAYS = 365.25; //sets constant
        final double MINUTES = 1440; //sets constant
        final double SECONDS = 60; // sets constant
                                   
                                    
                                  
        System.out.print("How old are you? ");  // prompts for input
        age = kb.nextDouble();                  // reads input from keyboard
        age = age * DAYS;                       // calculates age in days
        System.out.println("You are " + age + " days old"); // shows result
        age = age * MINUTES; //finds age in Mintues
        System.out.println("You are " + age + " minutes old"); //prints age in minutes
        age = age * SECONDS; //finds age in seconds
        System.out.println("You are " + age + " seconds old"); //prints age in seconds
    }
}