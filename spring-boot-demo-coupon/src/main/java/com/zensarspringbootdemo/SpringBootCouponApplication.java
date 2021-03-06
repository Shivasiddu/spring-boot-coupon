package com.zensarspringbootdemo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.zensarspringbootdemo" })
public class SpringBootCouponApplication {

	public static void main(String[] args) {
		System.out.println("RAM");
		SpringApplication.run(SpringBootCouponApplication.class, args);
		System.out.println("Application Started");
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}