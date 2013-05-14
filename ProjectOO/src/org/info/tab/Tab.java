package org.info.tab;

/**
 * The Class Tab.
 */
public abstract class Tab {
	
	private ListOfItemsGenerator myList;
	StringBuilder oupt=new StringBuilder();
	
	public ListOfItemsGenerator getMyList() {
		return myList;
	}

	public void printTab(double total, String theList) {
		//System.out.println("You have ordered: ");
		//System.out.println(theList);
		//System.out.println("Your total is: ");
		//System.out.println(total);
		
		oupt.append("You have ordered: \n");
		oupt.append(theList+"\n");
		oupt.append("Your total is: \n");
		oupt.append(total+"\n");
		
	}
	
	public void setList(ListOfItemsGenerator theList){
		myList = theList;
	}

	@Override
	public String toString() {
		return oupt.toString();
	}
	
	
}
