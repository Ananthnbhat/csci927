package com.csci927.pandemicaservice2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class PandemicaService2Application {
	private static final Logger log = LoggerFactory.getLogger(PandemicaService2Application.class);

//	@RequestMapping("/greeting")
//	public String home() {
//		return "Service 2 output";
//	}

	public static void main(String[] args) {
		log.info("Application started");
		SpringApplication.run(PandemicaService2Application.class, args);
	}

}