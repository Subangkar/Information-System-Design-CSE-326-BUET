/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIT
 */
public class Employee {
   private String name;
   private double monthlySalary;
   private int age;
   private int service_year; 
   private Manager manager ; 

   
   
    public Employee(String name, double monthlySalary, int age, int year) {
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.age = age;
        this.service_year = year ; 
        this.manager = null ; 
    }
    
    // You can write other getters or setter methods 

    
    // Implement this, if no manager is found throws an exception 
    public String getManagerName() {
        String name = null ; 
        return name;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    
    
    
    // Implement this function, if yearly salary is greater than 2 lakhs 10% tax applied, for more than 5 lakhs 15% tax applied
    
    public double calculateYearlySalary() {
        double yearlySalary = 0 ;
        return yearlySalary ; 
    }
    
    
    // If service year is more than 5 year get a 5% increment, if service year is more than 10 year get 10% increment
    public double get_increment(){
        return  0.0 ; 
    }
    
}
