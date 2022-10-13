package com.duy998.converter;

import com.duy998.dto.CategoryDTO;
import com.duy998.dto.ProductDTO;
import com.duy998.entity.CategoryEntity;
import com.duy998.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class CategoryConverter {
    public CategoryDTO convertertoDTO(CategoryEntity entity){
        CategoryDTO dto = new CategoryDTO();
        dto.setName(entity.getName());
        dto.setCode(entity.getCode());
        return dto;
    }
}
