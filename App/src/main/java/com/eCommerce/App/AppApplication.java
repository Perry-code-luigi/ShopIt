package com.eCommerce.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.eCommerce.App"})
public class AppApplication { public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
