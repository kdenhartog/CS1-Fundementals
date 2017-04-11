import java.util.*;

public class SimpleDateCalculator {
  public static void main(String [] args) {
  Scanner input = new Scanner(System.in);
  //gets user input
  System.out.println("Please enter start year :");
  int startYear = input.nextInt();
  System.out.println("Please enter start month :");
  int startMonth = input.nextInt();
  System.out.println("Please enter start day :");
  int startDay = input.nextInt();
  System.out.println("Please enter end year :");
  int endYear = input.nextInt();
  System.out.println("Please enter end month :");
  int endMonth = input.nextInt();
  System.out.println("Please enter end day :");
  int endDay = input.nextInt();
 //establishing variables to be used to check for incorrect dates
int day1 = checkMonth(startMonth,startYear);
int day2 = checkMonth(endMonth,endYear);
  
  //checking dates to make sure they are within the calendar
  if (startYear<1582 || endYear<1582){
   
    System.out.println("Error!");
    System.exit(0);
    
  }
  
  if (startMonth >13 || endMonth>13){
  
    System.out.println("Error!");
    System.exit(0);
    
  }
  
  if (startDay>day1 || endDay>day2){
  
    System.out.println("Error!");
    System.exit(0);
  
  }
  if (startYear>endYear){
    
    System.out.println("Error!");
    System.exit(0);
  }
  
  //declare total days count
  int totalDays = 0;

  //loop that adds days on for ever year between
  for(int year = startYear; year < endYear; year++){
    if((year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0)){
     totalDays += 366;
    } 
    else {
     totalDays += 365;
    }
  }
  //for loop to calculate total days from difference in months
  for(int month = startMonth +1; month < endMonth; month++){
   int months = checkMonth(month,startYear);
   totalDays += months;
  }
  //for loop to calculate total days from difference in days
  if(startDay <= endDay){
	  totalDays++;
	 
	  
  }
//output
  System.out.println("There are " + totalDays + " days between "+ startMonth + "/" + startDay + "/" + startYear + " and " + endMonth + "/" + endDay + "/" + endYear + "."); 
}

  
//checking days in a month
  public static int checkMonth(int startMonth, int startYear){
  int day = 0;
  switch (startMonth){
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:  
        day = 31;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        day = 30;
        break;
      case 2:
    	  if((startYear % 4 == 0) && (startYear % 100 != 0) && (startYear % 400 == 0)){ //checking to see if startYear should have 29 days or 28
        day = 29;
        }else{
        	day = 28;
        }
  }
  return day;
  }
}  
