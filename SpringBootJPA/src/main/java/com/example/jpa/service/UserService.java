package com.example.jpa.service;

import com.example.jpa.entity.User;

public interface UserService {
	
	public User save(User user);

	public User getById(Integer id);

	public User update(User user);

	public void delete(User user);

}
