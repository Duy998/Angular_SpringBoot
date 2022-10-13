package com.duy998.service;

import com.duy998.dto.CategoryDTO;
import com.duy998.entity.CategoryEntity;

public interface ICategoryService {
    CategoryDTO findyid(Long id);
}
