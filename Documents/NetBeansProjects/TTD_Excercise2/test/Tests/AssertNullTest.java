/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import com.mycompany.ttd_exercises.Nullness.AssertNullness;
import com.mycompany.ttd_exercises.Nullness.Config.AppConfigNullness;
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
public class AssertNullTest {
       public static ApplicationContext ctx;
      public static AssertNullness appNull;
    
    public AssertNullTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigNullness.class);
        appNull = (AssertNullness) ctx.getBean("null");
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
     public void testAssertNull() {
       
        Assert.assertNull(appNull.assertNullness(null));
    }
    
    @Test
     public void testAssertNotNull() {
        String name = "Bongani";
        Assert.assertNotNull(appNull.assertNullness(name));
    }
}
