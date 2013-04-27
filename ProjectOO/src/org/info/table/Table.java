package org.info.table;

import org.shared.XStreamXML;
import org.simulation.SimulationI;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

// TODO: Auto-generated Javadoc
/**
 * The Class Table.
 */
@XStreamAlias("Table")
public class Table implements SimulationI{
	
	/** The table id. */
	@XStreamAsAttribute
	private Integer tableID;
	
	/** The size. */
	private Integer size;
	
	/** The Exp time. */
	private Integer ExpTime=-1;
	
	/** The is available. */
	private boolean isAvailable; 
	
	/**
	 * Instantiates a new table.
	 *
	 * @param tableID the table id
	 * @param size the size
	 */
	public Table(Integer tableID, Integer size) {
		super();
		this.tableID = tableID;
		this.size = size;
		this.isAvailable=true;
	}
	

	/**
	 * Gets the table id.
	 *
	 * @return the table id
	 */
	public Integer getTableID() {
		return tableID;
	}
	
	/**
	 * Sets the table id.
	 *
	 * @param tableID the new table id
	 */
	public void setTableID(Integer tableID) {
		this.tableID = tableID;
	}
	
	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public Integer getSize() {
		return size;
	}
	
	/**
	 * Sets the size.
	 *
	 * @param size the new size
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	
	/**
	 * Checks if is available.
	 *
	 * @return true, if is available
	 */
	public boolean isAvailable() {
		return isAvailable;
	}


	/**
	 * Sets the available.
	 *
	 * @param isAvailable the new available
	 */
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Table [tableID=" + tableID + ", size=" + size
				+ ", isAvailable=" + isAvailable + "]\t"+this.ExpTime;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isAvailable ? 1231 : 1237);
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((tableID == null) ? 0 : tableID.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Table other = (Table) obj;
		if (isAvailable != other.isAvailable)
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (tableID == null) {
			if (other.tableID != null)
				return false;
		} else if (!tableID.equals(other.tableID))
			return false;
		return true;
	}


	/* (non-Javadoc)
	 * @see org.simulation.SimulationI#getExpirationTime()
	 */
	@Override
	public Integer getExpirationTime() {
		return this.ExpTime;
	}


	/* (non-Javadoc)
	 * @see org.simulation.SimulationI#setExpirationTime(int)
	 */
	@Override
	public void setExpirationTime(int inputTime) {
		this.ExpTime=inputTime;
	}

}
