/**
 * @author Aaron Townley
 * 
 * @version 1.0
 * 
 * This is the code for the FlightQueue class
 */
package queue;

import java.util.LinkedList;

public class FlightQueue {
	
	private LinkedList<Flight> flights = new LinkedList<>();
	
	//public FlightQueue(LinkedList<Flight> flights) {
	//	this.flights = flights;
	//}
	
	/**
	 * This is the method to add a Flight to the linked list flights
	 * @param f
	 */
	public void joinQueue(Flight f) {
		flights.add(f);
	}
	
	/**
	 *THis is the method to remove a Flight from the list of flights 
	 */
	public void landFlight() {
		flights.remove();		
	}
	
	/**
	 * This method is used to retrieve the size of the list at any given time
	 * 
	 * @return
	 */
	public int size() {
		int s = flights.size();
		return s;
	}

	/**
	 * This method will clear the whole list of any flights still stored in them
	 */
	public void clear() {
		flights.clear();
	}
	
	/**
	 * This method will display all the current flights within the list flights
	 */
	public void display() {	
		for(int i = 0; i < flights.size(); i++) {
			System.out.println(flights.get(i));
		}
	}

}

