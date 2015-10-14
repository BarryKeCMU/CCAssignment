//Solution44.java

/**
*  This class implements a function to track if a binary tree is balanced.
*
*  Notes: I do not know how to do it. I read the solution and understood the algorithm. I rewrote the codes by myself.
*  
* @author Barry Ke
* @version: Last modified on October 13, 2015
*/


//Assume the class Node has been created.
int getHeight(Node root)
{
	if (root == null) return 0;
	return Math.max(getHeight(root.left), getHeight(root.right)) + 1;	
}

boolean isBalanced(Node root)
{
	if (root = null) return true;
	
	int difference = Math.abs(getHeight(root.left) - getHeight(root.right));
	
	if (difference > 1) return false;
	/*
	  For this else part, I had "return true" but I looked at the solution, and I figured out why I was wrong.
	  I have to look at the left part specifically because even though the heigh difference between two subtrees is less than
	  1, it is still possible that the left subtree is not balanced.
	*/
	else return isBalanced(root.left) && isBalanced(root.right);
}