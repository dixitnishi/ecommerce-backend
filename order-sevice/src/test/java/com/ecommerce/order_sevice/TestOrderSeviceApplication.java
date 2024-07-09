package com.ecommerce.order_sevice;

import org.springframework.boot.SpringApplication;

public class TestOrderSeviceApplication {

	public static void main(String[] args) {
		SpringApplication.from(OrderSeviceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
