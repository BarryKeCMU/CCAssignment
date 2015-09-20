//Solution22.java

/**
*  This class finds the kth to last element in a singly linked list
*
* @author Barry Ke
* @version: Last modified on September 20, 2015
* Find the kth to last element
*/
class ListNode 
{  
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
}

public class ReturnKth
{
    public static void main(String [] args)
    {
        ListNode n1 = new ListNode(1);    
        ListNode n2 = new ListNode(2);    
        ListNode n3 = new ListNode(3);   
        ListNode n4 = new ListNode(4); 
        ListNode n5 = new ListNode(5);  
        ListNode n6 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;
        
        System.out.println(n5.val);
        System.out.println(n5.next.val);
        returnKth(n1, 10);
        
    }
     
    /**
     * This class prints out the kth to last element in a singly linked list
     * 
     * @param ListNode n: the first Node in a linked list
     * @param int k: the number represents the kth to last element 
     */
    public static void returnKth(ListNode n, int k)
    {
        ListNode temp = n;
        int track = k;
        
        for (int i = 0; i < k; i++)
        {
            temp = temp.next;
            track--;
            if ( temp == null && track!= 0) 
            {
                System.out.println("k is out of the bound.");
                return;
            }
        }
        
        while(temp != null)
        {
            n = n.next;
            temp = temp.next;               
        }         
    }  
}