package com.exm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exm.entity.Employee;
import com.exm.repository.EmployeeDao;
import com.exm.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public Employee getById(Integer id) {
		return employeeDao.findById(id).orElse(null); 
	}
	@Override
	public Employee save(Employee employee) {
		return employeeDao.save(employee);
	}
	@Override
	public Employee update(Employee employee) {
		return employeeDao.save(employee);
	}
	@Override
	public void deleteById(Integer id) {
		 employeeDao.deleteById(id);
	}
}