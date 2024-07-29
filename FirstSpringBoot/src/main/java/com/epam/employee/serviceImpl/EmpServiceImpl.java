package com.epam.employee.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.employee.entites.Employee;
import com.epam.employee.repository.EmpRepository;
import com.epam.employee.service.EmpService;
@Service
public  class EmpServiceImpl implements EmpService {

	@Autowired
	private  EmpRepository emprepository;
	
	@Override
	public Employee save(Employee employee) {
		return emprepository.save(employee);
	}

	@Override
	public Employee getByEmpId(Integer id) {
		return emprepository.findById(id).orElse(null);
	}

	@Override
	public Employee update(Employee employee) {
		return emprepository.save(employee);
	}

	@Override
	public void deleteById(Integer id) {
		 emprepository.deleteById(id);
		}
}