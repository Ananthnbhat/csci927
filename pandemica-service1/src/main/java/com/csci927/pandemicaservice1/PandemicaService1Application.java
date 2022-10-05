package com.csci927.pandemicaservice1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PandemicaService1Application {
	private static final Logger log = LoggerFactory.getLogger(PandemicaService1Application.class);

	@RequestMapping("/")
	public String home() {
		return "Service 1 output";
	}

	public static void main(String[] args) {
		log.info("Application started");
		SpringApplication.run(PandemicaService1Application.class, args);
	}

}
