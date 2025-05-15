/**
 * @author Aaron Townley
 * 
 * @version 1.0
 * 
 * This class is just demonstrating the standard methods applied within the class AbstractFlightQueue
 */

package queue;

public class NormalFlightQueue extends AbstractFlightQueue{
	
	/**
	 * This method adds a Flight to the queue flights
	 * 
	 * @param f
	 */
	public void joinQueue(Flight f) {
		flights.add(f);
	}

}
