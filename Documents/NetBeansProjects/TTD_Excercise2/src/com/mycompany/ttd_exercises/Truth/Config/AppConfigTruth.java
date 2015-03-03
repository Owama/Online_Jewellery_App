/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.Truth.Config;

import com.mycompany.ttd_exercises.Truth.AssertTruth;
import com.mycompany.ttd_exercises.Truth.Impl.TrueImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author BONGANI
 */
@Configuration
public class AppConfigTruth {
    
    @Bean(name="truth")
    public AssertTruth assertTruth()
    {
        return new TrueImpl();
    }
    
}



    
    