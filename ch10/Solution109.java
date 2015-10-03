//Solution109.java

/**
*  This class finds an element in a sorted M * N matrix
*
*  Notes: I looked at the solution in the book. I understood the algorithm and wrote the codes by myself.
*  
* @author Barry Ke
* @version: Last modified on October 3, 2015
*/


public class Solution109
{
	
	/**
	 * This method finds an element in a sorted M * N matrix
	 * 
	 * @param int [][] matrix: a M * N matrix that may contain a number that the user is going to search
	 * @param int target: a number that the user is going to search
	 */
    public boolean searchInt(int [][] matrix, int target)
    {
        int row = 0;
        int col = matrix[0].length - 1;
        
        while (row < matrix.length && col >= 0)
        {
            if (matrix[row][col] == target) return true;
            
            if (matrix[row][col] > target) col--;
            else if (matrix[row][col] < target) row++;        
        }
        return false;
    }
}