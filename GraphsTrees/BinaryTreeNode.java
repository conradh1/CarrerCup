import java.io.*;
import java.util.*;

public class BinaryTreeNode {

  private static BinaryTreeNode root;
  public int data;
  public BinaryTreeNode left;
  public BinaryTreeNode right;

  public BinaryTreeNode(int data) {
    this.data = data;
    left = null;
    right = null;

  }

  public void setData(int data) {
    this.data= data;
  }

  public int getData() {
    return data;
  }

  public void addLeft(BinaryTreeNode left) {
      this.left = left;
  }

  public BinaryTreeNode getLeft() {
    return left;

  }

  public void addRight(BinaryTreeNode right) {
      this.right = right;
  }


  public BinaryTreeNode getRight() {
    return right;

  }

  public static void preOrder( BinaryTreeNode node ) {
    if ( node  != null ) {
      System.out.print( node.getData()+" " );
      preOrder( node.getLeft());
      preOrder( node.getRight());
    }
  }

  public static void inOrder( BinaryTreeNode node ) {
    if ( node  != null ) {
      inOrder( node.getLeft());
      System.out.print( node.getData()+" " );
      inOrder( node.getRight());
    }
  }

  public static void postOrder( BinaryTreeNode node ) {
    if ( node  != null ) {
      postOrder( node.getLeft());
      postOrder( node.getRight());
      System.out.print( node.getData()+" " );
    }
  }

  public static int maxInTree( BinaryTreeNode node ) {
    int max = Integer.MIN_VALUE;

    Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
    if ( node == null ) return max;
    BinaryTreeNode currentNode = node;
    boolean done = false;

    while (!done) {
      if ( currentNode != null) {
	s.push(currentNode);
	if ( currentNode.getData() > max )
	    max = currentNode.getData();
	currentNode = currentNode.left;
      }
      else {
	if ( s.isEmpty() )
	  done = true;
	else  {
          currentNode = s.pop();
	  currentNode = currentNode.right;
	}
      }
    }
    return max;
  }

  public static int maxInTreeRecursion( BinaryTreeNode node ) {
    int max = Integer.MIN_VALUE;

    if ( node != null ) {
      int maxLeft = maxInTreeRecursion( node.getLeft() );
      int maxRight = maxInTreeRecursion( node.getRight() );

      if ( maxLeft > maxRight)
	max = maxLeft;
      else
	max = maxRight;

      if ( node.getData() > max)
	max = node.getData();
    }

    return max;
  }

  public static boolean searchTreeRecursion( BinaryTreeNode node, int k ) {

    if ( node == null )
      return false;
    if ( node.getData() == k )
	return true;

    return ( searchTreeRecursion( node.left, k ) || searchTreeRecursion( node.right, k ));
  }

  public static boolean searchTree( BinaryTreeNode node, int k ) {
    int max = Integer.MIN_VALUE;
    boolean done = false;
    Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
    BinaryTreeNode currentNode = node;

    if ( currentNode == null ) return false;

    while ( !done ) {
      if ( currentNode != null ) {
	if ( currentNode.data == k ) return true;
	s.push(currentNode);
	currentNode = currentNode = currentNode.left;
      }
      else {
	if ( s.isEmpty() )
	  done = true;
	else  {
          currentNode = s.pop();
	  currentNode = currentNode.right;
	}
      }
    }
    return false;
  }


  public static BinaryTreeNode addNode( BinaryTreeNode node, int value ) {
    Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();

    if ( node == null ) node = new BinaryTreeNode(value);
    q.offer( node );

    while ( !q.isEmpty() ) {
      BinaryTreeNode tmpNode = q.poll();
      if ( tmpNode != null ) {
	if ( tmpNode.left != null )
	  q.offer(tmpNode.left);
	else {
	  tmpNode.left = new BinaryTreeNode(value);
	  return node;
	}
	if ( tmpNode.right != null )
	  q.offer(tmpNode.right);
	else {
	  tmpNode.right = new BinaryTreeNode(value);
	  return node;
	}
      }
    }

    return node;
  }

  public static void main(String ar[]) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode n2 = new BinaryTreeNode(2);
        BinaryTreeNode n3 = new BinaryTreeNode(3);
        BinaryTreeNode n4 = new BinaryTreeNode(4);
        BinaryTreeNode n5 = new BinaryTreeNode(5);
        BinaryTreeNode n6 = new BinaryTreeNode(6);
        BinaryTreeNode n7 = new BinaryTreeNode(7);

        root.addLeft(n2);
        root.addRight(n3);
        n2.addLeft(n4);
        n2.addRight(n5);
        n3.addLeft(n6);
        n3.addRight(n7);

        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.print("\nInOrder: ");
	inOrder(root);
	System.out.print("\nPostOrder: ");
	postOrder(root);


        System.out.println("\nMAx: " +maxInTree(root));

        System.out.println("\nRecursion MAx: " +maxInTreeRecursion(root));
        int n = 3;
        System.out.println("\nSearch for : "+n+" = "+searchTreeRecursion(root, n));

        BinaryTreeNode root2 = new BinaryTreeNode(1);
        addNode(root2, n);
        System.out.print("Add : "+n+" PreOrder: ");
        preOrder(root2);
        System.out.println("Done!");
  }



}