/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.Exceptions.Impl;

import com.mycompany.ttd_exercises.Exceptions.AssertExceptions;

/**
 *
 * @author BONGANI
 */
public class ExceptionImpl  implements AssertExceptions{

    @Override
    public int assertException(int number) throws NumberFormatException {
        //throw new UnsupportedOperationException("Not supported yet.");
         return number;
    }

    @Override
    public int[] appException(int[] array) throws IndexOutOfBoundsException{
        //throw new UnsupportedOperationException("Not supported yet.");
        array = new int[10];
        int ar = 0;
         ar = array[0];
         return array;
    }
    
}
