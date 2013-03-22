package org.shared;

public class Utils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Integer[] convertStringArrayToIntegerArray(String[] input){
		Integer[] results = new Integer[input.length];

		for (int i = 0; i < input.length; i++) {
		    try {
		        results[i] = Integer.parseInt(input[i]);
		    } catch (NumberFormatException nfe) {};
		}
		
		return results;
	}
	
	
	
}
