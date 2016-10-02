import java.util.*;

/*
Carrer Cup question 1.4 question p 74 solution p 175
Replace spaces with %20

*/
class ReplaceSpaces
{

   public static String  replaceSpaces(String str) {

      char[] strs = str.toCharArray();
      int spaces = 0;

      // find new length
      for ( int i = 0; i < strs.length; i++ )  {
	if ( strs[i] == ' ' ) spaces++;

      }

      int newLength = strs.length + (spaces * 2);

      char[] chars = new char[newLength];
      newLength--;


      for ( int i = strs.length-1; i >= 0; i-- )  {
         if ( strs[i] == ' ' ) {
	    chars[newLength] = '0';
	    chars[newLength-1] = '2';
	    chars[newLength-2] = '%';
	    newLength -= 3;
         }
	 else {
	  chars[newLength] = strs[i];
	  newLength--;
	 }

      }
      return String.valueOf(chars);
   }

public final static void main(String S[]) {
    String str = "abce fghi";
    System.out.println( replaceSpaces(str));
    str = "abce fg h i";
    System.out.println( replaceSpaces(str));
  }
}
