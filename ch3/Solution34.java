//Solution34.java

/**
*  This class uses two stacks to simulate a quete.
*
* @author Barry Ke
* @version: Last modified on September 26, 2015
*/

import java.util.*;

class Solution34
{
    public static Stack <Integer> oldStack = new Stack <Integer>();
    public static  Stack <Integer> newStack = new Stack <Integer>();
    
    
    public static  void push (int i)
    {
        oldStack.push(i);
    }    
    
    public static  void pop()
    {
        int number = oldStack.size();
        while (!oldStack.isEmpty())
        {
            newStack.push(oldStack.peek());
            oldStack.pop();
                    
        } 
        
        newStack.pop();
        
        while (!newStack.isEmpty())
        {
            oldStack.push(newStack.peek());
            newStack.pop();
        }             
    }
    
    public static int peek()
    {
        
        while (!oldStack.isEmpty())
        {
            newStack.push(oldStack.peek());
            oldStack.pop();        
        } 
        
        int peekNumber = newStack.peek();
        
        
        while (!newStack.isEmpty())
        {
            oldStack.push(newStack.peek());
            newStack.pop();
        }      
        return peekNumber;        
    }
    
    public static void main(String [] args)
    {
        Solution34 sl = new Solution34();
        sl.push(2);
        sl.push(1);
        sl.push(2);
        sl.push(3);
        System.out.println(sl.peek());
    }     
}