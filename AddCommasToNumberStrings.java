package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	public void run() {
		
		
		while (true) {
			String digits = readLine("Enter a numeric string:");
			if (digits.length() == 0) break;
			println(addCommasToNumericString(digits));
		}
	}
			
		String addCommasToNumericString(String digits) {

			String change =  "";
			
			int numberofdigits = 0;
			int length = digits.length();
	    	for (int i = length - 1; i >= 0; i--) {
			change = digits.charAt(i) + change;
			numberofdigits++;
			if(((numberofdigits % 3) == 0) && (i > 0)) {
				change = "," + change;
			}
	    	}
			return change;
		}
}
	
	
