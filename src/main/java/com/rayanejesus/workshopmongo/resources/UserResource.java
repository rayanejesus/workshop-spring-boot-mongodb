package com.rayanejesus.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rayanejesus.workshopmongo.domain.User;
import com.rayanejesus.workshopmongo.services.UserService;

@RestController
@RequestMapping (value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		//vou buscar no banco de dados os usuários e guardar nesta lista
		List<User> list = service.findAll();
		//"ok" é um método que vai instaciar o ResponseEntity com o código de resposta http que a resposta veio com sucesso.
		//"body" vai definir qual o corpo da resposta. No corpo da minha resposta vai ter esse list que eu montei "body(list)".
		return ResponseEntity.ok().body(list);
	}

}
