import java.util.*;
import java.lang.*;
import java.math.*;
import javax.swing.*;
import java.text.*;

/**
 * Project 1
 * outputs a receipt for Purdue Pete's pizza piazza
 *
 * Kyle Den Hartog
 *
 * 007, Long Zhen
 *
 * 9/19/12
 *
 */

public class Project1{
  public static void main(String[] args){
 Scanner info = new Scanner(System.in);
 
 SimpleDateFormat format = new SimpleDateFormat("EEEEEEEE, MMMMMMMMMM d, yyyy"); // creates format for date
    String date = format.format(new Date(System.currentTimeMillis())); //creates a string storing the date
 
 System.out.println("How many guests?"); //requests user imput for # of guests
 int g = info.nextInt(); //stores numbers of guests
 System.out.println("How many cheese pizzas?"); // requests user input for # of cheese pizzas
 int cp = info.nextInt();//stores numbers of cheese pizzas
 System.out.println("How many pepperoni pizzas?");// requests user input for # of pepperoni pizzas
 int pp = info.nextInt();//stores numbers of pepperoni pizzas
 System.out.println("How many vegetarian pizzas?");// requests user input for # of vegetarian pizzas
 int vp = info.nextInt();//stores numbers of vegetarian pizzas
 System.out.println("How many 2 liter bottles of Pepsi?");// requests user input for # of pepsi bottles
 int pepsi = info.nextInt();//stores numbers of pepsi bottles
 System.out.println("How many 2 liter bottles of Mountain Dew?");// requests user input for # of Mountain Dew bottles
 int mdew = info.nextInt();//stores numbers of Mountain Dew bottles
 System.out.println("How many 2 liter bottles of Sprite?");// requests user input for # of Sprite bottles
 int sprite = info.nextInt();//stores numbers of Sprite bottles
 System.out.println("How much tip to leave? (in percent)");// requests user input for percent of tip
 double tip = info.nextDouble();//stores numbers for percent of tip
 
 double pricepizza = (double)(Math.random()*15.00)+5.00; // calculates a random price for pizzas
 double rpricepizza = Math.round(pricepizza*100); //begins rounding to 2 decimals
 double rpricepizza2 = rpricepizza/100; //finishes rounding to 2 decimals
 double pricesoda = (double)(Math.random()*4.00)+1.00; //calaculates a random price for sodas
 double rpricesoda = Math.round(pricesoda*100); // begins rounding to 2 decimals
 double rpricesoda2 = rpricesoda/100; // finishes rounding to 2 decimals
 double cpprice = cp*rpricepizza2; //sets a price for cheeese pizzas
 double ppprice = pp*rpricepizza2; // sets a price for pepperoni pizzas
 double vpprice = vp*rpricepizza2; // sets a price for vegetarian pizzas
 double pepsiprice = pepsi*rpricesoda2; //sets a price for pepsi 
 double mdewprice = mdew*rpricesoda2; //sets a price for mountain dew
 double spriteprice = sprite*rpricesoda2; // sets a price for sprite
 double subtotal = cpprice+ppprice+vpprice+pepsiprice+mdewprice+spriteprice; //totals all prices creating a subtotal
 double rtip = Math.round(tip*100); //sets decimal point to 2 places for tip
 double rtip2 = rtip/100; //finishes setting decimal point to 2 places for tip
 double tipcalc = rtip2/100; //gets decimal number to multiply by subtotal
 double tipcalc2 = tipcalc*subtotal; //multiplies tip by subtotal
 double grandtotal = subtotal+tipcalc2;// calculates grand total
 double tipper = tipcalc2/g; //breaks tip into amount per guests
 double rtipper = Math.round(tipper*100); //rounds decimal for calculations
 double rtipper2 = rtipper/100; //finishes rounding decimal for calculations
 DecimalFormat df = new DecimalFormat("##.##"); //decimal formating for output
 
 System.out.println("Purdue Pete's Pizza Piazza");//format
 System.out.println("=========================="+'\n');//format
 System.out.println(date+'\n');//outputs date & formating
 System.out.println("Item"+'\t'+'\t'+'\t'+'\t'+"Quantity"+'\t'+'\t'+"Price");//format
 System.out.println("--------------------------------------------------------------------------------");//format
 System.out.println("cheese pizza"+'\t'+'\t'+'\t'+"   "+cp+'\t'+'\t'+"$"+df.format(cpprice));//outputs cheese pizza prices and quantity
 System.out.println("pepperoni pizza"+'\t'+'\t'+'\t'+"   "+pp+'\t'+'\t'+"$"+df.format(ppprice));//outputs pepperoni pizza prices and quantity
 System.out.println("vegetarian pizza"+'\t'+'\t'+'\t'+"   "+vp+'\t'+'\t'+"$"+df.format(vpprice));//outputs vegetarian pizza prices and quantity
 System.out.println("2 liter bottle of Pepsi"+'\t'+'\t'+"   "+pepsi+'\t'+'\t'+"$"+df.format(pepsiprice));//outputs pepsi prices and quantity
 System.out.println("2 liter bottle of Mountain Dew"+'\t'+'\t'+"   "+mdew+'\t'+'\t'+"$"+df.format(mdewprice));//outputs mountain dew prices and quantity
 System.out.println("2 liter bottle of Sprite"+'\t'+'\t'+"   "+sprite+'\t'+'\t'+"$"+df.format(spriteprice));//outputs sprite prices and quantity
 System.out.println("--------------------------------------------------------------------------------");//format
 System.out.println("SubTotal"+'\t'+'\t'+'\t'+'\t'+'\t'+'\t'+"$"+df.format(subtotal));//outputs subtotal
 System.out.println("Tip("+df.format(tip)+"%)"+'\t'+'\t'+'\t'+'\t'+'\t'+'\t'+"$"+df.format(tipcalc2));//outputs tip info
 System.out.println("Grand Total"+'\t'+'\t'+'\t'+'\t'+'\t'+"$"+df.format(grandtotal)+'\n');//outputs grand total
 System.out.println("The tip per person for "+g+" guests is $"+df.format(tipper));//outputs tipper
   
 }
}