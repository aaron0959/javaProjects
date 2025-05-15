/**
 * @author Aaron T
 * @version 2201525
 * 
 * College Class
 */


package FristonCollege;
import FristonCollege.Student;
import java.util.ArrayList;



public class College {
	
	private ArrayList<Student> students;
	private ArrayList<Course> courses;
	
	/**
	 * Constructor method for the College class
	 * In this class we set up arraylists for both students and courses
	 * 
	 */
	public College() {
		students = new ArrayList<Student>();
		courses = new ArrayList<Course>();
		
	}
	
	/**
	 * Methood to add students to the arraylist
	 * @param newStudent temp variable to store new student details before adding to arraylist
	 */
	public void addStudents(Student newStudent) {
		students.add(newStudent);
	}
	
	/**
	 * Methood to add courses to the arraylist
	 * @param newCourse temp variable to store new course details before adding to arraylist
	 */
	public void addCourses(Course newCourse) {
		courses.add(newCourse);
		
	}
	
	
	/**
	 * Method to list all students within the arraylist
	 * 
	 */
	public void listStudents() {
		for(Student s: students) {
			s.printStudentDetails();
		}
	}
	
	/**
	 * This method is a search function to search for particular students using a last name
	 * @param surname the temp variable which stores the search keyword
	 */
	public void searchStudentByLastName(String surname) {
		System.out.println("Students with last name " + surname +": ");
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getSurname() == surname){
				students.get(i).printStudentDetails();
			}
		}
		
	}
	
	/**
	 * This method is a search function to search for particular students using an ID
	 * @param ID the temp variable which stores the ID to search with
	 */
	public void searchStudentByID(int ID) {
		System.out.println("Students with ID number " + ID +": ");
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStudentID() == ID){
				students.get(i).printStudentDetails();
			}
		}
		
	}
	
	public void removeStudentUsingID(int ID) {
		
		System.out.println("Removing student with ID "+ ID);
		for (int i = 0; i< students.size(); i++ ) {
			if(students.get(i).getStudentID() == ID) {
				students.remove(i);
			}
		}
		
	}
	
	/**
	 * Method to list all students within the arraylist
	 * 
	 */
	public void listCourses() {
		for(Course c: courses) {
			c.printCourseDetails();
		}
	}
	
	/**
	 * This method is a search function to search for particular courses using the title
	 * @param name the temp variable which stores the name to search with
	 */
	public void searchCourseByTitle(String name) {
		System.out.println("Courses with title " + name + ": ");
		for (int i = 0; i < courses.size(); i++ ) {
			if (courses.get(i).getCourseTitle() == name) {
				courses.get(i).printCourseDetails();
			}
		}
	}
	
	/**
	 * This method is a search function to search for particular courses  using an ID
	 * @param ID the temp variable which stores the ID to search with
	 */
	public void searchCourseByID(int ID) {
		System.out.println("Course with ID number " + ID + ": ");
		for (int i = 0; i < courses.size(); i++ ) {
			if (courses.get(i).getCourseNumber() == ID) {
				courses.get(i).printCourseDetails();
			}
		}
	}
	
	
/**
 * Method to remove courses by using id number
 * 
 * @param ID the search function
 */
public void removeCourseUsingID(int ID) {
		
		System.out.println("Removing course with ID "+ ID);
		for (int i = 0; i< courses.size(); i++ ) {
			if(courses.get(i).getCourseNumber() == ID) {
				courses.remove(i);
			}
		}
		
	}


public Student returnStudentRefWithID(int ID) {
	System.out.println("Searching for student with ID: "+ ID);
	
	for (int i = 0; i< students.size(); i++) {
		if (students.get(i).getStudentID()==ID) {
			int index = i;
			
		}
	}
	
	return students.get(index);
}

public Course returnCourseRefWithID(int ID) {
	System.out.println("Searching for course with ID: "+ ID);
	
	for (int i = 0; i<courses.size(); i++) {
		if (courses.get(i).getCourseNumber()==ID) {
			int index = i;
			
		}
	}
	
	return courses.get(index);
}

/**
 * The tester class where I've set up many Student and COurse objects and put them into their respective arraylist set up earlier. Here I can run all the methods to test that all the classes work
 * @param args
 */
public static void main(String[] args) {
	
		
	Student studentA = new Student("Aaron", "Townley", 07516561000, 11111111);
	Student studentB = new Student("B'Zackary", "Hellier",  07516561001, 11122233);
	Student studentC = new Student("James", "Cage-White", 07516561002, 99987456);
	Student studentD = new Student("Callum", "Sherrat", 07516561003, 22235648);
	Student studentE = new Student("Tia", "Sherrat", 07516561004, 99999999);
	Student studentF = new Student("Matthew", "Townley", 07516561005, 22222222);
	
	Course courseA = new Course("Software Engineering", 9250.69, 88888888);
	Course courseB = new Course("Psychology", 5500.25, 55555555);
	Course courseC = new Course("Motorsport Engineering", 9250.69, 66666645);
	Course courseD = new Course("Illustration", 45.23, 12345678);
	Course courseE = new Course("Business", 45.23, 45678923);
	Course courseF = new Course("Graphic Design", 9250.69, 12365498);
	
	College friston = new College();
	
	friston.addStudents(studentA);
	friston.addStudents(studentB);
	friston.addStudents(studentC);
	friston.addStudents(studentD);
	friston.addStudents(studentE);
	friston.addStudents(studentF);
	
	friston.addCourses(courseA);
	friston.addCourses(courseB);
	friston.addCourses(courseC);
	friston.addCourses(courseD);
	friston.addCourses(courseE);
	friston.addCourses(courseF);
	
	friston.listStudents();
	friston.searchStudentByID(11111111);
	friston.searchStudentByLastName("Townley");
	friston.removeStudentUsingID(11111111);
	friston.listStudents();
	
	friston.listCourses();
	friston.searchCourseByTitle("Software Engineering");
	friston.searchCourseByID(88888888);
	friston.removeCourseUsingID(88888888);
	friston.listCourses();

	
	
	
	//friston.displayStudentsFull();
		
	}
	
}

