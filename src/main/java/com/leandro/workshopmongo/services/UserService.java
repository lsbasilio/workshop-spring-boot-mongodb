package com.leandro.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandro.workshopmongo.domain.User;
import com.leandro.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo; // Injeção de dependência
	
	public List<User> findAll() {
		return repo.findAll();
	}

}
