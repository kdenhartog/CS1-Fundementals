import java.util.*;

public class mathWithExponents{
    public static void main(String[] args){
        Random rg = new Random();
        int number1, number2;
        number1 = rg.nextInt(51) + 50;
        number2 = rg.nextInt(31) + 10;
        
        System.out.println("The values are: " + number1 +" and " + number2 + "\n");
        System.out.println(number1 +  " to the power of " + number2 + " = " + Math.pow(number1, number2));
        System.out.println("The square root of " + number2 + " is " + Math.sqrt(number2));
        System.out.println("The cube root of " + number1 + " is " + Math.sqrt(number1));
        System.out.println("The natural log of " + number2 + " is " + Math.log(number2));
        System.out.println("The log base 10 of " + number1 + " is " + Math.log10(number1));
        System.out.println("The hypotenuse of the right triangle with sides " + number1 + " and " + number2 + " is " + Math.sqrt(Math.pow((double)(number1), 2) + Math.pow((double)(number2), 2)));

        
       }
}