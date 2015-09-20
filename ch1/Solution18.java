public class Solution18
{
	/**
	 * This method takes a matrix. If there is a zero in the matrix, its entire column and row 
	 * are set to zero.
	 * 
	 * @param int [][] array: the matrix that will be changed into a zero matrix
	 */
	
    public static void zeroMatrix(int [][] array)
    {
        //create two arrays to track if a row has zeros and if a column has zeros
        boolean [] colStatus = new boolean [array[0].length];
        boolean [] rowStatus = new boolean [array.length];        
        
        //walk through the whole matrix to find the spot with the value of zero.
        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[0].length; col++)
            {
                if (array[row][col] == 0)
                {
                    colStatus[col] = true;
                    rowStatus[row] = true;  
                }
            }
        }
                 
        //Go through colStatus and rowStatus. If colStatus[0] is true, set all the numbers in the first
        //column to be zero, etc.
        for (int i = 0; i < array[0].length; i++)
        {
            if (colStatus[i] == true)
            {
                for (int row = 0; row < array.length; row++)
                {
                    array[row][i] = 0;
                }
            }
        }
        
        for (int i = 0; i < array.length; i++)
        {
            if (rowStatus[i] == true)
            {
                for (int col = 0; col < array[0].length; col++)
                {
                    array[i][col] = 0;
                }
            }
        }
    }

}



