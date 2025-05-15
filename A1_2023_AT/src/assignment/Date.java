/**
 * @author Aaron Townley
 * @version 1.0
 * 
 * This class is the date class. Here we will use this for the day month and year of appointments
 */
package assignment;

public class Date implements Cloneable{
	
	private int day;
	private int month;
	private int year;
	
	/*Constructor method*/
	public Date() {
		day = 0;
		month = 0;
		year = 0;
	}

	/*Constructor method*/
	public Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	/*Constructor method*/
	public Date(Date date) {
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}
	/*The lines of code here are to allow the Date object class to be cloned */ 
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	/*Setters*/
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	/*Getters*/
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public String toString() {
		String s;
		s = day + "-" + month + "-" + year;
		return s;
	}
	
	
	

	
}

