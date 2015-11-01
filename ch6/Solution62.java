//Solution62.java

/**
*  
*  
* @author Barry Ke
* @version: Last modified on November 1, 2015
*/

/**
*  Assume that the probability of winning Game 1 is p.
*  
*  In Game 2, there are two possbilities of outcomes: making all three shots and making two shots out of three.
*  
*  -the probability of making 2 shots out of 3 is 3(1-p) * p*p
*  -the probability of making 3 shots is p^3
*  
*  They sum to (3p*p - 3*p*p*p)
*  
*  When (3p*p - 3*p*p*p) < p, I should play Game 1.
*  Simplify the equation, we get 2p*p - 3p + 1 > 0.
*  Thus when p < 0.5, I should play Game 1; when p > 0.5, I should play Game 2. 
*  
*  
* 
*
*/