/**
 * @author Aaron T
 * @version 2201525
 * 
 * Student Class
 */

package FristonCollege;


public class Student {

	private String forename;
	private String surname;
	private int phoneNumber;
	private int studentID;
	
	/**
	 * constructor class for Student
	 * @param nFN declares the variable forename
	 * @param nSN declares the variable surname
	 * @param nPN declares the phone number variable
	 */
	public Student(String nFN, String nSN, int nPN, int nID) {
		
		
		forename = nFN;
		surname = nSN;
		phoneNumber = nPN;
		studentID = nID;
	}
	
	/**
	 * Setter for student ID
	 * @param ID sets new ID number for student
	 */
	public void setID(int ID) {
		studentID = ID;
	}
	
	/**
	 * Accessor for student ID
	 * @return value of studentID 
	 */
	public int getStudentID() {
		return studentID;	
	}
	
	/**
	 * Mutator method for forename
	 * @param FN sets new forename for students if needed
	 */
	public void setForename(String FN) {
		forename = FN;
	}
	
	/**
	 * Accessor for forename
	 * @return the students forename
	 */
	public String getForename() {
		return forename;
	}
	
	/**
	 * Mutator for the students surname
	 * @param SN sets new surname for the student
	 */
	public void setSurname(String SN) {
		surname = SN;
	}
	
	/**
	 * Accessor method for the students surname
	 * @return the students surname
	 */
	public String getSurname() {
		return surname;		
	}
	
	/**
	 * Mutator method for the students phone number
	 * @param PN sets new value for students phone number
	 */
	public void setPhoneNumber(int PN) {
		phoneNumber = PN;
	}
	
	/**
	 * Accessor method for the students phone number
	 * @return students phone number
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Prints details of select student
	 * 
	 */
	public void printStudentDetails(){
		System.out.println("###############################################");
		System.out.println("Name: "+ forename + " " + surname);
		System.out.println("###############################################");
		System.out.println("Phone Number: "+ phoneNumber);
		System.out.println("###############################################");
		System.out.println("Student ID: "+ studentID);
		System.out.println("###############################################");
	}
}
