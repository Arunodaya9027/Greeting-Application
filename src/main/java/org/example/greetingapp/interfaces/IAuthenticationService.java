package org.example.greetingapp.interfaces;

import org.example.greetingapp.dto.AuthUserDTO;
import org.example.greetingapp.dto.ForgotPasswordDTO;
import org.example.greetingapp.dto.LoginDTO;
import org.example.greetingapp.dto.ResetPasswordDTO;
import org.example.greetingapp.exception.UserException;
import org.example.greetingapp.model.AuthUser;

public interface IAuthenticationService {
    AuthUser register(AuthUserDTO userDTO) throws Exception;
    String login(LoginDTO loginDTO) throws UserException;
    String forgotPassword(String email, ForgotPasswordDTO forgotPasswordDTO) throws UserException;
    String resetPassword(String email, ResetPasswordDTO resetPasswordDTO) throws UserException;
}
