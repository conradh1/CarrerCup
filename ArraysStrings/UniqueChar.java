import java.util.*;

/*
Carrer Cup question 1.1 question p 73 solution p 172

*/
class UniqueChar
{

   public static boolean  isUnique(String str) {

      char[] chars = str.toCharArray();
      List<Character> charList = new ArrayList<Character>();

      for ( int i = 0; i < chars.length; i++ )  {
         if ( charList.contains(chars[i]))
	  return false;
	 else
	  charList.add(chars[i]);
      }
      return true;
   }

public final static void main(String S[]) {
    String str = "abcefghi";
    System.out.println( isUnique(str));
    str = "helloqweruiop;lkj";
    System.out.println( isUnique(str));
  }
}
