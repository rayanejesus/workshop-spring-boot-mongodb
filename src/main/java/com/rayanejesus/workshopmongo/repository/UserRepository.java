package com.rayanejesus.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rayanejesus.workshopmongo.domain.User;


@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
