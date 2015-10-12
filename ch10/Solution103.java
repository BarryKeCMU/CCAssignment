//Solution103.java

/**
*  This class performs a search in a rotated array
*
*  Notes: I do not know how to do it. I read the solution and understood the algorithm. I rewrote the codes by myself.
*  
* @author Barry Ke
* @version: Last modified on October 11, 2015
*/


class Solution103
{   
    int search(int a[], int left, int right, int target)
    {
        int mid = (left + right)/2;
        if (a[mid] == target) return mid;
        if (right < left) return -1;
    }   
    
    //search the left part when the left part is normally ordered
    if (a[left] < a[mid])
    {
        //search the left part
        if (target > a[left] && target < a[mid]) return search(a, left, mid-1, target);
        //search the right part
        else return search(a, mid+1, right, target);
    }
    
    else if (a[mid] < a[right])
    {
        //search the right part; it is important to make sure target could be smaller or equal to the rightmost number
        if (target <= a[right] && target > a[mid]) search(a, mid+1, right, target); 
        else return search(a, left, mid-1, target);
    }
    
    //when it is the special case where the leftmost number is equal to the mid number
    else
    {   
        //search the right part
        if (a[right] != a[mid]) return search(a, mid+1, right, target);
        //search both the left part and the right part
        else  
        {
            //search the left part first
            int result = search(a, left, mid-1, target);    
            //do not find the number in the left part
            if (result == -1) result = search(a, mid+1, right, target);
            return result;
        }
    }
}




