import java.util.*;

public class LoopArtLab
{
    /**
     * Method drawSolidSquare
     *
     * @param size size of square
     * @param ch character used to make square
     */
    public void drawSolidSquare (int size, char ch)
    {
        // Outer loop: draws specified number of lines
        for (int x=0; x<size; x++)
        {
            // Inner loop: draws a line of characters
            for (int y=0; y<size; y++)
            {
                System.out.print(ch + " "); // character followed by space
            }
            System.out.println();
        }
    }

    /**
     * Method drawHollowSquare
     *
     * @param size size of hollow square
     * @param ch character used to make hollow square
     */
    public void drawHollowSquare (int size, char ch)
    {
        for(int x = 0; x < size; x++){
            for(int y = 0; y < size; y++){
                if(x == 0 || x == size-1 || y == 0 || y == size-1){
                    System.out.print(ch + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Method drawHollowRectangle
     *
     * @param len length of rectangle
     * @param wid width of rectangle
     * @param ch character used to make Hollow Rectangle
     */
    public void drawHollowRectangle (int len, int wid, char ch)
    {
        // Outer loop: draws len lines
        for (int x = 0; x < len; x++)
        {
            // Inner loop: draws each line wid characters wide
            for (int y = 0; y < wid; y++)
            {
                // Decide whether to use drawing character or space;
                // only use drawing character for outside (top, bottom, sides)
                if (x==0 || x==len-1 || y==0 || y==wid-1)
                    System.out.print(ch + " ");
                else // not on outside of figure - print space
                    System.out.print("  ");
            } // end inner loop
            System.out.println();
        } // end outer loop
    }

    /**
     * Method drawSolidRectangle
     *
     * @param len lenght of rectangle
     * @param wid width of rectangle
     * @param ch character used to make Solid Rectangle
     */
    public void drawSolidRectangle(int len, int wid, char ch)
    {
        for (int x = 0; x < len; x++)
        {
            // Inner loop: draws each line wid characters wide
            for (int y = 0; y < wid; y++)
            {
                System.out.print(ch + " ");
            } // end inner loop
            System.out.println("  ");
        }
    }// end outer loop

    /**
     * Method drawTriangle
     *
     * @param ht height
     * @param ch character used to create triangle
     */
    public void drawTriangle(int ht, char ch)
    {
        // Outer loop: draws ht lines
        for (int x=0; x<ht; x++)
        {
            // first inner loop: draws invisible right triangle made of spaces
            for (int y=ht; y>x; y--)
                System.out.print(" ");
            // second inner loop: draws visible triangle
            for (int z=0; z<=x; z++)
                System.out.print(ch + " ");
            System.out.println();
        } // end outer loop
    }    

    /**
     * Method drawHourGlass
     *
     * @param dim half the height of the hourglass
     * @param ch character used to create hourglass
     */
    public void drawHourGlass (int dim, char ch)
    {
        for (int x=0; x<dim; x++)
        {
            // first inner loop: draws invisible right triangle made of spaces
            for (int y=0; y<x; y++)
                System.out.print(" ");
            // second inner loop: draws visible triangle
            for (int z=dim; z>=x; z--)
                System.out.print(ch + " ");
            System.out.println();
        } // end outer loop
        
        for (int x=0; x<=dim; x++)
        {
            // first inner loop: draws invisible right triangle made of spaces
            for (int y=dim; y>x; y--)
                System.out.print(" ");
            // second inner loop: draws visible triangle
            for (int z=0; z<=x; z++)
                System.out.print(ch + " ");
            System.out.println();
        } // end outer loop
    }

    /**
     * Method drawDiamond
     *
     * @param dim half the height of the diamond
     * @param ch character used to create diamond
     */
    public void drawDiamond (int dim, char ch)
    {
        for (int x=0; x<dim; x++)
        {
            // first inner loop: draws invisible right triangle made of spaces
            for (int y=dim; y>x; y--)
                System.out.print(" ");
            // second inner loop: draws visible triangle
            for (int z=0; z<=x; z++)
                System.out.print(ch + " ");
            System.out.println();
        } // end outer loop
        
        for (int x=0; x<=dim; x++)
        {
            // first inner loop: draws invisible right triangle made of spaces
            for (int y=0; y<x; y++)
                System.out.print(" ");
            // second inner loop: draws visible triangle
            for (int z=dim; z>=x; z--)
                System.out.print(ch + " ");
            System.out.println();
        } // end outer loop

    }

    /**
     * Method drawMysteryShape
     *
     *@param
     */
    public void drawMysteryShape (int ht, char ch) 
    {
       for (int x=0; x<ht; x++)
        {
            // first inner loop: draws invisible right triangle made of spaces
            for (int y=ht; y>x; y--)
                System.out.print(" ");
            // second inner loop: draws visible triangle
            for (int z=0; z<=x; z++)
                System.out.print(ch + " ");
            System.out.println();
        } // end outer loop
       for(int x = 0; x < (int)ht/2; x++){
           for(int y = 0; y < ht; y++){
           System.out.print(" ");
        }
        System.out.println(ch);
        }       
    }

    public static void main (String [] args)
    {
        LoopArtLab tester = new LoopArtLab(); // create object to call methods with
        int choice;     // represents user's choice of shape to draw
        String input;   // used for choice & drawing character
        int x, y;       // used for various shape dimensions
        Random rg = new Random(); // used to generate dimension values
        Scanner kb = new Scanner(System.in);

        // show menu & draw figure user selects using chosen drawing character
        do {
            System.out.println("Choose a shape");
            System.out.println("1. Solid square");
            System.out.println("2. Hollow square");
            System.out.println("3. Solid rectangle");
            System.out.println("4. Hollow rectangle");
            System.out.println("5. Triangle");
            System.out.println("6. Hourglass");
            System.out.println("7. Diamond");
            System.out.println("8. Surprise!");
            System.out.print ("Your choice (Enter 0 to quit): ");
            input = kb.nextLine();
            // check for valid input
            if (!Character.isDigit(input.charAt(0)))
            {
                System.out.println ("OK, I'm going all random on you!");
                choice = rg.nextInt(8) + 1;
            }
            else
            {
                try
                {
                    choice = Integer.parseInt(input);
                }
                catch(NumberFormatException e)
                {
                    System.out.println ("OK, I'm going all random on you!");
                    choice = rg.nextInt(8) + 1;
                } // end catch block
            } // end else

            // generate dimensions
            x = rg.nextInt(17) + 3;
            y = rg.nextInt(17) + 3;

            // get drawing character (if user isn't quitting)
            if (choice != 0)
            {
                System.out.print("Enter the character you want to draw with: ");
                input = kb.nextLine();
            }

            // call one of the methods based on user's choice
            switch (choice)
            {
                case 0:
                System.out.println("Mkay.  Buh-bye now");
                break;
                case 1:
                System.out.println("Drawing " + x + "x" + x + " solid square");    
                tester.drawSolidSquare(x, input.charAt(0));
                break;
                case 2:
                System.out.println("Drawing " + x + "x" + x + " hollow square");
                tester.drawHollowSquare(x, input.charAt(0));
                break;
                case 3:
                System.out.println("Drawing " + x + "x" + y + " solid rectangle");
                tester.drawSolidRectangle(x, y, input.charAt(0));
                break;
                case 4:
                System.out.println("Drawing " + x + "x" + y + " hollow rectangle");
                tester.drawHollowRectangle(x, y, input.charAt(0));
                break;
                case 5:
                System.out.println("Drawing a triangle with a height of " + x);
                tester.drawTriangle(x, input.charAt(0));
                break;
                case 6:
                System.out.println("Drawing a hourglass");
                tester.drawHourGlass(x, input.charAt(0));
                break;
                case 7:
                System.out.println("Drawing a diamond");
                tester.drawDiamond(x, input.charAt(0));
                break;
                case 8:
                System.out.println("Drawing a suprise");
                tester.drawMysteryShape(x, input.charAt(0));
                break;
                default:
                System.out.println("Invalid input, please try again.");
                break;
            } // end switch
        } while (choice > 0);
    } // end main method
} // end class
