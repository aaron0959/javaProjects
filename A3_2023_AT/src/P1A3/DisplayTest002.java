/**
 * This class is a tester class for the second part of the project
 * 
 * @author aaron
 * 
 * @version 8/12/2023
 */
package P1A3;
import javax.swing.tree.DefaultMutableTreeNode;



public class DisplayTest002 {	
	/**
	 * THis is the mai method of the class to create objects to be added to the tree structure
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Mohammed", "Ali", "Senior Partner", 120000);
		Employee employee2 = new Employee("Sara", "Johnson", "Managing Partner", 89000);
		Employee employee3 = new Employee("Sandra", "Dee", "Partner", 78500);
		Employee employee4 = new Employee("Fred", "Dibner", "Finance Manager", 67900);
		Employee employee5 = new Employee("Cleo", "Patra", "Junior Partner", 45000);
		Employee employee6 = new Employee("Irfan", "Patel", "Junior Partner", 45000);
		Employee employee7 = new Employee("George", "Bush", "Office Manager", 37000);
		Employee employee8 = new Employee("Harry", "Potter", "Solicitor", 52500);
		Employee employee9 = new Employee("Ronald", "Reagan", "Senior Clerk", 22000);
		Employee employee10 = new Employee("Simon", "Templar", "Finance Officer", 18000);
		Employee employee11 = new Employee("Jacob", "Heart", "Clerk", 16000);
		Employee employee12 = new Employee("Barry", "Dwyer", "Clerk", 16000);
		Employee employee13 = new Employee("Mary", "Fritz", "Clerk", 16000);
		Employee employee14 = new Employee("Gordon", "Brown", "Finance Clerk", 16500);
		
		
		DefaultMutableTreeNode Employee1 = new DefaultMutableTreeNode(employee1);
		DefaultMutableTreeNode Employee2 = new DefaultMutableTreeNode(employee2);
		DefaultMutableTreeNode Employee3 = new DefaultMutableTreeNode(employee3);
		DefaultMutableTreeNode Employee4 = new DefaultMutableTreeNode(employee4);
		DefaultMutableTreeNode Employee5 = new DefaultMutableTreeNode(employee5);
		DefaultMutableTreeNode Employee6 = new DefaultMutableTreeNode(employee6);
		DefaultMutableTreeNode Employee7 = new DefaultMutableTreeNode(employee7);
		DefaultMutableTreeNode Employee8 = new DefaultMutableTreeNode(employee8);
		DefaultMutableTreeNode Employee9 = new DefaultMutableTreeNode(employee9);
		DefaultMutableTreeNode Employee10 = new DefaultMutableTreeNode(employee10);
		DefaultMutableTreeNode Employee11 = new DefaultMutableTreeNode(employee11);
		DefaultMutableTreeNode Employee12 = new DefaultMutableTreeNode(employee12);
		DefaultMutableTreeNode Employee13 = new DefaultMutableTreeNode(employee13);
		DefaultMutableTreeNode Employee14 = new DefaultMutableTreeNode(employee14);
		

		Employee1.add(Employee2);
		Employee1.add(Employee3);
		Employee1.add(Employee4);
		
		Employee2.add(Employee5);
		Employee2.add(Employee6);
		Employee2.add(Employee7);
		
		Employee3.add(Employee8);
		Employee3.add(Employee9);
		
		Employee4.add(Employee10);
		
		Employee7.add(Employee11);
		Employee7.add(Employee12);
		
		Employee9.add(Employee13);

		Employee10.add(Employee14);
		
		displayTree(Employee1, 0);
		
		System.out.println("#################################################################");
		
		earnsOver(Employee1, 50000);
		
		System.out.println("#################################################################");

		hasSubordinates(Employee1, 0);
		
		

	}
	
	/**
	 * This is a method to display the whole tree in the correct structure
	 * @param node
	 * @param depth
	 */
	private static void displayTree(DefaultMutableTreeNode node, int depth) {
		
		Employee employee = (Employee) node.getUserObject();
		System.out.println("\t".repeat(depth) + employee.toString());
		
		for (int i = 0; i<node.getChildCount(); i++) {
			displayTree((DefaultMutableTreeNode) node.getChildAt(i), depth+1);
		}
		
	}
	
	/**
	 * THis method is to see what objects on the tree have a value over a certain amount for their salary attribute
	 * THis will loop through the whole tree to find each one
	 * @param node
	 * @param amount
	 */
	private static void earnsOver(DefaultMutableTreeNode node, double amount) {
		
		Employee employee = (Employee) node.getUserObject();
		if( employee.getSalary() >=  amount) {
			System.out.println(employee.toString());
			for (int i = 0; i<node.getChildCount(); i++) {
				earnsOver((DefaultMutableTreeNode) node.getChildAt(i), amount);
			}
			
			}
		
	}
	
	/**
	 * THis method is to check if each node has child objects too. IF they do they are displayed in the console and the number of children is also shown
	 * @param node
	 * @param depth
	 */
	private static void hasSubordinates(DefaultMutableTreeNode node, int depth) {
		
		Employee employee = (Employee) node.getUserObject();
		
		
			if(node.getChildCount()>0) {
				System.out.println(employee.toString() + "\n Subordinate Count: " + node.getChildCount());
				for(int i = 0; i<node.getChildCount(); i++) {
					hasSubordinates((DefaultMutableTreeNode) node.getChildAt(i), depth);
			}
			
			
			
		}
		
	}

}
