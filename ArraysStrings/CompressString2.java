import java.util.*;

/*
Carrer Cup question 1.1 question p 73 solution p 172

*/
class CompressString2
{

   public static String compress(String str) {

      char[] chars = str.toCharArray();
      String compress = new String("");
      int n = 1, i;
      char c = chars[0];

      for ( i = 0; i < chars.length-1; i++ )  {
	c = chars[i];

	if ( i < chars.length && c == chars[i+1]   ) {
	    n++;
	}
	else {
	  compress += c;
	  if ( n > 1 ) {
	    compress += ""+n;
	    n = 1;
	  }
	}


      }
      // Last character
      compress += ""+chars[i];
      if ( n > 1 ) compress += ""+n;
      return compress;
   }

public final static void main(String S[]) {
    String str = "aabccccdeeeee";
    System.out.println( compress(str));
    str = "helloqweruiop;lkj";
    System.out.println( compress(str));
  }
}
