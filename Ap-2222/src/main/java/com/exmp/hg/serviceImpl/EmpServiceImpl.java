package com.exmp.hg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmp.hg.dao.EmpDao;
import com.exmp.hg.entity.Employee;
import com.exmp.hg.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired 
	public EmpDao  empDao;
	
	@Override
	public Employee save(Employee employee) {
		return empDao.save(employee);
	}

	@Override
	public Object updateById(Integer id) {
		return empDao.updateById(id);
	}
	
	

}
