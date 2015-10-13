//Solution43.java

/**
*  This class creates a linked list of all the nodes at each level in a given binary tree.
*
*  Notes: I do not know how to do it. I read the solution and understood the algorithm. I rewrote the codes by myself.
*  
* @author Barry Ke
* @version: Last modified on October 13, 2015
*/

//lists is an ArrayList that holds different LinkedLists, and each LinkedList in the ArrayList holds Node.
//Assume the class Node has been built
//level starts at zero
//By the time when I finished this question, I for the most part understood the algorithm behind this question.
//But I am not sure why the solution in the book has the second part which only inputs one parameter. That is why
//I do not include it in this Solution43 file.
void createLinkedList(Node root, ArrayList<LinkedList<Node>> lists, int level)
{
	if (root == null) return;
	
	LinkedList <Node> list = null;
	
	if (lists.size() == level)
	{
		list = new LinkedList<Node>();
		lists.add(list);
	}
	else
	{
		list = lists.get(level);
	}
	
	list.add(root);
	createLinkedList(root.left, lists, level + 1);
	createLinkedList(root.right, lists, level + 1);
}
