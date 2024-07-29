package com.aadi.shu.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aadi.shu.entity.Employee;

@Repository
public interface EmpDao extends CrudRepository<Employee, Integer>{

}
