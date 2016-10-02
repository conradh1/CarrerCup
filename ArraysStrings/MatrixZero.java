import java.util.*;

/*
Carrer Cup question 1.4 question p 74 solution p 175
Replace spaces with %20

*/
class MatrixZero
{

   public static int[][]  setZeros(int[][] matrix) {
    LinkedHashMap<Integer,Integer> myhash = new LinkedHashMap<Integer,Integer>();

    for ( int i = 0; i < matrix.length; i++) {
      for ( int j = 0; j < matrix[i].length; j++) {
	if ( matrix[i][j] == 0 )  {
	  myhash.put(i,j);
	}
      }
    }


    Set<Integer> keys = myhash.keySet();

    for (Integer c : keys) {
      int x = c;
      int y = myhash.get(c);

      for ( int i = 0; i < matrix.length; i++) {
	matrix[x][i] = 0;
      }
      for ( int j = 0; j < matrix[x].length; j++) {
	matrix[j][y] = 0;
      }
    }
    return matrix;
   }

public final static void main(String S[]) {
    int[][] matrix = new int[][]{
	{ 1, 4, 6, 1, 6  },
	{ 2, 0, 7, 8, 9  },
	{ 3, 6, 1, 3 ,0  },
	{ 3, 6, 1, 3 ,1  },
	{ 3, 6, 1, 3 ,1  }
      };
    int [][] matrix2 = setZeros(matrix);
    for ( int i = 0; i < matrix.length; i++) {
      for ( int j = 0; j < matrix[i].length; j++) {
	  System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }


  }
}
