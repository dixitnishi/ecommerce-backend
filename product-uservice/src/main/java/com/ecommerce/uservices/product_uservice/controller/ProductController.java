package com.ecommerce.uservices.product_uservice.controller;

import com.ecommerce.uservices.product_uservice.dto.ProductRequest;
import com.ecommerce.uservices.product_uservice.dto.ProductResponse;
import com.ecommerce.uservices.product_uservice.model.Product;
import com.ecommerce.uservices.product_uservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest) {
        return productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }
}
