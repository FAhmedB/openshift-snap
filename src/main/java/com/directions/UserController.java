package com.directions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@GetMapping(value="/user")
	public Long addUser(){
		User user = new User();
		user.setName("new Name");
		userRepository.save(user);
		return user.getId();
	}

}
