//Solution56.java

/**
*  This method determines the number of bits that need to be fipped to convert integer A to integer B. 
*  
* @author Barry Ke
* @version: Last modified on November 11, 2015
*/

int getBitNum(int a, int b){
	int count = 0;
	// 1 & c == 1 when there is a 1 on the rightmost digit, and this 1 means there is one bit that is different between A and B.
	for (int c = a ^ b; c != 0; c >> 1){
		count += 1 & c;
	}
	return c;
}