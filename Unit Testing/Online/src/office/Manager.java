package office;

import java.util.ArrayList;

/**
 * @author NIT
 */
public class Manager extends Employee {
	
	private String position;
	private ArrayList< Employee > employees;
	
	public Manager( String name , double monthlySalary , int age , int year , String position ) {
		super( name , monthlySalary , age , year );
		this.position = position;
		employees = new ArrayList<Employee>();
	}
	
	
	// Implement this. Return the list of employees under this manager
	public Employee[] getEmployees() {
//		return (Employee[]) employees.toArray();
		Employee[] emp = new Employee[employees.size()];
		employees.toArray( emp );
		return emp;
	}
	
	public void addEmployee( Employee e ) {
		employees.add( e );
	}
	
	// For each employee he manages manager gets a 5% increments
	public double get_increment() {
		if (monthlySalary < 0) return 0.0;
		return monthlySalary * (employees.size() * 0.05);
	}
	
	
}
