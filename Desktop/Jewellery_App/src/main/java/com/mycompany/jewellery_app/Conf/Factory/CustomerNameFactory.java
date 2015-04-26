/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewellery_app.Conf.Factory;

import com.mycompany.jewellery_app.Domain.Customer;
import com.mycompany.jewellery_app.Domain.CustomerName;
import com.mycompany.jewellery_app.Domain.Demography;
import java.util.Map;

/**
 *
 * @author BONGANI
 */
public class CustomerNameFactory {
    
     public static CustomerName getCustomerName (Map<String, String> values)
    {
        CustomerName name = new CustomerName();
        name.getFirstName();
        name.getLastName();
        name.getIdentityNumber();
    
        return name;
    }

    public static Customer getCustomerName(Demography demography, Map<String, String> values) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     
}
