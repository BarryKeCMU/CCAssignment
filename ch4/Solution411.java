//Solution411.java

/**
*  Given a tree constructed by the user, the class gets a random Node in the tree and returns this Node. 
*
*  Notes: I did not know how to do it. I read the solution and understood the algorithm. I rewrote the codes by myself.
*         I will definitely go back and review this question again in the future.
*  
* @author Barry Ke
* @version: Last modified on October 23, 2015
*/

class Node{
	private int data;
	private int size = 0;
	private Node leftNode;
	private Node rightNode;
	
	public Node(int d){
		data = d;
		size = 1;
	}
	
	/**
	 * This method selects a random Node in the given binary tree and returns this Node. 
	 * 
	 * @return the random node that gets chosen
	 */	
	public Node getRandomNode(){
		/*
		 * The notion behind the leftSize is to divide the tree into three parts: left, middle and right. Each of them has
		 * the equal probability of being chosen. 
		 */
		int leftSize = left == null? 0 : left.size;
		
		//gnerate a random number to decide if it is to pick the left, the middle or the right
		Random random = new Random();
		
		int randomNumber = random.nextInt(size);
		
		if(randomNumber < leftSize) return left.getRandomNode();
		else if (randomNumber == leftSize) return this;
		else return right.getRandomNode();
	}
	
	/**
	 * The method inserts a number to the tree follwing the rules of a binary search tree.
	 * 
	 * @param int d: a number that will be added to the current tree
	 */
	public void insertNode(int d){
		if (d <= data){
			if (this.leftNode == null) {
				this.leftNode = new Node(d);
			} else {
				leftNode.inserNode(d);
			}
		}
		else {
			if (this.rightNode == null){
				this.rightNode = new Node(d);
			} else {
				rightNode.insertNode(d);
			}
		}
		size++;
	}
	
	/**
	 * This method finds a Node that the user wants in the given tree. 
	 * 
	 * @param int d: the number of the Node that is to be found
	 * @return the Node that is to be found
	 */
	public Node findNode(int d){
		if (d == data) return this;
		else if (d < data){
			if (leftNode == null) return null;
			else return leftNode.findNode(d);
		} else if (d > data) {
			if (rightNode == null) return null;
			else if return rightNode.findNode(d);
		}
		return null;
	}
}