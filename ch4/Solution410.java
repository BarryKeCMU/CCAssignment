//Solution410.java

/**
*  This class checks if a smaller tree T2 is a subtree of a bigger tree T1.
*
*  Notes: I did not know how to do it. I read the solution and understood the algorithm. I rewrote the codes by myself.
*         I will definitely go back and review this question again in the future.
*  
* @author Barry Ke
* @version: Last modified on October 23, 2015
*/

boolean hasTree(Node t1, Node t2){
	if (t2 == null) return true;
	
	return findSubTree(t1, t2);
}

boolean findSubTree(Node t1, Node t2){
	if (t1 == null) return false;
	else if (t1.data == t2.data && match(t1, t2)) return true;
	//Use || here because either left part or right part may contain the subtree of t2.
	return ( findSubTree(t1.left, t2) || findSubTree(t1.right, t2) );
}

boolean match(Node t1, Node t2){
	//base case: when they both reach null at the same time
	if (t1 == null && t2 == null) return true;
	//two trees reach null at different time, which means they have different shape
	else if (t1 == null || t2 == null) return false;
	//two nodes have different numbers 
	else if (t1.data != t2.data) return false;
	//&& is used here because the left parts and the right parts of two trees should match exactly at the same time
	return (match(t1.left, t2.left) && match(t2.right, t2.right));		
}