package com.ecommerce.order_sevice.controller;


import com.ecommerce.order_sevice.dto.OrderRequest;
import com.ecommerce.order_sevice.dto.OrderResponse;
import com.ecommerce.order_sevice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderResponse placeOrder(@RequestBody OrderRequest orderRequest) {
        return service.placeOrder(orderRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<OrderResponse> retrieveAllOrders(){
        return service.getAllOrders();
    }
}
