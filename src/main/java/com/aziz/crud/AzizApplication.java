package com.aziz.crud;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzizApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure()
				.filename(".env")
				.load();

		System.setProperty("PASSWORD", dotenv.get("PASSWORD"));

		System.setProperty("POSTGRESQL_URL", dotenv.get("POSTGRESQL_URL"));
		System.setProperty("POSTGRESQL_USERNAME", dotenv.get("POSTGRESQL_USERNAME"));

		System.setProperty("SQLSERVER_URL", dotenv.get("SQLSERVER_URL"));
		System.setProperty("SQLSERVER_USERNAME", dotenv.get("SQLSERVER_USERNAME"));

		SpringApplication.run(AzizApplication.class, args);
	}

}
