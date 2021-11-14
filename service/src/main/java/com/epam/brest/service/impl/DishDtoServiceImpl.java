package com.epam.brest.service.impl;

import com.epam.brest.dao.DishDtoDao;
import com.epam.brest.model.dto.DishDto;
import com.epam.brest.service.DishDtoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DishDtoServiceImpl implements DishDtoService {
    private final DishDtoDao dishDtoDao;

    public DishDtoServiceImpl(DishDtoDao dishDtoDao) {
        this.dishDtoDao = dishDtoDao;
    }

    @Override
    public List<DishDto> findAllWithAvgSalary() {
        return dishDtoDao.findAllWithDishCosts();
    }
}
