//Solution110.java

/**
*  Question 10.10 in chapter 10
*  
*  Notes: I do not know about binary tree very well, so I watched videos on Youtube then I checked the solution section in the book.
*  I understood the rationales then I wrote the codes.
*
* @author Barry Ke
* @version: Last modified on October 3, 2015
*/

class Solution110
{
    protected root = null;  
    
	/**
	 * This method is called each time when each number is created
	 * 
	 * @param int x: the number that will be wrapped in a RankNode
	 */
    public void track (int x)
    {
        if (root == null) root = new RankNode(x);
        else 
        {
            root.insert(x);
        }
    }
    
    public class RankNode
    {
        protected int left_size = 0;
        protected RankNode left;
        protected RankNode right;
        protected int data = 0;
        protected RankNode(int d)
        {
            data = d;
        }           
    }
    
	/**
	 * This method inserts a node
	 * 
	 * @param int x: a number that will be wrapped in a node; this node will be inserted to the tree later.
	 */
    public void insert(int x)
    {
        if {x > data)
        {
            if (right != null) right.insert(x);
            else 
            {
                right = new RankNode(x);
            }
        }   
        
        else
        {
            if (left != null) left.insert(x);
            else
            {
                left = new RankNode(x);
            }
            left_size++; //I missed this line when I first wrote it. Made it up after I checked the solution.
        }
    }
    
	/**
	 * This method gets the rank of an input number.
	 * 
	 * @param  int d: the method will get the rank of this number
	 * @return  the rank of the input number
	 */        
    public int getRank(int d)
    {
        if (d < data)
        {
            if (left != null) left.getRank(d);
            else return -1;
        }
        
        else if (d == data) 
        {
            return left_size; 
        }
        
        else
        {
            int right_size = 0;
            if (right != null) 
            {
                right_size = right.getRank(d);
            }
            else right_size = -1;
            
            if (right_size == -1) return -1;
            else return (right_size + 1 + left_size); 
                             
        }
    }
    
	/**
	 * The method gets the rank of the input number
	 * 
	 * @param  int d: the method will return the rank of this number
	 * @return  the rank of the input number
	 */ 
    public int getRankNumber(int d)
    {
        return root.getRank(d);
    }
}