/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ttd_exercises.Nullness.Config;
import com.mycompany.ttd_exercises.Nullness.AssertNullness;
import com.mycompany.ttd_exercises.Nullness.Impl.NullnessImpl;
//import com.mycompany.ttd_exercises.Nullness.Impl.NonNullnessImpl;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author BONGANI
 */
public class AppConfigNullness {
    @Bean(name = "null")
    public AssertNullness appAssertNonNull()
    {
        return new NullnessImpl();
    }
    
}
