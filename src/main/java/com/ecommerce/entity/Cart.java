package com.ecommerce.entity;

import com.ecommerce.enums.CartState;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Cart extends BaseEntity{
    @ManyToOne
    private Discount discount;
    @ManyToOne
    private Customer customer;
    @Enumerated(EnumType.STRING)
    private CartState cartState;
}
