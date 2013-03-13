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
		
		Tables.add(1, 4);
		Tables.add(2, 4);
		Tables.add(3, 5);
		Tables.add(4, 6);
		Tables.add(5, 6);
		Tables.add(5, 4);//This should do nothing
		
		System.out.println("================");
		System.out.println("Percent Avaiable:"+Tables.getTotalSeatsAvailablePercent());
		System.out.println("Total Seats:"+Tables.getTotalSeats());
		System.out.println("Total Seats Available:"+Tables.getTotalSeatsAvailable());
		System.out.println("Total Seats Taken:"+Tables.getTotalSeatsTaken());
		System.out.println("-------");
		System.out.println("Tables");
		System.out.println(Tables);
		
		//Make Table Not Available
		System.out.println("================");
		Tables.makeTableNotAvailable(5);
		System.out.println("Percent Avaiable:"+Tables.getTotalSeatsAvailablePercent());
		System.out.println("Total Seats:"+Tables.getTotalSeats());
		System.out.println("Total Seats Available:"+Tables.getTotalSeatsAvailable());
		System.out.println("Total Seats Taken:"+Tables.getTotalSeatsTaken());
		System.out.println("-------");
		System.out.println("Tables");
		System.out.println(Tables);
		
		//Delete Table 4,Modify Size of Table, Make Table Available
		Tables.deleteTable(3);
		Tables.modifyTableSize(2, 5);
		Tables.makeTableAvailable(5);
		System.out.println("================");
		System.out.println("Percent Avaiable:"+Tables.getTotalSeatsAvailablePercent());
		System.out.println("Total Seats:"+Tables.getTotalSeats());
		System.out.println("Total Seats Available:"+Tables.getTotalSeatsAvailable());
		System.out.println("Total Seats Taken:"+Tables.getTotalSeatsTaken());
		System.out.println("-------");
		System.out.println("Tables");
		System.out.println(Tables);
		
	}

}
