package org.example.greetingapp.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.greetingapp.model.Greeting;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GreetingDTO {
    @Id
    private long counter;
    private String message;

    public GreetingDTO(Greeting greeting) {
        this.counter = greeting.getId();
        this.message = greeting.getMessage();
    }
}