/**
 * Sudoku
 * You can play sudoku with this program.
 *
 * @Kyle Den Hartog
 *
 * @RMB Robert Fruchtman
 *
 * @10/19/12
 *
 */

import java.util.Scanner;

public class Sudoku {
 static Scanner s = new Scanner(System.in);
 public int[][] gameBoard;

 // constructor below
 public Sudoku(int[][] game) {
  int[][] grid = new int[9][9];
  for (int row = 0; row < 9; row++) {
   for (int col = 0; col < 9; col++) {
    grid[row][col] = game[row][col];
   }
  }

  this.gameBoard = grid;
 }

 // constructor goes to next comment above
 public static void main(String[] args) {
  Sudoku game = new Sudoku(Constants.game); // initialize object called
  // game that refers to the
  while (!game.isPuzzleComplete()) { // loop until puzzle has been
   // complete
   game.printPuzzle();
   System.out.println("Enter new value <row col val>");
   String line = s.nextLine();
   char row = line.charAt(0);
   char col = line.charAt(2);
   int val = Integer.parseInt("" + line.charAt(4));
   if (game.gameBoard[letterToIndex(row)][letterToIndex(col)] == -1) {
    game.gameBoard[letterToIndex(row)][letterToIndex(col)] = val;

   } else {
    System.out.println("Fixed location. Cannot change value!");
   }
  }
  game.printPuzzle();
  System.out.println("Puzzle Complete!");
  
 }

 public static int letterToIndex(char x) {
  int i = 0;
  switch (x) {

  case 'a':
   i = 0;
   break;
  case 'b':
   i = 1;
   break;
  case 'c':
   i = 2;
   break;
  case 'd':
   i = 3;
   break;
  case 'e':
   i = 4;
   break;
  case 'f':
   i = 5;
   break;
  case 'g':
   i = 6;
   break;
  case 'h':
   i = 7;
   break;
  case 'i':
   i = 8;
   break;
  }
  return i;
 }

 public void printPuzzle() {
  System.out.println("   | a | b | c | d | e | f | g | h | i ");
  for (int y = 0; y < 9; y++) {
   System.out.print(" " + (char) (97 + y) + " ");
   for (int x = 0; x < 9; x++) {
    String output = "_";
    if (gameBoard[y][x] != -1) {
     output = "" + gameBoard[y][x];
    }
    System.out.print("| " + output + " ");
   }
   System.out.print("\n");
  }
 }
//isPuzzleComplete checks if the puzzle is filled but does not check if there are reduntant values
 public boolean isPuzzleComplete() {
   int[] markArray = new int[9];
  for (int i = 0; i < gameBoard.length; i++) {
   for (int j = 0; j < gameBoard.length; j++) {
    if (gameBoard[i][j] == -1) {
     return false;
    }
   }
  }
  return true;
  }// Ends isPuzzleComplete
}// Ends class
