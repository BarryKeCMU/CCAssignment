public class Solution12 
{
	/**
	 * This method will take two strings and decide if the first one is a permutation of the second one. 
	 * The algorithm behind the method is that I construct a so called "asciiArray" with the length of 128, and this array
	 * will store the frequency of each element in the ascii table. First of all, I compare the lengths of two strings.
	 * Then I count the number of characters in the first array in terms of its ascii index. For instance, if there 
	 * is a 'h' in the array, I increment one at the position
	 * of ['h'] in the asciiArray. Then, I walk through the second array and decrement the corresponding ascii value of each element
	 * in the array. If an integer value stored in the asciiArray becomes negative, the method will return a false, because 
	 * these two arrays are distinctive.  
	 * 
	 * @param String str1: the first string for the test
	 * @param String str2: the second string for the test
	 * @return a boolean that shows whether the second string is a permutation of the second string
	 */
	
    public static boolean isPermutation(String str1, String str2)
    {
        if (str1.length() != str2.length()) return false;
        
        int [] asciiArray = new int [128]; 
        
        for (int i = 0; i < str1.length(); i++)
        {
            asciiArray[str1.charAt(i)]++;
        }
        
        for (int i = 0; i < str2.length(); i++)
        {
            asciiArray[str2.charAt(i)]--;
            if (str2.charAt(i) < 0) 
            {
                return false;
            }
        }
        return true;
    }
}
}
