//Solution27.java

/**
*  This class takes a circular linked list and returns the node where the cycle begins. If it does not contain a circular
*  linked list, it returns null.
*  
*  Note: I could not think of the solution. I found the solution at LeetCode (//https://leetcode.com/problems/linked-list-cycle-ii/)
*
* @author Barry Ke
* @version: Last modified on September 21, 2015
*/



class ListNode 
{  
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
}

public class Solution28
{
    public static void main(String [] args)
    {
        ListNode n1 = new ListNode(1);    
        ListNode n2 = new ListNode(2);    
        ListNode n3 = new ListNode(3);   
        ListNode n4 = new ListNode(4); 
        ListNode n5 = new ListNode(5);  
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);
        ListNode n9 = new ListNode(9);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n3;
        
        /*
        The circular linked list looks like:
        
        1 - 2 - 3 - 4 - 5
               /         \
              9 - 8 - 7 - 6        
        */
        
        ListNode startPoint = getNode(n1);
        System.out.println(startPoint.val);
    
    }   

    /**
     * This method returns the node where the cycle begins. If it does not have a cycle,
     * it returns null.
     * 
     * @param ListNode n: the first node of the linked list to be tested
     * @return ListNode: the node where the cycle begins
     */
    public static ListNode getNode(ListNode n)
    {           
        //create a fast node that traverses 2 nodes per time unit and a slow node that traverses 
        //1 node per time unit
        ListNode fast = n;
        ListNode slow = n;
        
        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            
            if (fast == slow)
            {
               slow = n;
                
                while (fast != slow)
                {
                    if (fast != slow)
                    {
                        fast = fast.next;
                        slow = slow.next;
                    }
                }
                
                return fast;                
            }    
        }  
        return null;
    }   
}