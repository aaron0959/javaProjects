/**
 * @author Aaron Townley
 * @version 1.0
 *
 *
 *This tester class is for stage 3 of the assignment
 */
package assignment;
import java.util.ArrayList;


public class Test_003 {

	public static void main(String[] args) {
		Date d1 = new Date(25, 10, 2023);
		Time t1 = new Time(10, 30);
		MeetingRoom r1 = new MeetingRoom("b52");
		Appointment appointment1 = new Appointment("Aaron", "Stomach bug", d1, t1, r1);
		
		Date d2 = new Date(30, 11, 2023);
		Time t2 = new Time(10, 45);
		MeetingRoom r2 = new MeetingRoom("d79");
		Appointment appointment2 = new Appointment("B'Zackary", "Hair issues", d2, t2, r2);
		
		Date d3 = new Date(11, 9, 2023);
		MeetingRoom r3 = new MeetingRoom("a45");
		Appointment appointment3 = new Appointment("Tia", "Fake ginger :)", d3, t1, r3);
		/*array list creation*/
		ArrayList<Appointment> AppointmentArrayList = new ArrayList<Appointment>();
		
		AppointmentArrayList.add(appointment1);
		AppointmentArrayList.add(appointment2);
		AppointmentArrayList.add(appointment3);
		
		for(int i = 0; i< AppointmentArrayList.size(); i++) {
			System.out.println(AppointmentArrayList.get(i));
		}
		
		System.out.println("-----------------------------------------------------------------------");
		/*array creation*/
		
		Appointment[] AppointmentArray = {appointment1, appointment2, appointment3};
		
		for(int i = 0; i< AppointmentArray.length; i++) {
			System.out.println(AppointmentArray[i]);
		}
		System.out.println("-----------------------------------------------------------------------");
		/*search*/
		appointment1.searchRoom(AppointmentArray, r1);
		appointment1.searchName(AppointmentArray, "Aaron");
		appointment1.searchDate(AppointmentArray, d1);
		appointment1.searchTime(AppointmentArray, t1);
		System.out.println("-----------------------------------------");
		/**
		 * Sorting algorithm for sorting the array
		 * 
		 * I ran into problems when making this, within the appointment class are both attempts I made to sort the array given
		 * Therefore as this would ruin the rest of the test class I have decided to comment out the methods and the functions at the bottom of this tester class using javadoc commenting technique
		 * This way, the code is still visible however will create no impact on the rest of my classes whatsoever.
		 * 
		 * System.out.println(AppointmentArray);
		 * appointment1.sortArray(AppointmentArray);
		 * System.out.println(AppointmentArray);
		 * 
		 */
		
		
		
		
		
		

	}

}
