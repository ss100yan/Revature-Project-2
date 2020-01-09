package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.revature.model.User;
import com.revature.repository.UserRepository;

@Service(value="userService")
@CrossOrigin(origins = "http://localhost:4200")
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User authenticate(String username, String password) {
		System.out.println("username is " + username);
		System.out.println("password is " + password);
		return this.userRepository.findUserByUsernameAndPwd(username, password);
		
	}
	
	public User findUserByUsername(String username) {
		return this.userRepository.findUserByUsername(username);
	}

	public List<User> findAll() {
		return this.userRepository.findAll();
	}
}
