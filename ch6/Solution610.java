//Solution610.java
//I refered to the solution in the book and figured out the answer.

/**  
* @author Barry Ke
* @version: Last modified on November 16, 2015
*/

/**
*   As is suggested in the solution section, we could map 1000 bottles to 10 binary values so that each bottle is represented
*   by a binary code. For instance, 1 is 00000000001, 2 is 0000000001, 3 is 0000000011 and etc. Then we use test strips to 
*   test poison based on each bottle's binary representation. For instance, test strip 2 is to test poison among bottles whose
*   binary representations have 1s in the 2nd position, such as 3 (0000000011). Thus if at the end of the experiment,we find
*   that test strip 1, 2, and 3 detect poison, we know it is the bottle with the binary representation of 0000000111 has
*   poison, and in this case the number if 7. 
*  
*/
