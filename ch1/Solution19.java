public class Solution19
{
	/**
	 * This method takes two strings and decides if the second string is a rotation of the first string.
	 * 
	 * @param String str1: the first string
	 * @param String str2: the second string 
	 * @return a boolean that shows whether the second string is a rotation of the first one.
	 */
    public static boolean isSubstring(String str1, String str2)
    {
        char [] charArray1 = str1.toCharArray();
        char [] charArray2 = str2.toCharArray();
        
        //sort two strings alphabetically for comparison
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        String str1Result = new String(charArray1);
        String str2Result = new String(charArray2);
        
        return (str1Result.contains(str2Result));
    }
}



