//Solution1011.java

/**
*  This class sorts an araray and rearrange all the elements in a "peak-to-valley" fashion.
*
*  Notes: I read the answer in the solution section. I understood it and wrote it by myself.
* 
* @author Barry Ke
* @version: Last modified on October 4, 2015
*/

import java.util.*;

class Solution1011
{
    public void searchPeakValley(int [] array)
    {
        Arrays.sort(array);
        
        for (int i = 1; i < array.length; i += 2)
        {
            swap(array, i-1, i);
        }
    }   
    
    public void swap(int [] array, int left, int right)
    {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    } 
}