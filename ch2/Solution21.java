public class Solution21
{
	/**
	 * This method takes a linked list and deletes the duplicate elements inside
	 * Note: I did not know Hashset, so I heavily referred to the answers in the book and figured out the solution.
	 * 
	 * @param Node n: the first node in the linked list 
	 */
    public static void deleteDups(Node n)
    {
        Hashset <Integer> set = new Hashset<Integer>();
        
        Node previous = null;
        
        while(n != null)
        {
	        if (set.contains(n.data))
	        {
	            previous.next = n.next; //skip the current one    
	        }
	        
	        else 
	        {
	            set.add(n.data);
	            previous = n;
	        }
	        
	        n = n.next; //traverse through the linked list.
    	}
    }
}



