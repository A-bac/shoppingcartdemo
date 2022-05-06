package com.example.shoppingcartdemo.Entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_shoppproducts")
public class shopproducts {

    @Id
    @Column(name="p_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;

    private int quantity;
    private String name;
    private double cost;

    public shopproducts() {
    }

    public shopproducts(int quantity, String name, double cost) {
//        this.pid = pid;
        this.quantity = quantity;
        this.name = name;
        this.cost = cost;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
