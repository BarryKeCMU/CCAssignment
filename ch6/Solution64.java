//Solution64.java

/**
*  
*  
* @author Barry Ke
* @version: Last modified on November 15, 2015
*/

/**
*  1. The probability that three ants walk in the same direction is (0.5)^3 + (0.5)^3 = 3/4 (all to the left and 
*  all to the right) 
*  
*  2. When there are n ants on an n-vertex polygon, the probability that they all move in the same direction is
*  (0.5)^n * 2 = 2 ^ (1-n). So the probability that they collide is 1 - 2 ^ (1-n). 
*/