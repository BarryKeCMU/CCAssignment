class ListNode 
{  
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
}

public class Solution23
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
        
        deleteMiddle(n3);
        System.out.println(n1.val);
        System.out.println(n1.next.val);
        System.out.println(n1.next.next.val);
        System.out.println(n1.next.next.next.val);
        System.out.println(n1.next.next.next.next.val);
       
    }
    
    
    //assume n4 is given as a node in the middle of a linked list.
    public static void deleteMiddle(ListNode n)
    {
        ListNode temp1 = n;
        ListNode temp2 = n.next;
        
        n.val = temp2.val;
        n.next.val = temp1.val;
        
        n.next = n.next.next;   
    }    
}   