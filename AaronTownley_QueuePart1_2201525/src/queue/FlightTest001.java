/**
 * @author Aaron Townley
 * 
 * @version 1.0
 * 
 * This class is the tester class FlightTest001.
 * Here I will how the FlightQueue class uses a linked list with elements from the class Flights
 */

package queue;

public class FlightTest001 { 
	
	/**
	 * This method will allow us to create new instances of classes and call functions to them
	 * @param args
	 */
	public static void main(String[] args) {
		
		FlightQueue FlightList = new FlightQueue();
		
		Flight flight1 = new Flight("BA378", 1);
		Flight flight2 = new Flight("AB123", 2);
		Flight flight3 = new Flight("CD456", 3);
		Flight flight4 = new Flight("EF789", 4);
		Flight flight5 = new Flight("GH987", 5);
		
		
		FlightList.joinQueue(flight1);
		FlightList.joinQueue(flight4);
		FlightList.joinQueue(flight3);
		FlightList.joinQueue(flight2);
		FlightList.joinQueue(flight5);
		
		System.out.println(flight1.toString());
		
		System.out.println("###############################################");
		
		FlightList.display();
		
		System.out.println("###############################################");
		
		System.out.println("Size with full queue: " + FlightList.size());
		
		System.out.println("###############################################");
		
		FlightList.landFlight();
		
		System.out.println("Size after 1 landing: " + FlightList.size());
		
		System.out.println("###############################################");
		
		FlightList.display();
		
		System.out.println("###############################################");
		
		FlightList.clear();
		
		FlightList.display();
		
		System.out.println("###############################################");
		
		System.out.println("Size after all landing: " + FlightList.size());
		
		System.out.println("###############################################");
		
		
		
		
		
		

	}

}
