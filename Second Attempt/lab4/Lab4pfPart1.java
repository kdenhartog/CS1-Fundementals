import java.util.Scanner;

public class Lab4pfPart1
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        String format;
        double randomNum = Math.random();
        int fieldWidth, precision;
        System.out.printf("%-25s","Unformatted value is: ");
        System.out.print("|");
        System.out.println(randomNum);
        System.out.printf("%-25s","Value for field width: ");
        System.out.print("|");
        fieldWidth = kb.nextInt();
        System.out.printf("%-25s","Value for precision: ");
        System.out.print("|");
        precision = kb.nextInt();
        System.out.printf("%-25s","Formatted value: ");
        System.out.print("|");
        format = "%" + fieldWidth + "." + precision + "f";
        System.out.printf(format, randomNum);
        System.out.println();
    }
}