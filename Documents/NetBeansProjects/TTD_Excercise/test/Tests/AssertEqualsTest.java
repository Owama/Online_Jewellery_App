/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import com.mycompany.ttd_exercises.ObjectEquality.AssertEquality;
import com.mycompany.ttd_exercises.ObjectEquality.Config.AppConfigEquals;
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
public class AssertEqualsTest {
      public static ApplicationContext ctx;
      public static AssertEquality appEqual;
    
    public AssertEqualsTest() {
    }
    
  @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigEquals.class);
        appEqual = (AssertEquality) ctx.getBean("equals");
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
   public void testAssertEquals() {
        
        Assert.assertEquals(25, appEqual.appAssertEquals(10, 5, 10));
    }
}
