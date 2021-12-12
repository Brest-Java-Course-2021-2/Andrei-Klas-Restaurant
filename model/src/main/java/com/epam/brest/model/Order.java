package com.epam.brest.model;

import java.util.Date;
import java.util.List;

public class Order {
    private Integer orderID;
    private String orderName;
    private List<Integer> foodIDs;
    private Integer orderSum;
    private Date orderDate;

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public List<Integer> getFoodIDs() {
        return foodIDs;
    }

    public void setFoodIDs(List<Integer> foodIDs) {
        this.foodIDs = foodIDs;
    }

    public Integer getOrderSum() {
        return orderSum;
    }

    public void setOrderSum(Integer orderSum) {
        this.orderSum = orderSum;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

}
