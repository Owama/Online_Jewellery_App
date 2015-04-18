/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewelleryapp.api;

import com.mycompany.jewelleryapp.domain.Customer;
import com.mycompany.jewelleryapp.services.CustomerServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
    private CustomerServices service;
    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String Index(){
        return "This is a Home Page";
    }

    @RequestMapping(value = "/customer",method = RequestMethod.GET)
    public Customer getCustomer(){
        Customer customer = new Customer.Builder("12345")
                .name("Bongani klaas").offering(2015).build();

        return customer;
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers(){

        return service.getCustomers();
    }

}
