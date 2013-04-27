package org.info.table;

import java.util.ArrayList;

import org.errors.table.NoMoreRoomException;
import org.shared.Utils;

// TODO: Auto-generated Javadoc
/**
 * The Class TableSimulation.
 */
public class TableSimulation {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws InterruptedException the interrupted exception
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> ALQueuePartySize= new ArrayList<Integer>();
		
		TableManager Tables=new TableManager();
		//Tables.loadXML("data\\Table.xml");
		
		Tables.add(1, 4);
		Tables.add(2, 4);
		Tables.add(3, 5);
		Tables.add(4, 6);
		
		
		int times=15;
		
		for(int i=1;i<=times;i++){	
			System.out.println("================================================");
			System.out.println("====Current Time is "+i+" End Time: "+times+"===");
			System.out.println("================================================");
			
			
			
			
			int randomParty=Utils.randomNumberBetween(1,Tables.getBiggestTableSize());
			int randomExpTime=Utils.randomNumberBetween(16,20);
			
			
			
			
		
			int seatedID=Tables.getIDofAvailableTableBasedOnPartySize(randomParty);
			
			try {
				Tables.seatBasedOnPartySize(randomParty);
			} catch (NoMoreRoomException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Tables.getTable(seatedID).setExpirationTime(i+randomExpTime);
			
			
			
			printOut(Tables);
			System.out.println("Queue Size:"+ALQueuePartySize.size());
			System.out.println("Queue"+ALQueuePartySize);
			Thread.sleep(1000);
		}
		
	}

	
	
	/**
	 * Sim1.
	 *
	 * @throws InterruptedException the interrupted exception
	 * @throws NoMoreRoomException the no more room exception
	 */
	public static void Sim1() throws InterruptedException, NoMoreRoomException{
ArrayList<Integer> ALQueue= new ArrayList<Integer>();
		
		TableManager Tables=new TableManager();
		Tables.loadXML("data\\Table.xml");
		
		int times=15;
		
		for(int i=1;i<=times;i++){	
			System.out.println("================================================");
			System.out.println("================================================");
			System.out.println("================================================");
			
			int randomParty=Utils.randomNumberBetween(1,Tables.getBiggestTableSize());
			int randomExpTime=Utils.randomNumberBetween(16,20);
			int seatedID=Tables.getIDofAvailableTableBasedOnPartySize(randomParty);
			
			
			if(seatedID==-1){
				ALQueue.add(randomParty);
				System.out.println("added to queue:"+randomParty+"\t"+seatedID+"\t\t\t*************************");
			}else{
				Tables.seatBasedOnPartySize(randomParty);
				Tables.getTable(seatedID).setExpirationTime(i+randomExpTime);
				
				
				for(int j=0;j<Tables.getTables();j++){
					Table queNum=Tables.getTable(j);
					try{
						System.out.println(queNum.getExpirationTime()+"\t"+i);
						if(queNum.getExpirationTime()>=i){
							
							queNum.setExpirationTime(-1);
							queNum.setAvailable(true);
							System.out.println("Table ID:"+j+" Left");
						}	
					}catch(Exception E){
						//null
					}
					
				}
				
				
				for(int j=0;j<ALQueue.size();j++){
					int queNum=ALQueue.get(j);
					if(Tables.getIDofAvailableTableBasedOnPartySize(queNum)!=-1){
						Tables.seatBasedOnPartySize(queNum);
						ALQueue.remove(j);
						System.out.println("Seated this party from queue:\t"+ queNum);
					}
				}
				
				System.out.println("Party Size:"+randomParty+"\tTable ID:"+seatedID+"\t\t\t*************************");	
			}
			
			printOut(Tables);
			System.out.println("Queue Size:"+ALQueue.size());
			System.out.println("Queue"+ALQueue);
			Thread.sleep(1000);
		}
	}
	
	
	/**
	 * Prints the out.
	 *
	 * @param Tables the tables
	 */
	private static void printOut(TableManager Tables) {
		System.out.println("================");
		System.out.println("Tables");
		System.out.println(Tables);
		System.out.println("-------");
		System.out.println("Percent Avaiable:"+Tables.getTotalSeatsAvailablePercent());
		System.out.println("Total Seats:"+Tables.getTotalSeats());
		System.out.println("Total Seats Available:"+Tables.getTotalSeatsAvailable());
		System.out.println("Total Seats Taken:"+Tables.getTotalSeatsTaken());
		System.out.println("List of Avaiable Tables:"+Tables.getIDsofAvailableTables());
	}
}
