package com.csci927.pandemicaservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PandemicaService2Application {

	@RequestMapping("/")
	public String home() {
		return "Service 2 output";
	}

	public static void main(String[] args) {
		SpringApplication.run(PandemicaService2Application.class, args);
	}

}
