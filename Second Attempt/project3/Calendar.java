import java.lang.*;
import java.util.*;
import javax.swing.*;
/**
 * This was a simple program designed for a CS1 course in Java. It is intended to
 * print a calender in the command terminal.
 *
 * @author Kyle Den Hartog
 * @version 1.0 - 11/13/14
 */
public class Calendar
{

    /**
     * Constructor for objects of class Calender
     */
    public Calendar(int month, int year){

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param month - the month
     * @param year - the year
     * @return startDay - an integer 0-6 that represents the day of the week
     */
    public int startDay(int month, int year){
        int startDay;
        startDay = ((year + (year - 1) / 4 - (year - 1)/100 + (year - 1)/400)) % 7;
        switch(month){
            case 1:
            return startDay;
            case 2:
            return (startDay + 31) % 7;
            case 3:
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                return (startDay + 60) % 7;
            }else{
                return (startDay + 59) % 7;
            }
            case 4:
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                return (startDay + 91) % 7;
            }else{
                return (startDay + 90) % 7;
            }
            case 5:
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                return (startDay + 121) % 7;
            }else{
                return (startDay + 120) % 7;
            }
            case 6:
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                return (startDay + 152) % 7;
            }else{
                return (startDay + 151) % 7;
            }
            case 7:
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                return (startDay + 182) % 7;
            }else{
                return (startDay + 181) % 7;
            }
            case 8:
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                return (startDay + 213) % 7;
            }else{
                return (startDay + 212) % 7;
            }
            case 9:
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                return (startDay + 244) % 7;
            }else{
                return (startDay + 243) % 7;
            }
            case 10:
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                return (startDay + 274) % 7;
            }else{
                return (startDay + 273) % 7;
            }
            case 11:
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                return (startDay + 305) % 7;
            }else{
                return (startDay + 304) % 7;
            }
            case 12:
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                return (startDay + 335) % 7;
            }else{
                return (startDay + 334) % 7;
            }
            default:
            System.out.println("error in StartDay() method");
            throw new IllegalArgumentException();
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    public void calendarPrintMonth(int month, int year){
        int day = startDay(month,year);
        int date = 1;
        int febNumOfDays;
        boolean leapYear = false;
        String printString = "%" + (day*4 + 2) + "d";
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            leapYear = true;
        }
        switch(month){
            case 1:
            System.out.println("       January " + year + "       ");
            System.out.println(" S   M   T   W   R   F   S");
            System.out.println("--------------------------");
            System.out.printf(printString, date);
            date++;
            day++;
            while(date <= 31){
                if(day == 7){
                    System.out.println();
                    day = 0;
                }else{
                    if(day == 0){
                        System.out.printf("%2d", date);
                        date++;
                        day++;
                    }else{
                        System.out.printf("%4d", date);
                        date++;
                        day++;
                    }
                }
            }
            System.out.println();
            System.out.println();
            break;
            case 2:
            System.out.println("      February " + year + "       ");
            System.out.println(" S   M   T   W   R   F   S");
            System.out.println("--------------------------");
            System.out.printf(printString, date);
            date++;
            day++;
            if(leapYear = true){
                febNumOfDays = 29;
            }else{
                febNumOfDays = 28;
            }
            while(date <= febNumOfDays){
                if(day == 7){
                    System.out.println();
                    day = 0;
                }else{
                    if(day == 0){
                        System.out.printf("%2d", date);
                        date++;
                        day++;
                    }else{
                        System.out.printf("%4d", date);
                        date++;
                        day++;
                    }
                }
            }
            System.out.println();
            System.out.println();
            break;
            case 3:
            System.out.println("        March " + year + "        ");
            System.out.println(" S   M   T   W   R   F   S");
            System.out.println("--------------------------");
            System.out.printf(printString, date);
            date++;
            day++;
            while(date <= 31){
                if(day == 7){
                    System.out.println();
                    day = 0;
                }else{
                    if(day == 0){
                        System.out.printf("%2d", date);
                        date++;
                        day++;
                    }else{
                        System.out.printf("%4d", date);
                        date++;
                        day++;
                    }
                }
            }
            System.out.println();
            System.out.println();
            break;
            case 4:
            System.out.println("        April " + year + "        ");
            System.out.println(" S   M   T   W   R   F   S");
            System.out.println("--------------------------");
            System.out.printf(printString, date);
            date++;
            day++;
            while(date <= 30){
                if(day == 7){
                    System.out.println();
                    day = 0;
                }else{
                    if(day == 0){
                        System.out.printf("%2d", date);
                        date++;
                        day++;
                    }else{
                        System.out.printf("%4d", date);
                        date++;
                        day++;
                    }
                }
            }
            System.out.println();
            System.out.println();
            break;
            case 5:
            System.out.println("         May " + year + "         ");
            System.out.println(" S   M   T   W   R   F   S");
            System.out.println("--------------------------");
            System.out.printf(printString, date);
            date++;
            day++;
            while(date <= 31){
                if(day == 7){
                    System.out.println();
                    day = 0;
                }else{
                    if(day == 0){
                        System.out.printf("%2d", date);
                        date++;
                        day++;
                    }else{
                        System.out.printf("%4d", date);
                        date++;
                        day++;
                    }
                }
            }
            System.out.println();
            System.out.println();
            break;
            case 6:
            System.out.println("        June " + year + "         ");
            System.out.println(" S   M   T   W   R   F   S");
            System.out.println("--------------------------");
            System.out.printf(printString, date);
            date++;
            day++;
            while(date <= 30){
                if(day == 7){
                    System.out.println();
                    day = 0;
                }else{
                    if(day == 0){
                        System.out.printf("%2d", date);
                        date++;
                        day++;
                    }else{
                        System.out.printf("%4d", date);
                        date++;
                        day++;
                    }
                }
            }
            System.out.println();
            System.out.println();
            break;
            case 7:
            System.out.println("        July " + year + "         ");
            System.out.println(" S   M   T   W   R   F   S");
            System.out.println("--------------------------");
            System.out.printf(printString, date);
            date++;
            day++;
            while(date <= 31){
                if(day == 7){
                    System.out.println();
                    day = 0;
                }else{
                    if(day == 0){
                        System.out.printf("%2d", date);
                        date++;
                        day++;
                    }else{
                        System.out.printf("%4d", date);
                        date++;
                        day++;
                    }
                }
            }
            System.out.println();
            System.out.println();
            break;
            case 8:
            System.out.println("       August " + year + "        ");
            System.out.println(" S   M   T   W   R   F   S");
            System.out.println("--------------------------");
            System.out.printf(printString, date);
            date++;
            day++;
            while(date <= 31){
                if(day == 7){
                    System.out.println();
                    day = 0;
                }else{
                    if(day == 0){
                        System.out.printf("%2d", date);
                        date++;
                        day++;
                    }else{
                        System.out.printf("%4d", date);
                        date++;
                        day++;
                    };
                }
            }
            System.out.println();
            System.out.println();
            break;
            case 9:
            System.out.println("      September " + year + "      ");
            System.out.println(" S   M   T   W   R   F   S");
            System.out.println("--------------------------");
            System.out.printf(printString, date);
            date++;
            day++;
            while(date <= 30){
                if(day == 7){
                    System.out.println();
                    day = 0;
                }else{
                    if(day == 0){
                        System.out.printf("%2d", date);
                        date++;
                        day++;
                    }else{
                        System.out.printf("%4d", date);
                        date++;
                        day++;
                    }
                }
            }
            System.out.println();
            System.out.println();
            break;
            case 10:
            System.out.println("       October " + year + "       ");
            System.out.println(" S   M   T   W   R   F   S");
            System.out.println("--------------------------");
            System.out.printf(printString, date);
            date++;
            day++;
            while(date <= 31){
                if(day == 7){
                    System.out.println();
                    day = 0;
                }else{
                    if(day == 0){
                        System.out.printf("%2d", date);
                        date++;
                        day++;
                    }else{
                        System.out.printf("%4d", date);
                        date++;
                        day++;
                    }
                }
            }
            System.out.println();
            System.out.println();
            break;
            case 11:
            System.out.println("      November " + year + "       ");
            System.out.println(" S   M   T   W   R   F   S");
            System.out.println("--------------------------");
            System.out.printf(printString, date);
            date++;
            day++;
            while(date <= 30){
                if(day == 7){
                    System.out.println();
                    day = 0;
                }else{
                    if(day == 0){
                        System.out.printf("%2d", date);
                        date++;
                        day++;
                    }else{
                        System.out.printf("%4d", date);
                        date++;
                        day++;
                    }
                }
            }
            System.out.println();
            System.out.println();
            break;
            case 12:
            System.out.println("      December " + year + "       ");
            System.out.println(" S   M   T   W   R   F   S");
            System.out.println("--------------------------");
            System.out.printf(printString, date);
            date++;
            day++;
            while(date <= 31){
                if(day == 7){
                    System.out.println();
                    day = 0;
                }else{
                    if(day == 0){
                        System.out.printf("%2d", date);
                        date++;
                        day++;
                    }else{
                        System.out.printf("%4d", date);
                        date++;
                        day++;
                    }
                }
            }
            System.out.println();
            System.out.println();
            break;
            default:
            System.out.println("Error in PrintMonthCalendar Method");
            throw new IllegalArgumentException();
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    public void calendarPrintYear(int year){
        for(int x = 1; x <= 12; x++){
            calendarPrintMonth(x,year);
        }
    }

    /**
     * An void method taking in a user input to identify the month they want to use
     * Should be contained in the same class as the main method
     *
     * @return month - a number between 1 and 12 corresponding with the chosen month
     */
    public static int monthIdentifier(){
        Scanner scan = new Scanner(System.in);
        int month = 0;
        while(month == 0){
            System.out.println("Please enter the number corresponding to the month");
            System.out.println("Example Janurary = 1\n");
            month = scan.nextInt();
            if(month >= 1 && month <= 12){

            }else{
                System.out.println("You have entered an invalid number, Please try again\n");
                month = 0;
            }
        }
        return month;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rg = new Random();
        boolean quitYearFinder = true;
        boolean quitMonthFinder = true;
        boolean quitProgram = true;
        boolean programEnd = true;
        int mainYear = 0;
        int mainMonth = 0;

        System.out.println("Calender Program\n");
        while(quitProgram){
            while(quitYearFinder){
                int option;
                System.out.println("Enter 1 to specify a year");
                System.out.println("Enter 2 to generate a random year");
                System.out.println("Enter 3 to quit\n");
                option = sc.nextInt();

                switch(option){
                    case 1:
                    System.out.println("\nYou have chosen to specify a year");
                    System.out.println("Please enter a year greater then 1581\n");
                    do{
                        mainYear = sc.nextInt();
                        if(mainYear >= 1582){
                            quitYearFinder = false;
                        }
                        else{
                            System.out.println("\nPlease enter a new year greater than 1581");
                        }
                    }while((mainYear < 1582));
                    break;

                    case 2:
                    System.out.println("\nYou have chosen to generate a random year");
                    mainYear = rg.nextInt(432) + 1582;
                    System.out.println("The year generated for you is: " + mainYear);
                    quitYearFinder = false;
                    break;

                    case 3:
                    System.out.println("You have chosen to quit");
                    System.exit(1);

                    default:
                    System.out.println("\nYou have not entered a valid option please try again.\n");
                }
            }

            while(quitMonthFinder){
                int option;
                System.out.println("\nEnter 1 for a full calendar year");
                System.out.println("Enter 2 for a single month calendar");
                System.out.println("Enter 3 to quit\n");
                option = sc.nextInt();

                switch(option){
                    case 1:
                    System.out.println("\nYou have chosen a full calendar year\n");
                    mainMonth = 1;
                    Calendar yearCalendar = new Calendar(mainMonth, mainYear);
                    yearCalendar.calendarPrintYear(mainYear);
                    quitMonthFinder = false;
                    break;

                    case 2:
                    System.out.println("\nYou have chosen to specify a month of a year\n");
                    mainMonth = monthIdentifier();
                    Calendar monthCalendar = new Calendar(mainMonth, mainYear);
                    monthCalendar.calendarPrintMonth(mainMonth, mainYear);
                    quitMonthFinder = false;
                    break;

                    case 3:
                    System.out.println("You have chosen to quit");
                    System.exit(1);

                    default:
                    System.out.println("\nYou have not entered a valid option please try again.\n");
                }
            }
            while(programEnd){
                System.out.println("Would you like to quit?");
                System.out.println("Enter yes to exit or no to continue\n");
                String input = sc.next().toLowerCase();
                if(input.equals("yes")){
                    quitProgram = false;
                    programEnd = false;
                }else if(input.equals("no")){
                    quitMonthFinder = true;
                    quitYearFinder = true;
                    programEnd = false;
                }else{
                    System.out.println("Invalid input please try again\n");
                }
            }
        }
    }
}
