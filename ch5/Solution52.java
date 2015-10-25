//Solution52.java

/**
*  This class converts a double between 0 and 1 and prints out the binary representation of this number.
*  
*  Notes: I referred to the solution and figured out the answer.
*  
* @author Barry Ke
* @version: Last modified on October 25, 2015
*/

public String convert(double input){
	//examine if the input lies in the range
	if (input <= 0 || input >= 1) return null;
	
	//create a StringBuiler object to store the binary representation
	StringBuilder output = new StringBuilder();
	//the first element output should be a decimal point
	output.append(".");
	
	
	//convert each digit in the decimal number into binary
	//need to make sure the length of the binary is at most 32
	while(input > 0){
		if (output.length() >= 32) return "ERROR";
		
		double temp = input * 2;
		
		if (temp >= 1) {
			output.append("1");
			input = temp - 1;
		}else {
			output.append("0");
			input = temp;
		}
	}
	return output.toString();
}