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
public class RectangeTest {
    
    public RectangeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
   

   

    /**
     * Test of Area method, of class Rectange.
     */
    @Ignore
    @Test
    public void rectange_testArea() {
        Rectange rectange = new Rectange(5, 4);
        assertEquals(20, rectange.Area());
        rectange.setA(6);
        assertSame(20, rectange.Area());
        //assertSame(20, this);
    }
    
    
    
    @Test
    public void rectangle_equivalent_test(){
        Rectange r1 = new Rectange(5, 4);
        Rectange r2 = new Rectange(5, 4);
        assertEquals(r1, r2);
      
    }
    @Test
    public void rectangle_same_test(){
        Rectange r1 = new Rectange(5, 4);
        Rectange r2 = new Rectange(5, 4);
        assertSame(r1, r2);      
    }
    
}
