package com.epam.brest.dao;

import com.epam.brest.model.Dish;

import java.awt.*;
import java.util.List;

public interface DishDao {
    List<Dish> findAll();

    Integer create(Dish dish);

    Integer update(Dish dish);

    Integer delete(Integer dish_id);
}
