package com.rayanejesus.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.rayanejesus.workshopmongo.domain.User;
import com.rayanejesus.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		//vai limpar a coleção no MongoDB para mim
		userRepository.deleteAll();
		
		//vou add esses novos usuários (sem "id", porque o Mongo já irá trazer para mim
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		//Depois de limpar a coleção e add os novos usuários, eu vou salvar.
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
	}

}
