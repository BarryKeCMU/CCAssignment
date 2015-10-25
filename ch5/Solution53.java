//Solution53.java

/**
*  This class finds the longest chain of ones in a given binary number.
*  
*  Notes: I referred to the solution and figured out the answer.
*  
* @author Barry Ke
* @version: Last modified on October 25, 2015
*/

final int SEQUENCE_LENGTH = 32;

int longestChain (int input){
	
	int max = 0;
	
	for (int i = 0; i < SEQUENCE_LENGTH; i++){
		max = getLongestChain(input, i);
	}
	
	return max;
}

boolean getBit(int input, int i){
	//true: current number is 1
	//false: current number is 0
	return (input & (1 << i)) != 0;
}

int getLongestChain (int input, int ignoredIndex){
	
	int counter = 0;
	
	int longestChain = 0;
	
	for (int j = 0; j < SEQUENCE_LENGTH; j++){
		//both of the conditions mean if the number at this index is 1
		if (getBit(input, i) || i == ignoredIndex){
			counter++;
			longestChain = Math.max(counter, longestChain);
		} else {
			counter = 0;
		}
	}
	
	return longestChain;
}