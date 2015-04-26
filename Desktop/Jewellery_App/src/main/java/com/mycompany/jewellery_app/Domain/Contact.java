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
public class Contact implements Serializable{
    
    private int cell;
    private int phone;

    public int getCell() {
        return cell;
    }

    public int getPhone() {
        return phone;
    }
    
    
}
