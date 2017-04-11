import java.util.Scanner;
import java.util.*;

public class Driver{
 public static void main(String [] args) 
 {
  Scanner scan = new Scanner(System.in);
  Calculator calc = new Calculator();
  int input = 10;
  int arg1 = 0, arg2 = 0;
  System.out.println("Welcome to this simple calculator");
  try{
  while(input != 0) 
  {
   System.out.println("\n0) Exit");
   System.out.println("1) Add");
   System.out.println("2) Subtract");
   System.out.println("3) Multiply");
   System.out.println("4) Divide\n");
   System.out.print("Please select a menu item: ");

   input = scan.nextInt();
   
   if(input > 0 && input < 5) 
   {
    System.out.print("Please enter the first argument of the operation: ");
    arg1 = scan.nextInt();
    System.out.print("Please enter the second argument of the operation: ");
    arg2 = scan.nextInt();
    }
   switch(input)
   {
    case 0:
     System.out.println("Exiting!");
     break;
    case 1:
     System.out.println(calc.add(arg1, arg2));
     break;
    case 2:
     System.out.println(calc.subtract(arg1, arg2));
     break;
    case 3:
     System.out.println(calc.multiply(arg1, arg2));
     break;
    case 4:
   System.out.println(calc.divide(arg1, arg2));
     break; 
    default:
   System.out.println("Invalid input!");
   }//ends switch statement
   }//ends while loop
  }//ends try block
   catch(InputMismatchException e){
    System.out.println("Invalid Input");
   
   }catch(ArithmeticException e){
    System.out.println("Invalid Input, Divided by 0");
   }catch(NegativeArguementException e){
    System.out.println("Invalid Input");
   }catch(NegativeResultException e){
   System.out.println("Invalid Input");
   
  }//end NegativeResultException
   
 }//ends main
}//end class

