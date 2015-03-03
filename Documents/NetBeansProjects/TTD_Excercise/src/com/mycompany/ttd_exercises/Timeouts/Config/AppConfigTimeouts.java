/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.Timeouts.Config;

import com.mycompany.ttd_exercises.Timeouts.Impl.TimeOutImpl;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author BONGANI
 */
public class AppConfigTimeouts {
    
    @Bean(name = "timeout")
    public TimeOutImpl AssertTimeouts()
    {
        return new TimeOutImpl();
    }
}
