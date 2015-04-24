/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewellery_app.Conf.Factory;

import com.mycompany.jewellery_app.Domain.Demography;

/**
 *
 * @author BONGANI
 */
public class DemographyFactory {
    
     public static  Demography getDemography(String race, String gender)
     {
        Demography demography = new Demography();
        
      demography.getGender();
      demography.getRace();
        return demography;
    }
}
