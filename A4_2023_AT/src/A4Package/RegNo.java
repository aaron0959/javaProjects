/**
 * @author Aaron Townley
 * @version 1.0
 */

package A4Package;

public class RegNo implements Comparable<RegNo>{
	
	private String regNo;

	/**
	 * Constructor method for RegNo Class
	 * @param RN
	 */
	public RegNo(String RN) {
		this.regNo = RN;
	}
	
	/**
	 * Getter & Setter
	 */
	
	/**
	 * Setter for regNo attribute
	 * @param inpRegNo
	 */
	public void setRegNo(String inpRegNo) {
		this.regNo = inpRegNo;
	}
	
	/**
	 * getter for regNo attribute
	 * @return
	 */
	public String getRegNo() {
		return regNo;
	}
	
	/**
	 * toString method for regNo so its clearly displayed if needed 
	 * @return
	 */
	public String toString() {
		String s;
		s = regNo;
		return s;
	}

	/**
	 * Compare to method for the registration as it implements Comparable
	 */
	public int compareTo(RegNo other) {
		if(this.regNo.compareTo(other.regNo)!=0) {
			return this.regNo.compareTo(other.regNo);
			
		}else {
			return this.regNo.compareTo(other.regNo);
		}
	}
}
