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

	}

	/**
	 * Convert menu string to html.
	 *
	 * @param input the input
	 * @return the string
	 */
	public static String convertMenuStringToHtml(String input){
		StringBuilder output= new StringBuilder();
		
		output.append("<table border=\"1\" align=\"center\"><tr>\n");
		header(output,"ID");
		header(output,"Name");
		header(output,"Price");
		header(output,"Main Ing");
		header(output,"Category");
		output.append("</tr>\n");
		
		
		ArrayList<ArrayList<String>> alData=UtilsSup.stringtoNdArrayList(input,false,",|>");
		
		for(int i = 0 ; i<alData.size();i++){
			row(output,alData.get(i));
			
		}
		
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
