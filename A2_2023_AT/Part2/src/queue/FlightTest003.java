/**
 * @author Aaron Townley
 * 
 * @version 1.0
 * 
 * This class is to test the Class JavaPriorityFlightQueue
 */

package queue;


public class FlightTest003 {
	
	/**
	 * THis method is allowing us to set up instances of the Flight class and the JavaPriorityFlightQueue class.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	
	JavaPriorityFlightQueue FlightList4 = new JavaPriorityFlightQueue();
	
	Flight queue4_flight1 = new Flight("BA378", 1);
	Flight queue4_flight2 = new Flight("AB123", 2);
	Flight queue4_flight3 = new Flight("CD456", 5);
	Flight queue4_flight4 = new Flight("EF789", 4);
	Flight queue4_flight5 = new Flight("GH987", 3);
	
	
	FlightList4.joinQueue(queue4_flight1);
	FlightList4.joinQueue(queue4_flight4);
	FlightList4.joinQueue(queue4_flight3);
	FlightList4.joinQueue(queue4_flight2);
	FlightList4.joinQueue(queue4_flight5);
	
	System.out.println("TESTING JAVA PRIORITY QUEUE");
	
	System.out.println(queue4_flight1.toString());
	
	System.out.println("###############################################");
	
	FlightList4.display();
	
	System.out.println("###############################################");
	
	System.out.println("Size with full queue: " + FlightList4.size());
	
	FlightList4.landFlight();
	
	System.out.println("Size after 1 landing: " + FlightList4.size());
	
	System.out.println("###############################################");
	
	FlightList4.display();
	
	System.out.println("###############################################");
	
	FlightList4.clear();
	
	FlightList4.display();
	
	System.out.println("###############################################");
	
	System.out.println("Size after all landing: " + FlightList4.size());
	
	System.out.println("###############################################");
	
	}
	
}
