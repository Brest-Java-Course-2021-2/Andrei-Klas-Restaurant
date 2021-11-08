package com.epam.brest.model;


public class Menu {
    private Integer dishID;
    private String dishName;
    private Integer dishCost;

    public Integer getDishID() {
        return dishID;
    }

    public void setDishID(Integer dishID) {
        this.dishID = dishID;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Integer getDishCost() {
        return dishCost;
    }

    public void setDishCost(Integer dishCost) {
        this.dishCost = dishCost;
    }
}
