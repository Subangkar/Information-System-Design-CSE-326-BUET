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
public class Animal {
    int legs ;
    boolean veg ;
    String type ;

    public Animal(int legs, boolean veg, String type) {
        this.legs = legs;
        this.veg = veg;
        this.type = type;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isVeg() {
        return veg;
    }

    
    
    
}
