package com.ecommerce.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class CartItem extends BaseEntity{
    private Integer quantity;
    @ManyToOne
    private Cart cart;
    @ManyToOne
    private Product product;

}
