/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.Exceptions.config;

import com.mycompany.ttd_exercises.Exceptions.Impl.ExceptionImpl;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author BONGANI
 */
public class AppConfigException {
    
    @Bean(name = "exception")
    public ExceptionImpl AssertExceptions()
    {
        return new ExceptionImpl();
    }
}
