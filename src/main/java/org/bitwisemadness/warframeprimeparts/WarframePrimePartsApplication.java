package org.bitwisemadness.warframeprimeparts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("org.bitwisemadness.warframeprimeparts.database.model.*")
@EnableJpaRepositories("org.bitwisemadness.warframeprimeparts.database.repositories.*")
public class WarframePrimePartsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarframePrimePartsApplication.class, args);
	}

}
