package com.epam.brest.model;


public class Dish {
    private Integer dishId;
    private String dishName;
    private Integer dishCost;

    public Dish() {
    }

    public Dish(String dishName) {
        this.dishName = dishName;
    }

    public Dish(Integer departmentId, String departmentName) {
        this.dishId = departmentId;
        this.dishName = departmentName;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dish_name) {
        this.dishName = dishName;
    }

    public Integer getDishCost() {
        return dishCost;
    }

    public void setDishCost(Integer dish_cost) {
        this.dishCost = dishCost;
    }
}
