import java.util.*;
public class BMICalculator{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String userInput = null;
        int units = 0, weight = 0, height = 0;
        double BMI = 0, hConvert = 0;
        boolean check = true,wCheck = true,hCheck = true;
        System.out.println("BMI Calculator");
        
        while(check){
         System.out.println("Please enter 1 for metric units or 2 for American units\nor type exit to exit");
         userInput = kb.next();
         if(userInput.compareToIgnoreCase("exit") == 0){
           System.exit(1);
         }else try{
                units = Integer.parseInt(userInput);
         }catch (NumberFormatException e){
                System.out.println("Please enter a valid input, try again.");
         }
         if(units == 1){
           System.out.println("You chose metric units");
            while(wCheck){
             System.out.println("Please enter your weight in kg");
             try{
                 weight = (int)kb.nextDouble();
             }catch (InputMismatchException e){
                 System.out.println("You did not enter a valid number, try again.");
             }
             if(weight > 0){
                 wCheck = false;
             }else{
                 System.out.println("You did not enter a valid number, try again.");
             }
            }
            
            while(hCheck){
             System.out.println("Please enter your height in cm.");
             try{
                 height = (int)kb.nextDouble();
             }catch (InputMismatchException e){
                 System.out.println("You did not enter a valid number, try again.");
             }
             if(height > 0){
                 hCheck = false;
             }else{
                 System.out.println("You did not enter a valid number, try again.");
             }
            }
            hConvert = height / 100.0;
            BMI = ((double)weight / Math.pow(hConvert, 2));
            System.out.println("Your weight is " + weight + " kg.");
            System.out.println("Your height is " + height + " cm.");
            System.out.printf("Your BMI rating is: %.2f", BMI);
            check = false;    
            }     
         if(units == 2){
         System.out.println("You chose American units");
            while(wCheck){
             System.out.println("Please enter your weight in lbs");
             try{
                 weight = (int)kb.nextDouble();
             }catch (InputMismatchException e){
                 System.out.println("You did not enter a valid number, try again.");
             }
             if(weight > 0){
                 wCheck = false;
             }else{
                 System.out.println("You did not enter a valid number, try again.");
             }
            }
            
            while(hCheck){
             System.out.println("Please enter your height in inches.");
             try{
                 height = (int)kb.nextDouble();
             }catch (InputMismatchException e){
                 System.out.println("You did not enter a valid number, try again.");
             }
             if(height > 0){
                 hCheck = false;
             }else{
                 System.out.println("You did not enter a valid number, try again.");
             }
            }
            BMI = (((double)weight / Math.pow(height, 2))*(double)703);
            System.out.println("Your weight is " + weight + " lbs.");
            System.out.println("Your height is " + height + " inches.");
            System.out.printf("Your BMI rating is: %.2f", BMI);
            check = false; 
        }else{
            System.out.println("You did not enter a valid response, try again");
        }
    }
}
}
