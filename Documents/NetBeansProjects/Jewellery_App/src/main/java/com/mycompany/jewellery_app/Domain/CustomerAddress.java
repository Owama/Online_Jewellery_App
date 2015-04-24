/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewellery_app.Domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author BONGANI
 */
@Embeddable
public class CustomerAddress implements Serializable{
    
    private int postalCode;
    private String physicalAddress;
    private String postalAddress;

    public int getPostalCode() {
        return postalCode;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }
    
    
}
