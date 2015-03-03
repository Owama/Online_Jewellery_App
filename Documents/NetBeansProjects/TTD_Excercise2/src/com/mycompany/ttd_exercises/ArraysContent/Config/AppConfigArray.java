/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ttd_exercises.ArraysContent.Config;

import com.mycompany.ttd_exercises.ArraysContent.AssertArray;
import com.mycompany.ttd_exercises.ArraysContent.Impl.ArrayImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author BONGANI KLAAS
 */
@Configuration
public class AppConfigArray {
    
    @Bean(name="array")
    
    public AssertArray assertArrays()
    {
        return new ArrayImpl();
    }
    
}
