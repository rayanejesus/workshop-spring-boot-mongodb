package com.rayanejesus.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rayanejesus.workshopmongo.domain.User;

//Este objeto "UserRepository" vai ser capaz de fazer várias operações básicas com os usuários (salvar, deletar, recuperar etc.) 
//tudo isso já está imbutido no "MongoRepository".
@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
