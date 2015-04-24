/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewellery_app.Conf.Factory;
import com.mycompany.jewellery_app.Domain.Customer;
import com.mycompany.jewellery_app.Domain.Orders;
import java.util.List;
import java.util.Map;
import javax.persistence.criteria.Order;

/**
 *
 * @author BONGANI
 */
public class CustomerFactory {
    public static Customer getCustomer (String customerNumber, List<Order>orders)
    
    {
        Customer customer = new Customer();
        customer.getCustomerNumber();
        customer.getOrder();      
    
        return customer;
    }
    
}
