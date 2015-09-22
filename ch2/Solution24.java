//Solution24.java

/**
*  This class sorts a linked list in a certain fashion: given a value of x, all the nodes with the values less than x are placed
*  to the left of x and all the nodes with the values greater than x are placed to the right of x.
*
* @author Barry Ke
* @version: Last modified on September 20, 2015
*/

class ListNode 
{  
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
}

public class Solution24
{
    public static void main(String [] args)
    {
        ListNode n1 = new ListNode(3);    
        ListNode n2 = new ListNode(5);    
        ListNode n3 = new ListNode(8);   
        ListNode n4 = new ListNode(5); 
        ListNode n5 = new ListNode(10);  
        ListNode n6 = new ListNode(2);
        ListNode n7 = new ListNode(1);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;  
        n7.next = null;
        
        ListNode newNode = partition(n1, 5);
        
        while (newNode != null)
        {
            System.out.println(newNode.val);
            newNode = newNode.next;
        }
        
        
    }
    
    /**
     * This method sorts the linked list
     * 
     * @param ListNode n: the first node in a linked list
     * @param int x: a value that the partition depends on
     * @return the first node in the sorted linked list
     */   
    public static ListNode partition(ListNode n, int x)
    {    
        ListNode lessX = new ListNode(0);
        ListNode moreX = new ListNode(0);
        
        ListNode pointLessX = lessX;
        ListNode pointMoreX = moreX;
        
        while (n != null)
        {
            if (n.val < x)
            {
       
                pointLessX.next = n;
                pointLessX = pointLessX.next;
            } 
            
            else if (n.val >= x)
            {
                
                pointMoreX.next = n;
                pointMoreX = pointMoreX.next;
            }
            
            n = n.next;     
        }   
        
        pointLessX.next = moreX.next;
        pointMoreX.next = null;
        return lessX.next;

    }
}
    