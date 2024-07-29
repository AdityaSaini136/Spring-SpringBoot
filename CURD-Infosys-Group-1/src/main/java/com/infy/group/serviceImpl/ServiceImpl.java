package com.infy.group.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.group.entites.Employee;
import com.infy.group.repositery.EmpRepository;
import com.infy.group.service.EmpService;
@Service
public class ServiceImpl implements EmpService {
	
	@Autowired
	private EmpRepository empRepository;

	@Override
	public Employee save(Employee employee) {
		return empRepository.save(employee);
	}
	@Override
	public void deleteById(Integer id) {
		 empRepository.deleteById(id);
	}
	@Override
	public Employee getById(Integer id) {
		return empRepository.findById(id).orElse(null);
	}
	@Override
	public Employee update(Employee employee) {
		return empRepository.save(employee);
	}

}
