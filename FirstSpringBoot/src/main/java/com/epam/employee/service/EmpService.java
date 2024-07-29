package com.epam.employee.service;

import com.epam.employee.entites.Employee;

public interface EmpService {

	Employee save(Employee employee);

	Employee getByEmpId(Integer id);

	Employee update(Employee employee);

	void deleteById(Integer id);
	
	

}
