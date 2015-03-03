/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.Integers.Impl;

import com.mycompany.ttd_exercises.Integers.AssertIntegers;

/**
 *
 * @author BONGANI
 */
public class IntegersImpl implements AssertIntegers{

    @Override
    public int addIntegers(int a, int b) {
         return(a+b); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int subtractIntegers(int a, int b) {
       return(a-b); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int multiplyIntegers(int a, int b) {
        return(a*b); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int devideIntegers(int a, int b) {
        return(a/b); //To change body of generated methods, choose Tools | Templates.
    }
    
}
