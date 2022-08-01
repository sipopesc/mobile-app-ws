package ro.danisi.app.ws.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import ro.danisi.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService{
	UserDto createUser(UserDto user);
	UserDto getUser(String email);
}
