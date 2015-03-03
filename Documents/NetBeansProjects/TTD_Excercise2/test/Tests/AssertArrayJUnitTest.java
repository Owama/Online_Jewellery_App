package Tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.ttd_exercises.ArraysContent.Config.AppConfigArray;
import com.mycompany.ttd_exercises.ArraysContent.AssertArray;
import org.springframework.context.ApplicationContext;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author BONGANI KLAAS
 */
public class AssertArrayJUnitTest {
    
    public static ApplicationContext ctx;
    public static AssertArray appArray;
    
    public AssertArrayJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigArray.class);
        appArray = (AssertArray) ctx.getBean("array");
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
     public void testAssertArray() {
       
         int[] array = new int[]{1,2,3};
         
         Assert.assertArrayEquals(array, appArray.assertArray(array));
    }
}
