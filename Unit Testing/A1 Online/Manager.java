package src;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIT
 */
public class Manager extends Employee{
    
    private String position ; 
    
    public Manager(String name, double monthlySalary, int age, int year, String position) {
        super(name, monthlySalary, age, year);
        this.position = position ; 
    }
    
    
    
    // Implement this. Return the list of employees under this manager 
    public Employee[] getEmployees(){
        Employee employees [] = null ;
        return employees ; 
    }
    
     // For each employee he manages manager gets a 5% increments
    public double get_increment(){
        return  0.0 ; 
    }
    
    
    
    
}
