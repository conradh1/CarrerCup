import java.util.*;

/*
Carrer Cup question 1.1 question p 73 solution p 174
*/
class CompressString
{
  public static String compressString(String str) {
  
      char[] letters = str.toCharArray();
      StringBuilder compress = new StringBuilder();
      int dup = 1;
                  
      for ( int i =0; i < letters.length; i++) {        
        char letter = letters[i];
        if ( i != letters.length-1 && letter == letters[i+1] ) {
          dup++;
        }
        else {
          compress.append(letter);
          if ( dup > 1 ) {
            compress.append(dup);
          }
          dup = 1;
        }
      }
      if ( compress.equals("") )
        return str;
      else        
        return compress.toString();
  }
   
  public final static void main(String S[]) {
    String input = "ABCDDDDDEGGGGGGJJ";
    
    
    System.out.println("Original: "+input+" Compress String: "+compressString(input));
    
    
  }
    
}
