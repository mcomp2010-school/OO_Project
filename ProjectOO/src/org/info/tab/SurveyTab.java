package org.info.tab;

public class SurveyTab extends BlankTab {
	
	@Override
	public void printTab(double cost, String theList){
		super.printTab(cost, theList);
		askForSurvey(theList);
	}

	public void askForSurvey(String list) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Please take five minutes to fill out our online");
		System.out.println("survey, and tell us how the meal was!");
		System.out.println("Visit http://www.eatfastdiefull.com");	
	}

}
