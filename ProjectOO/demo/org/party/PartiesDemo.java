package org.party;

// TODO: Auto-generated Javadoc
/**
 * The Class PartiesDemo.
 */
public class PartiesDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parties PartiesObj=new Parties();
		
		PartiesObj.newParty(5);
		PartiesObj.newParty(2);
		PartiesObj.newParty(5);
		PartiesObj.newParty(4);
		
		System.out.println(PartiesObj);
	}

}
