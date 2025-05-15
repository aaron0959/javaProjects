/**
 * @author Aaron Townley
 * @version 1.0
 * 
 * Here we store the meeting room in which the appointment will take place
 */
package assignment;

public class MeetingRoom implements Cloneable{
	
	private String room;
	
	
	/*Constructor method*/
	public MeetingRoom(String room){
		
		this.room = room;
		
	}
	
	/*The lines of code here are to allow the room object class to be cloned */ 
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	/*Setter*/
	public void setRoom(String room) {
		this.room = room;
	}
	/*Getter*/
	public String getRoom() {
		return room;
	}
	
	public String toString() {
		String s;
		s = room;
		return s;
	}

	
}
