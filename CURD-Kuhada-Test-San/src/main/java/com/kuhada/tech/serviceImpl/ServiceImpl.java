package com.kuhada.tech.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuhada.tech.dao.EmpDao;
import com.kuhada.tech.entity.Employee;
import com.kuhada.tech.service.EmpService;

@Service
public class ServiceImpl implements EmpService  {
	
	@Autowired
	public EmpDao empDao;

	@Override
	public Employee save(Employee employee) {
		return empDao.save(employee);
	}

	@Override
	public Employee update(Employee employee) {
		return empDao.save(employee);
	}

	@Override
	public Employee getById(Integer id) {
		return empDao.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Integer id) {
		empDao.deleteById(id);
	}

	@Override
	public List<Employee> findAll() {
		return (List<Employee>) empDao.findAll();
	}
}
