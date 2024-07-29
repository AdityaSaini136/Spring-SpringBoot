package com.aadi.shu.service;

import com.aadi.shu.entity.Employee;

public interface EmpService {
	
	Employee save(Employee emp);

	Employee update(Employee emp);

	Employee getById(Integer id);

	void deleteById(Integer id);

}
