/**
 * @author Aaron Townley
 * @version 1.0
 */
package A4Package;

import java.util.HashMap;

public class Test004 {

	/**
	 * This main class is for the tasks required to be completed in part 4
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car car1 = new Car("Toyota", "GTR", "Red", Month.January);
		Car car2 = new Car("Ford", "Mustang", "Yellow", Month.October);
		Car car3 = new Car("Chevrolet", "Chevelle", "Blue", Month.July);
		Car car4 = new Car("Mazda", "3", "Red", Month.January);
		
		
		
		Address address1 = new Address("Great Moore Street", "Bolton", "BL3 6DS");
		Address address2 = new Address("Hulton Lane", "Bolton", "BL3 4LA");
		Address address3 = new Address("College Way", "Bolton", "BL3 5AC");
		Address address4 = new Address("Hastings Road", "Bolton", "BL4 3AB");
				
		Keeper keeper1 = new Keeper("Aaron", "Townley", address1);
		Keeper keeper2 = new Keeper("B'Zackary", "Hellier", address2);
		Keeper keeper3 = new Keeper("Tia", "Barton", address3);
		Keeper keeper4 = new Keeper("Zak", "Irvin", address4);
		
		DVLA dvla = new DVLA();
		
		
		HashMap<Car, Keeper> carDetails = new HashMap<Car, Keeper>();
		
		
		
		
		dvla.insertCarData(carDetails, car1, keeper1);
		dvla.insertCarData(carDetails, car2, keeper2);
		dvla.insertCarData(carDetails, car3, keeper3);
		dvla.insertCarData(carDetails, car4, keeper4);
		
		
		dvla.reminder(carDetails, Month.December);
		dvla.reminder(carDetails, Month.September);
		
		dvla.warningLetter(carDetails, Month.January);
		
	}

}
