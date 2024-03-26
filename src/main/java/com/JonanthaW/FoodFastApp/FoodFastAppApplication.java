package com.JonanthaW.FoodFastApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FoodFastAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodFastAppApplication.class, args);
	}

}
