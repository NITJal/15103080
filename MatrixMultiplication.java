/*   :Multiplication of two Matrix:
 * 
 * This take two matrix from user as input
 * Output multiplication of them if possible
 */


package Assignment_1;

import java.util.Scanner;

class MatrixMultiplication
{
   public static void main(String args[])
   {
      int m, n, p, q, sum = 0;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of first matrix:");
      m = in.nextInt();
      n = in.nextInt();
 
      int first[][] = new int[m][n];
 
      System.out.println("Enter the elements of first matrix:");
 
      for (int row = 0 ; row < m ; row++ )
         for (int col = 0 ; col < n ; col++ )
            first[row][col] = in.nextInt();
 
      System.out.println("Enter the number of rows and columns of second matrix:");
      p = in.nextInt();
      q = in.nextInt();
 
      if ( n != p )
         System.out.println("Matrices with entered orders can't be multiplied with each other.");
      else
      {
         int second[][] = new int[p][q];
         int multiply[][] = new int[m][q];
 
         System.out.println("Enter the elements of second matrix:");
 
         for (int row = 0 ; row < p ; row++ )
            for (int col = 0 ; col < q ; col++ )
               second[row][col] = in.nextInt();
 
         for (int row = 0 ; row < m ; row++ )
         {
            for (int col = 0 ; col < q ; col++ )
            {   
               for (int k = 0 ; k < p ; k++ )
               {
                  sum = sum + first[row][k]*second[k][col];
               }
 
               multiply[row][col] = sum;
               sum = 0;
            }
         }
 
         System.out.println("Product of entered matrices:-");
 
         for (int row = 0 ; row < m ; row++ )
         {
            for (int col = 0 ; col < q ; col++ )
               System.out.print(multiply[row][col]+"\t");
 
            System.out.print("\n");
         }
      }
   }
}