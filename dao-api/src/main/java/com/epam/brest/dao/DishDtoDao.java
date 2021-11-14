package com.epam.brest.dao;

import com.epam.brest.model.dto.DishDto;

import java.util.List;

public interface DishDtoDao {

    /**
     * Get all dishes with costs.
     *
     * @return dishes list.
     */
    List<DishDto> findAllWithDishCosts();
}
