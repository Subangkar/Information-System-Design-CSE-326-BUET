/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingproject;

/**
 *
 * @author uesr
 */
public class Cat extends  Animal{
    String color ; 

    public Cat(int legs, boolean veg, String type,String color) {
        super(legs, veg, type);
        this.color = color ; 
    }

    public String getColor() {
        return color;
    }
    
    
    
}
