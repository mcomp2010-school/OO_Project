package org.party;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;



// TODO: Auto-generated Javadoc
/**
 * The Class Parties.
 */
public class PartyManager {

	/** The party id. */
	private Integer partyID = 0;

	/** The parties. */
	private TreeMap<Integer,PartyItem> parties=new TreeMap<Integer,PartyItem>();

	/**
	 * New party.
	 *
	 * @param size the size
	 * @return the integer
	 */
	public Integer newParty(int size) {
		parties.put(partyID, new PartyItem(partyID,size));
		partyID++;
		return partyID-1;
	}


	/**
	 * Gets the party by id.
	 *
	 * @param inputID the input id
	 * @return the party by id
	 */
	public PartyItem getPartyByID(Integer inputID) {
		return parties.get(inputID);
	}

	/**
	 * Removes the partyby id.
	 *
	 * @param inputID the input id
	 */
	public void removePartybyID(Integer inputID) {
		parties.remove(inputID);
		
	}

	public int size() {
		return parties.size();
	}


	public ArrayList<PartyItem>getWaitingParties(){
		ArrayList<PartyItem> temp= new ArrayList<PartyItem>();
				
		for (Map.Entry<Integer, PartyItem> entry : this.parties.entrySet()) {
			Integer key = entry.getKey();
			PartyItem value = entry.getValue();

			if(value.getPartyStatusState()==PartyStatusE.WAITING){
				temp.add(value);
			}
			// System.out.println(key + " => " + value);
	
		}
		
		return temp;
	}
	
	public ArrayList<PartyItem>getSeatedParties(){
		ArrayList<PartyItem> temp= new ArrayList<PartyItem>();
				
		for (Map.Entry<Integer, PartyItem> entry : this.parties
				.entrySet()) {
			Integer key = entry.getKey();
			PartyItem value = entry.getValue();

			if(value.getPartyStatusState()==PartyStatusE.SEATED){
				temp.add(value);
			}
			// System.out.println(key + " => " + value);
	
		}
		
		return temp;
	}
	
	
	public ArrayList<PartyItem>getFinishParties(){
		ArrayList<PartyItem> temp= new ArrayList<PartyItem>();
				
		for (Map.Entry<Integer, PartyItem> entry : this.parties
				.entrySet()) {
			Integer key = entry.getKey();
			PartyItem value = entry.getValue();

			if(value.getPartyStatusState()==PartyStatusE.FINISH){
				temp.add(value);
			}
			// System.out.println(key + " => " + value);
	
		}
		
		return temp;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuilder outputBuilder = new StringBuilder();

		for (Map.Entry<Integer, PartyItem> entry : this.parties
				.entrySet()) {
			Integer key = entry.getKey();
			PartyItem value = entry.getValue();

			// System.out.println(key + " => " + value);
			outputBuilder.append(value + "\n");
		}

		return outputBuilder.toString().trim();
	}
	
}
