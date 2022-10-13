package com.duy998.dto;

import com.duy998.entity.ProductEntity;

import java.util.ArrayList;
import java.util.List;

public class CategoryDTO extends AbstractDTO<CategoryDTO>{
    private String name;
    private String code;
    private List<ProductDTO> product = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<ProductDTO> getProduct() {
        return product;
    }

    public void setProduct(List<ProductDTO> product) {
        this.product = product;
    }
}
