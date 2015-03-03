/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import static Tests.AssertArrayJUnitTest.ctx;
import com.mycompany.ttd_exercises.False.AssertFalse;
import com.mycompany.ttd_exercises.False.Config.AppConfigFalse;
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
public class AssertFalseTest {
        public static ApplicationContext ctx;
        public static AssertFalse appFalse;
    
    public AssertFalseTest() {
    }
    
   @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigFalse.class);
        appFalse = (AssertFalse) ctx.getBean("false");
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
    public void testAssertFalse() {
        
        String name = "Klaas";
        boolean choice = false;
        if(name.equalsIgnoreCase("Bongani"))
            choice = true;
        else
            choice = false;
        
        Assert.assertFalse(appFalse.assertFalse(choice));
         
    }
}
