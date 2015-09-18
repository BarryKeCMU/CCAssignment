public class Solution11 
{
	/**
	 * This method takes a string and a true value of the string length, then it replaces all the spaces in 
	 * the string with "%20" within the true length. 
	 * 
	 * @param char [] input: the array of characters
	 * @param int number: the true length of the string
	 * @return an array of characters after the replacement
	 */
	
    public static char[] changeString(char [] input, int number)
    {
        int countSpace = 0;
        
        for (int i = 0; i < number; i++)
        {
            if (input[i] == ' ') 
            {
                countSpace++;
            }
        }
        
        //need two variables: the first variable number keep tracks of the old array
        //the second variable "newnumber" keeps track of the expanded array
        int newNumber = number + countSpace * 2;
        
        number--;
        newNumber--;
        
        for (int i = number; i >= 0; i--)
        {
            if (input[i] != ' ')
            {
                input[newNumber] = input[i];
                newNumber--;
            }
            
            else
            {
                input[newNumber] = '0';
                input[newNumber-1] = '2';
                input[newNumber-2] = '%';
                newNumber -= 3;
            }
        }
               
        return input;
              
    }
    


}

