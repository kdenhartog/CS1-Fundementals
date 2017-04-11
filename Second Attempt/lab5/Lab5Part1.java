import java.util.*;
/**
* Reads in 3 integers and then prints them out in order of least to greatest
* 
* @author Kyle Den Hartog
* @date 10/1/14
*/
public class Lab5Part1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        int[] numHolder = new int[3];
        
        System.out.println("Please enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Please enter the second number: ");
        num2 = sc.nextInt();
        System.out.println("Please enter the third number: ");
        num3 = sc.nextInt();
    
        if(num1 >= num2 && num1 >= num3){
          numHolder[2] = num1;
          if(num2 >= num3){
              numHolder[1] = num2;
              numHolder[0] = num3;
          }else{
              numHolder[1] = num3;
              numHolder[0] = num2;
          }
        }if(num1 <= num2 && num1 <= num3){
          numHolder[0] = num1;
          if(num2 >= num3){
              numHolder[1] = num3;
              numHolder[2] = num2;
          }else{
              numHolder[1] = num2;
              numHolder[2] = num3;
          }    
        }if(num1 <= num2 && num1 >= num3 || num1 >= num2 && num1 <= num3){
         numHolder[1] = num1;
         if(num2 >= num3){
              numHolder[0] = num3;
              numHolder[2] = num2;
         }else{
              numHolder[0] = num2;
              numHolder[2] = num3;
        }    
    }
        System.out.println("Your numbers in order: ");
        System.out.println(numHolder[0]);
        System.out.println(numHolder[1]);
        System.out.println(numHolder[2]);
        
        
    }
}
    
