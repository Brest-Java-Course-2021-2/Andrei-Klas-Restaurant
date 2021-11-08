package com.epam.brest.model;

import java.util.Date;
import java.util.List;

public class Order {
    private Integer orderID;
    private List<Integer> dishIDs;
    private Integer orderSum;
    private Date orderDate;
    private Boolean confirmedByAdmin;
    private Boolean paid;
    private Boolean closed;

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public List<Integer> getDishIDs() {
        return dishIDs;
    }

    public void setDishIDs(List<Integer> dishIDs) {
        this.dishIDs = dishIDs;
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

    public Boolean getConfirmedByAdmin() {
        return confirmedByAdmin;
    }

    public void setConfirmedByAdmin(Boolean confirmedByAdmin) {
        this.confirmedByAdmin = confirmedByAdmin;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }
}
