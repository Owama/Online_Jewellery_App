/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.False.Config;

import com.mycompany.ttd_exercises.False.Impl.FalseImpl;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author BONGANI
 */
public class AppConfigFalse {
    
    @Bean(name = "false")
    public FalseImpl AsertFalse()
    {
        return new FalseImpl();
    }
    
}
