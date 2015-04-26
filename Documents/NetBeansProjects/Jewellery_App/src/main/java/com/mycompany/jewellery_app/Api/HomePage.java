/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewellery_app.Api;

import com.mycompany.jewellery_app.Domain.Customer;
import com.mycompany.jewellery_app.Services.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BONGANI
 */
@RestController
@RequestMapping("/api/**")
public class HomePage {
    
     @Autowired
    private CustomerService service;
    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String Index(){
        return "This is a Home Page";
    }

    @RequestMapping(value = "/customer",method = RequestMethod.GET)
    public Customer getCustomer(){
        Customer customer = new Customer.Builder("12345")
                .build();

        return customer;
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public List<Customer> getCustomers(){

        return service.getCustomers();
    }
    
}
