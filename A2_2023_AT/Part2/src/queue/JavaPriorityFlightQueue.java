/**
 * @author Aaron Townley
 * 
 * @version 1.0
 * 
 * This class is to test a queue system using the java.util.PriorityQueue library
 */

package queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class JavaPriorityFlightQueue extends AbstractFlightQueue{
	
	private PriorityQueue<Flight> priority;
	
	/**
	 * Constructor method to set a Priority Queue class up
	 */
	public JavaPriorityFlightQueue() {
		priority = new PriorityQueue<>(Comparator.comparingInt(Flight :: getPriority).reversed());
	}
	
	/**
	 * This method will add a Flight to the PriorityQueue
	 * 
	 * @param f
	 */
	public void joinQueue(Flight f) {
		priority.offer(f);
	}
	
	/**
	 * This method will remove the first Flight in the queue
	 */
	public void landFlight() {
		priority.poll();
	}
	
	/**
	 * This method will return the size of the Queue
	 * 
	 * @return
	 */
	public int getSize() {
		int s = priority.size();
		return s;
	}
	
	/**
	 * This method clears the entire Queue
	 */
	public void queueClear() {
		priority.clear();
		
	}
	
	/**
	 * This method iterates through the whole queue and will display all the Flights in the Queue  
	 */
	public void display() {
		
		for(Flight flight : priority) {
			System.out.println(flight);
		}
		
	}

}
