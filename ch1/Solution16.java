public class Solution16
{
	/**
	 * This method takes a string and compresses this string in a certain format. If the result string is not smaller than the original,
	 * the method outputs the original one.
	 * 
	 * @param String input: the string that will be compressed
	 * @return the compressed version of the string
	 */
	
    public static String compressString(String input)
    {
        input = input.toLowerCase() + " ";
        Character letter = input.charAt(0);
        String result = "";
        result +=letter;
        int countNum = 1;
        
        for (int i = 1; i < input.length(); i++)
        {
            if (input.charAt(i) != letter)
            {
                result += countNum;
                countNum = 1;
                letter = input.charAt(i);
                result += letter;
            }
            
            else 
            {
                countNum++;
            }
        }
        
        if (result.length() < input.length())
        {
            
            return ("The result string is smaller than the original.\nThe result is " + result+ ".");
        }
        
        else 
        {
            return ("The result string is not smaller than the original.\nThe original is " + input + ".");
        }
    }

}



