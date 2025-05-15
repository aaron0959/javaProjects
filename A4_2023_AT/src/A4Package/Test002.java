package A4Package;

/**
 * @author Aaron Townley
 * @version 1.0
 */
import java.util.Map;
import java.util.TreeMap;

public class Test002{

	/**
	 * This main class is for all the tasks given to complete in part 2
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
		
		TreeMap<RegNo, Car> treeCarInfo = new TreeMap<RegNo, Car>();
		
		dvla.insertInfo(treeCarInfo, reg1, car1);
		dvla.insertInfo(treeCarInfo, reg2, car2);
		dvla.insertInfo(treeCarInfo, reg3, car3);
		
		//dvla.showAllCarData();
		
		for(Map.Entry<RegNo, Car> entry : treeCarInfo.entrySet()) {
			RegNo regNo = entry.getKey();
			Car car = entry.getValue();
			
			System.out.println("Reg No: "+ regNo.getRegNo());
			System.out.println("Car Details: "+ car.toString());
			
		}
		
		
		
		
		
		
		
		
		

	}

}
