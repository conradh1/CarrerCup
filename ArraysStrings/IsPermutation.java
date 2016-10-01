import java.util.*;

/*
Carrer Cup question 1.3 question p 73 solution p 174

*/
class IsPermutation
{

   public static boolean  isPermutation(String str1, String str2) {

      char[] small;
      char[] big;
      LinkedHashMap<Character,Integer> myList = new LinkedHashMap<Character,Integer>();


      if ( str1.length() < str2.length()) {
	small = str1.toCharArray();
	big = str2.toCharArray();
      }
      else {
	small = str2.toCharArray();
	big = str1.toCharArray();
      }

      for ( int i = 0; i < small.length; i++ )  {
         if ( str1.indexOf(small[i]) == -1 ) return false;
      }
      return true;
   }

public final static void main(String S[]) {
    String str1 = "abcefghi";
    String str2 = "bca";
    System.out.println( isPermutation(str1,str2));
    str2 = "xyz";
    System.out.println( isPermutation(str1,str2));
  }
}
