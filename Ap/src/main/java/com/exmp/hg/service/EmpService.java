package com.exmp.hg.service;

import java.util.List;

import com.exmp.hg.entity.Employee;

public interface EmpService {

	Employee save(Employee emp);

	void deleteById(Integer id);

	Employee update(Employee emp);
	
	List<Employee> getAll ();
}
