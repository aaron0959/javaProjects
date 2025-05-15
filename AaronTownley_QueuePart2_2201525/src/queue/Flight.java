package queue;


public class Flight {
	
	private String flightID;
	private int priority;
	
	public Flight(String flightID, int priority) {
		
		this.flightID = flightID;
		this.priority = priority;
		
		}
	
	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public String getFlightID() {
		return flightID;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public int compareTo(Flight compare) {
		return Integer.compare(this.priority, compare.priority);
	}
	
	public String toString() {
		
		String s;
		s = "Flight ID: " + flightID + " Priority: " + priority;
		return s;
		
	}

	
	
}