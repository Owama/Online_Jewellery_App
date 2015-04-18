/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.FloatingPoint.Impl;

import com.mycompany.ttd_exercises.FloatingPoint.AssertFloat;

/**
 *
 * @author BONGANI
 */
public class FloatImpl implements AssertFloat{
    
    @Override
    public double assertFloats(double a, double b) {
        
        return(a + b);
    }
    
}
