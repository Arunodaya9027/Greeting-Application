package org.example.greetingapp.controller;

import org.example.greetingapp.dto.GreetingDTO;
import org.example.greetingapp.dto.UserDTO;
import org.example.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;

    @GetMapping("")
    public GreetingDTO getGreeting(@RequestParam(value = "firstName", required = false) String firstName, @RequestParam(value = "lastName", required = false) String lastName) {
        UserDTO user = new UserDTO();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
    }
}