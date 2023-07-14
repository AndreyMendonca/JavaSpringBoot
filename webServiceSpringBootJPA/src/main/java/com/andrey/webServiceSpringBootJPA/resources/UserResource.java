package com.andrey.webServiceSpringBootJPA.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrey.webServiceSpringBootJPA.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "Mari", "maria@gmail.com", "9999999", "123456");
		return ResponseEntity.ok().body(user);
	}
}
