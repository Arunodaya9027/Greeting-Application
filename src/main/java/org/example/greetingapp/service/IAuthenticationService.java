package org.example.greetingapp.service;

import org.example.greetingapp.dto.AuthUserDTO;
import org.example.greetingapp.dto.LoginDTO;
import org.example.greetingapp.exception.UserException;
import org.example.greetingapp.model.AuthUser;

public interface IAuthenticationService {
    AuthUser register(AuthUserDTO userDTO) throws Exception;
    String login(LoginDTO loginDTO) throws UserException;
}
