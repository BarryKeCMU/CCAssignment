//Solution27.java

/**
*  This class takes in two linked lists and determines if they have an intersection.
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

public class Solution27
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
        
        /*
        The graph of two linked lists is shown below:
        
        n1 - n2 - n3(Intersection) - n4 - n5 - n6
                   |
                  n7
                   |
                  n8
                   |
                  n9
                  
        Two linked lists:
        1. n1 - n2 - n3 - n4 - n5 - n6
        2. n8 - n7 - n3 - n4 - n5 - n6
        */
        
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;
        
        n9.next = n8;
        n8.next = n7;
        n7.next = n3;
     
        System.out.println(hasIntersection (n1, n9));
    }
    
    /**
     * This method decides if two linked lists have an intersection.
     * 
     * @param ListNode n1: the first linked list to be tested
     * @param ListNode n2: the second linked list to be tested
     * @return a boolean value that indicates whether the two linked lists have an intersection
     */    
    public static boolean hasIntersection(ListNode n1, ListNode n2)
    {
        ListNode sizeNodeN1 = n1;
        ListNode sizeNodeN2 = n2;
        
        //get the sizes of two linked lists
        int size1 = 0;
        int size2 = 0;
        
        while (sizeNodeN1 != null)
        {
            size1++;
            sizeNodeN1 = sizeNodeN1.next;
        }   
        System.out.println("size1 " + size1);
        
        while (sizeNodeN2 != null)
        {
            size2++;
            sizeNodeN2 = sizeNodeN2. next;
        }
        
        System.out.println("size2 " + size2);
    
        //truncate the extra part
        if (size1 > size2)
        {
            for (int i = 0; i < (size1-size2); i++)
            {
                n1 = n1.next;
            }
        }

        else
        {
            for (int i = 0; i < (size2 - size1); i++)
            {
                n2 = n2.next;
            }
        }  
        
        while ((n1 != null)&&(n2 != null))
        {
            if (n1 ==  n2) return true;
            else{
                n1 = n1.next;
                n2 = n2.next;
            }  
        }
        return false;
    }       
}