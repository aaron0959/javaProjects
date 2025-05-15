/**
 * @author Aaron Townley
 * @version 1.0
 */
package A4Package;



public class Car{
	
	private String make;
	private String model;
	private String colour;
	private Month taxExpiresEndMonth;
	
	/**
	 * Constructor method for Car class
	 * @param newMake
	 * @param newModel
	 * @param newColour
	 * @param newTax
	 */
	public Car(String newMake, String newModel, String newColour, Month newTax){
		this.make = newMake;
		this.model = newModel;
		this.colour = newColour;
		this.taxExpiresEndMonth = newTax;
	}
	
	/*
	 * Getters and setters
	 */
	
	/**
	 * setter for make attribute
	 * @param inpMake
	 */
	public void setMake(String inpMake) {
		this.make = inpMake;
	}
	
	/**
	 * setter for model attribute
	 * @param inpModel
	 */
	public void setModel(String inpModel) {
		this.model = inpModel;
	}
	
	/**
	 * setter for colour attribute
	 * @param inpColour
	 */
	public void setColour(String inpColour) {
		this.colour = inpColour;
	}
	
	/**
	 * setter for month attribute
	 * @param inpMonth
	 */
	public void setTax(Month inpMonth) {
		this.taxExpiresEndMonth = inpMonth;
	}
	
	/**
	 * getter method for make attribute
	 * @return
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * getter method for model attribute
	 * @return
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * getter for colour attribute
	 * @return
	 */
	public String getColour() {
		return colour;
	}
	
	/**
	 * getter for month attribute
	 * @return
	 */
	public Month getTaxMonth() {
		return taxExpiresEndMonth;
	}
	
	/**
	 * toString method for all details of the Car
	 * @return
	 */
	public String toString() {
		String s;
		s = "Make: " + make + " |Model: " + model + " |Colour: " + colour + "|Tax ends: " + taxExpiresEndMonth;
		return s;
	}


}
