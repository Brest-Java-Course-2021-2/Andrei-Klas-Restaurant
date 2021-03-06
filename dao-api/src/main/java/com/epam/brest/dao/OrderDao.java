package com.epam.brest.dao;

import com.epam.brest.model.Order;

import java.util.List;

public interface OrderDao {
    List<Order> findAll();

    Integer create(Order order);

    Integer update(Order order);

    Integer delete(Integer order_id);
}
