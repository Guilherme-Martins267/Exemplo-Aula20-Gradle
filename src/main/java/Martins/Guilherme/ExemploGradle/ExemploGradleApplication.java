package Martins.Guilherme.ExemploGradle;

import Martins.Guilherme.ExemploGradle.model.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemploGradleApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExemploGradleApplication.class, args);
		System.out.println("Opa galera, SpringBOOT com o Gradle");

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Guilherme");
		System.out.println(pessoa);
	}
}