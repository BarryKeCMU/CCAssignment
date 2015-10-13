//Solution42.java

/**
*  This class creates a binary search tree with minimum height for a given sorted array in increasing order
*
*  Notes: I do not know how to do it. I read the solution and understood the algorithm. I rewrote the codes by myself.
*  
* @author Barry Ke
* @version: Last modified on October 13, 2015
*/

//Assume the class Node has been built.
Node createMinimumBST(int [] a)
{
	return createMinimumBST(a, 0, a.length - 1);
}

//I did not understand the rationale behind this recursive algorithm until I drew a tree and walked through each step.
Node createMinimumBST(int [] a, int start, int end)
{
	if (end < start) return null; 
	
	int mid = (end + start) / 2;
	
	Node root = new Node( a[mid] );
	
	root.left = createMinimumBST(a, start, mid - 1);
	
	root.right = createMinimumBST(a, mid + 1, end);
	
	return root;
}