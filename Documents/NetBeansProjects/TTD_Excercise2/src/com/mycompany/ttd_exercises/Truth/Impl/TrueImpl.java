/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.Truth.Impl;

import com.mycompany.ttd_exercises.Truth.AssertTruth;

/**
 *
 * @author BONGANI
 */
public class TrueImpl implements AssertTruth{

   @Override
    public boolean assertTruth() {
        String name = "Bongani";
        boolean choice;
        
        if(name.equalsIgnoreCase("bongani"))
            choice = true;
        else
            choice = false;
        return choice;
    }
    
}
