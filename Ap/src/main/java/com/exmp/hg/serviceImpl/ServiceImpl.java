package com.exmp.hg.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmp.hg.entity.Employee;
import com.exmp.hg.repository.EmpRepository;
import com.exmp.hg.service.EmpService;

@Service
public class ServiceImpl implements EmpService {
	
	@Autowired
	private EmpRepository empRepository;

	@Override
	public Employee save(Employee emp) {
		return empRepository.save(emp);
	}

	@Override
	public void deleteById(Integer id) {
	 empRepository.deleteById(id);
	}

	@Override
	public Employee update(Employee emp) {
		return empRepository.save(emp);
	}

	@Override
	public List<Employee> getAll() {
		return empRepository.findAll();
	}

}
