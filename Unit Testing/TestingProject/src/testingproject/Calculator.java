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
public class Calculator {
    
    double add(double  a,  double  b){
        return a+b ; 
    }
    
    double divide(double  a, double  b){
        return  a/ b ; 
    }
    
    int sum_series(int a){
        int n = Integer.min(10, a); 
        int sum = 0 ;
        for (int i=1;i<=n;i++){
            sum = sum + i ; 
        }
        return  sum ; 
    }
    
    int emni(){
        for (int i=0;i<1000000000;i++){
            
        }
        return  0 ; 
    }
    
    void infLoop(){
        while (true);
    }
}
