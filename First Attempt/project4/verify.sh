#!/bin/bash

if [ -f "./Sudoku.class" ]
then 
  java Sudoku < input1 > test_out1
  java Sudoku < input2 > test_out2
  diff output1 test_out1 > log1
  diff output2 test_out2 > log2

  if [ -s ./log1 ]
  then
     echo "Test1 [FAIL]"
     echo "Check log1 for full log"
#     head -20 ./log1 
  else 
     echo "Test1  : [PASS]"
  fi
  if [ -s ./log2 ]
  then
     echo "Test2 [FAIL]"
     echo "Check log2 for full log"
#     head -20 ./log2
  else 
    echo "Test2  [PASS]"
  fi

else
  echo "Cannot find Sudoku.class. Make sure your main method is in Sudoku.java and code is compiled"
fi
