/**
 * @author Aaron Townley
 * @version 1.0
 * 
 * Here we bring all other classes together to show every detail of the appointment details
 */
package assignment;

/*import java.util.Arrays;*/

public class Appointment implements Cloneable{
	
	private String name;
	private String purpose;
	private Date date;
	private Time time;
	private MeetingRoom room;
	
	
	/*Constructor method*/
	public Appointment(String name, String purpose, Date date, Time time, MeetingRoom room) {
		
		this.name = name;
		this.purpose = purpose;
		this.date = date;
		this.time = time;
		this.room = room;
		
		
	}
	
	/*The lines of code here are to allow the Appointment object class to be cloned */ 
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	/*Setters*/
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setTime(Time time) {
		this.time = time;
	}
	
	public void setRoom(MeetingRoom room) {
		this.room = room;
	}
	
	/*Getters*/
	public String getName() {
		return name;
		
	}
	
	public String getPurpose() {
		return purpose;
	}
	
	public Date getDate() {
		return date;
	}
	
	public Time getTime() {
		return time;
		
	}
	
	public MeetingRoom getMeetingRoom() {
		return room;
		
	}
	/*This is the searching algorithm to find a set value within the array of appointments created in Test003*/
	public void searchRoom(Appointment[] array1, MeetingRoom searchingFor) {
		for(int i = 0; i < array1.length; i++) {
			Appointment temp = array1[i];
			if(temp.getMeetingRoom()== searchingFor) {
				System.out.println(searchingFor + " is found in appointment: " + array1[i]);		
			}
		}
	}
	
	public void searchName(Appointment[] array1, String searchingFor) {
		for(int i = 0; i < array1.length; i++) {
			Appointment temp = array1[i];
			if(temp.getName()== searchingFor) {
				System.out.println(searchingFor + " is found in appointment: " + array1[i]);		
			}
		}
	}
	
	public void searchDate(Appointment[] array1, Date searchingFor) {
		for(int i = 0; i < array1.length; i++) {
			Appointment temp = array1[i];
			if(temp.getDate()== searchingFor) {
				System.out.println(searchingFor + " is found in appointment: " + array1[i]);		
			}
		}
	}
	
	public void searchTime(Appointment[] array1, Time searchingFor) {
		for(int i = 0; i < array1.length; i++) {
			Appointment temp = array1[i];
			if(temp.getTime()== searchingFor) {
				System.out.println(searchingFor + " is found in appointment: " + array1[i]);		
			}
		}
	}
		/**As explained in the Test003 class, none of my sorting algorithms worked completely therefore I have commented them out of the code using javadoc commenting 
		 * This way they are still visible but will allow the rest of the code (especially the test003 class to run without error
		 * 	
		 * public void sortArray(Appointment[] array2) {
		 * 		Arrays.sort(array2, 0, 2);
		 * }
		 */
		/**
		 * Date closestDate = array2[0].getDate();
		 *for(int i = 0; i< array2.length; i++) {
		 *	Appointment temp = array2[i];
	     *  if(temp.getDate() < closestDate) {	
	     *    }
	     *  }
		 */
		
	
	
	/*The toString method allows each appointment object to be displayed in a readable manner*/
	public String toString() {
		String s;
		s = "NAME: " + name + " ## Purpose: " + purpose + " ## DATE: " + date + " ## TIME: " + time + " ## IN ROOM: " + room + " ##";
		return s;
	}


}
