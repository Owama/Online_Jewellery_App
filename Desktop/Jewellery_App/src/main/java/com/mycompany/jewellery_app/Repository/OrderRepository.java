/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewellery_app.Repository;

import javax.persistence.criteria.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author BONGANI
 */
public interface OrderRepository extends JpaRepository <Order,Long> {
    
}
