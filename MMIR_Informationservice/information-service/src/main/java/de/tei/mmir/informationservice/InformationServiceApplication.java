package de.tei.mmir.informationservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@OpenAPIDefinition
public class InformationServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(InformationServiceApplication.class, args);
    }
}
