/**
 * @author Aaron Townley
 * @version 1.0
 * 
 * Here we will store the time of the appointments using hours and minutes 
 */
package assignment;

public class Time implements Cloneable{
	
	private int hour;
	private int minute;
	
	private String hourAsString;
	private String minAsString;
	private String timeAsString;
	/*Constructor method*/
	public Time() {
		hour = 0;
		minute = 0;
	}
	/*Constructor method*/
	public Time(int hour, int minute) {
		
		this.hour = hour;
		this.minute = minute;
		
		//hourAsString = this.hourAsString;
		//minAsString = this.minAsString;
		//timeAsString = this.timeAsString;
	}
	/*Constructor method*/
	public Time(Time time) {
		this.hour = time.hour;
		this.minute = time.minute;
	}
	
	/*The lines of code here are to allow the Time object class to be cloned */ 
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	/*Setters*/
	public void setHour(int hour) {
		hourAsString = Integer.toString(hour);
	}
	
	public void setMinute(int minute) {
		minAsString = Integer.toString(minute);
	}
	/*Getters*/
	public String getHour() {
		return hourAsString;
		
	}
	
	public String getMinute() {
		return minAsString;
	}
	
	public String getTime() {
		getHour();
		getMinute();
		
		timeAsString = "TIME:" + hourAsString + ":" + minAsString;
		
		return timeAsString; 
		
		
		
	}
	
	public String toString() {
		String s;
		s = hour + ":" + minute;
		return s;
	}
	



}
