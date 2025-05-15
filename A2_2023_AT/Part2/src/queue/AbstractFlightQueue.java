/**
 * @author Aaron Townley
 * 
 * @version 1.0
 * 
 * This is the code for the class AbstractFlightQueue
 * 
 */

package queue;

import java.util.LinkedList;

public abstract class AbstractFlightQueue {

	protected LinkedList<Flight> flights = new LinkedList<>();
	
	/**
	 * This constructor method will set up the list flights
	 * @param flights
	 */
	public void FlightQueue(LinkedList<Flight> flights) {
		this.flights = flights;
	}
	
	/**
	 * This method is to add a Flight to the list made called flights
	 * @param f
	 */
	public void joinQueue(Flight f) {
		flights.add(f);
	}
	
	/**
	 * This method is for removing a Flight out of the queue.
	 * As this is a priority queue I have made it so the Flight with the highest priority attribute is removed.
	 */
	public void landFlight() {
		Flight topPriority = flights.get(0);
		
		for(Flight flight : flights) {
			if (flight.compareTo(topPriority) > 0) {
				topPriority = flight;
			}
		}
		
		flights.remove();	
		
		
	}
	
	/**
	 * This method is to return the size of the list of flights
	 * @return
	 */
	public int size() {
		int s = flights.size();
		return s;
	}
	
	/**
	 * This method is to clear the full queue flights
	 */
	public void clear() {
		flights.clear();
	}
	
	/**
	 * THis method is here to display all the Flights in the list flights
	 */
	public void display() {	
		for(int i = 0; i < flights.size(); i++) {
			System.out.println(flights.get(i));
		}
	}

	/**
	 * This method is here so that we can get a Flight with a specific index that we're looking for.
	 * @param x
	 * @return
	 */
	public Flight getValue(int x) {
		return flights.get(x);
	}



}
