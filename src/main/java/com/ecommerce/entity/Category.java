package com.ecommerce.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Category extends BaseEntity{

    private String name;



//    @JoinTable(name = "product_category_rel",
//            joinColumns = @JoinColumn(name = "c_id"),
//            inverseJoinColumns = @JoinColumn(name = "p_id"))
   //private List <Product> productList;

}
