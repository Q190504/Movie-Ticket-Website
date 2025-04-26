package com.example.movie_ticket_sales_website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.movie_ticket_sales_website")
@EntityScan(basePackages = "com.example.movie_ticket_sales_website.model")
@EnableJpaRepositories
public class MovieTicketSalesWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketSalesWebsiteApplication.class, args);
	}

}
