package org.info.table;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.errors.table.NoMoreRoomException;
import org.info.menu.MenuItem;
import org.interfaces.XStreamXMLI;
import org.party.PartyItem;
import org.party.PartyStatusE;
import org.shared.performance.Timing;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

// TODO: Auto-generated Javadoc
/**
 * The Class TableManager.
 */
public class TableManager implements XStreamXMLI {
	
	/** The Stop watch performance. */
	private static boolean StopWatchPerformance=false;
	
	/** The Clock1. */
	private static Timing Clock1=new Timing();
	
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
		String tem=df.format((SeatsAvailable/SeatsTotal)*100)+"%";
		if(tem.length()==0){
			tem="0.00%";
		}
		
		return tem;
	}
	
	
	/**
	 * Seat based on party size.
	 *
	 * @param size the size
	 * @return true, if successful
	 * @throws NoMoreRoomException the no more room exception
	 */
	public Integer seatBasedOnPartySize(int size) throws NoMoreRoomException{
		int id=this.getIDofAvailableTableBasedOnPartySize(size);
		
		if(id>=1){
			this.getTable(id).setAvailable(false);
			return id;
		}else{
			throw new NoMoreRoomException("No More Room");
		}	
	}
	
	public Integer seatBasedOnPartyItem(PartyItem input) throws NoMoreRoomException{
		int id=this.getIDofAvailableTableBasedOnPartySize(input.getSize());
		
		if(id>=1){
			this.getTable(id).setAvailable(false);
			input.setPartyStatusState(PartyStatusE.SEATED,id);
			return id;
		}else{
			throw new NoMoreRoomException("No More Room - Status Stayed the Same");
		}	
	}
	
	public void makeTableAvaiableBasedOnPartyItem(PartyItem input){
			this.getTable(input.getIntTableID()).setAvailable(true);
			input.setPartyStatusState(PartyStatusE.FINISH,-1);
	}
	
	
	
	/**
	 * Gets the ID of available table based on party size.
	 *
	 * @param size the size
	 * @return the i dof available table based on party size
	 */
	public Integer getIDofAvailableTableBasedOnPartySize(int size){
		ArrayList<Table> SortedAL=this.cloneALSortedBySize();
		
		Integer intAvailableTableID=-1;
		
		for (int i = 0; i < SortedAL.size(); i++) {
			Table CurrentTable=SortedAL.get(i);
			
			if(CurrentTable.isAvailable()==true&&CurrentTable.getSize()>=size){
				intAvailableTableID=CurrentTable.getTableID();
				break;
			}
			//System.out.println(CurrentTable);
		}	
		return intAvailableTableID;
	}
	
	
	/**
	 * Gets the biggest table size.
	 *
	 * @return the biggest table size
	 */
	public Integer getBiggestTableSize(){
		ArrayList<Table> SortedAL=this.cloneALSortedBySize();
		
		if(SortedAL.size()==0){
			return -1;
		}else{
			return SortedAL.get(SortedAL.size()-1).getSize();
		}
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
	@Override
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
			e.printStackTrace();
		}
		
		@SuppressWarnings("unchecked")
		ArrayList<Table> tempTable=(ArrayList<Table>)xstream.fromXML(lines.toString());
		this.Tables=tempTable;
	}
	
	/**
	 * Gets the xml.
	 *
	 * @return the xml
	 */
	@Override
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
	@Override
	public void saveXML(String FileName){
		File file = new File(FileName);
		try {
			FileUtils.writeStringToFile(file, this.getXML());
		} catch (IOException e) {
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

	
	
	/**
	 * Clone array list.
	 *
	 * @return the array list
	 */
	private ArrayList<Table> cloneArrayList(){
		ArrayList<Table> cloneArrayList= new ArrayList<Table>();
		
		for(int i = 0;i<this.Tables.size();i++){
			cloneArrayList.add(this.Tables.get(i));
		}
		
		return cloneArrayList;	
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {
		TableManager workingTableManager=new TableManager();
		workingTableManager.Tables=this.cloneArrayList();
		return workingTableManager;
	}
	

	/**
	 * Clone ArrayList sorted by size.
	 *
	 * @return the array list
	 */
	private ArrayList<Table> cloneALSortedBySize(){
		ArrayList<Table> cloneArrayList=(ArrayList<Table>) this.cloneArrayList();
				
		Collections.sort(cloneArrayList, new Comparator<Table>() {
			  public int compare(Table o1, Table o2) {
			      return o1.getSize().compareTo(o2.getSize());
			  }
			});
				
		return cloneArrayList;
	}

	/**
	 * Gets the tables.
	 *
	 * @return the tables
	 */
	public int getTables(){
		return this.Tables.size();
	}
	
}
