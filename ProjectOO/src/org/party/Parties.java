package org.party;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;



public class Parties {

	private Integer partyID = 0;

	private TreeMap<Integer,PartyItem> parties=new TreeMap<Integer,PartyItem>();

	public Integer newParty(int size) {
		parties.put(partyID, new PartyItem(partyID,size));
		partyID++;
		return partyID-1;
	}


	public PartyItem getPartyByID(Integer inputID) {
		return parties.get(inputID);
	}

	public void removePartybyID(Integer inputID) {
		parties.remove(inputID);
		
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
