package com.epam.brest.service;

import com.epam.brest.model.dto.DishDto;

import java.util.List;

public interface DishDtoService {


    /**
     * Get list of department Dto.
     *
     * @return list of department Dto.
     */
    List<DishDto> findAllWithAvgSalary();

}
