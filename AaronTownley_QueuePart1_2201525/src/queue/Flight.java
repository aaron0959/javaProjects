/**
 * @author Aaron Townley
 * 
 * @version 1.0
 * 
 * 
 * Here is all the code for the Class Flight.
 * 
 */

package queue;

public class Flight {
	
	
	private String flightID;
	private int priority;
	
	/**
	 * Constructor method
	 * 
	 * @param flightID
	 * @param priority
	 */
	
	public Flight(String flightID, int priority) {
		this.flightID = flightID;
		this.priority = priority;
		}
	
	/**
	 * Setter method for flightID
	 * 
	 * @param flightID
	 */
	
	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}
	
	/**
	 * Setter method for priority
	 * 
	 * @param priority
	 */
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	/**
	 * Getter method for flightID
	 * 
	 * @return
	 */
	public String getFlightID() {
		return flightID;
	}
	
	/**
	 * Getter method for priority
	 * @return
	 */
	
	public int getPriority() {
		return priority;
	}
	
	/**
	 * This method will print the details of the flight used to query it
	 */
	
	public String toString() {
		String s;
		s = "Flight ID: " + flightID + " Priority: " + priority;
		return s;
	}

	
	
}
