//Solution33.java

/**
*  This class simulates a stack of plates. If a stack gets filled, there will be another stack created to
*  hold the rest of plates.
*  
*  Notes: I did not come up with the solution by myself. 
*  I referred to the solution here: https://codesolutiony.wordpress.com/2014/12/30/3-3-set-of-stacks/
*                                   https://leetcode.com/discuss/49181/stack-of-plates
*  I understood it and wrote it.
*
* @author Barry Ke
* @version: Last modified on September 26, 2015
*/

import java.util.*;

public class Solution33
{
    public static ArrayList <Stack> sets = new ArrayList <Stack>();
    public static int counter, capacity, numOfStacks;
    
    public SetOfStacks(int capacity)
    {
        this.capacity = capacity;
        counter = 0;
        numOfStacks = 0;
    }

    public void push (int i)
    {
        for (int i = 0; i< sets.size(); i++)
        {
            if (sets.get(i).size() != capacity)
            {
                sets.get(i).push(i);
                return;                     
            }
  
        }   
        Stack <Interger> stack = new Stack <> ();
        stack.push(i);
        sets.add(stack);                
    }   
    
    public void pop()
    {
        if (sets.size() == 0){}
        else
        {
            sets.get(sets.size()-1).pop();
            
            if (sets.get(sets.size()-1).size()==0) sets.remove(sets.get(sets.size()-1));
        }
    }
 
}
