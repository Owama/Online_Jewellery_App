/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewellery_app.Repository;

import com.mycompany.jewellery_app.Domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BONGANI
 */
@Repository
public interface CustomerRepository extends JpaRepository <Customer,Long>{
    
}
