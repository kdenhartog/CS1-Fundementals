import java.util.*;
/**
* Reads in 3 words and then prints them out in alphabetical order
* 
* @author Kyle Den Hartog
* @date 10/1/14
*/
public class Lab5Part2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1, str2, str3;
        String[] strHolder = new String[3];
        
        System.out.println("Please enter the first word: ");
        str1 = sc.next();
        System.out.println("Please enter the second word: ");
        str2 = sc.next();
        System.out.println("Please enter the third word: ");
        str3 = sc.next();
    
        if(str1.compareTo(str2) >= 0  && str1.compareTo(str3) >= 0){
          strHolder[2] = str1;
          if(str2.compareTo(str3) >= 0){
              strHolder[1] = str2;
              strHolder[0] = str3;
          }else{
              strHolder[1] = str3;
              strHolder[0] = str2;
          }
        }
        if(str1.compareTo(str2) <= 0 && str1.compareTo(str3) <= 0){
          strHolder[0] = str1;
          if(str2.compareTo(str3) >= 0){
              strHolder[1] = str3;
              strHolder[2] = str2;
          }else{
              strHolder[1] = str2;
              strHolder[2] = str3;
          }    
        }
        if(str1.compareTo(str2) <= 0 && str1.compareTo(str3) >= 0 || str1.compareTo(str2) >= 0  && str1.compareTo(str3) <= 0){
         strHolder[1] = str1;
         if(str2.compareTo(str3) >= 0){
              strHolder[0] = str3;
              strHolder[2] = str2;
         }else{
              strHolder[0] = str2;
              strHolder[2] = str3;
          }    
        }
        System.out.println("Your words alphabetized are: ");
        System.out.println(strHolder[0]);
        System.out.println(strHolder[1]);
        System.out.println(strHolder[2]);
        
        
    }
}
    
