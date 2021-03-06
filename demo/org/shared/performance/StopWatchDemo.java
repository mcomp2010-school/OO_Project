package org.shared.performance;


import static java.lang.System.out; 

import com.google.common.base.Stopwatch;  
import java.util.concurrent.TimeUnit;  
import java.util.logging.Level;  
import java.util.logging.Logger;  
  
// TODO: Auto-generated Javadoc
/** 
 * Demonstrates Guava's (Release 10) Stopwatch class. 
 * http://marxsoftware.blogspot.com/2011/10/guava-stopwatch.html
 * @author Dustin 
 */  
public class StopWatchDemo  
{  
   
   /** The Constant LOGGER. */
   private final static Logger LOGGER = Logger.getLogger(StopWatchDemo.class.getCanonicalName());  
  
   /**
    * Do something just to be doing it.
    *
    * @param numberOfTimesToDoNothing the number of times to do nothing
    */
   public static void doSomethingJustToBeDoingIt(final int numberOfTimesToDoNothing)  
   {  
      for (int count=0; count < numberOfTimesToDoNothing; count++)  
      {  
         try  
         {  
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));  
         }  
         catch (InterruptedException interruptEx)  
         {  
            LOGGER.log(Level.INFO, "Don't interrupt me when I'm trying to sleep!", interruptEx);  
         }  
      }  
   }  
  
   /** 
    * Print statistics on Stopwatch-reported times for provided number of loops. 
    *  
    * @param numberLoops Number of loops executed. 
    * @param stopwatch Stopwatch instance with time used statistics. 
    */  
   public static void printElapsedTime(final int numberLoops, final Stopwatch stopwatch)  
   {  
      if (stopwatch.isRunning())  
      {  
         out.println("WARNING! Your stopwatch is still running!");  
      }  
      else // stopwatch not running  
      {  
         out.println(numberLoops + " loops required: ");  
         out.println("\t" + stopwatch.toString(6));  
         out.println("\t" + stopwatch.elapsedMillis() + " elapsed milliseconds.");  
         out.println("\t" + stopwatch.elapsedTime(TimeUnit.MINUTES) + " minutes");  
         out.println("\t" + stopwatch.elapsedTime(TimeUnit.SECONDS) + " seconds");  
         out.println("\t" + stopwatch.elapsedTime(TimeUnit.MILLISECONDS) + " milliseconds");  
         out.println("\t" + stopwatch.elapsedTime(TimeUnit.NANOSECONDS) + " nanoseconds");  
      }  
   }  
  
   /**
    * The main method.
    *
    * @param arguments the arguments
    */
   public static void main(final String[] arguments)  
   {  
      final Stopwatch stopwatch = new Stopwatch();  
  
      int numberTimes = 5;  
      stopwatch.start();  
      doSomethingJustToBeDoingIt(numberTimes);  
      stopwatch.stop();  
      printElapsedTime(numberTimes, stopwatch);  
  
      numberTimes = 45;  
      stopwatch.reset();  
      stopwatch.start();  
      doSomethingJustToBeDoingIt(numberTimes);  
      stopwatch.stop();  
      printElapsedTime(numberTimes, stopwatch);  
  
      numberTimes = 125;  
      stopwatch.reset();  
      stopwatch.start();  
      doSomethingJustToBeDoingIt(numberTimes);  
      stopwatch.stop();  
      printElapsedTime(numberTimes, stopwatch);  
   }  
}  