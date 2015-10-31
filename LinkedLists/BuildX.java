import java.util.*;

/*
Carrer Cup question 2.4 question p 77 solution p 188
*/
class BuildX
{
   class Node {
      int val;
      Node prev, next;
   }
  public  Node buildX(int center, int[] nums) {
      Node root = new Node();
      root.val= center;
      root.next = null;
      root.prev = null;
      
      for ( int i = 0; i < nums.length; i++ ) {                
        Node newNode = new Node();
        newNode.val = nums[i];
        Node current = root;
        Node prev = root;        
        // go right
        if ( nums[i] < center ) {                    
          while ( current != null ) {
            prev = current;
            current = current.prev;
          }         
          current = newNode;
          current.prev = null;
          current.next = prev;          
        }
        // go left
        else if ( nums[i] > center ) {          
          while ( current != null ) {
            prev = current;
            current = current.next;
          }         
          current = newNode;
          current.next = null;
          current.prev = prev;          
        }            
      }
      return root;
      
  }
   
  public final static void main(String S[]) {
    int[] input = {1,2,3,4,6,7,8,9};
    BuildX x = new BuildX();
    x.buildX(5, input);
  }
    
}
