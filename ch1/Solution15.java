public class Solution15
{
	/**
	 * This method takes two strings and decide if they are one edit or zero edit away.
	 * 
	 * @param String str1: the first string
	 * @param String str2: the second string 
	 * @return a boolean that shows whether these two strings are one edit or zero edit away.
	 */
	
    public static boolean oneAway(String str1, String str2)
    {
        if ((str1.length() - str2.length() > 1) || (str1.length() - str2.length() < -1)) return false;
        
        //Assume str1.length() > str2.length(). When it is not, swap the first one with the second one.
        if (str2.length() > str1.length())
        {
            String temp  = str2;
            str2 = str1;
            str1 = temp;
        }
        
        int countDifference = 0;
        
        /*
         *When two strings are different in length, the method compares the characters in each string until the 
         *second-to-last character in the longer string, str1. By that time, if there is no difference, the
         *two strings tested are one edit away. It stops at the second-to-last character, because the last character
         *in str1 is only contained in str1, str2 does not contain it.
         */
        if (str1.length() != str2.length())
        {
            for (int i = 0; i < str1.length() - 1; i++)
            {
                if (countDifference > 1) return false;
                
                if (str1.charAt(i) == str2.charAt(i)) 
                {   
                    System.out.println(i + "  " + countDifference);
                    continue;
                }
                else countDifference++;
            }
        }
        /*
         *When two strings are same in length, the method compares characters in each string until the last characters
         *in each string.
         */
         
        else 
        {
            for (int i = 0; i < str1.length(); i++)
            {
                if (countDifference > 1) return false;
                
                if (str1.charAt(i) == str2.charAt(i)) continue;
                else 
                {     
                    countDifference++;
                }
            } 
        }
        return true;
    }

}



