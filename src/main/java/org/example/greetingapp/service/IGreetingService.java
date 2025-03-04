package org.example.greetingapp.service;

import org.example.greetingapp.dto.GreetingDTO;
import org.example.greetingapp.dto.UserDTO;


public interface IGreetingService {
    GreetingDTO addGreeting(UserDTO user);
    GreetingDTO getGreetingById(long id);
}
