//Solution17.java

/**
*  This class takes in a matrix and rotates the matrix clockwise by 90 degree.
*
* @author Barry Ke
* @version: Last modified on September 21, 2015
*/

import java.util.*;

public class Solution17
{
    public static void main(String [] args)
    {
        int [][] matrix = {{4,5,6},
                           {1,4,6},
                           {3,4,9}};
                           
        rotate(matrix);
        
    }
    
    /**
     * This method rotates a matrix clockwise by 90 degree.
     * 
     * @param int [][] matrix: the matrix to be rotated
     */
    public static void rotate(int [][] matrix)
    {
        int temp = 0;
        
        //rotate the first row with the last row, second row with the second last row etc.
        for (int row = 0; row < matrix.length/2; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                temp = matrix[row][col];
                matrix[row][col] = matrix[matrix.length - 1 - row][col];
                matrix[matrix.length - 1 - row][col] = temp;                                          
            }         
        }
        
        System.out.println(Arrays.deepToString(matrix));
        
        //rotate the numbers along the diagonal
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = row; col < matrix[0].length; col++)
            {
                temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;                
            }
        }
        System.out.println(Arrays.deepToString(matrix));

    }
}