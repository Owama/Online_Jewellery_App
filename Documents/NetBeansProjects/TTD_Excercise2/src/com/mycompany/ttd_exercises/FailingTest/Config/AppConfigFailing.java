/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.FailingTest.Config;

import com.mycompany.ttd_exercises.FailingTest.Impl.FailingImpl;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author BONGANI
 */
public class AppConfigFailing {
    
     @Bean(name = "failing")
    public FailingImpl AssertFailing()
    {
        return new FailingImpl();
    }
}
