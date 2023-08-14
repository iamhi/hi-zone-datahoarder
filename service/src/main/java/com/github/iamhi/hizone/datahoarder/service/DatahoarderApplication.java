package com.github.iamhi.hizone.datahoarder.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.github.iamhi.hizone.datahoarder"})
@ConfigurationPropertiesScan("com.github.iamhi.hizone.datahoarder.config")
@EntityScan("com.github.iamhi.hizone.datahoarder.data.*")
@EnableJpaRepositories("com.github.iamhi.hizone.datahoarder.data.*")
public class DatahoarderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatahoarderApplication.class, args);
	}
}
