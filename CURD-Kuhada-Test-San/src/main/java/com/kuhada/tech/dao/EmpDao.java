package com.kuhada.tech.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kuhada.tech.entity.Employee;

@Repository
public interface EmpDao extends CrudRepository<Employee, Integer>  {

	
}
