package com.csci927.pandemicaservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
public class PandemicaService2Application {

//	@RequestMapping("/")
//	public String home() {
//		return "Service 2 output";
//	}

	public static void main(String[] args) {
		SpringApplication.run(PandemicaService2Application.class, args);
	}

}
