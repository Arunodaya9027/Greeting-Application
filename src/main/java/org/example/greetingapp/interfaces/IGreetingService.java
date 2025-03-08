package org.example.greetingapp.interfaces;

import org.example.greetingapp.dto.GreetingDTO;
import org.example.greetingapp.dto.UserDTO;
import org.example.greetingapp.model.Greeting;

import java.util.List;


public interface IGreetingService {
    Greeting addGreeting(UserDTO user);
    GreetingDTO getGreetingById(long id);
    List<GreetingDTO> getAllGreetings();
    Greeting editGreeting(long id, UserDTO user);
    void deleteGreeting(long id);
}
