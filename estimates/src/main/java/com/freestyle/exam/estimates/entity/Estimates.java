package com.freestyle.exam.estimates.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "estimates")
@Data
public class Estimates {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "amount")
    private Integer amout;

    @Column(name = "budgeted_amount")
    private int budgeted_amount;

    @Column(name = "customer_cd")
    private int customer_cd;

    @Column(name = "employee_cd")
    private int employee_cd;

    @Column(name = "date")
    private String date;

    @Column(name = "status")
    private int status;

    @Column(name = "order_id")
    private int order_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBudgeted_amount() {
        return budgeted_amount;
    }

    public void setBudgeted_amount(int budgeted_amount) {
        this.budgeted_amount = budgeted_amount;
    }

    public int getCustomer_cd() {
        return customer_cd;
    }

    public void setCustomer_cd(int customer_cd) {
        this.customer_cd = customer_cd;
    }

    public int getEmployee_cd() {
        return employee_cd;
    }

    public void setEmployee_cd(int employee_cd) {
        this.employee_cd = employee_cd;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmout() {
        return amout;
    }

    public void setAmout(Integer amout) {
        this.amout = amout;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
