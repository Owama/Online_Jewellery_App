/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewellery_app.Conf.Factory;

import com.mycompany.jewellery_app.Domain.CustomerAddress;

/**
 *
 * @author BONGANI
 */
public class CustomerAddressFactory {
    
    public static CustomerAddress getCustomerAddress (int postalCode, String physicalAddress, String postalAddress)
    {
           CustomerAddress address = new CustomerAddress();
           address.getPhysicalAddress();
           address.getPostalAddress();
           address.getPostalCode();
        
            return address;
    }
            
}
