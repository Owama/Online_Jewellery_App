/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import com.mycompany.ttd_exercises.FloatingPoint.AssertFloat;
import com.mycompany.ttd_exercises.FloatingPoint.Config.AppConfigFloat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author BONGANI
 */
public class AssertFloatingPointTest {
     public static ApplicationContext ctx;
    public static AssertFloat appFloat;
    
    public AssertFloatingPointTest() {
    }
    
   @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigFloat.class);
        appFloat = (AssertFloat) ctx.getBean("floats");
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
    public void testAssertFloatingPoint() {
            
        Assert.assertEquals(6.1, appFloat.assertFloats(2.1,3.6),0.5);
    }
}
