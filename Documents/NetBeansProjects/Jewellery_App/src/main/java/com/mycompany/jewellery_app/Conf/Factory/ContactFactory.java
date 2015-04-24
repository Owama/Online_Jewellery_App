/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewellery_app.Conf.Factory;

import com.mycompany.jewellery_app.Domain.Contact;
import java.util.Map;

/**
 *
 * @author BONGANI
 */
public class ContactFactory {
    
    public static Contact getContact (Map<String, String> values)
    {
        Contact contact = new Contact();
        contact.getPhone();
        contact.getCell();
    
        return contact;
    }
    
}
