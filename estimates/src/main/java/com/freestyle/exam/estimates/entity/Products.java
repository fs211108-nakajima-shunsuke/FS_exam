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
    @Column(name = "cd")
    @GeneratedValue
    private int cd;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
