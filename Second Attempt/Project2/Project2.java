import java.util.*;
import java.io.*;
/**
 * This program takes in a file with a list of 25 student names and 4 test scores for each
 * student. It then calculates and outputs to the console and to an output.txt file each
 * student's name, Test Score Average, and Letter Grade recieved. It also prints the class
 * average for each Test.
 * 
 * 
 * @author Kyle Den Hartog 
 * @version 10/21/14
 * 
 * @param t1Sum: variable to hold total score of all Test 1 scores
 * @param t2Sum: variable to hold total score of all Test 2 scores
 * @param t3Sum: variable to hold total score of all Test 3 scores
 * @param t4Sum: variable to hold total score of all Test 4 scores
 * @param stuAvg: variable to hold student's test average of all 4 tests
 * @param t1Avg: holds Test 1 average
 * @param t2Avg: holds Test 2 average
 * @param t3Avg: holds Test 3 average
 * @param t4Avg: holds Test 4 average
 */
public class Project2{  
    public static void main(String[] args){
        Scanner inFile;
        PrintWriter outFile = null;
        FileInputStream input = null;//temp object for recieving input from file
        FileOutputStream output = null;//temp object for outputting to file
        Project2 p2 = new Project2();//used to call method inside of class
        
        
        int stuSum = 0, t1Sum = 0, t2Sum = 0, t3Sum = 0, t4Sum = 0;
        double stuAvg, t1Avg, t2Avg, t3Avg, t4Avg;
        
        
        try{
            output = new FileOutputStream("output.txt");
            input = new FileInputStream("data.txt");
        }catch(FileNotFoundException e){
            System.out.println("The file cannot be found.");
            System.exit(1);
        }

        inFile = new Scanner(input);//Scans input file
        outFile = new PrintWriter(output);//writes to output file
        outFile.printf("%-20s%-20s%-20s\n","Student Name","Test Score Average",
            "Letter Grade");
        System.out.printf("%-20s%-20s%-20s\n","Student Name","Test Score Average",
            "Letter Grade");    
        while(inFile.hasNext()){
            String firstName = inFile.next();//gets student's first name
            String lastName = inFile.next();//gets student's last name
            int t1 = inFile.nextInt();//gets first test score for student
            int t2 = inFile.nextInt();//gets second test score for student
            int t3 = inFile.nextInt();//gets third test score for student
            int t4 = inFile.nextInt();//gets fourth test score for student
            
            stuSum = t1 + t2 + t3 + t4; //used in calculating student test average
            stuAvg = stuSum/4.0; //calculates student test average
            String letterGrade = p2.letterGrade(stuAvg);//calls method to determine grade
            t1Sum += t1; //adds students score to total for test averages
            t2Sum += t2;
            t3Sum += t3;
            t4Sum += t4;
        
          
            outFile.printf("%-20s%-20.1f%-20s\n",firstName + " " + lastName,
                stuAvg, letterGrade);
            System.out.printf("%-20s%-20.1f%-20s\n",firstName + " " + lastName,
                stuAvg, letterGrade);
        }
        t1Avg = t1Sum / 25.0; //calculates average score of Test 1
        t2Avg = t2Sum / 25.0; //calculates average score of Test 2
        t3Avg = t3Sum / 25.0; //calculates average score of Test 3
        t4Avg = t4Sum / 25.0; //calculates average score of Test 4
        outFile.println("\n" + "Class Averages");
        System.out.println("\n" + "Class Averages");
        
        outFile.printf("%-8s%-8s%-8s%-8s\n","Test 1", "Test 2", "Test 3", "Test 4");
        System.out.printf("%-8s%-8s%-8s%-8s\n","Test 1", "Test 2", "Test 3", "Test 4");
        
        outFile.printf("%-8.1f%-8.1f%-8.1f%-8.1f\n\n\n",t1Avg, t2Avg, t3Avg, t4Avg);
        System.out.printf("%-8.1f%-8.1f%-8.1f%-8.1f\n\n\n",t1Avg, t2Avg, t3Avg, t4Avg);
        outFile.close();
    }

            /**
     * Inputs a number that is equal to the percentage recieved and outputs the letter
     * grade that should be recieved.
     *
     * @param numGrade: the grade recieved in number form.
     * @return     letter Grade
     */
    private String letterGrade(double tScoreAvg){
        if(tScoreAvg >= 91){
            return "A";
        }else if(tScoreAvg >= 90){
            return "A-";
        }else if(tScoreAvg >= 89){
            return "B+";
        }else if(tScoreAvg >= 81){
            return "B";
        }else if(tScoreAvg >= 80){
            return "B-";
        }else if(tScoreAvg >= 79){
            return "C+";
        }else if(tScoreAvg >= 71){
            return "C";
        }else if(tScoreAvg >= 70){
            return "C-";
        }else if(tScoreAvg >= 69){
            return "D+";
        }else if(tScoreAvg >= 61){
            return "D";
        }else if(tScoreAvg >= 60){
            return "D-";
        }else{
            return "F";
        }
    }
}
