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
import org.info.comment.CommentCategoryE;
import org.info.tab.BlankTab;
import org.info.tab.CouponTab;
import org.info.tab.ListOfItems;
import org.info.tab.SurveyTab;
import org.info.tab.Tab;
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

	public static void main(String[] args) {
		MainQueue test=new MainQueue();
		test.start(1000);
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
                System.out.println("Queue Size All:" + infoObj.getPartyMgr().size());
                System.out.println("Queue Size Waiting:" + infoObj.getPartyMgr().getWaitingParties().size());
                
        }
    }
	
	
	class SeatingTask extends TimerTask {
		public void run() {
			try{//Make sure Thread Does not stop
				System.out.println("=====================================================================");

				System.out.println("Beep!-SeatingTask");
				//timer.cancel(); //Not necessary because
				//we call System.exit
				ArrayList<PartyItem> alWaitingParties = null;

				alWaitingParties= infoObj.getPartyMgr().getWaitingParties();


				System.out.println(alWaitingParties);
				System.out.println("----------------------------------------------------------------------");
				for (int i = 0; i < alWaitingParties.size(); i++) {
					try {
						infoObj.Tables().seatBasedOnPartyItem(alWaitingParties.get(i));
						//TODO: Generate orders
						
						System.out.println("DEBUG:Seated party");
					} catch (NoMoreRoomException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}
				}
			}catch(Exception E){
				//nothing
			}
		}
	}

	class CustomerFinishTask extends TimerTask {
        public void run() {
        	try{//Make sure Thread Does not stop
                System.out.println("Beep!-CustomerFinishTask");
                //timer.cancel(); //Not necessary because
                 
               ArrayList<PartyItem> alSeatedParties= infoObj.getPartyMgr().getSeatedParties();
        		System.out.println("alSeatedParties:"+alSeatedParties);
                for (int i = 0; i < alSeatedParties.size(); i++) {
                	PartyItem currentItem=alSeatedParties.get(i);
                	 if(Utils.randomNumberBetween(1,100)<=40){
           				int intTableId=currentItem.getIntTableID();
                		 System.out.println("Made table " +  intTableId+ " available");
                		 
                		 infoObj.Tables().makeTableAvaiableBasedOnPartyItem(currentItem);
                				 
           				//TODO: Generate Recipt of order
           				
                		 
                		 
                		 
                		//TODO: Generate Recept
                		  	Tab myTab;

                			ListOfItems theList = new ListOfItems();
                			theList.getMenuItems();

                			if (theList.getOrderSize() >= 3){
                				if (theList.getCost() >= 20.00){
                					myTab = new CouponTab();
                				} else
                					myTab = new SurveyTab();
                			} else {
                				myTab = new BlankTab();	
                			}
                			myTab.setList(theList);
                			double cost = myTab.getMyList().getCost();
                			String list = myTab.getMyList().getList();

                			myTab.printTab(cost, list);
                			
                			infoObj.getTabsMgr().addTab(myTab);
                		 
                		 
                		//TODO: Generate Comment of order
                		 if(Utils.randomNumberBetween(1,100)<=50){//50 percent of Tables makes a comment
                				infoObj.getCommentMgr().addComment("Food was great", CommentCategoryE.SERVICE);
                				infoObj.getCommentMgr().addComment("Bad Server, Very Slow", CommentCategoryE.COMPLAINT);
                				infoObj.getCommentMgr().addComment("Bug in food", CommentCategoryE.COMPLAINT);
                				infoObj.getCommentMgr().addComment("Prices are too high", CommentCategoryE.PRICES);
                				infoObj.getCommentMgr().addComment("The chicken was very good", CommentCategoryE.FOOD_ITEM);
                				infoObj.getCommentMgr().addComment("Long Waiting Time", CommentCategoryE.COMPLAINT);
                				
                		 }
                		 
           				//qWaitingCustomers.remove(intTableID);
                 	}
                }
               
        	}catch(Exception E){
				//nothing
        		System.err.println(E);
			}
                  
         }
    }
	
	
	
}