package com.duy998.service.impl;

import com.duy998.converter.CategoryConverter;
import com.duy998.converter.ProductConverter;
import com.duy998.dto.CategoryDTO;
import com.duy998.dto.ProductDTO;
import com.duy998.entity.CategoryEntity;
import com.duy998.entity.ProductEntity;
import com.duy998.repository.CategoryRepository;
import com.duy998.repository.ProductRepository;
import com.duy998.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductConverter productConverter;

    @Autowired
    private CategoryConverter categoryConverter;

    @Override
    public List<ProductDTO> findAll() {
        List<ProductEntity> entities = productRepository.findAll();
        List<ProductDTO> DTOs = new ArrayList<>();
        CategoryDTO categoryDTO = new CategoryDTO();
        ProductDTO productDTO = new ProductDTO();
        for (ProductEntity entity: entities
             ) {
           // CategoryEntity categoryEntity = categoryRepository.getOne(entity.getCategory().getId());
            categoryDTO.setName(entity.getCategory().getName());
            //categoryDTO.setCode(categoryEntity.get().getCode());
            productDTO = productConverter.convertertoDTO(entity);
            productDTO.setCategory(categoryDTO);
            //productDTO.setCategory(categoryDTO);
            DTOs.add(productDTO);
        }
        return DTOs;
    }
}
