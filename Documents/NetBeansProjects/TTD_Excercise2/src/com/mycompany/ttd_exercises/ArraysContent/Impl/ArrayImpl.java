/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.ArraysContent.Impl;

import com.mycompany.ttd_exercises.ArraysContent.AssertArray;

/**
 *
 * @author BONGANI KLAAS
 */
public class ArrayImpl implements AssertArray {

    @Override
    public int[] assertArray(int[] array) {
       array = new int[] {1,2,3};
        int ar = 0;
         ar = array[0];
         return array;
    }
   
}
