//Solution25.java

/**
*  This class sums up two numbers represented by two linked lists (in reverse order) and returns a linked list that
*  represents the sum (also in reverse order).
*
* @author Barry Ke
* @version: Last modified on September 23, 2015
*/
class ListNode 
{  
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
}

class SumList
{
    public static void main(String[]args)
    {
        
        ListNode n7 = new ListNode(7);
        ListNode n1 = new ListNode(1);
        ListNode n6 = new ListNode(6);
        n7.next = n1;
        n1.next = n6;
        System.out.print(n7.val);
        System.out.print(n7.next.val);
        System.out.println(n7.next.next.val);   
        
        ListNode n5 = new ListNode(5);
        ListNode n9 = new ListNode(9);
        ListNode n2 = new ListNode(2);
        n5.next = n9;
        n9.next = n2;
        
        
        System.out.print(n5.val);
        System.out.print(n5.next.val);
        System.out.println(n5.next.next.val);
        
        System.out.println("The sum is " + returnSum(n7, n5).val);
        System.out.println("The sum is " + returnSum(n7, n5).next.val);
        System.out.println("The sum is " + returnSum(n7, n5).next.next.val);        
    }
      
    /**
     * This method returns a list node that represents the sum of two linked lists
     * 
     * @param ListNode n1: the first node in the first linked list
     * @param ListNode n2: the first node in the second linked list 
     */
    public static ListNode returnSum(ListNode n1, ListNode n2)
    {
        //n1 = 7 - 1 - 6
        //n2 = 5 - 9 - 2
        
        int carry = 0;
        
        ListNode headPointer = new ListNode(0);
        ListNode result = headPointer;
        
        while (n1 != null || n2 != null)
        {
            int a = 0;
            if (n1 != null)
            {
                a = n1.val;
            }
            
            int b = 0;
            if(n2 != null)
            {
                b = n2.val;
            }
            
            int sum = (a + b + carry);
            result.next = new ListNode(sum % 10);
            result = result.next;
            carry = sum / 10;
            
            if (n1 != null) n1 = n1.next;
            if (n2 != null) n2 = n2.next;
        }  
        
        if (carry > 0)
        {
            result.next = new ListNode(carry);
        }
        
        return headPointer.next;
        
    } 
}