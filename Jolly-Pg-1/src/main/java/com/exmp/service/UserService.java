package com.exmp.service;

import java.util.List;

import com.exmp.entity.User;

public interface UserService {

	User save(User user);

	User getById(Integer id);

	List<User> getAll();

	void deleteById(Integer id);

	User updateById(User user);
	
	
	

}
