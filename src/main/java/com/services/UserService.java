package com.example.cs4500sp19s1jga.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
	static List<User> users = new ArrayList();

	static {
		users.add(new User(123, "alice", "alice", "Alice", "Wonderland"));
		users.add(new User(234, "bob", "bob", "Bob", "Marley"));
	}

	@GetMapping("/api/user")
	public List<User> findAllUsers() {
		return users;
	}

}