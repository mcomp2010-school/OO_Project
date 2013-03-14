package org.info.table;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.info.menu.MenuItem;
import org.shared.performance.Timing;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

// TODO: Auto-generated Javadoc
/**
 * The Class TableManager.
 */
public class TableManager {
	
	/** The Stop watch performance. */
	private boolean StopWatchPerformance=false;
	
	/** The Clock1. */
	private Timing Clock1=new Timing();
	
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
	 * @return true, if successful
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
	 * @return true, if successful
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
	 * @return true, if successful
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
	public Table getTable(Integer tableID){
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
	
	/**
	 * Gets the total seats available percent.
	 *
	 * @return the total seats available percent
	 */
	public String getTotalSeatsAvailablePercent(){
		double SeatsAvailable= this.getTotalSeatsAvailable();
		double SeatsTotal= this.getTotalSeats();
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		return df.format((SeatsAvailable/SeatsTotal)*100)+"%";
	}
	
	/**
	 * Gets the i dsof available tables.
	 *
	 * @return the i dsof available tables
	 */
	public ArrayList<Integer> getIDsofAvailableTables(){
		ArrayList<Integer> tempIDs=new ArrayList<Integer>();
		
		for (int i = 0; i < Tables.size(); i++) {
			Table CurrentTable=Tables.get(i);
			if(CurrentTable.isAvailable()){
				tempIDs.add(CurrentTable.getTableID());	
			}	
		}	
		
		return tempIDs;
	}
	
	
	/**
	 * Gets the total seats available.
	 *
	 * @return the total seats available
	 */
	public int getTotalSeatsAvailable(){
		int sum=0;
		
		for (int i = 0; i < Tables.size(); i++) {
			Table CurrentTable=Tables.get(i);
			if(CurrentTable.isAvailable()){
				sum+=CurrentTable.getSize();	
			}	
		}	
		return sum;
	}

	/**
	 * Gets the total seats taken.
	 *
	 * @return the total seats taken
	 */
	public int getTotalSeatsTaken(){
		int sum=0;
		
		for (int i = 0; i < Tables.size(); i++) {
			Table CurrentTable=Tables.get(i);
			if(!CurrentTable.isAvailable()){
				sum+=CurrentTable.getSize();	
			}	
		}	
		return sum;
	}
	
	/**
	 * Gets the total seats.
	 *
	 * @return the total seats
	 */
	public int getTotalSeats(){
		int sum=0;
		
		for (int i = 0; i < Tables.size(); i++) {
			Table CurrentTable=Tables.get(i);
			sum+=CurrentTable.getSize();
		}	
		
		return sum;
	}
	
	
	/**
	 * Load xml.
	 *
	 * @param FileName the file name
	 */
	public void loadXML(String FileName){
		XStream xstream = new XStream();
		xstream.alias("Table", Table.class); 
		xstream.autodetectAnnotations(true);
		
		this.Tables.clear();
		
		File file = new File(FileName);
		String lines = null;
		try {
			lines = FileUtils.readFileToString(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		ArrayList<Table> tempTable=(ArrayList<Table>)xstream.fromXML(lines.toString());
		this.Tables=tempTable;
	}
	
	/**
	 * Gets the xml.
	 *
	 * @return the xml
	 */
	public String getXML(){		
		XStream xstream = new XStream(); 
		xstream.alias("Table", Table.class);
		xstream.autodetectAnnotations(true);
		
		String xml = xstream.toXML(this.Tables);
		
		return xml;
	}
	
	/**
	 * Save xml.
	 *
	 * @param FileName the file name
	 */
	public void saveXML(String FileName){
		File file = new File(FileName);
		try {
			FileUtils.writeStringToFile(file, this.getXML());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
