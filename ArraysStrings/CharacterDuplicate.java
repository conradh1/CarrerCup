import java.util.*;

/*
Carrer Cup question 1.1 question p 73 solution p 174
*/
class CharacterDuplicate
{
  public static boolean characterDuplicate(String str) {
                  
      for ( int i =0; i < str.length()-1; i++) {        
        String sub = str.substring(i+1);
        if ( sub.indexOf(str.charAt(i)) > -1)
          return true;           
      }
      return false;
  }
   
  public final static void main(String S[]) {
    String input = "ABCDEFGJII";
    
    System.out.println("Character found:"+characterDuplicate(input));
    
    
  }
    
}
