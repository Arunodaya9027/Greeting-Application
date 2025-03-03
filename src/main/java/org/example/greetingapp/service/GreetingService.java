package org.example.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getSimpleGreet() {
        return "Hello World!";
    }
}
