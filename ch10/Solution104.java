//Solution104.java

/**
*  This class searchs an integer in a sorted array with only positive integers; this array lacks a size method.
*
*  Notes: I looked at the solution in the book. I understood the algorithm and wrote the codes by myself.
*  
*  
* @author Barry Ke
* @version: Last modified on October 4, 2015
*/

public int expandArray(Listly list, int target)
{
	int index = 1;
	while (list.elementAt(index) < target && list.elementAt(index) != -1)
	{
		index *= 2;		
	}
	return binarySearch(list, target, index/2, index)
}

public int binarySearch(Listy list, int target, int low, int high)
{
	
	while(low <= high)
	{
		int mid = (low + high) / 2;
		
		if (value < list.elementAt(mid) || list.elementAt(mid) == -1) //both conditions mean that the index of target value is 
			                                                          //still to the left of the mid
		{
			high = mid - 1;
		}
		else if (value > list.elementAt(mid))
		{
			low = mid + 1;
		}
		else
		{
			return mid;
		}
	}
	//if we cannot find the index of the target value, it means the target value does not exist in the list. It returns -1.
	return -1;
}