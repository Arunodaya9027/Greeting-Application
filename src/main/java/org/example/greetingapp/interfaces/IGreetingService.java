package org.example.greetingapp.interfaces;

import org.example.greetingapp.dto.GreetingDTO;
import org.example.greetingapp.dto.UserDTO;
import java.util.List;


public interface IGreetingService {
    GreetingDTO addGreeting(UserDTO user);
    GreetingDTO getGreetingById(long id);
    List<GreetingDTO> getAllGreetings();
    GreetingDTO editGreeting(long id, UserDTO user);
    void deleteGreeting(long id);
}
