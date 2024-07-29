package com.exmp.hg.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exmp.hg.entity.Employee;

@Repository
public interface EmpDao extends CrudRepository<Employee, Integer>{
	
	Object updateById(Integer id);

}
