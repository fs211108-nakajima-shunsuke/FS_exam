package com.freestyle.exam.estimates.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "mst_products")
@Data
public class Products {
    @Id
    //@GeneratedValue
    @Column(name = "cd")
    private int cd;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;
}
