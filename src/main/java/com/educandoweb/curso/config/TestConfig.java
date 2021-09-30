package com.educandoweb.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User us1 = new User(null, "Maria Brown", "maria@gmail.com", "9888888888", "123456");
		User us2 = new User(null, "Alex Green", "alex@gmail.com", "98888888", "123456");
		
		userRepository.saveAll(Arrays.asList(us1, us2));
	}
}
