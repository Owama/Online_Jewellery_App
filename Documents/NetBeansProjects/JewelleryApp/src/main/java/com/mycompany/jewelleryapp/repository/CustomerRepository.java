/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewelleryapp.repository;

import com.mycompany.jewelleryapp.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BONGANI
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

    public Iterable<Customer> findAll();
    
}