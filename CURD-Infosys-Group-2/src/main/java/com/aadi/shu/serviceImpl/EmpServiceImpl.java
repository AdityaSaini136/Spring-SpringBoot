package com.aadi.shu.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aadi.shu.dao.EmpDao;
import com.aadi.shu.entity.Employee;
import com.aadi.shu.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpDao empDao;
	
	@Override
	public Employee save(Employee emp) {
		return empDao.save(emp);
	}

	@Override
	public Employee update(Employee emp) {
		return empDao.save(emp);
	}

	@Override
	public Employee getById(Integer id) {
		return empDao.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Integer id) {
		 empDao.deleteById(id);
	}

	
	
	
	
	
	

}
