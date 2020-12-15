package com.bbtutorials.users.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bbtutorials.users.entity.Vaga;
import com.bbtutorials.users.repository.UsersRepository;

@Component
public class UsersService {
	
	private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Vaga> getUsers() {
        return usersRepository.findAll();
    }
    
    public Vaga saveUser(Vaga users) {
    	return usersRepository.save(users);
    }

}
