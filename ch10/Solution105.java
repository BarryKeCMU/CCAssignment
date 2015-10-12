//Solution105.java

/**
*  This class performs a sparse search.
*  
*  Notes: I do not know how to do it. I read the solution and understood the algorithm. I rewrote the codes by myself.
*
* @author Barry Ke
* @version: Last modified on October 11, 2015
*/

class Solution105
{
    int search(String a[], String target, int first, int last)
    {
        if (first > last) return -1;
        int mid = (first + last)/2;
        
        //if the mid is an empty string, move mid to the closest non-empty string
        if (a[mid].isEmpty())
        {
            int left = mid - 1;
            int right = mid + 1;
             
            //traverse through the whole array with two pointers left and right until a non-empty string is found.
            while(true)
            {
                if (left < first || right > last) return -1;
                else if (right <= last && !a[right].isEmpty())
                {
                    mid = right;
                    break;
                }
                else if (left >= first && !a[left].isEmpty())
                {
                    mid = left;
                    break;
                }
                right++;
                left--; 
            }  
        }
        
        if (target.equals(a[mid]) return mid;
        //search the right part if the mid is lexicographically less than the target
        else if (a[mid].compareTo(target) < 0) return search(a, target, mid+1, last);
        //search the left part if the mid is lexicographically more than the target
        else return search(a, target, first, mid-1);       
    }
}

