/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.Integers.Config;

import com.mycompany.ttd_exercises.Integers.Impl.IntegersImpl;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author BONGANI
 */
public class AppConfigIntegers {
    
    @Bean(name = "calc")
    public IntegersImpl AssertIntegers()
    {
        return new IntegersImpl();
    }
    
}
