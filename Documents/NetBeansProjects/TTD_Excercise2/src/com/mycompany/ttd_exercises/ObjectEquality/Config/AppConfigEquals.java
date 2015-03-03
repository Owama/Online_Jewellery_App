/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.ObjectEquality.Config;

import com.mycompany.ttd_exercises.ObjectEquality.AssertEquality;
import com.mycompany.ttd_exercises.ObjectEquality.Impl.EqualImpl;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author BONGANI
 */
public class AppConfigEquals {
    @Bean(name ="equals")
    
    public AssertEquality assertEqual()
    {
        return new EqualImpl();
    }
    
}
