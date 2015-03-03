/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.ObjectEquality.Impl;

import com.mycompany.ttd_exercises.ObjectEquality.AssertEquality;

/**
 *
 * @author BONGANI
 */
public class EqualImpl implements AssertEquality {

   @Override
    public int appAssertEquals(int a, int b, int c) {
         int results;
        results = a + b + c;
        
        return results; //To change body of generated methods, choose Tools | Templates.
    }
   
}
