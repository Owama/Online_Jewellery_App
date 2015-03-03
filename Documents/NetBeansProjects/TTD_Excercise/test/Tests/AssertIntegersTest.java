/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import com.mycompany.ttd_exercises.Integers.AssertIntegers;
import com.mycompany.ttd_exercises.Integers.Config.AppConfigIntegers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author BONGANI
 */
public class AssertIntegersTest {
    public static ApplicationContext ctx;
    public static AssertIntegers appCalc;
    
    public AssertIntegersTest() {
    }
    
        @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(AppConfigIntegers.class);
        appCalc = (AssertIntegers)  ctx.getBean("calc");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testAdd() {
    
        Assert.assertEquals(5,appCalc.addIntegers(3, 2));
    }
    @Test
    public void testSubtract() {
    
        Assert.assertEquals(4,appCalc.subtractIntegers(7,3));
    }
    @Test
    public void testMultiply() {
    
        Assert.assertEquals(20,appCalc.multiplyIntegers(4,5));
    }
    @Test
    public void testDevide() {
    
        Assert.assertEquals(6,appCalc.devideIntegers(30, 5));
    }
}
