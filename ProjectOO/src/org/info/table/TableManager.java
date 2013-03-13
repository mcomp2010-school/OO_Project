package org.info.table;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class TableManager.
 */
public class TableManager {
	
	
	/** The Tables. */
	private ArrayList<Table> Tables=new ArrayList<Table>();
	
	
	/**
	 * Check if exist.
	 *
	 * @param tableID the table id
	 * @return true, if successful
	 */
	public boolean checkIfExist(Integer tableID){
		Table tempTable=this.getTable(tableID);
		
		if(tempTable!=null){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Adds the.
	 *
	 * @param tableID the table id
	 * @param size the size
	 */
	public boolean add(Integer tableID, Integer size){
		if(this.checkIfExist(tableID)){
			//exist 
			return false;
		}else{
			Tables.add(new Table(tableID,size));
			return true;
		}
	}
	
	/**
	 * Make table available.
	 *
	 * @param tableID the table id
	 */
	public boolean makeTableAvailable(Integer tableID){
		Table tempTable=this.getTable(tableID);
		
		if(tempTable!=null){
			tempTable.setAvailable(true);
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Make table not available.
	 *
	 * @param tableID the table id
	 */
	public boolean makeTableNotAvailable(Integer tableID){
		Table tempTable=this.getTable(tableID);
		
		if(tempTable!=null){
			tempTable.setAvailable(false);
			return true;
		}else{
			return false;
		}
	}

	
	/**
	 * Modify table size.
	 *
	 * @param tableID the table id
	 * @param size the size
	 * @return true, if successful
	 */
	public boolean modifyTableSize(Integer tableID,Integer size){
		Table tempTable=this.getTable(tableID);
		
		if(tempTable!=null){
			tempTable.setSize(size);
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Delete table.
	 *
	 * @param tableID the table id
	 * @return true, if successful
	 */
	public boolean deleteTable(Integer tableID){
		boolean success=false;
		
		for (int i = 0; i < this.Tables.size(); i++) {
			Table CurrentTable=this.Tables.get(i);
			
			if(CurrentTable.getTableID().equals(tableID)){
				this.Tables.remove(i);
				success=true;
				break;
			}
		}	
		
		return success;
	}
	
	/**
	 * Gets the table.
	 *
	 * @param tableID the table id
	 * @return the table
	 */
	private Table getTable(Integer tableID){
		Table tempTable=null;
		
		for (int i = 0; i < Tables.size(); i++) {
			Table CurrentTable=Tables.get(i);
			
			if(CurrentTable.getTableID().equals(tableID)){
				tempTable=CurrentTable;
				break;
			}
		}	
		
		return tempTable;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder Output= new StringBuilder();

		for (int i = 0; i < this.Tables.size(); i++) {
			Output.append(this.Tables.get(i)+"\n");
		}
		
		return Output.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Tables == null) ? 0 : Tables.hashCode());
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
		TableManager other = (TableManager) obj;
		if (Tables == null) {
			if (other.Tables != null)
				return false;
		} else if (!Tables.equals(other.Tables))
			return false;
		return true;
	}
	
}
