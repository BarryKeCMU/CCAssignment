//Solution57.java

/**
*  This method swaps odd and even bits in an integer 
*  
* @author Barry Ke
* @version: Last modified on November 1, 2015
*/

int swapEvenOdd(int a){
	       //shift the even bits to odd bits      odd to even
	return (((0xAAAAAAAA & x) >>> 1)	    |     ((0x55555555 & x) << 1)	);
}