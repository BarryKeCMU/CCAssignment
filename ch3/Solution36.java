//Solution36.java

/**
*  This class simulates a queue that holds the objects of dogs and cats.
*
*  Note: I looked at the solution in the book. I understood it and wrote down the codes by myself. I did not understand the abstract 
*  class Animal that well, so I heavily referred to the abstract class Animal in the solution.
*  
* @author Barry Ke
* @version: Last modified on September 27, 2015
*/

import java.util.*;

abstract class Animal
{
    private int order;
    protected String name;
    public Animal(String name)
    {
        this.name = name;
    }
    public void setOrder(int order)
    {
        this.order = order;
    }
    public int getOrder()
    {
        return order;
    }
    
    public boolean isOlderThan(Animal a)
    {
        return this.getOrder() < a.getOrder();
    }
}

public Dogs extends Animal
{
    public Dogs(String name)
    {
        super(name);
    }
}

public Cats extends Animal
{
    public Cats(String name)
    {
        super(name);
    }
}

class Solution36
{
    LinkedList <Dogs> dogs = new LinkedList <Dogs>();
    LinkedList <Cats> cats = new LinkedList <Cats>();
    private order = 0;
    
    public void enqueue(Animal a) 
    {
        a.setOrder(order);        
        
        if (a instanceof Dogs) dogs.addLast(a);
        else if (a instance Cats) cats.addLast(a);
        
        order++;
    }
    
    public Animal dequeueAny()
    {
        if (dogs.size()==0) return cats.poll();
        else if (cats.size()==0) return dogs.poll();
        else //when both of them are empty
        {
            return null;
        }     
    
        Dogs returnedDogs = dogs.peek();
        Cats returnedCats = cats.peek();
        
        if (returnedDogs.isOlderThan(returnedCats)) return dogs.poll();
        else return cats.poll();    
    }
    
    public Dogs dequeueDog()
    {
        return dogs.poll();
    }
    
    public Cats dequeueCat()
    {
        return cats.poll();
    }
}