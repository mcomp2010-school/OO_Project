package org.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class HtmlUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String convertMenuStringToHtml(String input){
		StringBuilder output= new StringBuilder();
		
		output.append("<table border=\"1\"><tr>");
		header(output,"ID");
		header(output,"Name");
		header(output,"Price");
		header(output,"Main Ing");
		output.append("</tr>");
		
		
		ArrayList<ArrayList<String>> alData=Utils.stringtoNdArrayList(input,false,",|>");
		
		for(int i = 0 ; i<alData.size();i++){
			row(output,alData.get(i));
			
		}
		
		output.append("</table>");
		return output.toString();
	}

	private static void header(StringBuilder output,String header) {
		output.append("<th>"+header+"</th>");
	}
	
	private static void row(StringBuilder output,ArrayList<String> input){
		output.append("<tr>");
		for(int i = 0 ; i<input.size();i++){
			output.append("<td>"+input.get(i)+"</td>");
		}
		output.append("</tr>");
	}

}
