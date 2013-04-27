package org.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

import org.errors.table.NoMoreRoomException;
import org.info.InformationProvider;
import org.shared.Utils;

// TODO: Auto-generated Javadoc
/**
 * The Class MainQueue.
 */
public class MainQueue {	
	private InformationProvider infoObj=InformationProvider.getSingletonObject();

	private ArrayList<Integer> qWaitingCustomers=new ArrayList<Integer>();
	
	private static Timer timer;
	
	public MainQueue(){
		
       
	}

	public void start(Integer time_input){
		timer = new Timer();
		 timer.schedule(new RemindTask()
	        ,0,//initial delay
	        time_input);  //subsequent rate
	}
	
	public void stop(){
		timer.cancel();
	}
	public void ne(){
		//int randomParty=Utils.randomNumberBetween(1,infoObj.Tables().getBiggestTableSize());	
	}
	
	

	public static void main(String[] args) {
		 
		 
	        
	}
	
	class RemindTask extends TimerTask {
        public void run() {
                System.out.format("Beep!%n");
                //timer.cancel(); //Not necessary because
                                  //we call System.exit
            	try {
    				infoObj.Tables().seatBasedOnPartySize(Utils.randomNumberBetween(1,infoObj.Tables().getBiggestTableSize()));
    			} catch (NoMoreRoomException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
        }
    }
	
	
	
	
	
}
