public class Solution14
{
	/**
	 * This method takes a string and decides if it is a permutation of a palindrome.
	 * 
	 * @param String input: the string to be tested for being a permutation of a palidrome.
	 * @return a boolean that shows whether the string is a permutation of a palindrome.
	 */
	
    public static boolean palinPermuted (String input)
    {
    
        //convert all the letters to lowercase
        String str = input.toLowerCase();
        
        int [] asciiArray = new int [128];
        
        //walk through the array to count the frequencies of each letter in the string
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) != ' ')
            {
                asciiArray[str.charAt(i)]++;
            }      
        }
        
        
        //walk through the asciiArray to check the frequencies of each character
        //if it is a palindrome permutation, there are only two possibilities:
        //1. the frequencies of all characters are even
        //2. there is only one character that appears once, and the variable ,"countFrequency", counts the 
        //frequency of this variable
        int countFrequency = 0;
        
        for (int i = 0; i < asciiArray.length; i++)
        {
                   
            if (countFrequency > 1) return false;
            
            System.out.println("number is " + i + "&&" + asciiArray[i]);
            if (asciiArray[i]%2 == 0) 
            {               
                continue;
            }
            
            else
            {
                countFrequency++;
                //System.out.println("asciiArray  " +asciiArray[i]);
                //System.out.println("countfrequency is " + countFrequency);
            }
        }
        return true;
    }
}



