package com.otaviolube.bolao;

import com.otaviolube.controllers.LoginController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({LoginController.class})
public class BolaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BolaoApplication.class, args);
	}

}
