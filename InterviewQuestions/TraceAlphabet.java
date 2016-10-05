import java.util.*;
import java.util.regex.*;
import java.io.*;

/*
  Looks for a substring in a list of strings
  See: https://www.hackerrank.com/challenges/find-substring
*/

class TraceAlphabet {

private static void traceSteps(String word) {
  word = word.toLowerCase();
  char[] letters = word.toCharArray();
  int current1 = 0, current2 = 0;
  int max = 5;

  for ( int i = 0; i < letters.length; i++ ) {
    int n = (int)letters[i] - (int)'a'; // get number 1-26
    char c;
    char l = letters[i];
    int end1 = n%max;
    int end2 = n/max;

    while ( current1 > end1 ) {

      System.out.println("Left");
      current1--;
    }

    while ( current2 > end2 ) {
      System.out.println("Up");
      current2--;
    }

    while ( current1 < end1 ) {
      System.out.println("Right");
      current1++;
    }

    while ( current2 < end2 ) {
      System.out.println("Down");
      current2++;
    }
    System.out.println("OK//to select "+l);
  }
}


 public final static void main(String[] args)  {
  traceSteps("con");
 } //main

}
