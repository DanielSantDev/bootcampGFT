package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * PROJETO SPRING BOOT GERADO VIA SPRING INITIALIZR
 *
 * OS MÓDULOS SELECIONADOS FORAM:
 *Spring Data JPA
 *Spring Web
 *H2 Database
 *OpenFeign
 *
 * @author DanielSantDev
 *
 */

@EnableFeignClients
@SpringBootApplication
public class PadroesProjetoSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(PadroesProjetoSpringApplication.class, args);
	}

}
