package gasimov.registrationandloginapp.service;

import gasimov.registrationandloginapp.model.User;
import gasimov.registrationandloginapp.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);}
