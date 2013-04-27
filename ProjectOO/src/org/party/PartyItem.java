package org.party;

import java.sql.Timestamp;

import org.joda.time.DateTime;


// TODO: Auto-generated Javadoc
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

	/**
	 * Instantiates a new party item.
	 *
	 * @param partyItemID the party item id
	 * @param size the size
	 */
	public PartyItem(Integer partyItemID, int size) {
		super();
		this.partyItemID = partyItemID;
		this.timePlaced=new DateTime();
		this.size = size;
	}

	/**
	 * Gets the party item id.
	 *
	 * @return the party item id
	 */
	public Integer getPartyItemID() {
		return partyItemID;
	}

	/**
	 * Sets the party item id.
	 *
	 * @param partyItemID the new party item id
	 */
	public void setPartyItemID(Integer partyItemID) {
		this.partyItemID = partyItemID;
	}

	/**
	 * Gets the time placed.
	 *
	 * @return the time placed
	 */
	public DateTime getTimePlaced() {
		return timePlaced;
	}

	/**
	 * Sets the time placed.
	 *
	 * @param timePlaced the new time placed
	 */
	public void setTimePlaced(DateTime timePlaced) {
		this.timePlaced = timePlaced;
	}

	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Sets the size.
	 *
	 * @param size the new size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PartyItem [partyItemID=" + partyItemID + ", timePlaced="
				+ timePlaced + ", size=" + size + "]";
	}
	
}
