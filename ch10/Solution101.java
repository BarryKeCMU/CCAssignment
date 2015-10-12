//Solution101.java

/**
*  This class merges array B into array A; array A has enough buffer to hold array B. 
*
* @author Barry Ke
* @version: Last modified on September 27, 2015
* Find the kth to last element
*/


public class Solution101
{
    public static void main(String [] args)
    {
        int [] arrayA = new int [5];
        int [] arrayB = new int [3];
        
        arrayA[0] = 1;
        arrayA[1] = 2;
        arrayA[2] = 4;
        
        arrayB[0] = 5;
        arrayB[1] = 6;
        arrayB[2] = 8;        
    }
    
    public static void sortedMerge (int [] arrayA, int [] arrayB, int indexA, int indexB)
    {
        int mergeIndex = indexA + indexB + 1;
        
        while (indexB != 0 && indexA != 0)
        {
            if (arrayA[indexA] > arrayB[indexB])
            {
                arrayA[mergeIndex] = arrayA[indexA];
                indexA--;
            }
            
            else
            {
                arrayA[mergeIndex] = arrayB[indexB];
                indexB--;
            }
            mergeIndex--;
        }     
    }   
}