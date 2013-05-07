package org.party;

import java.util.ArrayList;

import org.errors.table.NoMoreRoomException;
import org.info.table.TableManager;

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

		PartyManager PartiesObj=new PartyManager();
		
		PartiesObj.newParty(5);
		PartiesObj.newParty(2);
		PartiesObj.newParty(5);
		PartiesObj.newParty(4);
		
		System.out.println(PartiesObj);
		//System.out.println(PartiesObj);
		
		TableManager Tables=new TableManager();
		
		
		Tables.add(1, 4);
		
		
		ArrayList<PartyItem> alWaitingParties= PartiesObj.getWaitingParties();
		
		for (int i = 0; i < alWaitingParties.size(); i++) {
			try {
				Tables.seatBasedOnPartyItem(alWaitingParties.get(i));
			} catch (NoMoreRoomException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		System.out.println("-------------");
		System.out.println(PartiesObj.toString());
		System.out.println(Tables.toString());
		
		System.out.println("-------------");
		
		
		ArrayList<PartyItem> alSeatedParties= PartiesObj.getSeatedParties();
		
		for (int i = 0; i < alSeatedParties.size(); i++) {
				//Tables.seatBasedOnPartyItem(alSeatedParties.get(i));
			System.out.println(">>>>>>"+alSeatedParties.get(i));
		}
		
		System.out.println("-------------");
		
		
			
	}

}
