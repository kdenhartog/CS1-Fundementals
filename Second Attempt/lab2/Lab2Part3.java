import java.util.*; // brings in Random & Scanner

public class Lab2Part3
{
    public static void main (String [] args)
    {
        int randVal1,randVal2;   // 2 random numbers

        Random rg = new Random();       // random generator

        randVal1 = rg.nextInt(100)+1;   // number between 1 & 100
        randVal2 = rg.nextInt(50)+1;    // number between 1 & 50

        System.out.println("The numbers are: " + randVal1 + 
            " and " + randVal2);

        // find & print sum:
        System.out.println("The sum is: " + (randVal1+randVal2));
        System.out.println("The difference is: " + (randVal1-randVal2));
        System.out.println("The product is: " + (randVal1*randVal2));
        System.out.println("The integer quotient is: " + (randVal1/randVal2));
        System.out.println("The integer remainder is: " + (randVal1%randVal2));
        System.out.println("The real quotient is: " + (double)(randVal1)/(randVal2));
        

    } // end of main
} // end of class