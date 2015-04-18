/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewelleryapp.services.Impl;


import com.mycompany.jewelleryapp.domain.Customer;
import com.mycompany.jewelleryapp.repository.CustomerRepository;
import com.mycompany.jewelleryapp.services.CustomerServices;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author BONGANI
 */
public class CustomerServiceImpl implements CustomerServices{

    @Autowired
    CustomerRepository repository;

    @Override
    public List<Customer> getCustomers() {
        List<Customer> allcustomer = new ArrayList<Customer>();

        Iterable<Customer> customer = repository.findAll();
        for (Customer customers : customer)
        {
            allcustomer.add(customers);
        }
        return allcustomer;//To change body of generated methods, choose Tools | Templates.
    }

  
}
    
