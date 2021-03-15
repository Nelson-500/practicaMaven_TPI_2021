/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavencalculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nel500
 */
public class mavenCalculatorTest {
    
    public mavenCalculatorTest() {
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
     * Test of add method, of class mavenCalculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double number1 = 1.0;
        double number2 = 1.0;
        mavenCalculator instance = new mavenCalculator();
        double expResult = 2.0;
        double result = instance.add(number1, number2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of subtract method, of class mavenCalculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        double number1 = 1.0;
        double number2 = 1.0;
        mavenCalculator instance = new mavenCalculator();
        double expResult = 0.0;
        double result = instance.subtract(number1, number2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of multipy method, of class mavenCalculator.
     */
    @Test
    public void testMultipy() {
        System.out.println("multipy");
        double number1 = 1.0;
        double number2 = 1.0;
        mavenCalculator instance = new mavenCalculator();
        double expResult = 1.0;
        double result = instance.multipy(number1, number2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of divide method, of class mavenCalculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double number1 = 1.0;
        double number2 = 1.0;
        mavenCalculator instance = new mavenCalculator();
        double expResult = 1.0;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, 0.0);

    }
    
}
