/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jewellery_app.Repository.Crud;

import com.mycompany.jewellery_app.Conf.Factory.CustomerNameFactory;
import com.mycompany.jewellery_app.Conf.Factory.DemographyFactory;
import com.mycompany.jewellery_app.Domain.Customer;
import com.mycompany.jewellery_app.Domain.CustomerName;
import static com.mycompany.jewellery_app.Domain.Customer_.name;
import com.mycompany.jewellery_app.Domain.Demography;
import com.mycompany.jewellery_app.Repository.CustomerRepository;
import com.mycompany.jewellery_app.Services.CustomerService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 *
 * @author BONGANI
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes= App.class)
//@WebAppConfiguration
public class TestCrudCustomer {
    private Long id;
    
    @Autowired
    CustomerRepository repo;
    //public static ApplicationContext ctx;
    private CustomerService customerService;
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createCustomer() throws Exception {
         
         Demography demography = DemographyFactory.getDemography("gender", "race");
           
         Map<String,String> values = new HashMap<String, String>();
         values.put ("gender", "male");
         values.put ("race", "african");
         
         //CustomerName customer = CustomerNameFactory.getCustomerName(values);
         //id=customer.getId();
         Assert.assertNotNull(demography);
     }
  
}
