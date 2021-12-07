package com.epam.brest.dao;

import java.util.List;

public interface OrderDtoDao {

    /**
     * Get all orders with sums.
     *
     * @return orders list.
     */
    List<OrderDao> findAllWithOrderSums();
}
