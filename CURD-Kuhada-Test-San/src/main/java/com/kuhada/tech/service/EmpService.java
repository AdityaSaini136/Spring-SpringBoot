package com.kuhada.tech.service;

import java.util.List;

import com.kuhada.tech.entity.Employee;

public interface EmpService {

	Employee save(Employee employee);

	Employee update(Employee employee);

	Employee getById(Integer id);

	void deleteById(Integer id);

	List<Employee> findAll();



}
