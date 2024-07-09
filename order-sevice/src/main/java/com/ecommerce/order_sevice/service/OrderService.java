package com.ecommerce.order_sevice.service;


import com.ecommerce.order_sevice.dto.OrderRequest;
import com.ecommerce.order_sevice.dto.OrderResponse;
import com.ecommerce.order_sevice.model.Order;
import com.ecommerce.order_sevice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderResponse placeOrder(OrderRequest orderRequest) {
        Order order = Order.builder().orderNumber(UUID.randomUUID().toString()).skuCode(orderRequest.skuCode()).price(orderRequest.price()).quantity(orderRequest.quantity()).build();
        orderRepository.save(order);
        log.info("Order Created Successfully");
        return new OrderResponse(order.getId(), order.getOrderNumber(), order.getSkuCode(), order.getPrice(), order.getQuantity());
    }

    public List<OrderResponse> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        return orders.stream()
                .map(order -> new OrderResponse(order.getId(), order.getOrderNumber(), order.getSkuCode(), order.getPrice(), order.getQuantity()))
                .toList();
    }
}
