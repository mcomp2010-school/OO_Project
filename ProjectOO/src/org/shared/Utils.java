package org.shared;

// TODO: Auto-generated Javadoc
/**
 * The Class Utils.
 */
public class Utils {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Convert string array to integer array.
	 *
	 * @param input the input
	 * @return the integer[]
	 */
	public static Integer[] convertStringArrayToIntegerArray(String[] input){
		Integer[] results = new Integer[input.length];

		for (int i = 0; i < input.length; i++) {
		    try {
		        results[i] = Integer.parseInt(input[i]);
		    } catch (NumberFormatException nfe) {};
		}
		
		return results;
	}

	/**
	 * Random number between.
	 *
	 * @param Min the min
	 * @param Max the max
	 * @return the integer
	 */
	public static Integer randomNumberBetween(int Min,int Max){
		return Min + (int)(Math.random() * ((Max - Min) + 1));
	}
	
	
	
}
