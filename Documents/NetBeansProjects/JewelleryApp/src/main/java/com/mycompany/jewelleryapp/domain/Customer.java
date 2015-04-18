/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewelleryapp.domain;
import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author BONGANI
 */

public class Customer implements Serializable {
   private static final long serialVersionUID = 1L;
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerNumber;
    private String name;
  
   
   
    
    public Customer(){
        
    }
    
    private Customer(Builder builder){
        id = builder.id;
        customerNumber = builder.customerNumber;
        name = builder.name;
               
    }
    
    
    public static class Builder{
        
        private Long id;
        private String customerNumber;
        private String name; 
                    
        public Builder(String customerNumber){
            this.customerNumber = customerNumber;
        }  
        
        public Builder id(Long value){
            id = value;
            return this;
        }
        
        public Builder name(String value)
        {
            name = value;
            return this;
        }
       
        
        public Builder Customer(Customer value){
            id = value.getId();
            customerNumber = value.getCustomerNumber();
            name = value.getName();
                       
            
            return this;
        }
        
        public Customer build(){
            return new Customer(this);
        }

        public Object offering(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
     
        
    }
    
   

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getName() {
        return name;
    }

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
             
  
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.jewelleryapp.domain.Customer[ id=" + id + " ]";
    }
}
