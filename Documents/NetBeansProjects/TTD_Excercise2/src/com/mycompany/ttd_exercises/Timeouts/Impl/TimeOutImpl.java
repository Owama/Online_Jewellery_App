/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.Timeouts.Impl;

import com.mycompany.ttd_exercises.Timeouts.AssertTimeouts;

/**
 *
 * @author BONGANI
 */
public class TimeOutImpl implements AssertTimeouts{

   @Override
    public int appTimeout() {
        
        
        int count = 0;
        
        do{
            count++;
        
        }while(count == 3);
        
        return count;
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
