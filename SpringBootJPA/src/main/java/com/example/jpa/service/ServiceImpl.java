package com.example.jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.entity.User;
import com.example.jpa.repository.UserRepository;

@Service
public class ServiceImpl  implements UserService{
    @Autowired
	UserRepository userRepository;
	
	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getById(Integer id) {
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public User update(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(User user) {
		 userRepository.delete(user);
	}
  
}