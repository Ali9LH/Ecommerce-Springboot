package com.ecommerce.admin;

// Importation des annotations
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// Classe principale de l'application avec configuration automatique Spring Boot
@SpringBootApplication(scanBasePackages = "com.ecommerce.*")
@EnableJpaRepositories(value = "com.ecommerce.*")
@EntityScan(value = "com.ecommerce.library.model")


// Méthode principale pour démarrer l'application
public class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}

}
