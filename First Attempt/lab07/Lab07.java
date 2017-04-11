import java.util.*;
import javax.swing.*;

public class Lab07{
  public static void main(String [] args){
    int john = 18;
    int sarah = 14;
    int dave = 21;
    int joey = 20;
    int hannah = 19;
    
    loopOneB();
    switchifOneB(john);
    switchifOneB(sarah);
    switchifOneB(dave);
    switchifOneB(joey);
    switchifOneB(hannah);
    loopTwoB();
    danglingElseB(5);
  }
  
   public static void loopOneB(){
    int a = 4;
      int b = 2;
     for(int i = 0; i< 10; i++){
      a = a + b;
      b = b*i;
    }
    System.out.println("a = " + a);
   }
    
     public static void switchifOneB(int age){
    
    String gradeString;
    
    switch (age){
      case 15: System.out.println("This student is a Freshman in High School.");
               break;
      case 16: System.out.println("This student is a Sophomore in High School.");
               break;
      case 17: System.out.println("This student is a Junior in High School.");  
               break;
      case 18: System.out.println("This student is a Senior in High School.");
               break;
      case 19: System.out.println("This student is a Freshman in College.");
               break;
      case 20: System.out.println("This student is a Sophomore in College.");
               break;
      case 21: System.out.println("This student is a Junior in College.");
               break;
      case 22: System.out.println("This student is a Senior in College.");
               break;
    }
    
     }
      public static void loopTwoB(){
        int i = 10;
        for(int a = 0; a< 100; a++){
      i = a + i;
      a *= a;
  
    }
     System.out.println("int i = " + i); 
  }
    public static void danglingElseB(int aa){ 
      if ( aa <=10 ){  
        if ( aa == 10 ){
       System.out.println( "aa is equal to 10" ) ;
        }else{
    System.out.println( "aa is less than 10" ) ;
    
  }
 }
    }
}
    