package org.shared;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.shared.UtilsSup;

public class HtmlUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String convertMenuStringToHtml(String input){
		StringBuilder output= new StringBuilder();
		
		output.append("<table border=\"1\" align=\"center\"><tr>\n");
		header(output,"ID");
		header(output,"Name");
		header(output,"Price");
		header(output,"Main Ing");
		output.append("</tr>\n");
		
		
		ArrayList<ArrayList<String>> alData=UtilsSup.stringtoNdArrayList(input,false,",|>");
		
		for(int i = 0 ; i<alData.size();i++){
			row(output,alData.get(i));
			
		}
		
		output.append("</table>");
		return output.toString();
	}

	private static void header(StringBuilder output,String header) {
		output.append("<th>"+header+"</th>\n");
	}
	
	private static void row(StringBuilder output,ArrayList<String> input){
		output.append("<tr>\n");
		for(int i = 0 ; i<input.size();i++){
			output.append("<td>"+input.get(i)+"</td>\n");
		}
		output.append("</tr>\n");
	}

}
