/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import com.mycompany.ttd_exercises.ObjectIdentity.AssertIdentity;
import com.mycompany.ttd_exercises.ObjectIdentity.Config.AppConfigIdentity;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mycompany.ttd_exercises.ObjectIdentity.AssertIdentity;
import com.mycompany.ttd_exercises.ObjectIdentity.Impl.IdentifyImpl;




/**
 *
 * @author BONGANI
 */
public class AssertObjectIdentifyTest {
    public static ApplicationContext ctx;
    public static AssertIdentity identity;
    
    public AssertObjectIdentifyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(AppConfigIdentity.class);
        identity = (AssertIdentity) ctx.getBean("identity");
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
     public void testIdentity() {
            Assert.assertSame("Bonganiklaas", identity.appAssertIdentity("Bonganiklaas"));
    }
    @Test
     public void testIdentity2() {
            Assert.assertNotSame("BonganiKlass", identity.appAssertIdentity("BonganiKlaas"));
    }
}


