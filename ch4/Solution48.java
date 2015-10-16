//Solution48.java

/**
*  This class finds the first common ancestor of two nodes in a binary tree. 
*
*  Notes: I did not know how to do it. I read the solution and understood the algorithm. I rewrote the codes by myself.
*         I will definitely go back and review this question again in the future.
*  
* @author Barry Ke
* @version: Last modified on October 15, 2015
*/

/**
 * This method returns the first common ancestor Node of two Nodes
 * 
 * @param Node p: the first Node
 * @param Node q: the secodn Node 
 * @return the first ancestor Node
 */
//Assume the class Node already exists
Node findAnces(Node p, Node q)
{
	if (p == q) return null;
	
	Node ancestor = p;
	
	while (ancestor != null){
		if(isOnPath(ancestor, q)){
			return ancestor;
		}
		else{
			ancestor = ancestor.parent;
		}
	}
	return null;
}

/**
 * This method takes two Nodes and decide if they are on the same path within a tree.
 * 
 * @param Node ancestor: the first Node
 * @param Node q: the secodn Node
 * @return a boolean value that shows whether the first Node and the second Node are on the same path within the given tree
 */
boolean isOnPath(Node ancestor, Node q)
{
	while (ancestor != q && q != null){
		q = q.parent;		
	}
	return q == ancestor;		
}