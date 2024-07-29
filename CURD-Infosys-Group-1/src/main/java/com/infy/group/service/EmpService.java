package com.infy.group.service;

import org.springframework.stereotype.Service;

import com.infy.group.entites.Employee;

@Service
public interface EmpService {

	Employee save(Employee employee);

	Employee getById(Integer id);

	Employee update(Employee employee);

	void deleteById(Integer id);
}
