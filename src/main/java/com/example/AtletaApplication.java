package com.example;

import com.example.service.AtletaService;
import com.example.service.MedallaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AtletaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AtletaApplication.class, args);

		AtletaService athleteService = context.getBean(AtletaService.class);
		MedallaService medalService = context.getBean(MedallaService.class);

		athleteService.createAthlete();
		athleteService.testAthlete();

		medalService.createMedal();
		medalService.testMedal();
	}
}
