/**
 * @author Aaron T
 * @version 2201525
 * 
 * Course Class
 */


package FristonCollege;




public class Course {
	private int courseNumber;
	private String courseTitle;
	private double courseFee;
	
	/**
	 * Constructor method for the course class
	 * @param NcourseTitle declares courseTitle variable
	 * @param NcourseFee declares the variable for the courseFee
	 */
	public Course(String NcourseTitle, double NcourseFee, int nCN) {
		
		courseTitle = NcourseTitle;
		courseFee = NcourseFee;
		courseNumber = nCN;
	
	}
	
	/**
	 * Sets course number
	 * 
	 * @param ID changes the number of the course
	 */
	public void setCourseNumber(int ID) {
		courseNumber = ID;
		
	}
	
	/**
	 * Accessor method for course number
	 * @return the course number
	 * 
	 */
	public int getCourseNumber() {
		return courseNumber;
	}
	
	/**
	 * Mutator method for the course title
	 * @param nCT changes the name of the course title
	 */
	public void setCourseTitle(String nCT) {
		courseTitle = nCT;
		
	}
	
	/**
	 * Accessor method for the couurse title
	 * @return the course's title
	 */
	public String getCourseTitle() {
		return courseTitle;
		
	}
	
	/**
	 * Mutator method for the fee of the course
	 * @param nCF changes the fee of the course
	 */
	public void setCourseFee(double nCF) {
		courseFee = nCF;
		
	}
	
	/**
	 * Accessor method for the course's fee
	 * @return the cost of the course
	 */
	public double getCourseFee() {
		return courseFee;
		
	}
	
	/**
	 * 
	 * Prints all details of the course
	 */
	public void printCourseDetails() {
		System.out.println("###############################################");
		System.out.println("Course Title: "+ courseTitle);
		System.out.println("###############################################");
		System.out.println("Course Number: "+ courseNumber);
		System.out.println("###############################################");
		System.out.println("Course Fee: "+ courseFee);
		System.out.println("###############################################");
	}

}
