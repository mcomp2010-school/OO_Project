package org.shared;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.shared.UtilsSup;

// TODO: Auto-generated Javadoc
/**
 * The Class HtmlUtils.
 */
public class HtmlUtils {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n="Table[Field1=2;;;Field2=3]";
		
		ArrayList<String> fil= getGenericDivLine(n,0);
		
		System.out.println(convertGenericStringToHtml(n));
		
		//ArrayList<String> hello=UtilsSup.stringto1dArrayList(n,false);
		
		
	}
	
	public static ArrayList<String> getGenericDivLine(String n, int index){
		ArrayList<ArrayList<String>> fil= getGenericDivLine(n);
		ArrayList<String> ArrLLog = new ArrayList<String>();
		
		for (int i = 0; i < fil.size(); i++) {
			ArrLLog.add(fil.get(i).get(index).toString());
		}
		return ArrLLog;
	}

	public static ArrayList<ArrayList<String>> getGenericDivLine(String n){
		if(n.contains("[")&&n.contains("]")){
			n=n.substring(n.indexOf("[")+1,n.indexOf("]"));
		}
		
		ArrayList<ArrayList<String>> ArrLLog = new ArrayList<ArrayList<String>>();
		ArrayList<String> fil=UtilsSup.splitStringToWords(n, ";;;");
		for (int i = 0; i < fil.size(); i++) {
			ArrLLog.add(UtilsSup.splitStringToWords(fil.get(i), "="));
		}
		return ArrLLog;
	}
	
    public static String convertGenericStringToHtml(String strInput) {
		StringBuilder output= new StringBuilder();
		
		output.append("<table border=\"1\" align=\"center\">\n");
		


    try {// Main         
            InputStream in = new ByteArrayInputStream(strInput.getBytes());
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            int linen=0;
            // Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                    if (strLine.trim().length() >= 1) {
                    	if(linen==0){
                    		row(output, getGenericDivLine(strLine,0));
                    	}
                
                    	row(output, getGenericDivLine(strLine,1));
                    	
                    	linen++;
                    }
            }
            in.close(); // Close the input stream
    } catch (Exception e) {// Catch exception if any
    	System.err.println("Error: " + strInput);
            System.err.println("Error: " + e);
    }// End Main
    output.append("</table>");
    return output.toString();
}
    


	/**
	 * Convert Orders string to html
	 * */
	public static String convertOrdersStringToHtml(String input){
		StringBuilder output = new StringBuilder();
		
		output.append("<table border=\"1\" align=\"center\"><tr>\n");
		//put headers here
		output.append("</tr>\n");
		
		ArrayList<ArrayList<String>> alData = UtilsSup.stringtoNdArrayList(input, false,  ",|>");
		for(int i = 0; i < alData.size(); i++){
			row(output,alData.get(i));
		}
		
		output.append("</table>");
		return output.toString();
	}
	
	/**
	 * Header.
	 *
	 * @param output the output
	 * @param header the header
	 */
	private static void header(StringBuilder output,String header) {
		output.append("<th>"+header+"</th>\n");
	}
	
	/**
	 * Row.
	 *
	 * @param output the output
	 * @param input the input
	 */
	private static void row(StringBuilder output,ArrayList<String> input){
		output.append("<tr>\n");
		for(int i = 0 ; i<input.size();i++){
			output.append("<td>"+input.get(i)+"</td>\n");
		}
		output.append("</tr>\n");
	}

}
