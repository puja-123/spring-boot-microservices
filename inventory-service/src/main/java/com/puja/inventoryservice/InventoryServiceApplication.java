package com.puja.inventoryservice;

import com.puja.inventoryservice.model.Inventory;
import com.puja.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("moto_g10");
			inventory1.setQuantity(100);
			Inventory inventory2 = new Inventory();
			inventory2.setSkuCode("moto_g11");
			inventory2.setQuantity(0);
			inventoryRepository.save(inventory1);
			inventoryRepository.save(inventory2);
		};
	}
}
