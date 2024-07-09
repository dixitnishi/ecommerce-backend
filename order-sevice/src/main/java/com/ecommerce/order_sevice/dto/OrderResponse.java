package com.ecommerce.order_sevice.dto;

import java.math.BigDecimal;

public record OrderResponse(long id, String orderNumber, String skuCode, BigDecimal price, Integer quantity) {
}
