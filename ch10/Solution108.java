//Solution108.java

/**
*  This checks an array with all the numbers from 1 to N, and prints all the duplicates in the array.
*  
*  Notes: I did not know the class of "BitSet()" so I looked at the solution. I understood it and wrote down the codes by myself.
*
* @author Barry Ke
* @version: Last modified on October 3, 2015
* Find the kth to last element
*/

//import the BitSet 
import java.util.*;

/**
 * This method checks if the array with the numbers from 1 to N has duplicated and if so prints the duplicates.
 * 
 * @param int [] array: the array to be checked for duplicates
 */
public static void checkDuplicates (int [] array)
{
	BitSet bit = new BitSet(32000);
	
	for (int i = 0; i < array.length; i++)
	{
		int num = array[i];
		int newNum = num - 1;
		
		if (bit.get(newNum))
		{
			System.out.println(newNum);
		}
		else 
		{
			bit.set(newNum);
		}
	}	
}

