package com.cacaniquel.nicolas; 
// Define o pacote onde a classe está localizada

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Anotação que ativa várias configurações automáticas do Spring Boot

@SpringBootApplication
// Marca esta classe como a classe principal da aplicação Spring Boot
public class NicolasApplication {

    public static void main(String[] args) {
        // Método principal do Java: é por aqui que o programa começa a executar

        SpringApplication.run(NicolasApplication.class, args);
        // Inicia o servidor da aplicação Spring Boot
        // Carrega as configurações, cria o servidor web (Tomcat) 
        // e deixa a API disponível em http://localhost:8080
    }

}