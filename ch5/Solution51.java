//Solution51.java

/**
*  This class inserts M into N bitwise. 
*  
*  Notes: I referred to the solution and figured out the answer.
*  
* @author Barry Ke
* @version: Last modified on October 25, 2015
*/

int update(int n, int m, int i, int j){
	int allOnes = ~0;
	
	/*
	 *  As the solution suggests, it is necessary to prepare the right part and the left part of the inserted number for the 
	 *  output before we merge.
	 */
	
	//prepare the left part
	int left = allOnes << (j + 1);
	
	//move rightward by (i - 1) units
	int right = (1 << i) - 1;
	
	//clear bits from i to j in N.
	int clearedN = n & (left | right);
	
	//move m leftward by i units so it can be inserted to n
	int result = clearedN | (m << i);
}