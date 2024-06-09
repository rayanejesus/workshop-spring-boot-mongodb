package com.rayanejesus.workshopmongo.dto;

import java.io.Serializable;

import com.rayanejesus.workshopmongo.domain.User;

public class UserDTO implements Serializable {
	
	private String id;
	private String name;
	private String email;
	
	public UserDTO () {}
//Contrutor sobrecarregado para instaciar um UserDTO de forma automatizada a partir de "User".
	public UserDTO (User obj) {
		
		//Copio os dados do usuário para o DTO
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
