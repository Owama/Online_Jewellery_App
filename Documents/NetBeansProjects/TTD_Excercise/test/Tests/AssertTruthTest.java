/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.mycompany.ttd_exercises.ArraysContent.Config.AppConfigArray;
import com.mycompany.ttd_exercises.Truth.AssertTruth;
import com.mycompany.ttd_exercises.Truth.Config.AppConfigTruth;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author BONGANI
 */

public class AssertTruthTest {
    public static ApplicationContext ctx;
    public static AssertTruth appTrue;
    
    public AssertTruthTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        ctx = new AnnotationConfigApplicationContext(AppConfigTruth.class);
        appTrue = (AssertTruth) ctx.getBean("truth");
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
    public void testAssertTruth()
    {    
          Assert.assertTrue(appTrue.assertTruth());
                                  //  assertTruth(appTrue.assertTruth());
    }
}
