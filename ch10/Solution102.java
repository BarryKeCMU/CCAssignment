//Solution102.java

/**
 * 	This class checks an array of strings so that all the anagrams are placed next to each other in the new array.
 * 
 *  Notes: I did not know how to do this problem because I am not familiar with HashMap. I read the solution and I understood it.
 *  I wrote down the codes by myself with the book closed.
 *
 * @author Barry Ke
 * @version: Last modified on October 2 , 2015
 */


import java.util.*;

class Solution102
{
  
    public static void checkAnagram(String [] array)
    {
        HashMap <String> hm = new HashMap<String>();
        
        for (String element: array)
        {
            hm.put(sortString(element), element);        
        }   
        
        int index = 0;
        for (String key: hm.keyset())
        {
            ArrayList <String> resultArray = hm.get(key);
            for (String element: resultArray)
            {
                array[index] = element;
                index++;
            }        
        }             
    }
    
    public static String sortString(String input)
    {
        char [] charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);        
    }   
}