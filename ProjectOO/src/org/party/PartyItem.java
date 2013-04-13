package org.party;

import java.sql.Timestamp;

import org.joda.time.DateTime;


/**
 * The Class CommentItem.
 */
public class PartyItem {
	
	/** The comment item id. */
	private Integer partyItemID;
	
	/** The time placed. */
	private DateTime timePlaced;
	
	/** The size of party. */
	private int size;

	public PartyItem(Integer partyItemID, int size) {
		super();
		this.partyItemID = partyItemID;
		this.timePlaced=new DateTime();
		this.size = size;
	}

	public Integer getPartyItemID() {
		return partyItemID;
	}

	public void setPartyItemID(Integer partyItemID) {
		this.partyItemID = partyItemID;
	}

	public DateTime getTimePlaced() {
		return timePlaced;
	}

	public void setTimePlaced(DateTime timePlaced) {
		this.timePlaced = timePlaced;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "PartyItem [partyItemID=" + partyItemID + ", timePlaced="
				+ timePlaced + ", size=" + size + "]";
	}
	
}
