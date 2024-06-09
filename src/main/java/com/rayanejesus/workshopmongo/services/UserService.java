package com.rayanejesus.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rayanejesus.workshopmongo.domain.User;
import com.rayanejesus.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	//reponsável por retornar todos os usuários do meu banco
	public List <User> findAll(){
		return repo.findAll();
	}
		
}
