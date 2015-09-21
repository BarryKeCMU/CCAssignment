//Solution24.java

/**
*  This class checks if a given linked list is a palindrome.
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

public class Solution26
{
    public static void main(String [] args)
    {
        ListNode n1 = new ListNode(1);    
        ListNode n2 = new ListNode(2);    
        ListNode n3 = new ListNode(3);   
        ListNode n4 = new ListNode(3); 
        ListNode n5 = new ListNode(3);  
        ListNode n6 = new ListNode(1);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null; 
        
        System.out.println("Is the given linked list a palindrome? " + isPalindrome(n1));
        
    }
    
    /**
     * This method checks if a given linked list is a palindrome.
     * 
     * @param ListNode n: the linked list to be checked
     * @return a boolean that indicates if the linked list is a palindrome or not.
     */ 
    public static boolean isPalindrome(ListNode n)
    {
        ListNode head = n;

        ListNode headReverse = insertFirst(n);
 
        while (head != null)
        {
            if (head.val != headReverse.val)
            { 
                return false;
            }
            //why does n work; but head works.
            head = head.next;
            headReverse = headReverse.next;
        } 
        
           
        return true;       
            
    }
    
    /**
     * This method arranges ListNode to be checked for a palindrome in reverse order
     * 
     * @param ListNode n: the first ListNode from the left at the given linked list
     * @return ListNode: the first ListNode from the left in reverse order
     */ 
    
    public static ListNode insertFirst(ListNode n)
    {   
        ListNode pre = null;
        
        while (n != null)
        {
            ListNode temp = new ListNode(n.val);
            temp.next = pre;
            pre = temp;
            n = n.next; 
        }      
        
        //return the headNode in the linked list in reverse order 
        return pre;    
    }
}