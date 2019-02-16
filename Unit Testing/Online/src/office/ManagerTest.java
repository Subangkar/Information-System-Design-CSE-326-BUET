package office;

import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {
	
	@Test
	public void getEmployees() {
		System.out.println("Testing ManagerTest.getEmployees()");
		Employee e0 = new Employee( "A" , 100000 , 50 , 2 );
		Employee e1 = new Employee( "B" , 100000 , 50 , 6 );
		Employee e2 = new Employee( "C" , 100000 , 50 , 11 );
		Employee e3 = new Employee( "C2" , 100000 , 50 , 11 );
		Employee e4 = new Employee( "C3" , 100000 , 50 , 11 );
		Manager m1 = new Manager( "P" , 100000 , 60 , 2 , "MD" );
		Manager m2 = new Manager( "Q" , 100000 , 60 , 2 , "CEO" );
		m1.addEmployee( e0 );
		m1.addEmployee( e1 );
		m2.addEmployee( e2 );
		m2.addEmployee( e3 );
		m2.addEmployee( e4 );
		
		Employee[] arr1 = {e0,e1};
		Employee[] arr2 = {e2,e3,e4};
		assertEquals( "Empoyees 1", arr1,m1.getEmployees() );
		assertEquals( "Empoyees 2", arr2,m2.getEmployees() );
		
	}
	
	@Test
	public void get_increment() {
		System.out.println("Testing ManagerTest.get_increment()");
		Employee e0 = new Employee( "A" , 100000 , 50 , 2 );
		Employee e1 = new Employee( "B" , 100000 , 50 , 6 );
		Employee e2 = new Employee( "C" , 100000 , 50 , 11 );
		Manager m1 = new Manager( "P" , 100000 , 60 , 2 , "MD" );
		Manager m2 = new Manager( "Q" , 100000 , 60 , 2 , "CEO" );
		Manager m3 = new Manager( "R" , 100000 , 60 , 2 , "MAN" );
		m1.addEmployee( e0 );
		m1.addEmployee( e1 );
		m2.addEmployee( e2 );
		assertEquals( "Expected Increment for 2 emp" , 100000 * 2 * 0.05 , m1.get_increment() , 0.0 );
		assertEquals( "Expected Increment for 1 emp" , 100000 * 1 * 0.05 , m2.get_increment() , 0.0 );
		assertEquals( "Expected Increment for 0 emp" , 100000 * 0 * 0.05 , m3.get_increment() , 0.0 );
	}
}
