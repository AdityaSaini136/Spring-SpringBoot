package com.exm.service;

import com.exm.entity.Employee;

public interface EmployeeService {

	Employee  getById(Integer id);

	Employee save(Employee employee);

	Employee update(Employee employee);

	void deleteById(Integer id);
	
	

}
