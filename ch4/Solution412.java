//Solution412.java

/**
*  Given a target value, this class traverses a binary tree and finds a route that sums to the target value.
*
*  Notes: I did not know how to do it. I read the solution and understood the algorithm. I rewrote the codes by myself.
*         I will definitely go back and review this question again in the future.
*  
* @author Barry Ke
* @version: Last modified on October 23, 2015
*/

int countTotalPaths(Node root, int target){
	if (root == null) return 0;
	
	/*
	 * This recursion part consists of three segments, and they all together make sure each node in 
	 * the tree would become a root of its corresponding subtree.
	 */
	int totalPathsFromRoot = countFromRoot(root, target, 0);
			
	int totalPathsFromLeft = countTotalPaths(root.left, target);
	
	int totalPathsFromRight = countTotalPaths(root.right, target);
	
	return totalPathsFromRoot + totalPathsFromLeft + totalPathsFromRight;
}

int countFromRoot(Node root, int target, int currentSum){
	if (root == null) return 0;
	
	currentSum += root.data;
	
	int totalPaths = 0;
	
	if (target == currentSum){
		totalPaths++;
	}
	
	totalPaths = countFromRoot(root.left, target, currentSum);
	totalPaths = countFromRoot(root.right, target, currentSum);
	
	return totalPaths;
}