package com.epam.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.epam.employee.entites.Employee;

public interface EmpRepository  extends  CrudRepository<Employee, Integer>{

}
