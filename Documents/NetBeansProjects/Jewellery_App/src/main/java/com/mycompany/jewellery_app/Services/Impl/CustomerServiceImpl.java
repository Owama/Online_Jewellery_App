/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewellery_app.Services.Impl;

import static com.mycompany.jewellery_app.Domain.CreditCard_.id;
import com.mycompany.jewellery_app.Domain.Customer;
import com.mycompany.jewellery_app.Services.CustomerService;
import java.util.List;
import java.util.Collection;
import java.util.Objects;
import com.mycompany.jewellery_app.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author BONGANI
 */
@Service
public class CustomerServiceImpl implements CustomerService{
     @Autowired
    CustomerRepository customerRepo;

    @Override
    public List<Customer> getCustomers() {
    
       Customer customer = new Customer();
        List<Customer> allcustomer = customerRepo.findAll();
                        
        for (Customer customers: allcustomer)
        {
            if (Objects.equals(customers.getCustomerNumber(), id)) 
               {
                  customer = customers;
               }
          
        }
              
        return (List<Customer>) customer;  
    }
    
}
