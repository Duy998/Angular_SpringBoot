package com.duy998.converter;

import com.duy998.dto.ProductDTO;
import com.duy998.entity.ProductEntity;
import org.springframework.stereotype.Component;


@Component
public class ProductConverter {
    public ProductDTO convertertoDTO(ProductEntity entity){
        ProductDTO dto = new ProductDTO();
        dto.setConTent(entity.getConTent());
        dto.setPrice(entity.getPrice());
        dto.setThumbNail(entity.getThumbNail());
        dto.setShortDescription(entity.getShortDescription());
        dto.setTitle(entity.getTitle());

        return dto;
    }

}
