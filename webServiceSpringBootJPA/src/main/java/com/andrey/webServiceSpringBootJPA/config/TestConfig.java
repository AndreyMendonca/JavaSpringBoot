package com.andrey.webServiceSpringBootJPA.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andrey.webServiceSpringBootJPA.entities.User;
import com.andrey.webServiceSpringBootJPA.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown","maria@gmail.com","9888888888","12328372837");
		User u2 =  new User(null, "Alex Grenn", "alex@gmail.com","1298298912","20912092");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
}
