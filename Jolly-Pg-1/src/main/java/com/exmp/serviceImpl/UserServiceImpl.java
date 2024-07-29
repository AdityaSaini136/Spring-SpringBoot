package com.exmp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmp.entity.User;
import com.exmp.repository.UserRepository;
import com.exmp.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
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
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		userRepository.deleteById(id);
	}

	@Override
	public User updateById(User user) {
		return userRepository.save(user);
	}

}
