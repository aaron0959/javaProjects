/**
 * @author Aaron Townley
 * @version 1.0
 *
 *This tester class is for stage 1 of the assignment
 */
package assignment;

public class Test001 {

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
		Time t3 = new Time(13, 30);
		Appointment appointment3 = new Appointment("Tia", "odd behaviour", d3, t3, r1);
		
		System.out.println(appointment1.toString());
		System.out.println(appointment2.toString());
		System.out.println(appointment3.toString());
		
		
		
		System.out.println(d1);

	}

}
