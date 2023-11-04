package com.ecommerce.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "address")
public class Address extends BaseEntity{


    private String name;
    private String Street;
    private String zipCode;

    @ManyToOne
    private Customer customer; //keep it in ManyToOne

}
