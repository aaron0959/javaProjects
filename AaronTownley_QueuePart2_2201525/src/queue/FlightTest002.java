/**
 * @author Aaron Townley
 *  
 * @version 1.0
 * 
 * This class is to test the properties of the classes: AbstractFlightQueue
 * 														PriorityFlightQueue1
 * 														PriorityFlightQueue2
 * 														NormalFlightQueue
 */

package queue;

public class FlightTest002 /*extends AbstractFlightQueue*/ { 
	
	/**
	 * This method puts together all the methods from each class specified and will create an instance for each class to be queried
	 * @param f
	 */
	public static void joinQueue(Flight f) {
		
		/*TESTING PriorityFlightQueue1*/
		PriorityFlightQueue1 FlightList1 = new PriorityFlightQueue1();
		
		Flight queue1_flight1 = new Flight("BA378", 1);
		Flight queue1_flight2 = new Flight("AB123", 2);
		Flight queue1_flight3 = new Flight("CD456", 5);
		Flight queue1_flight4 = new Flight("EF789", 4);
		Flight queue1_flight5 = new Flight("GH987", 3);
		
		FlightList1.queueSort(queue1_flight1);
		FlightList1.queueSort(queue1_flight4);
		FlightList1.queueSort(queue1_flight3);
		FlightList1.queueSort(queue1_flight2);
		FlightList1.queueSort(queue1_flight5);
		
		System.out.println("TESTING PRIORITY QUEUE1");
		
		System.out.println(queue1_flight1.toString());
		
		System.out.println("###############################################");
		
		FlightList1.display();
		
		System.out.println("###############################################");
		
		System.out.println("Size with full queue: " + FlightList1.size());
		
		FlightList1.landFlight();
		
		System.out.println("Size after 1 landing: " + FlightList1.size());
		
		System.out.println("###############################################");
		
		FlightList1.display();
		
		System.out.println("###############################################");
		
		FlightList1.clear();
		
		FlightList1.display();
		
		System.out.println("###############################################");
		
		System.out.println("Size after all landing: " + FlightList1.size());
		
		System.out.println("###############################################");
		
		/*TESTING PriorityFlightQueue2*/
		PriorityFlightQueue2 FlightList2 = new PriorityFlightQueue2();
		
		Flight queue2_flight1 = new Flight("BA378", 1);
		Flight queue2_flight2 = new Flight("AB123", 2);
		Flight queue2_flight3 = new Flight("CD456", 5);
		Flight queue2_flight4 = new Flight("EF789", 4);
		Flight queue2_flight5 = new Flight("GH987", 3);
		
		FlightList2.sortQueue2(queue2_flight1);
		FlightList2.sortQueue2(queue2_flight4);
		FlightList2.sortQueue2(queue2_flight3);
		FlightList2.sortQueue2(queue2_flight2);
		FlightList2.sortQueue2(queue2_flight5);
		
		System.out.println("TESTING PRIORITY QUEUE2");
		
		System.out.println(queue1_flight2.toString());
		
		System.out.println("###############################################");
		
		FlightList2.display();
		
		System.out.println("###############################################");
		
		System.out.println("Size with full queue: " + FlightList2.size());
		
		FlightList2.landFlight();
		
		System.out.println("Size after 1 landing: " + FlightList2.size());
		
		System.out.println("###############################################");
		
		FlightList2.display();
		
		System.out.println("###############################################");
		
		FlightList2.clear();
		
		FlightList2.display();
		
		System.out.println("###############################################");
		
		System.out.println("Size after all landing: " + FlightList2.size());
		
		System.out.println("###############################################");
		
		/*TESTING NormalFlightQueue*/
		NormalFlightQueue FlightList3 = new NormalFlightQueue();
		
		Flight queue3_flight1 = new Flight("BA378", 1);
		Flight queue3_flight2 = new Flight("AB123", 2);
		Flight queue3_flight3 = new Flight("CD456", 5);
		Flight queue3_flight4 = new Flight("EF789", 4);
		Flight queue3_flight5 = new Flight("GH987", 3);
		
		FlightList3.joinQueue(queue3_flight1);
		FlightList3.joinQueue(queue3_flight4);
		FlightList3.joinQueue(queue3_flight3);
		FlightList3.joinQueue(queue3_flight2);
		FlightList3.joinQueue(queue3_flight5);
		
		System.out.println("TESTING NORMAL QUEUE");
		
		System.out.println(queue3_flight1.toString());
		
		System.out.println("###############################################");
		
		FlightList3.display();
		
		System.out.println("###############################################");
		
		System.out.println("Size with full queue: " + FlightList3.size());
		
		FlightList3.landFlight();
		
		System.out.println("Size after 1 landing: " + FlightList3.size());
		
		System.out.println("###############################################");
		
		FlightList3.display();
		
		System.out.println("###############################################");
		
		FlightList3.clear();
		
		FlightList3.display();
		
		System.out.println("###############################################");
		
		System.out.println("Size after all landing: " + FlightList3.size());
		
		System.out.println("###############################################");
		
	}

}

