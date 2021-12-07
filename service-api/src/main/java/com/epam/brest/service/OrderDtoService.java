package com.epam.brest.service;

import com.epam.brest.model.dto.OrderDto;

import java.util.List;

public interface OrderDtoService {


    /**
     * Get list of food Dto.
     *
     * @return list of food Dto.
     */
    List<OrderDto> findAllWithAvgCost();

}
