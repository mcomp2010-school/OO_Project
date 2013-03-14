package org.info.table;

// TODO: Auto-generated Javadoc
/**
 * The Class TableDemo.
 */
public class TableDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TableManager Tables=new TableManager();
		
		boolean useFile=false;
		
		if(useFile){
			Tables.loadXML("data\\Table.xml");
		}else{
			Tables.add(1, 4);
			Tables.add(2, 4);
			Tables.add(3, 5);
			Tables.add(4, 6);
			Tables.add(5, 6);
			Tables.add(5, 4);//This should do nothing
			Tables.add(6, 2);
			Tables.add(7, 2);
			Tables.add(8, 2);
			Tables.add(9, 8);
			Tables.add(10, 8);
			Tables.add(11, 12);
			Tables.add(12, 6);
			Tables.add(13, 6);
			Tables.add(14, 4);
			Tables.add(15, 4);
			
			Tables.saveXML("data\\Table.xml");
			
		}
	
	
		
		
		
		System.out.println("================");
		System.out.println("Tables");
		System.out.println(Tables);
		System.out.println("-------");
		System.out.println("Percent Avaiable:"+Tables.getTotalSeatsAvailablePercent());
		System.out.println("Total Seats:"+Tables.getTotalSeats());
		System.out.println("Total Seats Available:"+Tables.getTotalSeatsAvailable());
		System.out.println("Total Seats Taken:"+Tables.getTotalSeatsTaken());
		System.out.println("List of Avaiable Tables:"+Tables.getIDsofAvailableTables());
		
		//Make Table Not Available
		Tables.makeTableNotAvailable(5);
		System.out.println("================");
		System.out.println("Tables");
		System.out.println(Tables);
		System.out.println("-------");
		System.out.println("Percent Avaiable:"+Tables.getTotalSeatsAvailablePercent());
		System.out.println("Total Seats:"+Tables.getTotalSeats());
		System.out.println("Total Seats Available:"+Tables.getTotalSeatsAvailable());
		System.out.println("Total Seats Taken:"+Tables.getTotalSeatsTaken());
		System.out.println("List of Avaiable Tables:"+Tables.getIDsofAvailableTables());
		
		//Make Table Not Available
		Tables.makeTableNotAvailable(1);
		Tables.makeTableNotAvailable(2);
		System.out.println("================");
		System.out.println("Tables");
		System.out.println(Tables);
		System.out.println("-------");
		System.out.println("Percent Avaiable:"+Tables.getTotalSeatsAvailablePercent());
		System.out.println("Total Seats:"+Tables.getTotalSeats());
		System.out.println("Total Seats Available:"+Tables.getTotalSeatsAvailable());
		System.out.println("Total Seats Taken:"+Tables.getTotalSeatsTaken());
		System.out.println("List of Avaiable Tables:"+Tables.getIDsofAvailableTables());
		
		
		//Delete Table 4,Modify Size of Table, Make Table Available
		Tables.deleteTable(3);
		Tables.modifyTableSize(2, 5);
		Tables.makeTableAvailable(5);
		Tables.makeTableAvailable(1);
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
