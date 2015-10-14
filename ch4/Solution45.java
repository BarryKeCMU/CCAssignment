//Solution45.java

/**
*  This class checks if a binary tree is a binary search tree.
*
*  Notes: I do not know how to do it. I read the solution and understood the algorithm. I rewrote the codes by myself.
*  
* @author Barry Ke
* @version: Last modified on October 13, 2015
*/

//Assume that the class Node exists.
//Assume there is no duplicate in the tree.
int i = 0;
void copyBST(Node root, int [] a)
{
	if (root = null) return;
	copyBST(root.left, a);
	a[i] = root.data;
	i++;
	copyBST(root.right, a);
}

boolean isBinary(Node root)
{
	int [] a = new int [root.size];
	copyBST(root, a);
	
	//time to check if the nodes in the array are in increasing order
	for (int i = 0; i < a.length - 1; i++)
	{
		if (a[i] >= a[i+1]) return false;
	}
	
	return true;
}
