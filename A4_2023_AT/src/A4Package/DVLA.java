/**
 * @author Aaron Townley
 * @version 1.0
 */
package A4Package;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;



public class DVLA {
	
		/**
		 * HashMap for RegNo
		 * Key: RegNo, Value:Car
		 */
	
		/**
		 * This method is for inserting data into a hashmap relating the Car class to the Reg class
		 * @param registration
		 * @param tempReg
		 * @param tempCar
		 */
		public void insertRegData(Map<RegNo, Car> registration,RegNo tempReg, Car tempCar) {
			registration.put(tempReg, tempCar);
		}
		
		/**
		 * This method iterates through the hashmap given and will print all the values within the map
		 * @param registration
		 */
		public void showAllRegData(Map<RegNo, Car> registration) {
			for(RegNo i: registration.keySet()) {
				System.out.println("Reg Number: " + i.toString() + " |Car details: " + registration.get(i).toString());
				
			}
		}
	
		/**
		 * HashMap for Car
		 * Key: Car, Value: Keeper
		 */
	
		/**
		 * This method creates a hashmap that links the car class to the keeper class
		 * @param car
		 * @param tempCar
		 * @param tempKeeper
		 */
		public void insertCarData(Map<Car, Keeper> car, Car tempCar, Keeper tempKeeper) {
			car.put(tempCar, tempKeeper);
		}
		
		/**
		 * This method iterates through the hashmap and will print all the details of the hashmap relating car to keeper
		 * @param car
		 */
		public void showAllCarData(Map<Car, Keeper>car) {
			for(Car i: car.keySet()) {
				System.out.println("Car details: " + i.toString() + " |Owner details: " + car.get(i).toString());
			}
		}

	
		/**
		 * HashMap for Keeper
		 * Key: Keeper, Value: Address
		 */
		HashMap<Keeper, Address> keeper = new HashMap<Keeper, Address>();
		public void insertKeeperData(Keeper tempKeeper, Address tempAddress) {
			keeper.put(tempKeeper, tempAddress);
		}
		
		public void showAllKeeperData() {
			for(Keeper i: keeper.keySet()) {
				System.out.println("Keeper details: " + i.toString());
			}
		}
		
		/**
		 * Method to insert data into a hashmap that relates the car class to the reg class
		 * @param carInfo
		 * @param tempRegNo
		 * @param tempCar
		 */
		public void insertInfo(Map<RegNo, Car> carInfo, RegNo tempRegNo, Car tempCar) {
			carInfo.put(tempRegNo, tempCar);
		}
		
		/**
		 * This method iterates through the hashmap that links car class ot reg class and will print all the data out
		 * @param carInfo
		 */
		public void showAllCars(Map<RegNo, Car> carInfo) {
			for(RegNo i: carInfo.keySet()) {
				System.out.println("Car details: " + i.toString() + " |Registration: " + carInfo.get(i).toString());
			}
		}
		
		/**
		 * This method is designed to send a reminder to the keepers that their tax will need renewing soon.
		 * @param tempCar
		 * @param tempMonth
		 */
		public void reminder(Map<Car, Keeper> tempCar, Month tempMonth) {
			String reminderList;
			reminderList = "";
			ArrayList<Keeper> reminder = new ArrayList<Keeper>();
			for(Car i: tempCar.keySet()) {
				if(i.getTaxMonth().getMonthValue() == tempMonth.getNextMonthValue(tempMonth)){
					reminder.add(tempCar.get(i));
					}
			}
			for(int a=0; a<reminder.size(); a++) {
				reminderList += reminder.get(a) + "\n";
		}
			System.out.println("These owners will need to renew thier car tax soon: \n" + reminderList);
			
		}
		
		/**
		 * This method sends a notice to the keepers whos tax has expired already and it needs renwign immediately.
		 * @param tempCar
		 * @param tempMonth
		 */
		public void warningLetter(Map<Car, Keeper> tempCar, Month tempMonth) {
			String warningList;
			warningList = "";
			ArrayList<Keeper> warning = new ArrayList<Keeper>();
			for(Car i: tempCar.keySet()) {
				if(i.getTaxMonth() == tempMonth) {
					warning.add(tempCar.get(i));
				}
			
			
			
				
			}
			for(int a = 0; a < warning.size();a++) {
				warningList += warning.get(a) + "\n";
			
			}
			
			System.out.println("These cars will need their tax renewing IMMEDIATELY: \n" + warningList );
				
		
		}
}
