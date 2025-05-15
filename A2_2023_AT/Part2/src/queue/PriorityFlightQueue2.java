/**
 * @author Aaron Townley
 * 
 * @version 1.0
 * 
 * This class is to demonstrate a sorting algorithm using iteration
 */

package queue;

public class PriorityFlightQueue2 extends AbstractFlightQueue {
	
	/**
	 * This method is to add a Flight to the queue. 
	 * This will find the rightful index where the Flight is supposed to be by iterating through the list flights.
	 * Comparing each priority attribute to the one being added to the queue. 
	 * Once the value is more than the one being added it will be replaced and the replaced Flight will be added next to that one.
	 * 
	 * @param f
	 */
	public void sortQueue2(Flight f) {
		
		int queueIndex = 0;
		while(queueIndex < flights.size() && flights.get(queueIndex).getPriority() <= f.getPriority()) {
			queueIndex++;
		}
		
		flights.add(queueIndex, f);
		
		
	}

}
