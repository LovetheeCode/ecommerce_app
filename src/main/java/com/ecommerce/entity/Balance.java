package com.ecommerce.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "balance")
public class Balance extends BaseEntity{

    private BigDecimal amount;

    @OneToOne
    private Customer customer;

}
