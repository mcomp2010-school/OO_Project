package org.shared;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class UtilsSup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n="0>hello,hello\n1>how,how";
		
		ArrayList<ArrayList<String>> hello=stringtoNdArrayList(n,false,",|>");
		
		System.out.println(hello);
	}
	
    /**
     * Used to Split string into words using the String Tokenizer Class.
     * It Ignores Spaces.  It puts the words into an ArrayList<String>.
     *
     * @param strInput The Input String
     * @return ArrayList of String of the Words
     */
    public static ArrayList<String> splitStringToWords(String strInput,String strDel) {
            ArrayList<String> ArrCurrent = new ArrayList<String>();
           
            StringTokenizer stringtokenizer = new StringTokenizer(strInput, strDel);
            while (stringtokenizer.hasMoreElements()) {
                    String strCurrentToken=stringtokenizer.nextToken();
                   
                    if(strCurrentToken.trim().length()==0){
                            //Ignore Spaces
                    }else{
                            ArrCurrent.add(strCurrentToken);
                    }                      
            }
            return ArrCurrent;
    }

    /**
     * used to Convert data in file to 1 columned ArrayList.
     *
     * @param strInput the str input
     * @param blnIncludeBlankLines Boolean to include blank lines.
     * @return the fast table
     */

    public static ArrayList<String> stringto1dArrayList(String strInput,
                    boolean blnIncludeBlankLines) {
            ArrayList<String> ArrLLog = new ArrayList<String>();

            try {// Main
                    ArrLLog.clear();// Clear ArrayList
                    
                    InputStream in = new ByteArrayInputStream(strInput.getBytes());
                    BufferedReader br = new BufferedReader(new InputStreamReader(in));
                    String strLine;
                    // Read File Line By Line
                    while ((strLine = br.readLine()) != null) {
                            if (strLine.trim().length() >= 0
                                            && blnIncludeBlankLines == true) {
                                    ArrLLog.add(strLine.trim());
                            } else if (strLine.trim().length() >= 1
                                            && blnIncludeBlankLines == false) {
                                    ArrLLog.add(strLine.trim());
                            }
                    }
                    in.close(); // Close the input stream
            } catch (Exception e) {// Catch exception if any
                    System.err.println("Error: " + e.getMessage());
            }// End Main
            return ArrLLog;
    }


    /**
     * used to Convert data in file to 1 columned ArrayList.
     *
     * @param strInput the str input
     * @param blnIncludeBlankLines Boolean to include blank lines.
     * @return the fast table
     */

    public static ArrayList<ArrayList<String>> stringtoNdArrayList(String strInput,
                    boolean blnIncludeBlankLines,String strDel) {
            ArrayList<ArrayList<String>> ArrLLog = new ArrayList<ArrayList<String>>();

            try {// Main
                    ArrLLog.clear();// Clear ArrayList
                    
                    InputStream in = new ByteArrayInputStream(strInput.getBytes());
                    BufferedReader br = new BufferedReader(new InputStreamReader(in));
                    String strLine;
                    // Read File Line By Line
                    while ((strLine = br.readLine()) != null) {
                            if (strLine.trim().length() >= 0
                                            && blnIncludeBlankLines == true) {
                                    ArrLLog.add(splitStringToWords(strLine.trim(),strDel));
                            } else if (strLine.trim().length() >= 1
                                            && blnIncludeBlankLines == false) {
                            		ArrLLog.add(splitStringToWords(strLine.trim(),strDel));
                            }
                    }
                    in.close(); // Close the input stream
            } catch (Exception e) {// Catch exception if any
                    System.err.println("Error: " + e.getMessage());
            }// End Main
            return ArrLLog;
    }
    
    
}
