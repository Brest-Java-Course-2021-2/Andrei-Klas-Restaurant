package com.epam.brest.model;


public class Food {
    private Integer foodId;
    private String foodName;
    private Integer foodCost;

    public Food() {
    }

    public Food( String foodName) {
        this.foodName = foodName;
    }

    public Food(Integer foodId, String foodName, Integer foodCost) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodCost = foodCost;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Integer getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(Integer foodCost) {
        this.foodCost = foodCost;
    }
}
