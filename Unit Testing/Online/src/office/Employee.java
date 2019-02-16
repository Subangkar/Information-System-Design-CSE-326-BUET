package office;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author NIT
 */
public class Employee {
	private String name;
	double monthlySalary;
	private int age;
	private int service_year;
	private Manager manager;
	
	
	public Employee( String name , double monthlySalary , int age , int year ) {
		this.name = name;
		this.monthlySalary = monthlySalary;
		this.age = age;
		this.service_year = year;
		this.manager = null;
	}
	
	// You can write other getters or setter methods
	
	
	// Implement this, if no manager is found throws an exception
	public String getManagerName() {
		String name = this.manager.getManagerName();
		return name;
	}
	
	public void setManager( Manager manager ) {
		this.manager = manager;
	}
	
	public void setManager( Employee manager ) {
		this.manager = new Manager( manager.name , manager.monthlySalary , manager.age , manager.service_year ,
				"Boss" );
	}
	
	// Implement this function, if yearly salary is greater than 2 lakhs 10% tax applied, for more than 5 lakhs 15% tax applied
	
	public double calculateYearlySalary() {
		double yearlySalary = monthlySalary > 0 ? monthlySalary * 12 : 0;
		if (yearlySalary > 500000) {
			yearlySalary -= yearlySalary * 0.15;
		} else if (yearlySalary > 200000) {
			yearlySalary -= yearlySalary * 0.10;
		}
		return yearlySalary;
	}
	
	@Override
	public boolean equals( Object obj ) {
		return this.name.equals( ((Employee) obj).name );
//		return super.equals( obj );
	}
	
	// If service year is more than 5 year get a 5% increment, if service year is more than 10 year get 10% increment
	public double get_increment() {
		if (monthlySalary < 0) return 0;
		if (service_year > 10) return monthlySalary * 0.10;
		else if (service_year > 5) return monthlySalary * 0.05;
		return 0.0;
	}
	
}
