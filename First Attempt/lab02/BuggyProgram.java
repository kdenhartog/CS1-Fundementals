import java.util.*;
import javax.swing.*;
/*
#name: your name here
#class: BuggyProgram.java
#lab: cs180_lab02
*/
public class BuggyProgram 
{
 public static void main(String [] args) 
 {
  //Create Scanner Object
  Scanner s = new Scanner(System.in);
  
  //Welcome user with terminal
  System.out.println("Welcome to BuggyProgram!");
  
  //print a request for a name via the terminal
  System.out.println("Please enter your name: ");
  
  //read the string from the terminal
  String userName = s.nextLine();
  
  //print a request for a major via the terminal
  System.out.println("Please enter your current major: ");
  
  //read the string from the terminal
  String userMajor = s.nextLine();
  
  //request and read a phone number from user using JOptionPane
  String userPhoneNumber = JOptionPane.showInputDialog(null, "Please enter your phone number:");
  
  //request and read an email from user using JOptionPane
  String userEmail = JOptionPane.showInputDialog(null, "Enter your email address:");
  
  //call createBusinessCard() to generate a business card with user info
  createBusinessCard(userName, userMajor, userEmail, userPhoneNumber);
 
 }
 
 public static void createBusinessCard(String name, String major, String email, String phone){
   JOptionPane.showMessageDialog(null, "------------------------------------------------\n" + name + "\nMajor: " + major + "\nPhone: " + phone + "\nEmail: " + email + "\n------------------------------------------------\n", "Business Card", JOptionPane.PLAIN_MESSAGE);
 }
}