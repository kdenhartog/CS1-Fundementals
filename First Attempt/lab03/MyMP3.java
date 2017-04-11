import java.util.*;
import java.text.SimpleDateFormat;

public class MyMP3
{
  public static void main(String [] args){

    Scanner s = new Scanner(System.in);
    //This collects the date from the computer
    SimpleDateFormat format = new SimpleDateFormat("EEE, MMM d, ''yy");
    String date = format.format(new Date(System.currentTimeMillis()));
    //request user to enter album title
    System.out.println("Enter the album title:");
    //save album title in terminal
    String title = s.nextLine();
    //request user to enter album author
    System.out.println("Enter the album author:");
    //save album author in terminal  
    String author = s.nextLine();
    //request user to enter album price
    System.out.println("Enter the album price:");
    //save price in terminal  
    String price = s.nextLine();
    //display user info that has been imputed
    System.out.println(" album: "+ title +" singer: " + author + " price: " + price + 
                       " bought on: " + date + author + price);
    
    
  }
}