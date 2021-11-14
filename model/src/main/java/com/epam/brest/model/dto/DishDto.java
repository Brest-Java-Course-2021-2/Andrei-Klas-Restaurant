package com.epam.brest.model.dto;

import java.math.BigDecimal;

/**
 * POJO Dish for model.
 */
public class DishDto {

    /**
     * Dish Id.
     */
    private Integer dishId;

    /**
     * Dish Name.
     */
    private String dishName;

    /**
     * Average salary of the Dish.
     */
    private BigDecimal avgSalary;

    /**
     * Constructor without arguments.
     */
    public DishDto() {
    }

    /**
     * Constructor with dish name.
     *
     * @param dishName dish name
     */
    public DishDto(String dishName) {
        this.dishName = dishName;
    }

    /**
     * Returns <code>Integer</code> representation of this dishId.
     *
     * @return dishId Dish Id.
     */
    public Integer getDishId() {
        return dishId;
    }

    /**
     * Sets the dish's identifier.
     *
     * @param dishId Dish Id.
     */
    public void setDishId(final Integer dishId) {
        this.dishId = dishId;
    }

    /**
     * Returns <code>String</code> representation of this dishName.
     *
     * @return dishName Dish Name.
     */
    public String getDishName() {
        return dishName;
    }

    /**
     * Sets the dish's name.
     *
     * @param dishName Dish Name.
     */
    public void setDishName(final String dishName) {
        this.dishName = dishName;
    }

    /**
     * Returns <code>BigDecimal</code> representation of average salary
     * for the Dish.
     *
     * @return dishId.
     */
    public BigDecimal getAvgSalary() {
        return avgSalary;
    }

    /**
     * Sets the dish's average salary.
     *
     * @param avgSalary Average salary.
     */
    public void setAvgSalary(final BigDecimal avgSalary) {
        this.avgSalary = avgSalary;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "DishDto{"
                + "departentId=" + dishId
                + ", dishName='" + dishName + '\''
                + ", avgSalary=" + avgSalary
                + '}';
    }
}
