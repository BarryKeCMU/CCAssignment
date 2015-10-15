//Solution46.java

/**
*  This 
*
*  Notes: I did not know how to do it. I read the solution and understood the algorithm. I rewrote the codes by myself.
*         I will definitely go back and review this question again in the future.
*  
* @author Barry Ke
* @version: Last modified on October 13, 2015
*/

//Assume Node class already exists.

Node findSuccessor(Node n)
{
	if (n == null) return null;
	
	//if the node has a right child, then find the leftmost node in this right child.
	if (n.right != null)
	{
		return findLeftMost(n.right);
	}
	else
	{
		Node q = n;
		Node x = q.parent;
		
		//I memorized this while loop and I am still not sure the meaning of this part.
		while (x != null && x.left != q)
		{
			q = x;
			x = x.parent;
		}
		return x;
	}	
}

Node findLeftMost(Node n)
{
	//get into the right subtree and go to the left-most node. 
	if (n == null) return null;
	while (n.left != null)
	{
		n = n.left;
	}
	return n;
}