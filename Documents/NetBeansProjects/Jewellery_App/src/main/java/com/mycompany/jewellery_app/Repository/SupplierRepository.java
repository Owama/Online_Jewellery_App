/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewellery_app.Repository;

import com.mycompany.jewellery_app.Domain.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author BONGANI
 */
public interface SupplierRepository extends JpaRepository <Supplier,Long> {
    
}
