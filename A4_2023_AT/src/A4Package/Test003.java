/**
 * @author Aaron Townley
 * @version 1.0
 */
package A4Package;
import java.util.HashMap;

public class Test003 {
	
	/**
	 * This private method is for linking two hashmaps together to display them at the same time.
	 * @param carInfoHash
	 * @param car
	 * @param tempReg
	 * @param tempCar
	 * @param tempKeeper
	 */
	private static void registry(HashMap<RegNo, Car> carInfoHash, HashMap<Car, Keeper> car, RegNo tempReg, Car tempCar, Keeper tempKeeper) {
		DVLA dvla = new DVLA();
		carInfoHash.put(tempReg, tempCar);
		car.put(tempCar, tempKeeper);
		dvla.showAllRegData(carInfoHash);
		dvla.showAllCarData(car);
	}

	/**
	 * This main class is for all the tasks required in part 3
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car1 = new Car("Toyota", "GTR", "Red", Month.January);
		Car car2 = new Car("Ford", "Mustang", "Yellow", Month.October);
		Car car3 = new Car("Chevrolet", "Chevelle", "Blue", Month.July);
				
		RegNo reg1 = new RegNo("FH16 AOX");
		RegNo reg2 = new RegNo("KS06 LXG");
		RegNo reg3 = new RegNo("SO04 BLV");
				
		Address address1 = new Address("Great Moore Street", "Bolton", "BL3 6DS");
		Address address2 = new Address("Hulton Lane", "Bolton", "BL3 4LA");
		Address address3 = new Address("College Way", "Bolton", "BL3 5AC");
				
		Keeper keeper1 = new Keeper("Aaron", "Townley", address1);
		Keeper keeper2 = new Keeper("B'Zackary", "Hellier", address2);
		Keeper keeper3 = new Keeper("Tia", "Barton", address3);
				
		HashMap<RegNo, Car> carInfoHash = new HashMap<RegNo, Car>();
		HashMap<Car, Keeper> car = new HashMap<Car, Keeper>();

		
		registry(carInfoHash, car, reg1, car1, keeper1);
		registry(carInfoHash, car, reg2, car2, keeper2);
		registry(carInfoHash, car, reg3, car3, keeper3);
		
	}
}
