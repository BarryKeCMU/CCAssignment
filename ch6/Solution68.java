//Solution68.java
//I refered to the solution in the book and figured out the answer.

/**  
* @author Barry Ke
* @version: Last modified on November 16, 2015
*/

/**
*  As is suggested by the answer in the textbook, in order to maintain the consistency of drops, every time when egg A moves
*  up, we have to reduce the number of steps that egg 2 has to reach egg A's position if egg A breaks by one unit. In other 
*  words, the stpes that egg A will take is 14, 27, 39, 50, 60, 69, 77, 84, 90, 95, 99. We choose 14 as the starting position,
*  because based on the equation that x + (x-1) + (x-2) + ... + 1 = 100, we get x = 13.65. And we find that if we round
*  x up to 14, it will produce the optimal result.  
*  
*/
