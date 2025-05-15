/**
 * @author Aaron Townley
 * @version 1.0
 */
package A4Package;

public class Address {
	
	private String street;
	private String town;
	private String postcode;
	
	/**
	 * Constructor method for Class Address
	 * @param tempStreet
	 * @param tempTown
	 * @param tempPostcode
	 */
	public Address(String tempStreet, String tempTown, String tempPostcode) {
		this.street = tempStreet;
		this.town = tempTown;
		this.postcode = tempPostcode;
	}
	
	/**
	 * Getters & Setters
	 */
	
	/**
	 * Setter for Street attribute
	 * @param inpStreet
	 */
	public void setStreet(String inpStreet) {
		this.street = inpStreet;	
	}
	
	/**
	 * Setter for Town attribute
	 * @param inpTown
	 */
	public void setTown(String inpTown) {
		this.town = inpTown;
	}
	
	/**
	 * Setter for postcode attribute
	 * @param inpPostcode
	 */
	public void setPostcode(String inpPostcode) {
		this.postcode = inpPostcode;
	}
	
	/**
	 * getter for attribute street
	 * @return
	 */
	public String getStreet() {
		return street;
	}
	
	/**
	 * getter for town attribute
	 * @return
	 */
	public String getTown() {
		return town;
	}
	
	/**
	 * getter for postcode attribute
	 * @return
	 */
	public String getPostcode() {
		return postcode;
	}
	
	/**
	 * toString method for the whole class
	 * @return
	 */
	public String toString() {
		String s;
		s = "Street: " + street + " |Town: " + town + " |Postcode: " + postcode;
		return s;
	}

}
