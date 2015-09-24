//Solution31.java

/**
*  Description: I will use an ArrayList to implement three stacks. I choose ArrayList because it can be dynamically expanded so I do 
*  not have to worry about the size of the three stacks. Also, if I want to push an element, number 3 to the second stack for 
*  instance, I only need to know the pointer2 and add the number at the index of (pointer2+1). At the same time, update
*  the pointer3. If it is at the pointer1, I will need to update the pointer2 and the pointer 3. 
*  
*  The ArrayList that I will implement is shown below:
*  
*  |-----------|-----------|-----------|
*     stack1    pointer1  stack2  pointer2  stack3  pointer3
*     
*  pointer1: keeps track of the first stack; it is an index number
*  pointer2: keeps track of the second stack; it is an index number
*  pointer3: keeps track of the third stack; it is an index number; it equals ArrayList.size()-1
*  
*  For instance, if 3 is inserted to the first stack and 2 is inserted to the second stack, the ArrayList becomes like this:
*  |1|2||
*  pointer1: updated to 0;
*  pointer2: updated to 1;
*  pointer3: equals to ArrayList.size()-1, which is 1 in this case;
*  
*  
*
*
*
*
*
*
*
*
*
*
*
*
*
* @author Barry Ke
* @version: Last modified on September 23, 2015
* Find the kth to last element
*/



