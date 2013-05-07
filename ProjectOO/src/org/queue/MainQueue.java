package org.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

import org.errors.table.NoMoreRoomException;
import org.info.InformationProvider;
import org.party.PartyItem;
import org.shared.Utils;

// TODO: Auto-generated Javadoc
/**
 * The Class MainQueue.
 */
public class MainQueue {	
	private InformationProvider infoObj=InformationProvider.getSingletonObject();
	
	private static Timer timer_AddingTask;
	private static Timer timer_SeatingTask;
	private static Timer timer_CustomerFinishTask;
	
	public MainQueue(){
		
       
	}

	public void start(Integer time_input){
		timer_AddingTask = new Timer();
		timer_AddingTask.schedule(new AddingPartyTask()
	        ,0,//initial delay
	        time_input);  //subsequent rate
		 
		 timer_SeatingTask = new Timer();
		 timer_SeatingTask.schedule(new SeatingTask()
	       ,0,//initial delay
	      time_input);  //subsequent rate
		 
		 
		 timer_CustomerFinishTask = new Timer();
		timer_CustomerFinishTask.schedule(new CustomerFinishTask()
	      ,0,//initial delay
	        time_input);  //subsequent rate
	}
	
	public void stop(){
		timer_AddingTask.cancel();
		timer_SeatingTask.cancel();
		timer_CustomerFinishTask.cancel();
	}
	
	class AddingPartyTask extends TimerTask {
        public void run() {
        	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Beep!-AddingPartyTask");
                //timer.cancel(); //Not necessary because
                                  //we call System.exit
                
                int intParty=Utils.randomNumberBetween(1,infoObj.Tables().getBiggestTableSize());
                infoObj.getPartyMgr().newParty(intParty);
                System.out.println("Queue Size:" + infoObj.getPartyMgr().size());
                
        }
    }
	
	
	class SeatingTask extends TimerTask {
        public void run() {
        	System.out.println("=====================================================================");
        	
                System.out.println("Beep!-SeatingTask");
                //timer.cancel(); //Not necessary because
                                  //we call System.exit
                ArrayList<PartyItem> alWaitingParties= infoObj.getPartyMgr().getWaitingParties();
        		
                System.out.println(alWaitingParties);
                System.out.println("----------------------------------------------------------------------");
                for (int i = 0; i < alWaitingParties.size(); i++) {
        			try {
        				infoObj.Tables().seatBasedOnPartyItem(alWaitingParties.get(i));
        				System.out.println("DEBUG:Seated party");
        			} catch (NoMoreRoomException e) {
        				// TODO Auto-generated catch block
        				//e.printStackTrace();
        			}
                }
        }
    }
	
	class CustomerFinishTask extends TimerTask {
        public void run() {
                System.out.println("Beep!-CustomerFinishTask");
                //timer.cancel(); //Not necessary because
                  
               ArrayList<PartyItem> alSeatedParties= infoObj.getPartyMgr().getSeatedParties();
        		
                for (int i = 0; i < alSeatedParties.size(); i++) {
                	 if(Utils.randomNumberBetween(1,10)>=5){
                		 
           				System.out.println("Made table " + "available");
           				//qWaitingCustomers.remove(intTableID);
                 	}
                }
               
            	
                  
         }
    }
	
	
	
}
