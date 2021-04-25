package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	public void run() {
	String message1 = readLine("Enter String:");
	String removeAll = removeAllOccurrences(message1,'t');
	println("Result:" + removeAll);
	String message2 = readLine("Enter String:");
	String removeAll2 = removeAllOccurrences(message1,'e');
	println("Result:" + removeAll2);
	String message3 = readLine("Enter String:");
	String removeAll3 = removeAllOccurrences(message1, '=');
	println("Result:" + removeAll3);
	}
		
		
	    public String removeAllOccurrences(String str,  char ch) {
	    
	    String change = "";
	    	
	    	for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) !=ch) {
				change += str.charAt(i);
			}
	    	}
	    	return change;
				
			}
				
			
			

	}
	
