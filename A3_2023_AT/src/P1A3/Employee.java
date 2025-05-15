/**
 * @author aaron
 * 
 * @version 8/12/2023
 * 
 * This class is to set up the main object class for the tree within the entire project
 */
package P1A3;

public class Employee implements Cloneable {
	
		private String forename;
		private String surname;
		private String title;
		private float salary;
		
		/**
		 * Constructor class to set up the object class
		 * @param fn
		 * @param sn
		 * @param title
		 * @param salary
		 */
		public Employee(String fn, String sn, String title, float salary) {
			this.forename = fn;
			this.surname = sn;
			this.title = title;
			this.salary = salary;
		}
		
		/**
		 * This is a setter method for the forename variable
		 * @param forename
		 */
		public void setForename(String forename) {
			this.forename = forename;
		}
		
		/**
		 * Setter method for the surname variable
		 * @param surname
		 */
		public void setSurname(String surname) {
			this.surname = surname;
		}
		
		/**
		 * Setter method for the title variable
		 * @param title
		 */
		public void setTitle(String title) {
			this.title = title;
		}
		
		/**
		 * Setter method for the salary variable
		 * @param salary
		 */
		public void setSalary(float salary) {
			this.salary = salary;
		}
		
		/**
		 * Getter method for the forename variable
		 * @return
		 */
		public String getForename() {
			return forename;
		}
		
		/**
		 * Getter method for the surname variable
		 * @return
		 */
		public String getSurname() {
			return surname;
		}
		
		/**
		 * Getter method for the title variable
		 * @return
		 */
		public String getTitle() {
			return title;
		}
		
		/**
		 * Getter method for the salary variable
		 * @return
		 */
		public float getSalary() {
			return salary;
		}
		
		/**
		 * To string method to concatenate all the individual attributes of the Employee object
		 */
		public String toString() {
			String s;
			s = "Name: " + forename + " " + surname +"\n Title: " + title +"\n Salary: £" + salary;
			return s;
		}
}

