import java.util.Scanner;
import java.util.Random;

public class FractionClient
{
    public static void main (String [] args)
    {
        Random rg = new Random();
        Fraction f1, f2, f3;
        String input = null;
        int a = 0, b = 0;
        double c = 0;
        Scanner kb = new Scanner (System.in);
        do
        {
            System.out.println("******Testing Fraction methods******");
            System.out.println("***Generating Fraction with random values (f1)***");
            f1 = new Fraction (rg.nextInt(10)+1, rg.nextInt(20)+1);
            System.out.println("f1 = " + f1);
            System.out.println("***Testing default constructor (f2)***");
            f2 = new Fraction();
            System.out.println("f2 = " + f2);
            System.out.println("***Testing simplify***");
            System.out.println("Setting up random unreduced Fraction: ");
            f3 = new Fraction((rg.nextInt(10)+1)*3, (rg.nextInt(10)+1)*9);
            System.out.println("f3 before simplify = " + f3);
            f3 = f3.simplify();
            System.out.println("***Testing toDouble on f1***");
            c = f1.toDouble();
            System.out.println("f3 after simplify = " + f3);
            System.out.println(f1 + " = " + c);
            System.out.println("***Testing set methods***");
            
            boolean valid = false;
            while (!valid)
            {
                System.out.println("Enter new numerator for f1: ");
                input = kb.nextLine();
                try
                {
                    a = Integer.parseInt(input);
                    valid = true;
                }
                catch (NumberFormatException e)
                {
                    System.out.println(input + " not valid - try again");
                }
            }
            f1.setNumerator(a);
            System.out.println("f1 = " + f1);
            
            
			valid = false;
            while (!valid)
            {
                System.out.print("Enter new denominator for f2: ");
                input = kb.nextLine();
                try
                {
                    b = Integer.parseInt(input);
                    f2.setDenominator(b);
                    valid = true;
                }
                catch (NumberFormatException e)
                {
                    System.out.println(input + " not valid - try again");
                }
                catch (RuntimeException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("f2 = " + f2);
            System.out.println("***Testing arithmetic methods***");
            f3 = f1.times(f2);
            System.out.println(f1 + " * " + f2 + " = " + f3);
            f3 = f1.times(f2.getDen());
            System.out.println(f1 + " * " + f2.getDen() + " = " + f3);
            System.out.print("Enter q to quit, enter to continue: ");
            input = kb.nextLine();
        } while(!input.equalsIgnoreCase("q"));
    }
}