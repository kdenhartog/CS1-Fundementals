/**
 * Creates data file for program assignment 2, Spring 2012
 * 
 * Inputs: 25 Strings representing student names (read from keyboard)
 * Outputs: Student names followed by 4 randomly-generated numbers
 * representing test scores - outputs both to screen & to data file
 */

import java.util.*; // brings in Scanner & Random
import java.io.*;   // brings in FileOutputStream & PrintWriter

public class MakeP2DataFile
{
    Scanner kb;             // reads keyboard input
    Random rg;              // generates random int values for test scores
    PrintWriter outfile;    // represents output file
    
    /** 
     * Constructor initializes input source & random number generator,
     * opens output file; if FileNotFoundException is thrown, opens default
     * output file in current directory
     * 
     */
    public MakeP2DataFile(String name)
    {
        rg = new Random();
        kb = new Scanner(System.in);
        FileOutputStream f = null;     // temporary object for 
                                       // opening output file
        try
        {
            f = new FileOutputStream(name);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Couldn't open specified file: " + name);
            System.out.println("Creating local file data.txt");
            try 
            {
                f = new FileOutputStream("data.txt");
            }
            catch (FileNotFoundException g) {}
        }
        
        outfile = new PrintWriter(f);
    }   // end constructor
    
    
	
	
	
	
	/**
     * makeFile method reads in student names, generates random test scores,
     * and writes both out to screen & output file
     */
    public void makeFile()
    {
        final int NUMRECS = 25; // number of records to be created
        int ct = 0,             // loop counter
            score;              // individual test score, generated randomly
        String name;            // name of individual student, read from keyboard
        
        while (ct < 25)
        {
            // prompt for & read in student name
            System.out.print ("Enter student name for record " + (ct+1) + ": ");
            name = kb.nextLine();
            // write name out to screen & file
            System.out.print(name);
            outfile.print(name);
            // inner loop generates 4 random test scores & writes them out to
            // screen & data file
            for (int x = 0; x < 4; x++)
            {
                score = rg.nextInt(50) + 51; // score between 51 and 100
                // write each score to screen & file; use tab as separator
                System.out.print(" " + score);
                outfile.print(" " + score);
            } // end for loop
            // output end of line character to separate data records
            System.out.println();
            outfile.println();
            // update loop counter
            ct++;
        } // end while loop
        outfile.close();    // closes data file, forcing write to disk
    } // end makeFile method
    
    public static void main (String [] args)
    {
        // use command line parameter to send String to constructor
        MakeP2DataFile mpdf = new MakeP2DataFile(args[0]);
        mpdf.makeFile();
    }       
} // end class