//Solution66.java
//I refered to the solution in the book and figured out the answer.

/**  
* @author Barry Ke
* @version: Last modified on November 15, 2015
*/

/**
*  
*  Case 1: when there is only one person with blue eyes, he looks around and realizes he is the only one with blue eyes so he 
*  leaves on the first day.
*  
*  Case 2: when there are two people with blue eyes, person A and person B. Person A finds B and realizes that B will leave on
*  the first day so A stays on the island. At the same time, person B feels the same way except he thinks person A will leave
*  on the first day. It is not until the second day that both of them realize neither of them has left, and they realize that
*  both of them should leave.
*  
*  Case 3: based on case 1 and case 2, we can see that when there are N people with blue eyes on the island, the Nth person belives
*  there are (N-1) number of people with blue eyes on the island, so it takes (N-1) days for them to leave. The Nth person will
*  leave on the Nth day. Thus if there are N number of blue-eyed people on the island, it takes N days for them to leave.
*  
*  
*/