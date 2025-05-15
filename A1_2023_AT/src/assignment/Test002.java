/**
 * @author Aaron Townley
 * @version 1.0
 *
 *
 *This tester class is for stage 2 of the assignment
 */
package assignment;


public class Test002 implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
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
		
		
		Appointment appointment4 = appointment1;
		
		Appointment appointment5 = (Appointment)appointment3.clone();
		
		/*Evidence of shallow copying*/
		System.out.println("If shallow copy true, if deep copy false: ");
		System.out.println(appointment1 == appointment4);
		/*showing these objects have not been shallow copied*/	
		System.out.println("Shallow = True, Deep = false");
		System.out.println(appointment2 == appointment4);
		/*deep copying*/
		System.out.println("If shallow true, if deep false");
		System.out.println(appointment3 == appointment5);
		System.out.println("------------------------------------------");
		
		/*Proof of shallow copying using .hashCode() for indexes -- showing they are identical indexes*/
		System.out.println("(Original)Appointment1: " +appointment1.hashCode());
		System.out.println("(Shallow Copied Appointment1)Appointment4: " +appointment4.hashCode());
		System.out.println("------------------------------------------");
		/*Proof of deep copying using .hashCode() for indexes -- showing they are different indexes*/
		System.out.println("(Original) Appointment3: " +appointment3.hashCode());
		System.out.println("(Deep Copied Appointment3)Appointment3: " +appointment5.hashCode());
		
		

	}

}
