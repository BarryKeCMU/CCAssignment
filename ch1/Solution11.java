public class Solution11 
{
	/**
	 * This method will take a String input and test whether this String
	 * has all unique characters.
	 * 
	 * @param input: the string that will be tested for unique letters
	 * @return a boolean that shows whether the string tested has all unique characters
	 */
	public static boolean hasUnique(String input)
	{
		boolean hasUnique = true;
        
		
		for (int i = 0; i < input.length()-1; i++)
		{
			for (int y = i + 1; y < input.length(); y++)
			{
                if (input.charAt(i) == input.charAt(y))
                {
                	//assign hasUnique to "false" when repetitive characters are found.
				    hasUnique = false;
				}   
			}
		}	
        if (hasUnique == false) return false;
        else return true;        
	}  
}
