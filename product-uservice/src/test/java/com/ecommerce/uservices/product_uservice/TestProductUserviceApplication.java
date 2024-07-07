package com.ecommerce.uservices.product_uservice;

import org.springframework.boot.SpringApplication;

public class TestProductUserviceApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProductUserviceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
