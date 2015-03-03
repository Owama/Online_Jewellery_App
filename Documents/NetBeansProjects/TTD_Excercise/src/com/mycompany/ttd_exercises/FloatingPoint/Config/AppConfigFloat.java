/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.FloatingPoint.Config;

import com.mycompany.ttd_exercises.FloatingPoint.AssertFloat;
import com.mycompany.ttd_exercises.FloatingPoint.Impl.FloatImpl;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author BONGANI
 */
public class AppConfigFloat {
     @Bean(name="floats")
    
    public AssertFloat AssertFloats()
    {
        return new FloatImpl();
    }
    
}
