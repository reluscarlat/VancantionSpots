package com.project.VacantionSpots;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.project.VacantionSpots.controller.SpotController;
import com.project.VacantionSpots.service.SpotService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.project.VacantionSpots"})
public class VacantionSpotsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(VacantionSpotsApplication.class, args);
		SpotController bean = context.getBean(SpotController.class);
		System.out.println(bean);
	}
}
