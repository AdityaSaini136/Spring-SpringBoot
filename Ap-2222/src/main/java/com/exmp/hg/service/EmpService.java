package com.exmp.hg.service;

import com.exmp.hg.entity.Employee;

public interface EmpService {

	public Employee save(Employee employee);

	public Object updateById( Integer id);

}
