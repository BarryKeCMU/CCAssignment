//Solution35.java

/**
*  This class sorts a stack and puts the minimum values on the top of the stack.
*
* @author Barry Ke
* @version: Last modified on September 26, 2015
*/

import java.util.*;

public class Solution35
{
    public static Stack<Integer> sortStack(Stack <Integer> stack)
    {
        Stack <Integer> tempStack = new Stack <Integer> ();
        int minValue = stack.peek();
        while (!stack.isEmpty())
        {
            if (minValue > stack.peek()) minValue = stack.peek();
            tempStack.push(stack.peek());
            stack.pop();
        }
        
        int counter = 0;
        while (!tempStack.isEmpty())
        {
            if (tempStack.peek() == minValue) 
            {
                counter++;
                tempStack.pop();
                continue;
            }
            stack.push(tempStack.peek());
            tempStack.pop();
        } 
        
        while (counter != 0)
        {
            stack.push(minValue);
            counter--;
        }
        
        return stack;
    }
    
    public static void main (String [] args)
    {
        Stack <Integer> stack = new Stack <Integer>();
        stack.push(4);  
        stack.push(3);
        stack.push(2);
        stack.push(1);    
        
        Stack <Integer> returnedStack = sortStack(stack);  
        System.out.println(returnedStack.peek());
    }
}