package com.duy998.api;

import com.duy998.dto.ProductDTO;
import com.duy998.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoffeeAPI {

    @Autowired
    private IProductService iProductService;

    @GetMapping(value = "/coffee")
    private List<ProductDTO> getAllCoffee(){
        return iProductService.findAll();
    }
}
