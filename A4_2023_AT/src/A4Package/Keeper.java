/**
 * @author Aaron Townley
 * @version 1.0
 */
package A4Package;

public class Keeper {
	
	private String forename;
	private String surname;
	private Address address;
	
	/**
	 * Constructor method for Keeper class
	 * @param fn
	 * @param sn
	 * @param add
	 */
	public Keeper(String fn, String sn, Address add) {
		
		this.forename = fn;
		this.surname = sn;
		this.address = add;
		
	}
	
	/**
	 * Getters & Setters
	 */
	
	/**
	 * setter for forename attribute
	 * @param inpFN
	 */
	public void setForename(String inpFN) {
	
		this.forename = inpFN;
		
	}
	
	/**
	 * setter for surname attribute
	 * @param inpSN
	 */
	public void setSurname(String inpSN) {
		
		this.surname = inpSN;
		
	}
	
	/**
	 * setter for address attribute 
	 * @param inpAdd
	 */
	public void setAddress(Address inpAdd) {
		
		this.address = inpAdd;
		
	}
	
	/**
	 * getter for forename attribute
	 * @return
	 */
	public String getFN() {
		return forename;
	}
	
	/**
	 * getter for surname attribute
	 * @return
	 */
	public String getSN() {
		return surname;
	}
	
	/**
	 * getter for address attribute
	 * @return
	 */
	public Address getAdd() {
		return address;
	}
	
	/**
	 * toString method for the Keeper class to print all the details
	 * @return
	 */
	public String toString() {
		String s;
		s = "Name: " + forename + " " + surname + " |Address: " + address.toString();
		return s;
	}

}
