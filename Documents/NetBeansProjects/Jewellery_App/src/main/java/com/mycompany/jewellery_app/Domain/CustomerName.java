/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewellery_app.Domain;

import java.io.Serializable;

/**
 *
 * @author BONGANI
 */
public class CustomerName implements Serializable{
    
    private String firstName;
    private String lastName;
    private int identityNumber;

    public int getIdentityNumber() {
        return identityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    
}
