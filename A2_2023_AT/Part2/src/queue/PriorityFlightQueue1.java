/**
 * @author Aaron Townley
 * 
 * @version 1.0
 * 
 * This class is for demonstrating sorting through a list using the java.util.Collections methods
 */

package queue;
import java.util.*;

import java.util.Collections;
//import java.util.List;

//import java.util.LinkedList;

public class PriorityFlightQueue1 extends AbstractFlightQueue{
	
	//public LinkedList<Flight> flights = new LinkedList<>();
	
	/**
	 * This method is to add a Flight to the list and then sort it to its right position in the queue according to the attribute priority
	 * 
	 * @param a
	 */
	public void queueSort(Flight a) {
		
		flights.add(a);
		Collections.sort(flights, Comparator.comparingInt(Flight :: getPriority).reversed());
		
	}

	

}
