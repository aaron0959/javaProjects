/**
 * @author Aaron Townley
 * @version 1.0
 */
package A4Package;

import java.util.HashMap;

public class Test001 {

	/**
	 * This main class is for all the tasks required in part 1
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("Toyota", "GTR", "Red", Month.January);
		Car car2 = new Car("Ford", "Mustang", "Yellow", Month.October);
		Car car3 = new Car("Chevrolet", "Chevelle", "Blue", Month.July);
		
		RegNo reg1 = new RegNo("FH16 AOX");
		RegNo reg2 = new RegNo("KS06 LXG");
		RegNo reg3 = new RegNo("SO04 BLV");
		
		DVLA dvla = new DVLA();
		
		HashMap<RegNo, Car> carInfo = new HashMap<RegNo, Car>();
		
		dvla.insertInfo(carInfo, reg1, car1);
		dvla.insertInfo(carInfo, reg2, car2);
		dvla.insertInfo(carInfo, reg3, car3);
		
		dvla.showAllCars(carInfo);
		
		
		

	}

}
