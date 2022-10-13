package com.duy998.service;

import com.duy998.dto.ProductDTO;

import java.util.List;

public interface IProductService {
    List<ProductDTO> findAll();
}
