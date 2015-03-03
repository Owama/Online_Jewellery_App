/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import static Tests.AssertArrayJUnitTest.ctx;
import com.mycompany.ttd_exercises.Exceptions.AssertExceptions;
import com.mycompany.ttd_exercises.Exceptions.config.AppConfigException;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
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
public class AssertExceptionTest {
       
       public static ApplicationContext ctx;
       public static AssertExceptions exc;
    
    public AssertExceptionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigException.class);
        exc = (AssertExceptions)ctx.getBean("exception");
        
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
     @Test(expected = NumberFormatException.class)
      public void testnumberformatException() {
     
       int num = Integer.parseInt(JOptionPane.showInputDialog("please enter an number"));
       exc.assertException(num);
         
     }
}
