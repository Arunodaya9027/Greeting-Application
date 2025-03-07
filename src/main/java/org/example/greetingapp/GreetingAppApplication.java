package org.example.greetingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class GreetingAppApplication {

    public static void main(String[] args) {
        Dotenv.configure()
                .systemProperties()
                .load();
        SpringApplication.run(GreetingAppApplication.class, args);
    }

}
