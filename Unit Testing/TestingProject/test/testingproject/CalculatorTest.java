/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author uesr
 */
public class CalculatorTest {
    Calculator calculator ; 
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       
        System.out.println("testingproject.CalculatorTest.setUpClass()");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("testingproject.CalculatorTest.tearDownClass()");
    }
    
    @Before
    public void setUp() {
        calculator = new Calculator() ; 
        System.out.println("testingproject.CalculatorTest.setUp()");
    }
    
    @After
    public void tearDown() {
        System.out.println("testingproject.CalculatorTest.tearDown()");
    }

    @Ignore
    @Test
    public void testSomeMethod() {
        System.out.println("testingproject.CalculatorTest.testSomeMethod()");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Ignore
     @Test
    public void testSomeMethod1() {
        System.out.println("testingproject1.CalculatorTest.testSomeMethod()");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Ignore
    @Test
    public  void add_test(){
        assertEquals("Value should be ",5.2, calculator.add(2.7, 2.5),0.0);
    }
    
    @Ignore
    @Test(expected = AssertionError.class)
    public void divide_test(){
        assertEquals(2.5, calculator.divide(5, 0),0.0);
    }
    
    @Ignore
    @Test
    public  void sum_test(){
        assertEquals(0, calculator.sum_series(0));
        assertEquals(1, calculator.sum_series(1));
        assertEquals(3, calculator.sum_series(2));
        assertEquals(45, calculator.sum_series(9));
        assertEquals(55, calculator.sum_series(10));
        assertEquals(66, calculator.sum_series(11));
    }
    
    @Test(timeout = 10000)
    public  void emni_test(){
        assertEquals(0, calculator.emni());
    }
    
}
