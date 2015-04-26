/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jewellery_app.Domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.*;

/**
 *
 * @author BONGANI
 */
@Entity
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String custId;
    private String customerNumber;
    private int offering;
    
    @Embedded
    private CustomerName name;
    @Embedded
    private Contact contact;
       
    @OneToOne
    private CustomerAddress address;
    
    @Embedded
    private Demography demographic;
    @OneToMany
    List<Orders> order;
    @OneToMany
    List<CreditCard>creditCard;
    
    public Customer()
    {
    
    }
    public Customer (Builder builder)
    {
        id=builder.id;
        this.contact=builder.contact;
        this.address=builder.address;
        this.creditCard=builder.CreditCard;
        this.customerNumber=builder.customerNumber;
        this.demographic=builder.demographic;
        this.custId=builder.CustId;
        this.order=builder.Order;   
        this.offering=builder.offering;
            
    }
         
    public static class Builder{
    
            private Long id;
            private List<CreditCard> CreditCard;
            private List<Orders>Order;
            private CustomerAddress address;
            private Contact contact;
            private CustomerName name;
            private Demography demographic;
            private String customerNumber;
            private String CustId; 
            private int offering;
            
           public Builder(String customerNumber)
           {
              this.customerNumber = customerNumber;
           }  
        
        public Builder id(Long value){
            this.id = value;
            return this;
        }
        
        public Builder offering (int value)
        {
            this.offering = value;
                    return this;
        }
        public Builder name(CustomerName value)
        {
            this.name = value;
            return this;
        }
        public Builder contact(Contact value){
            this.contact = value;
            return this;
        }
        
        public Builder address(CustomerAddress value){
            this.address = value;
            return this;
        }
        public Builder demographic(Demography value){
            this.demographic = value;
            return this;
        }
        
        public Builder order(List<Orders> value){
            Order = value;
            return this;
            
        }
        public Builder creditCard(List<CreditCard> value){
            CreditCard = value;
            return this;
            
        }
        public Builder custId(String value){
            this.CustId =  value;
            return this;
        }
        
    
    public Builder copy (Customer value)
    {
       this.address=value.getAddress();
       this.contact=value.getContact();
       this.CreditCard=value.getCreditCard();
       this.CustId=value.getCustId();
       this.customerNumber=value.getCustomerNumber();
       this.id=value.getId();
       this.Order=value.getOrder();
       this.demographic=value.getDemographic();
   
       return this;
    }
    
    public Customer build()
    {
            return new Customer (this);    
    }
   
  }
    
    public String getCustId() {
        return custId;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public CustomerName getName() {
        return name;
    }

    public Contact getContact() {
        return contact;
    }

    public CustomerAddress getAddress() {
        return address;
    }

    public Demography getDemographic() {
        return demographic;
    }

    public List<Orders> getOrder() {
        return order;
    }

    public List<CreditCard> getCreditCard() {
        return creditCard;
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
        return "com.mycompany.jewellery_app.Domain.Customer[ id=" + id + " ]";
    }
    
}



