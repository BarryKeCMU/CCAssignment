//Solution31.java

/**
*  This class uses an ArrayList to simulate an array with three stacks.
*
* @author Barry Ke
* @version: Last modified on September 27, 2015
* Find the kth to last element
*/

import java.util.*;

class Solution31
{
    public static List <List> arrayStack = new ArrayList<>();
    public static List <Integer> stack1 = new ArrayList<Integer>();
    public static List <Integer> stack2 = new ArrayList<Integer>();
    public static List <Integer> stack3 = new ArrayList<Integer>();

    public Solution31()
    {
        arrayStack.add(stack1);
        arrayStack.add(stack2);
        arrayStack.add(stack3);
    }
    
    public void push(int index, int data)
    {
        if (index == 0) arrayStack.get(0).add(data);    
        else if (index == 1) arrayStack.get(1).add(data);
        else if (index == 2) arrayStack.get(2).add(data);
        else return;        
    }
    
    public int peek (int index)
    {
        if (index == 0) 
        {
            return (Integer) arrayStack.get(index).get(arrayStack.get(0).size()-1);
        }
        else if (index == 1)
        {
            return (Integer) arrayStack.get(index).get(arrayStack.get(0).size()-1);
        }
        else if (index == 2) 
        {
            return (Integer) arrayStack.get(index).get(arrayStack.get(0).size()-1);
        }
        else
        {
            return -999;
        }
    }    
    
    public void pop(int index)
    {
        if (index == 0) 
        {
            arrayStack.get(index).remove(arrayStack.get(0).size()-1);
        }
        else if (index == 1)
        {
            arrayStack.get(index).remove(arrayStack.get(0).size()-1);
        }
        else if (index == 2) 
        {
            arrayStack.get(index).remove(arrayStack.get(0).size()-1);
        }
        else
        {
            return;
        }
    }
    
    public boolean empty(int index)
    {
        if (index == 0) 
        {
            return arrayStack.get(index).isEmpty();
        }
        else if (index == 1)
        {
            return arrayStack.get(index).isEmpty();
        }
        else if (index == 2) 
        {
            return arrayStack.get(index).isEmpty();
        }
        else
        {
            return true;
        }
    }
    
    public static void main(String [] args)
    {
        Solution31 sl = new Solution31();
        sl.push(0,1);
        sl.push(0,2);
        sl.push(0,3);
        System.out.println(sl.peek(0));
        sl.pop(0);
        System.out.println(sl.peek(0));
        System.out.println(sl.empty(4));
    }
}

