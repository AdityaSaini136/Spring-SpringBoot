package com.exm.repository;

import org.springframework.data.repository.CrudRepository;

import com.exm.entity.Employee;

public interface EmployeeDao  extends CrudRepository<Employee, Integer>  {

}
