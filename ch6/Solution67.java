//Solution67.java
//I refered to the solution in the book and figured out the answer.

/**  
* @author Barry Ke
* @version: Last modified on November 16, 2015
*/

/**
*  As is suggested in the textbook, there are seven possible scenarios:
*  Sequence     Number of Boys     Probability     Number of Boys * Probability    
*  G                 0                 1/2               0
*  BG                1                 1/4               1/4
*  BBG               2                 1/8               1/4    
*  BBBG              3                 1/16              3/16
*  BBBBG             4                 1/32              1/8
*  BBBBBG            5                 1/64              5/64
*  
*  If we sum up all the probability listed above, the result is: 114/128, which is very close to 1. It means the gender ratio 
*  is even, 1:1. The ratio is even because we could see each sequence being put into a string. The possbility of having a boy 
*  or a girl is 50%, which is same as the probability of the next character being a G or a B. Therefore, half of the characters
*  in the giant string should be B and half of the characters in the giant string should be G. *  
*/

double nFamilies(int n){
	int boys = 0;
	int girls = 0;
	for (int i = 0; i < n; i ++){
		int [] arr = oneFamily();
		boys += arr[0];
		girls += arr[1];
	}
	
	return (double) girls/(girls + boys);
}

int [] oneFamily(){
	Random rand = new Random();
	int boys = 0;
	int girls = 0;
	while (girls == 0){
		if (rand.nextBoolean()) boys++;
		else girls++;
	}
	int [] arr = new int [2];
	arr[0] = boys;
	arr[1] = girls;
	return arr;
}