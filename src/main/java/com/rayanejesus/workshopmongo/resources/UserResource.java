package com.rayanejesus.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rayanejesus.workshopmongo.domain.User;

@RestController
@RequestMapping (value = "/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User maria = new User ("1", "Maria Brown", "maria@gmail.com");
		User alex = new User ("2", "Alex Green", "alex@gmail.com");
		List<User> list = new ArrayList<>();
		
		//todos os objs que eu colocar aqui em parênteses vão ser adicionados na minha lista
		list.addAll(Arrays.asList(maria, alex));
		//"ok" é um método que vai instaciar o ResponseEntity com o código de resposta http que a resposta veio com sucesso.
		//"body" vai definir qual o corpo da resposta. No corpo da minha resposta vai ter esse list que eu montei "body(list)".
		return ResponseEntity.ok().body(list);
	}

}
