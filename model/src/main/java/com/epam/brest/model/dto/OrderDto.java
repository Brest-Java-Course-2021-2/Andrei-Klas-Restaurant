package com.epam.brest.model.dto;

import java.math.BigDecimal;

/**
 * POJO Order for model.
 */
public class OrderDto {

    /**
     * Order Id.
     */
    private Integer orderId;

    /**
     * Order Name.
     */
    private String orderName;

    /**
     * Sum of the Order.
     */
    private BigDecimal orderSum;

    /**
     * Constructor without arguments.
     */
    public OrderDto() {
    }

    /**
     * Constructor with order name.
     *
     * @param orderName order name
     */
    public OrderDto(String orderName) {
        this.orderName = orderName;
    }

    /**
     * Returns <code>Integer</code> representation of this orderId.
     *
     * @return orderId Order Id.
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * Sets the order's identifier.
     *
     * @param orderId Order Id.
     */
    public void setOrderId(final Integer orderId) { this.orderId = orderId; }

    /**
     * Returns <code>String</code> representation of this orderName.
     *
     * @return orderName Order Name.
     */
    public String getOrderName() {
        return orderName;
    }

    /**
     * Sets the order's name.
     *
     * @param orderName Order Name.
     */
    public void setOrderName(final String orderName) {
        this.orderName = orderName;
    }

    /**
     * Returns <code>BigDecimal</code> representation of order's sum
     * for the Order
     *
     * @return orderId.
     */
    public BigDecimal getOrderSum() {
        return orderSum;
    }

    /**
     * Sets sum of costs of foods in the order.
     *
     * @param orderSum Costs sum of foods in the order.
     */
    public void setOrderSum(final BigDecimal orderSum) {
        this.orderSum = orderSum;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "FoodDto{"
                + "foodId=" + orderId
                + ", foodName='" + orderName + '\''
                + ", foodCost=" + orderSum
                + '}';
    }
}