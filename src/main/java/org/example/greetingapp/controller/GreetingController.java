package org.example.greetingapp.controller;

import org.example.greetingapp.dto.GreetingDTO;
import org.example.greetingapp.dto.UserDTO;
import org.example.greetingapp.interfaces.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    @Autowired
    IGreetingService greetingService;

    @PostMapping("")
    public GreetingDTO getGreeting(@RequestParam(value = "firstName", defaultValue = "", required = false) String firstName, @RequestParam(value = "lastName", defaultValue = "", required = false) String lastName) {
        UserDTO user = new UserDTO();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return new GreetingDTO(greetingService.addGreeting(user));
    }

    @GetMapping("/{id}")
    public GreetingDTO getGreetingById(@PathVariable(value = "id") long id) {
        return greetingService.getGreetingById(id);
    }

    @GetMapping("/all")
    public Iterable<GreetingDTO> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    @PutMapping("/edit/{id}")
    public GreetingDTO editGreeting(@PathVariable(value = "id") long id, @RequestParam(value = "firstName", defaultValue = "", required = false) String firstName, @RequestParam(value = "lastName", defaultValue = "", required = false) String lastName) {
        UserDTO user = new UserDTO();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return new GreetingDTO(greetingService.editGreeting(id, user));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGreeting(@PathVariable(value = "id") long id) {
        greetingService.deleteGreeting(id);
    }
}