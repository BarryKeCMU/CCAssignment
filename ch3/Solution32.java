//Solution32.java

/**
*  This class describes a stack that as push, pop, min methods that all operate in O(1) time.
*  
*  Notes: I did not come up with the solution by myself. 
*  I found the solution here: https://leetcode.com/discuss/55278/simple-java-solution-using-two-stacks-in-o-1
*  I understood it and wrote it.
*
* @author Barry Ke
* @version: Last modified on September 24, 2015
*/
public class Solution32
{
    Stack <Integer> main = new Stack <Integer>();
    Stack <Integer> min = new Stack<Integer>();
    
    public void push(int value)
    {
        main.push(value);
        if (min.empty())
        {
            min.push(value);
        }
        
        else if (min.peek() > value)
        {
            min.push(value);
        }     
    }
    
    public int pop()
    {
        int value = main.pop();
        if (value == min.peek())
        {
            min.pop();
        } 
        return value;
    } 
    
    public int min()
    {
        int value = min.peek();
        return value;
    }     
}



