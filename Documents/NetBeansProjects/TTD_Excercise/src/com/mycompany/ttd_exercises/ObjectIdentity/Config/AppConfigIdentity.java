/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.ObjectIdentity.Config;

import com.mycompany.ttd_exercises.ObjectIdentity.AssertIdentity;
import com.mycompany.ttd_exercises.ObjectIdentity.Impl.IdentifyImpl;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author BONGANI
 */
public class AppConfigIdentity {
    @Bean(name="identity")
    
    public AssertIdentity appIdentity()
    {
        return new IdentifyImpl();
    }
    
}
