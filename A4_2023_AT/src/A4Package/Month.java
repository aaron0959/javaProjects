/**
 * @author Aaron Townley
 * @version 1.0
 */
package A4Package;

public enum Month {
	
	January(1), February(2), March(3), April(4), May(5), June(6), July(7), August(8), September(9), October(10), November(11), December(12);
	
	private final int monthValue;
	
	/**
	 * Constructor for month class
	 * @param monthValue
	 */
	Month(int monthValue){
		this.monthValue = monthValue;
	}
	
	/**
	 * getter for month attribute
	 * @return
	 */
	public int getMonthValue() {
		return monthValue;
	}
	
	/**
	 * method to get the next month after the one given. Mainly based for december looping to january
	 * @param tempMonth
	 * @return
	 */
	public int getNextMonthValue(Month tempMonth) {
		int tempValue = tempMonth.getMonthValue();
		int nextVal = 0;
		if(tempValue != 12) {
			nextVal = tempValue + 1;
		}
		else {
			nextVal = 1;
		}
		return nextVal;
	}
	

}