package org.example.greetingapp.repository;

import org.example.greetingapp.dto.GreetingDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<GreetingDTO, Long> {
}
