package office;

import static org.junit.Assert.*;

import org.junit.Test;


public class EmployeeTest {
	
	public EmployeeTest() {
	
	}
	
	// Implement this function, if yearly salary is greater than 2 lakhs 10% tax applied, for more than 5 lakhs 15% tax applied
	@Test
	public void calculateYearlySalary() {
		System.out.println( "Testing EmployeeTest.calculateYearlySalary()" );
		Employee e0 = new Employee( "A" , 0 , 50 , 2 );
		Employee e1 = new Employee( "B" , 100000 / 12.0 , 50 , 2 );
		Employee e2 = new Employee( "C" , 250000 / 12.0 , 50 , 2 );
		Employee e3 = new Employee( "D" , 550000 / 12.0 , 50 , 2 );
		assertEquals( "Expected Yearly Salary for 100000" , 100000 * 1.00 , e1.calculateYearlySalary() , 0.0 );
		assertEquals( "Expected Yearly Salary for 250000" , 250000 * 0.90 , e2.calculateYearlySalary() , 0.0 );
		assertEquals( "Expected Yearly Salary for 550000" , 550000 * 0.85 , e3.calculateYearlySalary() , 0.0 );
		
	}
	
	@Test
	public void get_increment() {
		System.out.println( "Testing EmployeeTest.get_increment()" );
		Employee e0 = new Employee( "A" , 100000 , 50 , 2 );
		Employee e1 = new Employee( "B" , 100000 , 50 , 6 );
		Employee e2 = new Employee( "C" , 100000 , 50 , 11 );
		Employee e3 = new Employee( "A1" , 200000 , 50 , 2 );
		Employee e4 = new Employee( "B1" , 200000 , 50 , 6 );
		Employee e5 = new Employee( "C1" , 200000 , 50 , 11 );
//		Employee e3 = new Employee( "D" , 100000 , 50 , 2 );
		assertEquals( "Expected Increment for 2" , 100000 * 0.00 , e0.get_increment() , 0.0 );
		assertEquals( "Expected Increment for 6" , 100000 * 0.05 , e1.get_increment() , 0.0 );
		assertEquals( "Expected Increment for 11" , 100000 * 0.10 , e2.get_increment() , 0.0 );
		assertEquals( "Expected Increment for 2.1" , 200000 * 0.00 , e3.get_increment() , 0.0 );
		assertEquals( "Expected Increment for 6.1" , 200000 * 0.05 , e4.get_increment() , 0.0 );
		assertEquals( "Expected Increment for 11.1" , 200000 * 0.10 , e5.get_increment() , 0.0 );
	}
	
	@Test
	public void getManagerName() {
		System.out.println( "Testing EmployeeTest.getManagerName()" );
		Employee e0 = new Employee( "A" , 100000 , 50 , 2 );
		Employee e1 = new Employee( "B" , 100000 , 50 , 6 );
		Employee e2 = new Employee( "C" , 100000 , 50 , 11 );
		Manager m1 = new Manager( "P" , 100000 , 60 , 2 , "MD" );
		Manager m2 = new Manager( "Q" , 100000 , 60 , 2 , "CEO" );
		e1.setManager( m1 );
		e2.setManager( m2 );
		
		try {
			assertEquals( " A has manager none" , null , e1.getManagerName() );
			assertEquals( " B has manager P" , m1 , e1.getManagerName() );
			assertEquals( " C has manager Q" , m2 , e2.getManagerName() );
		} catch (NullPointerException e) {
			System.out.println( "Manager missing for some employees" );
		}
		
	}
}
