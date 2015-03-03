/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import static Tests.AssertArrayJUnitTest.ctx;
import static Tests.AssertTruthTest.appTrue;
import com.mycompany.ttd_exercises.FailingTest.AssertFailing;
import com.mycompany.ttd_exercises.FailingTest.Config.AppConfigFailing;
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
public class AssertFailingTest {
     public static ApplicationContext ctx;
    public static AssertFailing appFail;
    
    public AssertFailingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        ctx = new AnnotationConfigApplicationContext(AppConfigFailing.class);
        appFail = (AssertFailing) ctx.getBean("failing");
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void fail()
    {    
          Assert.fail();
          
    }
}
